package com.example.myapplicationfirsttry.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.widget.TextView;


import java.util.Timer;
import java.util.TimerTask;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {

        SimpleDateFormat formatter   =   new   SimpleDateFormat   ("HH:mm:ss");
        Date curDate =  new Date(System.currentTimeMillis());
        String   str   =   formatter.format(curDate);
        mText = new MutableLiveData<>();
        mText.setValue(str);
    }

    public LiveData<String> getText() {
        return mText;
    }
}