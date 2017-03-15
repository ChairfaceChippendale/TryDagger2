package com.ujujzk.trydagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    Speaker speaker;
    @Inject
    ImageModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ITryDaggerComponent component = TryDaggerApp.component(this);
        component.inject(this);

        speaker = component.speaker();

        ImageView view = (ImageView) findViewById(R.id.image);
        model.downloadTask(view);
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(speaker.getName() + "\n" + speaker.getSpeech());

    }
}
