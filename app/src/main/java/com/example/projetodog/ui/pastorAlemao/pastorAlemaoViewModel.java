package com.example.projetodog.ui.pastorAlemao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class pastorAlemaoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public pastorAlemaoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}