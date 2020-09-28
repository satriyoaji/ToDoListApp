package com.example.todolistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView titledoes, descdoes, datedoes;
    Button newListBtn;

    RecyclerView ourlist;
    ArrayList<ToDoList> lists;
    ToDoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titledoes = findViewById(R.id.titledoes);
        descdoes = findViewById(R.id.descdoes);
        datedoes = findViewById(R.id.datedoes);
        newListBtn = findViewById(R.id.newListBtn);

        newListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewTask.class);
                startActivity(i);
            }
        });

        //get data
//        ourlist = findViewById(R.id.ourlist);
//        ourlist.setLayoutManager(new LinearLayoutManager(this));
//        lists = new ArrayList<ToDoList>();
    }

}
