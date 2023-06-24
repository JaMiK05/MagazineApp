package uz.gita.magazineapp.app;

import dagger.hilt.internal.aggregatedroot.codegen._uz_gita_magazineapp_app_App;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._cafe_adriel_voyager_hilt_HiltWrapper_VoyagerHiltViewModelFactories_ViewModelFactoryEntryPoint;
import hilt_aggregated_deps._cafe_adriel_voyager_hilt_OptionalMultibindingsModule;
import hilt_aggregated_deps._cafe_adriel_voyager_hilt_ScreenModelEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;
import hilt_aggregated_deps._uz_gita_magazineapp_MainActivity_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_magazineapp_app_App_GeneratedInjector;
import hilt_aggregated_deps._uz_gita_magazineapp_di_ContextModule;
import hilt_aggregated_deps._uz_gita_magazineapp_di_DirectionModule;
import hilt_aggregated_deps._uz_gita_magazineapp_di_NavigationModule;
import hilt_aggregated_deps._uz_gita_magazineapp_di_RepositoryModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_accountscreen_AccountViewScreenModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_accountscreen_AccountViewScreenModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_addcategories_AddCategoryViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_addcategories_AddCategoryViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_addproduct_AddScreenViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_addproduct_AddScreenViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_onboarding_OnBoardingViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_onboarding_OnBoardingViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_shopscreen_ShopScreenViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_shopscreen_ShopScreenViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_shopscreen_page_homepage_HomePageViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_shopscreen_page_homepage_HomePageViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_shopscreen_page_shoppingpage_ShoppingPageViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_shopscreen_page_shoppingpage_ShoppingPageViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_signin_SignInScreenViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_signin_SignInScreenViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_signup_SignUpScreenViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._uz_gita_magazineapp_presentation_screens_signup_SignUpScreenViewModel_HiltModules_KeyModule;

@ComponentTreeDeps(
    rootDeps = _uz_gita_magazineapp_app_App.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _cafe_adriel_voyager_hilt_HiltWrapper_VoyagerHiltViewModelFactories_ViewModelFactoryEntryPoint.class,
        _cafe_adriel_voyager_hilt_OptionalMultibindingsModule.class,
        _cafe_adriel_voyager_hilt_ScreenModelEntryPoint.class,
        _dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint.class,
        _dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class,
        _uz_gita_magazineapp_MainActivity_GeneratedInjector.class,
        _uz_gita_magazineapp_app_App_GeneratedInjector.class,
        _uz_gita_magazineapp_di_ContextModule.class,
        _uz_gita_magazineapp_di_DirectionModule.class,
        _uz_gita_magazineapp_di_NavigationModule.class,
        _uz_gita_magazineapp_di_RepositoryModule.class,
        _uz_gita_magazineapp_presentation_screens_accountscreen_AccountViewScreenModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_accountscreen_AccountViewScreenModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_addcategories_AddCategoryViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_addcategories_AddCategoryViewModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_addproduct_AddScreenViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_addproduct_AddScreenViewModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_onboarding_OnBoardingViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_onboarding_OnBoardingViewModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_shopscreen_ShopScreenViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_shopscreen_ShopScreenViewModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_shopscreen_page_homepage_HomePageViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_shopscreen_page_homepage_HomePageViewModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_shopscreen_page_shoppingpage_ShoppingPageViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_shopscreen_page_shoppingpage_ShoppingPageViewModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_signin_SignInScreenViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_signin_SignInScreenViewModel_HiltModules_KeyModule.class,
        _uz_gita_magazineapp_presentation_screens_signup_SignUpScreenViewModel_HiltModules_BindsModule.class,
        _uz_gita_magazineapp_presentation_screens_signup_SignUpScreenViewModel_HiltModules_KeyModule.class
    }
)
public final class App_ComponentTreeDeps {
}
