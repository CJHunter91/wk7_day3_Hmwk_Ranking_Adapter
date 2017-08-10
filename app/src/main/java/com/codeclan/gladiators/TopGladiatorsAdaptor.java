package com.codeclan.gladiators;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 09/08/2017.
 */

public class TopGladiatorsAdaptor extends ArrayAdapter<Gladiator> {


    public TopGladiatorsAdaptor(Context context, ArrayList<Gladiator> gladiators){
        super(context, 0 ,gladiators);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //get item is the built in arrayAdapter function taking the given list
        Gladiator currentGladiator = getItem(position);
        // use find by id on the list item view for the current gladiator
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        TextView dob = (TextView) listItemView.findViewById(R.id.dob);
        TextView wins = (TextView) listItemView.findViewById(R.id.wins);

        ranking.setText(Integer.toString(currentGladiator.getRanking()));
        name.setText(currentGladiator.getName());
        dob.setText(currentGladiator.getDob());
        wins.setText("Wins: " + Integer.toString(currentGladiator.getWins()));

        return listItemView;
    }
}
