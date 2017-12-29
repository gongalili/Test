package com.example.magshimim.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    private int cnt1 = 0;
    private int cnt2 = 0;
    private int cnt3 = 0;
    private int cnt4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                cnt1++;
                tv.setText(Integer.toString(cnt1));
            }
        });
        findViewById(R.id.button2).setOnClickListener(onClickListener);
        findViewById(R.id.button4).setOnClickListener(new HandleClick());
    }

    private class HandleClick implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            TextView tv = (TextView)findViewById(R.id.textView4);
            cnt2++;
            tv.setText(Integer.toString(cnt2));
        }
    }


    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView tv = (TextView)findViewById(R.id.textView2);
            cnt3++;
            tv.setText(Integer.toString(cnt3));
        }
    };


    public void onClick(View view){
        TextView tv = (TextView)findViewById(R.id.textView1);
        cnt4++;
        tv.setText(Integer.toString(cnt4));
    }

}