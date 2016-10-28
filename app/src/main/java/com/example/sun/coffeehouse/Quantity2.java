package com.example.sun.coffeehouse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class Quantity2 extends AppCompatActivity {
    int numberOfCoffees = 0;
    TextView Qunatity;
    TextView Price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantity2);
    }
    private void display(int number) {
        TextView Quantity = (TextView) findViewById(R.id.Quntity_of_coffee);
        Quantity.setText("" + number);
    }

    public void increment(View view) {
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
    }

    public void decrement(View view) {
        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);
    }


    private void displayPrice(int number) {
        TextView Price = (TextView) findViewById(R.id.Price_text_view);
        Price.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void TotalPrice(View view) {

        displayPrice(numberOfCoffees * 40);
    }

    public void foodpanda1(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.foodpanda.com/"));
        startActivity(intent);
    }
}
