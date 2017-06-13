package com.rawr.app.boilerplate.injection.component;

import dagger.Subcomponent;
import com.rawr.app.boilerplate.injection.PerActivity;
import com.rawr.app.boilerplate.injection.module.ActivityModule;
import com.rawr.app.boilerplate.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
