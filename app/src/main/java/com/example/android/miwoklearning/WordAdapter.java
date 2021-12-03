package com.example.android.miwoklearning;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context,  ArrayList<Word> objects) {
        super(context,R.layout.list_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word word = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.miwokView);
        defaultTextView.setText(word.getMiwokTranslation());
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.defaultView);
        miwokTextView.setText(word.getDefaultTranlation());
        return listItemView;
    }


}
