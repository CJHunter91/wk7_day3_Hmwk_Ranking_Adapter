package com.codeclan.gladiators;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TopGladiatorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_gladiators);

//        get the list to use
        ArrayList<Gladiator> list = new TopGladiators().getList();
//        create the adaptor passing it the list and the current state of this activity(context)
        TopGladiatorsAdaptor adaptor = new TopGladiatorsAdaptor(this, list);
//        get the the list view for the top gladiators activity layout list.
        ListView listView = (ListView) findViewById(R.id.list);
        // assign the adaptor to the list view;
        listView.setAdapter(adaptor);
    }
}
