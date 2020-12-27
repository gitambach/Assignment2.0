package com.counttoast.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mShowCount;
    int a=0;
    private int mCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState1) {
        super.onCreate(savedInstanceState1);
  setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textView);
        if (savedInstanceState1!=null) {
           mCount= savedInstanceState1.getInt("mCount");
           mShowCount.setText(String.valueOf(mCount));
        }
    }

    @Override
    protected void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("mShowCount",mCount);

    }


    @Override
protected void onRestoreInstanceState( Bundle savedInstanceState) {
     super.onRestoreInstanceState(savedInstanceState);
    mCount= savedInstanceState.getInt("mShowCount");
   mShowCount.setText(String.valueOf(mCount));

 }
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
}