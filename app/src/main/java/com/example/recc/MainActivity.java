package com.example.recc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<RecModel> userlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rec);
    initdata();
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(new RecAdapter(userlist));
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    
    
    }

    private void initdata() {


    userlist=new ArrayList<>();

    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));
    userlist.add(new RecModel(R.drawable.u,"Mohit"));

    }
}