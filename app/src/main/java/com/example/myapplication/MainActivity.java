package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listViewTools;
    private Object AdapterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewTools = findViewById(R.id.listViewTools);

       listViewTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
 
           }
       });
    }
}