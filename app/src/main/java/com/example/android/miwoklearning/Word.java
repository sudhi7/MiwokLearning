package com.example.android.miwoklearning;

public class Word {
    private String mDefaultTranlation;
    private String mMiwokTranslation;
    private int image;
    private boolean imageProvided;
    private int audio;

    public Word(String mDefaultTranlation, String mMiwokTranslation, int image, int audio) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.image = image;
        this.audio = audio;
        imageProvided = true;
    }

    public Word(String mDefaultTranlation, String mMiwokTranslation, int audio) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.audio = audio;
        imageProvided = false;
    }

    public String getDefaultTranlation() {
        return mDefaultTranlation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImage() {
        return image;
    }

    public boolean hasImage() {return imageProvided;}

    public int getAudio() {return audio;}
}
