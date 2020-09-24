package com.example.loginwork;
import android.util.AttributeSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context,AttributeSet attr){
        super(context,attr);
        LayoutInflater.from(context).inflate(R.layout.title,this);
    }
}
