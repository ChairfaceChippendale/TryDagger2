package com.ujujzk.trydagger2;


import dagger.Module;
import dagger.Provides;

@Module
public class TryDaggerImageModelModule {

    @Provides
    public ImageModel provideImageModel (String url) {
        ImageModel model = new ImageModel();
        model.setImageUrl(url);
        return model;
    }

    @Provides
    public String provider() {
        return "http://jjdancer.com/wp-content/uploads/2013/10/veganwarrior.jpg";
    }

}
