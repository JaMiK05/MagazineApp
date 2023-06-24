// Generated by Dagger (https://dagger.dev).
package uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomePageViewModel_Factory implements Factory<HomePageViewModel> {
  private final Provider<DataRepository> repositoryProvider;

  private final Provider<HomePageDirection> directionProvider;

  public HomePageViewModel_Factory(Provider<DataRepository> repositoryProvider,
      Provider<HomePageDirection> directionProvider) {
    this.repositoryProvider = repositoryProvider;
    this.directionProvider = directionProvider;
  }

  @Override
  public HomePageViewModel get() {
    return newInstance(repositoryProvider.get(), directionProvider.get());
  }

  public static HomePageViewModel_Factory create(Provider<DataRepository> repositoryProvider,
      Provider<HomePageDirection> directionProvider) {
    return new HomePageViewModel_Factory(repositoryProvider, directionProvider);
  }

  public static HomePageViewModel newInstance(DataRepository repository,
      HomePageDirection direction) {
    return new HomePageViewModel(repository, direction);
  }
}