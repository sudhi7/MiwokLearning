package com.example.android.miwoklearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One","Lutti"));
        words.add(new Word("Two","Otiiko"));
        words.add(new Word("Three","Tolookosu"));
        words.add(new Word("Four","Oyyisa"));
        words.add(new Word("Five","Massokka"));
        words.add(new Word("Six","Temmokka"));
        words.add(new Word("Seven","Kenekaku"));
        words.add(new Word("Eight","Kawinta"));
        words.add(new Word("Nine","wo'e"));
        words.add(new Word("Ten","na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.rootview);
        listView.setAdapter(itemsAdapter);
    }
}