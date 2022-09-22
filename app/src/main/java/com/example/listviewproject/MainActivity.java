package com.example.listviewproject;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        ArrayList<String> frandNames = new ArrayList<String>(asList("Sajjan", "Akshit", "Anupriya", "Ishan", "Niharika", "Aditya", "Dhruv", "Abhang", "Aryan", "Atharva"));
//        frandNames.add("Sajjan");
//        frandNames.add("Akshit");
//        frandNames.add("Ishan");
//        frandNames.add("Dhruv");
//        frandNames.add("Aditya");
//        frandNames.add("Abhang");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frandNames);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Person Selected: "+frandNames.get(i), Toast.LENGTH_SHORT).show();
                Log.i("Person Selected: ", frandNames.get(i));
            }
        });

    }
}