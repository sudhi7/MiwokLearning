package com.example.android.miwoklearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word("Where are you" +
                "going?","minto wuksus"));
        arr.add(new Word("What is your" +
                "name?","tinnә oyaase'nә"));
        arr.add(new Word("My name is...","oyaaset..."));
        arr.add(new Word("How are you" +
                "feeling?","michәksәs?"));
        arr.add(new Word("I’m feeling good. ","kuchi achit"));
        arr.add(new Word("Are you coming?","әәnәs'aa?"));
        arr.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        arr.add(new Word("I’m coming.","әәnәm"));
        arr.add(new Word("Let’s go.","yoowutis"));
        arr.add(new Word("Come here.","әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, arr);
        ListView listView = (ListView) findViewById(R.id.phrases_root_view);
        listView.setAdapter(itemsAdapter);
    }
}