package com.example.android.miwoklearning;

public class Word {
    private String mDefaultTranlation;
    private String mMiwokTranslation;
    private int image;

    public Word(String mDefaultTranlation, String mMiwokTranslation, int image) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.image = image;
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
}
