package com.example.android.miwoklearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word("father","әpә",R.drawable.family_father));
        arr.add(new Word("mother","әṭa",R.drawable.family_mother));
        arr.add(new Word("son","angsi",R.drawable.family_son));
        arr.add(new Word("daughter","tune",R.drawable.family_daughter));
        arr.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        arr.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother));
        arr.add(new Word("older sister", "teṭe",R.drawable.family_older_sister));
        arr.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister));
        arr.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        arr.add(new Word("grandfather","paapa",R.drawable.family_grandfather));
        WordAdapter itemsAdapter = new WordAdapter(this,arr);
        ListView listView = (ListView) findViewById(R.id.family_root_view);
        listView.setAdapter(itemsAdapter);
    }
}