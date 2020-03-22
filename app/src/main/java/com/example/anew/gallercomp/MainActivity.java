package com.example.anew.gallercomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Gallery;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gallery g1=findViewById(R.id.g1);
        g1.setAdapter(new Custadap(MainActivity.this));

    }
}
