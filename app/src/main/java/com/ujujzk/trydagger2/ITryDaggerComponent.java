package com.ujujzk.trydagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                TryDaggerImageModelModule.class,
                TryDaggerImageSpeakerModule.class
        })
public interface ITryDaggerComponent {
    void inject(MainActivity mainActivity);
    Speaker speaker();

}
