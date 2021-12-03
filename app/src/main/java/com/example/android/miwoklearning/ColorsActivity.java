package com.example.android.miwoklearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        arr.add(new Word("green","chokokki",R.drawable.color_green));
        arr.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        arr.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        arr.add(new Word("black","kululli",R.drawable.color_black));
        arr.add(new Word("white","kelelli",R.drawable.color_white));
        arr.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        arr.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));
        WordAdapter itemsAdapter = new WordAdapter(this,arr);
        ListView listView = (ListView) findViewById(R.id.color_root_view);
        listView.setAdapter(itemsAdapter);
    }
}