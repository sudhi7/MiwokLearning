package com.example.android.miwoklearning;

public class Word {
    private String mDefaultTranlation;
    private String mMiwokTranslation;

    public Word(String mDefaultTranlation, String mMiwokTranslation) {
        this.mDefaultTranlation = mDefaultTranlation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaultTranlation() {
        return mDefaultTranlation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
