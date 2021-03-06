package com.example.zookeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etFly, etGorilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFly = findViewById(R.id.etFly);
        etGorilla = findViewById(R.id.etGorilla);

        Bat t = new Bat();
        t.attackTown();
        t.attackTown();
        t.attackTown();
        t.eatHumans();
        t.eatHumans();
        t.fly();
        etFly.setText("Bird" + t.toString());
//        etFly.setText("Bird" + t.eatHumans());
//        etFly.setText("Bird" + t);
//        etFly.setText("Bird" + t.fly());

        Gorilla g = new Gorilla(95);
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        g.eatBananas();
        g.eatBananas();
        g.climb();

//        etGorilla.setText("Gorilla" + g);
//        etGorilla.setText("Gorilla" + g.throwSomething());
//        etGorilla.setText("Gorilla" + g.eatBananas());
        etGorilla.setText("" + g.toString());


    }
}