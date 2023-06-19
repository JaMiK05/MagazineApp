package uz.gita.magazineapp.data.local

import android.content.Context
import com.google.firebase.auth.FirebaseUser
import com.google.gson.Gson

/**
 *   Created by Jamik on 6/16/2023 ot 6:45 PM
 **/
class MyShared private constructor(context: Context) {

    private val sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()

    fun saveUser(email: String, password: String) {
        editor.putString("email", email).apply()
        editor.putString("pas", password).apply()
    }

    fun getUser(): Boolean {
        val email = sharedPreferences.getString("email", "")
        val password = sharedPreferences.getString("pas", "")
        return (email!!.isNotEmpty() && password!!.isNotEmpty())
    }

    fun getEmail() = sharedPreferences.getString("email", "")

    fun getPassword() = sharedPreferences.getString("pas", "")

    companion object {
        private lateinit var myShared: MyShared
        fun init(context: Context) {
            myShared = MyShared(context)
        }

        fun getShared() = myShared
    }
}