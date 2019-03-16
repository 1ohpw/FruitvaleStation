package com.wolf.android.fruitvalestation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DublinPleasantonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dublin_pleasanton);


        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new Train("5 minutes", "orange", "2"));
        trains.add(new Train("10 minutes", "orange", "2"));
        trains.add(new Train("15 minutes", "orange", "2"));

        ListView dublinPleasantonListView = findViewById(R.id.dublin_pleasanton_listview);
        TrainAdapter dublinPleasantonAdapter = new TrainAdapter(this, trains);
        dublinPleasantonListView.setAdapter(dublinPleasantonAdapter);


    }
}
