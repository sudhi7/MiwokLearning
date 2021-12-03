package com.example.android.miwoklearning;

public class Word {
    private String mDefaultTranlation;
    private String mMiwokTranslation;
    private int image;
    private boolean imageProvided;

    public Word(String mDefaultTranlation, String mMiwokTranslation, int image) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.image = image;
        imageProvided = true;
    }

    public Word(String mDefaultTranlation, String mMiwokTranslation) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
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
}
