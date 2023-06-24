package uz.gita.magazineapp.di;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 3:47 PM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H\'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH\'\u00a8\u0006\u001e"}, d2 = {"Luz/gita/magazineapp/di/DirectionModule;", "", "accountScreenBind", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenDirection;", "impl", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenDirectionImpl;", "addScreenBind", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenDirection;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenDirectionImpl;", "addcategoryBInd", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryDirection;", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryDirectionIMpl;", "homePageBind", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/homepage/HomePageDirection;", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/homepage/HomePageDirectionImpl;", "onBoardingBind", "Luz/gita/magazineapp/presentation/screens/onboarding/OnBoardingDirection;", "Luz/gita/magazineapp/presentation/screens/onboarding/OnBoardingDirectionIMpl;", "shopScreenBind", "Luz/gita/magazineapp/presentation/screens/shopscreen/ShopDirection;", "Luz/gita/magazineapp/presentation/screens/shopscreen/ShopDirectionImpl;", "shopePAgeBind", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageDirection;", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageDirectionImpl;", "signInScreenBind", "Luz/gita/magazineapp/presentation/screens/signin/SignInDirection;", "Luz/gita/magazineapp/presentation/screens/signin/SignInDirectionImpl;", "signUPScreenBind", "Luz/gita/magazineapp/presentation/screens/signup/SignUpDirection;", "Luz/gita/magazineapp/presentation/screens/signup/SignUpDirectionImpl;", "app_debug"})
@dagger.Module
public abstract interface DirectionModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.onboarding.OnBoardingDirection onBoardingBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.onboarding.OnBoardingDirectionIMpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenDirection accountScreenBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.signin.SignInDirection signInScreenBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.signin.SignInDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.signup.SignUpDirection signUPScreenBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.signup.SignUpDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.addproduct.AddScreenDirection addScreenBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.addproduct.AddScreenDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.shopscreen.ShopDirection shopScreenBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.shopscreen.ShopDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryDirection addcategoryBInd(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryDirectionIMpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage.HomePageDirection homePageBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage.HomePageDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageDirection shopePAgeBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageDirectionImpl impl);
}