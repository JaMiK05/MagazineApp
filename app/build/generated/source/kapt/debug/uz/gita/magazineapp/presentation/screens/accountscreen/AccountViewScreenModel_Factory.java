// Generated by Dagger (https://dagger.dev).
package uz.gita.magazineapp.presentation.screens.accountscreen;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AccountViewScreenModel_Factory implements Factory<AccountViewScreenModel> {
  private final Provider<AccountScreenDirection> directionProvider;

  public AccountViewScreenModel_Factory(Provider<AccountScreenDirection> directionProvider) {
    this.directionProvider = directionProvider;
  }

  @Override
  public AccountViewScreenModel get() {
    return newInstance(directionProvider.get());
  }

  public static AccountViewScreenModel_Factory create(
      Provider<AccountScreenDirection> directionProvider) {
    return new AccountViewScreenModel_Factory(directionProvider);
  }

  public static AccountViewScreenModel newInstance(AccountScreenDirection direction) {
    return new AccountViewScreenModel(direction);
  }
}