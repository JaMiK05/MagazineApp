package uz.gita.magazineapp.domain.repositories.datarepository.impl

import android.util.Log
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 9:07 PM
 **/
class DataRepositoryImpl @Inject constructor() : DataRepository {

    private val firestore = Firebase.firestore

    override fun addProductTOCategory(productId: String, categoryId: String): Flow<String> =
        callbackFlow {
            val collection = firestore.collection("categories")
            /* collection
                 .limit(1)
                 .whereEqualTo("id", categoryId)
                 .addSnapshotListener { value, e ->
                     if (e != null) {
                         Log.w("TTT", "Listen failed.", e)
                         return@addSnapshotListener
                     }
                     val cities = ArrayList<String>()
                     for (doc in value!!) {
                         val productsIds: ArrayList<String> =
                             doc["products"] as ArrayList<String>
                         productsIds.add(productId)
                         val id = doc["id"] as String
                         val name = doc["name"] as String
                         val category = CategoryData(
                             id,
                             name,
                             productsIds
                         )
                         collection.document(doc.id)
                             .set(category)
                     }
                     Log.d("TTT", "Current cites in CA: $cities")
                 }*/
            collection.whereEqualTo("id", categoryId)
                .limit(1)
                .get().addOnSuccessListener { querySnapshot ->
                    for (document in querySnapshot.documents) {
                        val productsIds: ArrayList<String> =
                            document["products"] as ArrayList<String>
                        productsIds.add(productId)
                        val id = document["id"] as String
                        val name = document["name"] as String
                        val category = CategoryData(
                            id,
                            name,
                            productsIds
                        )
                        collection.document(document.id)
                            .set(category)
                    }
                }

            awaitClose()
        }

    override fun getAllCategories(): Flow<List<CategoryData>> = callbackFlow {
        val categoryRef = firestore.collection("categories")
        categoryRef
            .addSnapshotListener { snapshots, e ->
                if (e != null) {
                    Log.w("TTT", "listen:error", e)
                    return@addSnapshotListener
                }
                val categories = ArrayList<CategoryData>()
                for (dc in snapshots!!.documents) {
                    val category = CategoryData(
                        id = dc.get("id") as String,
                        name = dc.get("name") as String,
                        products = dc.get("products") as ArrayList<String>
                    )
                    categories.add(category)
                }
                trySend(categories)
            }

//        categoryRef
//            .get()
//            .addOnSuccessListener { querySnapshot ->
//                val categories = ArrayList<CategoryData>()
//                querySnapshot.forEach {
//                    val category = CategoryData(
//                        id = it.get("id") as String,
//                        name = it.get("name") as String,
//                        products = it.get("products") as ArrayList<String>
//                    )
//                    categories.add(category)
//                }
//                trySend(categories)
//            }
//            .addOnFailureListener {
//                trySend(emptyList())
//            }
        awaitClose()
    }

    override fun getProducts(list: List<String>): Flow<List<ProductData>> = callbackFlow {
        val products = ArrayList<ProductData>()
        val documents = firestore.collection("products")
        list.forEach {
            documents.whereEqualTo("id", it)
                .addSnapshotListener { snapshots, e ->
                    if (e != null) {
                        Log.w("TTT", "listen:error", e)
                        return@addSnapshotListener
                    }
                    val categories = ArrayList<CategoryData>()
                    for (data in snapshots!!.documents) {
                        val product = ProductData(
                            id = data["id"] as String,
                            userId = data["userId"] as String,
                            name = data["name"] as String,
                            price = data["price"] as String,
                            description = data["description"] as String,
                            category = data["category"] as String,
                        )
                        products.add(product)
                    }
                    trySend(products)
                }
            /*   documents.whereEqualTo("id", it)
                   .get()
                   .addOnSuccessListener { querySnapshot ->
                       for (document in querySnapshot.documents) {
                           val data = document.data!!
                           val product = ProductData(
                               id = data["id"] as String,
                               userId = data["userId"] as String,
                               name = data["name"] as String,
                               price = data["price"] as String,
                               description = data["description"] as String,
                               category = data["category"] as String,
                           )
                           products.add(product)
                       }
                       trySend(products)
                   }
                   .addOnFailureListener {
                   }*/
        }

        awaitClose()
    }

    override fun getALlProducts(): Flow<List<ProductData>> = callbackFlow {
        val products = ArrayList<ProductData>()
        val documents = firestore.collection("products")

        documents
            .addSnapshotListener { snapshots, e ->
                if (e != null) {
                    Log.w("TTT", "listen:error", e)
                    return@addSnapshotListener
                }
                val categories = ArrayList<CategoryData>()
                for (data in snapshots!!.documents) {
                    val product = ProductData(
                        id = data["id"] as String,
                        userId = data["userId"] as String,
                        name = data["name"] as String,
                        price = data["price"] as String,
                        description = data["description"] as String,
                        category = data["category"] as String,
                    )
                    products.add(product)
                }
                trySend(products)
            }

        /* documents.get()
             .addOnSuccessListener { querySnapshot ->
                 for (document in querySnapshot.documents) {
                     val data = document.data!!
                     val product = ProductData(
                         id = data["id"] as String,
                         userId = data["userId"] as String,
                         name = data["name"] as String,
                         price = data["price"] as String,
                         description = data["description"] as String,
                         category = data["category"] as String,
                     )
                     products.add(product)
                 }
                 trySend(products)
             }.addOnFailureListener {
                 trySend(emptyList())
             }*/
        awaitClose { }
    }

    override fun myProducts(userid: String): Flow<List<ProductData>> = callbackFlow {
        val products = ArrayList<ProductData>()
        val documents = firestore.collection("products")

        documents.whereEqualTo("userId", userid)
            .addSnapshotListener { snapshots, e ->
                if (e != null) {
                    Log.w("TTT", "listen:error", e)
                    return@addSnapshotListener
                }
                for (data in snapshots!!.documents) {
                    val product = ProductData(
                        id = data["id"] as String,
                        userId = data["userId"] as String,
                        name = data["name"] as String,
                        price = data["price"] as String,
                        description = data["description"] as String,
                        category = data["category"] as String,
                    )
                    products.add(product)
                }
                trySend(products)
            }


        /* documents.whereEqualTo("userId", userid)
             .get()
             .addOnSuccessListener { querySnapshot ->
                 for (document in querySnapshot.documents) {
                     val data = document.data!!
                     val product = ProductData(
                         id = data["id"] as String,
                         userId = data["userId"] as String,
                         name = data["name"] as String,
                         price = data["price"] as String,
                         description = data["description"] as String,
                         category = data["category"] as String,
                     )
                     products.add(product)
                 }
                 trySend(products)
             }
             .addOnFailureListener {
                 trySend(emptyList())
             }*/
        awaitClose()
    }

    override fun addProduct(product: ProductData): Flow<Result<String>> = callbackFlow {
        val documents = firestore.collection("products")
        documents.add(product)
            .addOnSuccessListener {
                trySend(Result.success("succes"))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
        awaitClose {}
    }

    override fun addCategory(category: CategoryData): Flow<Result<String>> = callbackFlow {
        val categoryRef = firestore.collection("categories")
        categoryRef.add(category)
            .addOnSuccessListener {
                trySend(Result.success("success"))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
        awaitClose { }
    }


}
