package uz.gita.magazineapp.domain.repositories.authrepository.impl

import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/15/2023 ot 3:40 PM
 **/

var user: FirebaseUser? = null


class AuthRepositoryImpl @Inject constructor() : AuthRepository {

    private val auth = Firebase.auth

    override fun logIn(email: String, password: String): Flow<Result<Unit>> = callbackFlow {
        auth.signInWithEmailAndPassword(email, password).addOnSuccessListener {
            user = auth.currentUser
            trySend(Result.success(Unit))
        }.addOnFailureListener {
            trySend(Result.failure(it))
        }.addOnCanceledListener {
            trySend(Result.failure(Exception("Cancelled Operation")))
        }
        awaitClose { }
    }

    override fun createUser(email: String, password: String): Flow<Result<Unit>> = callbackFlow {
        auth.createUserWithEmailAndPassword(email, password).addOnSuccessListener {
            user = auth.currentUser
            myLog("${user?.email}")
            trySend(Result.success(Unit))
        }.addOnFailureListener {
            trySend(Result.failure(it))
        }.addOnCanceledListener {
            trySend(Result.failure(Exception("Cancelled Operation")))
        }
        awaitClose { }
    }
}