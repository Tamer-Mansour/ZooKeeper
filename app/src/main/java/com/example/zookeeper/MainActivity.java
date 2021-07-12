package com.example.zookeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etFly,etGorilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFly = findViewById(R.id.etFly);
        etGorilla = findViewById(R.id.etGorilla);

        Gorilla g = new Gorilla("",100);
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        g.eatBananas();
        g.eatBananas();
        g.climb();

        etGorilla.setText(""+ g.toString());

        Bat t = new Bat();
        t.attackTown();
        t.attackTown();
        t.attackTown();
        t.eatHumans();
        t.eatHumans();
        t.fly();
        etFly.setText(""+ t.toString());



    }
}