package uz.gita.magazineapp.domain.repositories.authrepository

import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

/**
 *   Created by Jamik on 6/15/2023 ot 3:40 PM
 **/
interface AuthRepository {


    fun logIn(email: String, password: String): Flow<Result<Unit>>


    fun createUser(email: String, password: String): Flow<Result<Unit>>

}