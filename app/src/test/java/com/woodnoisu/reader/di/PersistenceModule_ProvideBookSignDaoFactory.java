// Generated by Dagger (https://dagger.dev).
package com.woodnoisu.reader.di;

import com.woodnoisu.ktReader.persistence.AppDataBase;
import com.woodnoisu.ktReader.persistence.BookSignDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PersistenceModule_ProvideBookSignDaoFactory implements Factory<BookSignDao> {
  private final Provider<AppDataBase> appDataBaseProvider;

  public PersistenceModule_ProvideBookSignDaoFactory(Provider<AppDataBase> appDataBaseProvider) {
    this.appDataBaseProvider = appDataBaseProvider;
  }

  @Override
  public BookSignDao get() {
    return provideBookSignDao(appDataBaseProvider.get());
  }

  public static PersistenceModule_ProvideBookSignDaoFactory create(
      Provider<AppDataBase> appDataBaseProvider) {
    return new PersistenceModule_ProvideBookSignDaoFactory(appDataBaseProvider);
  }

  public static BookSignDao provideBookSignDao(AppDataBase appDataBase) {
    return Preconditions.checkNotNullFromProvides(PersistenceModule.INSTANCE.provideBookSignDao(appDataBase));
  }
}