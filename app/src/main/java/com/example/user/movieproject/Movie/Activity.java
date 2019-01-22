package com.example.user.movieproject.Movie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;


import com.example.user.movieproject.Phone.Phone;
import com.example.user.movieproject.R;

import java.util.ArrayList;
import java.util.List;

public class Activity extends AppCompatActivity {
    List<Movie> movies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        Adapter adapter = new Adapter(this, movies);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){

        movies.add(new Movie (  "Balbli", 2016, R.drawable.ic_launcher_foreground, "OOOoo"));
      //  movies.add(new Movie ("Balbli", "2010","Трэвис Найт", R.drawable.ic_launcher_background));

    }
}
