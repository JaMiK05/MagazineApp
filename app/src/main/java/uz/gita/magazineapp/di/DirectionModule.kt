package uz.gita.magazineapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenDirection
import uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenDirectionImpl
import uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryDirection
import uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryDirectionIMpl
import uz.gita.magazineapp.presentation.screens.addproduct.AddScreenDirection
import uz.gita.magazineapp.presentation.screens.addproduct.AddScreenDirectionImpl
import uz.gita.magazineapp.presentation.screens.onboarding.OnBoardingDirection
import uz.gita.magazineapp.presentation.screens.onboarding.OnBoardingDirectionIMpl
import uz.gita.magazineapp.presentation.screens.shopscreen.ShopDirection
import uz.gita.magazineapp.presentation.screens.shopscreen.ShopDirectionImpl
import uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage.HomePageDirection
import uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage.HomePageDirectionImpl
import uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageDirection
import uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageDirectionImpl
import uz.gita.magazineapp.presentation.screens.signin.SignInDirection
import uz.gita.magazineapp.presentation.screens.signin.SignInDirectionImpl
import uz.gita.magazineapp.presentation.screens.signup.SignUpDirection
import uz.gita.magazineapp.presentation.screens.signup.SignUpDirectionImpl

/**
 *   Created by Jamik on 6/16/2023 ot 3:47 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
interface DirectionModule {

    @Binds
    fun onBoardingBind(impl: OnBoardingDirectionIMpl): OnBoardingDirection

    @Binds
    fun accountScreenBind(impl: AccountScreenDirectionImpl): AccountScreenDirection

    @Binds
    fun signInScreenBind(impl: SignInDirectionImpl): SignInDirection

    @Binds
    fun signUPScreenBind(impl: SignUpDirectionImpl): SignUpDirection

    @Binds
    fun addScreenBind(impl: AddScreenDirectionImpl): AddScreenDirection

    @Binds
    fun shopScreenBind(impl: ShopDirectionImpl): ShopDirection

    @Binds
    fun addcategoryBInd(impl: AddCategoryDirectionIMpl): AddCategoryDirection

    @Binds
    fun homePageBind(impl: HomePageDirectionImpl): HomePageDirection

    @Binds
    fun shopePAgeBind(impl: ShoppingPageDirectionImpl): ShoppingPageDirection


}