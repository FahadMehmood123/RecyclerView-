package com.fahadmehmood.recyclerview_191088;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Random> studentlist=new ArrayList<>();
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recylerview);
        studentlist.add(new Random("Fahad","191088","CS","4th"));
        studentlist.add(new Random("Ali","191012","Electronic","2nd"));
        studentlist.add(new Random("Mehmood","19311","Mechatronics","1st"));
        studentlist.add(new Random("Farhan","193123","BBA","8th"));
        studentlist.add(new Random("Fahad","191088","BALLB","3rd"));
        studentlist.add(new Random("Ali","191012","Med","5th"));
        studentlist.add(new Random("Fahad","191088","CS","4th"));
        studentlist.add(new Random("Ali","191012","Electronic","2nd"));
        studentlist.add(new Random("Mehmood","19311","Mechatronics","1st"));
        studentlist.add(new Random("Farhan","193123","BBA","8th"));
        studentlist.add(new Random("Fahad","191088","BALLB","3rd"));
        studentlist.add(new Random("Ali","191012","Med","5th"));
        recyclerViewAdapter=new RecyclerViewAdapter(studentlist,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}