package com.example.android.miwoklearning;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word("father","әpә",R.drawable.family_father,R.raw.family_father));
        arr.add(new Word("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        arr.add(new Word("son","angsi",R.drawable.family_son,R.raw.family_son));
        arr.add(new Word("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        arr.add(new Word("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        arr.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        arr.add(new Word("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        arr.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        arr.add(new Word("grandmother", "ama", R.drawable.family_grandmother,R.raw.family_grandmother));
        arr.add(new Word("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));
        WordAdapter itemsAdapter = new WordAdapter(this,arr);
        ListView listView = (ListView) findViewById(R.id.family_root_view);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = arr.get(position);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getAudio());
                mediaPlayer.start();
            }
        });
    }
}