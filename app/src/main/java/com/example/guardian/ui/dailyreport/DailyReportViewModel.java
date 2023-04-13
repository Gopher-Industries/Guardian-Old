package com.example.guardian.ui.dailyreport;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class DailyReportViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DailyReportViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}