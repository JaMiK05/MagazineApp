// Generated by Dagger (https://dagger.dev).
package uz.gita.magazineapp.domain.repositories.authrepository.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthRepositoryImpl_Factory implements Factory<AuthRepositoryImpl> {
  @Override
  public AuthRepositoryImpl get() {
    return newInstance();
  }

  public static AuthRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthRepositoryImpl newInstance() {
    return new AuthRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final AuthRepositoryImpl_Factory INSTANCE = new AuthRepositoryImpl_Factory();
  }
}
