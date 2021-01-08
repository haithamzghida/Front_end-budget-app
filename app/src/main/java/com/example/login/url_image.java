package com.example.login;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class url_image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url_image);

        ImageView imageView = findViewById(R.id.url_image);

        String url = "https://pngimage.net/wp-content/uploads/2018/06/icone-nourriture-png-1.png";

        Picasso.with(this).load(url).into(imageView);
    }
}