package com.example.wallmec;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.kc.unsplash.Unsplash;
import com.kc.unsplash.api.Order;
import com.kc.unsplash.models.Photo;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Unsplash unsplash = new Unsplash("nu6pEfcHqN3cCG_FmIFey_qpq_JVnBDOnxY_OPrHiCY");

        unsplash.getPhotos(1, 10, Order.LATEST, new Unsplash.OnPhotosLoadedListener() {
            @Override
            public void onComplete(List<Photo> photos) {
                int photoCount = photos.size();
            }

            @Override
            public void onError(String error) {
                Log.v("Error", error);
            }
        });

    }
}