package com.example.sun.coffeehouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Coffee1(View view) {
        Intent intent=new Intent(MainActivity.this,uantity.class);
        startActivity(intent);
    }

    public void Coffee2(View view) {
        Intent intent=new Intent(MainActivity.this,Quantity2.class);
        startActivity(intent);
    }
}
