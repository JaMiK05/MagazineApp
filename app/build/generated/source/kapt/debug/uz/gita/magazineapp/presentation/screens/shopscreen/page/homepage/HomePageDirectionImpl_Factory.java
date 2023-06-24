// Generated by Dagger (https://dagger.dev).
package uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.magazineapp.util.navigation.AppNavigator;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomePageDirectionImpl_Factory implements Factory<HomePageDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public HomePageDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public HomePageDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static HomePageDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new HomePageDirectionImpl_Factory(navigatorProvider);
  }

  public static HomePageDirectionImpl newInstance(AppNavigator navigator) {
    return new HomePageDirectionImpl(navigator);
  }
}