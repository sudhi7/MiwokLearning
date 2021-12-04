package com.example.android.miwoklearning;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    private MediaPlayer.OnCompletionListener listener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    AudioManager.OnAudioFocusChangeListener audioListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }
            else if(focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            }
            else if(focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                mediaPlayer.stop();
                releaseMediaPlayer();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One","Lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Two","Otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Three","Tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Four","Oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Five","Massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Six","Temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("Seven","Kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("Eight","Kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("Nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("Ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.rootview);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                releaseMediaPlayer();
                int res = audioManager.requestAudioFocus(audioListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if(res == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudio());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(listener);
                }
            }
        });
    }

    private void releaseMediaPlayer() {
        if(mediaPlayer!=null) {
            mediaPlayer.release();
            mediaPlayer=null;
            audioManager.abandonAudioFocus(audioListener);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
}