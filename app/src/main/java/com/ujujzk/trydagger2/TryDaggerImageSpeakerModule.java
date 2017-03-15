package com.ujujzk.trydagger2;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TryDaggerImageSpeakerModule {

    @Provides
    @Singleton
    public Speaker provideSpeaker () {
        Speaker speaker = new Speaker();
        speaker.setName("Alex");
        speaker.setSpeech("Dagger2");
        return speaker;
    }

}
