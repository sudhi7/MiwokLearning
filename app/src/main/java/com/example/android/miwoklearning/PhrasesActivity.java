package com.example.android.miwoklearning;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word("Where are you" +
                "going?","minto wuksus",R.raw.phrase_where_are_you_going));
        arr.add(new Word("What is your" +
                "name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        arr.add(new Word("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        arr.add(new Word("How are you" +
                "feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        arr.add(new Word("I’m feeling good. ","kuchi achit",R.raw.phrase_im_feeling_good));
        arr.add(new Word("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        arr.add(new Word("Yes, I’m coming.","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        arr.add(new Word("I’m coming.","әәnәm",R.raw.phrase_im_coming));
        arr.add(new Word("Let’s go.","yoowutis",R.raw.phrase_lets_go));
        arr.add(new Word("Come here.","әnni'nem",R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this, arr);
        ListView listView = (ListView) findViewById(R.id.phrases_root_view);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, arr.get(position).getAudio());
                mediaPlayer.start();
            }
        });
    }
}