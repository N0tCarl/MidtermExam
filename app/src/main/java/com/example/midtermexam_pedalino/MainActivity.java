package com.example.midtermexam_pedalino;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));

        ImageView imageview22 = findViewById(R.id.imageView2);
        ImageView imageview33 = findViewById(R.id.imageView3);
        ImageView imageview44 = findViewById(R.id.imageView4);
        ImageView imageview55 = findViewById(R.id.imageView5);

        imageview22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent(MainActivity.this, Maint2Activity.class);
                startActivity(intent);

            }
        });

        imageview33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent(MainActivity.this, Maint3Activity.class);
                startActivity(intent);

            }
        });

        imageview44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent(MainActivity.this, Maint4Activity.class);
                startActivity(intent);

            }
        });

        imageview55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent(MainActivity.this, Maint5Activity.class);
                startActivity(intent);

            }
        });
    }}
