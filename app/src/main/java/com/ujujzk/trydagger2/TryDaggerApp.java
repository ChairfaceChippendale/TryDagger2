package com.ujujzk.trydagger2;

import android.app.Application;
import android.content.Context;


public class TryDaggerApp extends Application {
    ITryDaggerComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerITryDaggerComponent
                .builder()
                .tryDaggerImageModelModule(new TryDaggerImageModelModule())
                .tryDaggerImageSpeakerModule(new TryDaggerImageSpeakerModule())
                .build();
    }


    public static ITryDaggerComponent component(Context context) {
        return ((TryDaggerApp) context.getApplicationContext()).component;
    }
}
