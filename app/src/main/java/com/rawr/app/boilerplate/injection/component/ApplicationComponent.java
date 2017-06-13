package com.rawr.app.boilerplate.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.rawr.app.boilerplate.data.DataManager;
import com.rawr.app.boilerplate.data.SyncService;
import com.rawr.app.boilerplate.data.local.DatabaseHelper;
import com.rawr.app.boilerplate.data.local.PreferencesHelper;
import com.rawr.app.boilerplate.data.remote.RibotsService;
import com.rawr.app.boilerplate.injection.ApplicationContext;
import com.rawr.app.boilerplate.injection.module.ApplicationModule;
import com.rawr.app.boilerplate.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
