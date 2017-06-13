package com.rawr.app.boilerplate.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.rawr.app.boilerplate.injection.component.ApplicationComponent;
import com.rawr.app.boilerplate.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
