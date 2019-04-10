package com.example.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


     public class MainActivity extends AppCompatActivity {
    private TextView mTextView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView01=findViewById(R.id.mytextview01);

        String str2 ="test 測試1231232132";
        String str3="ji3ji3ji3iji3";
        mTextView01.setText(str2+str3);
    }

}
