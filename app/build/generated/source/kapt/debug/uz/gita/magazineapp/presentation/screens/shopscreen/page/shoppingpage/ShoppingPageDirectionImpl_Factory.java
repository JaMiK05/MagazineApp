// Generated by Dagger (https://dagger.dev).
package uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage;

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
public final class ShoppingPageDirectionImpl_Factory implements Factory<ShoppingPageDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public ShoppingPageDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public ShoppingPageDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static ShoppingPageDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new ShoppingPageDirectionImpl_Factory(navigatorProvider);
  }

  public static ShoppingPageDirectionImpl newInstance(AppNavigator navigator) {
    return new ShoppingPageDirectionImpl(navigator);
  }
}