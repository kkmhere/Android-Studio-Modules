package com.example.recyclerviewcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAapter;
    private List<Person1> person1List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        person1List=new ArrayList<>();

        for(int index=0;index<20;index++)
        {
            Person1 myperson=new Person1("KESHAV"+index,"PILOT");
            person1List.add(myperson);

        }

        recyclerViewAapter =new recyclerViewAdapter(person1List,MainActivity.this);
        recyclerView.setAdapter(recyclerViewAapter);


    }
}
