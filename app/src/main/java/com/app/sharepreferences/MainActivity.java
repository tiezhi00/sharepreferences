package com.app.sharepreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        SharedPreferences sharedPreferences=getSharedPreferences("MY_DATA", Context.MODE_PRIVATE);
//        //保存数据
//        SharedPreferences.Editor editor=sharedPreferences.edit();
//        editor.putInt("number",1200);
//        editor.apply();
//
//
//        //读取数据
//        int num=sharedPreferences.getInt("number",0);
//        Log.i("MainActivity","----------------------num="+num);
        MyData myData=new MyData(getApplicationContext());//不能使用this
        myData.number=1200;
        myData.save();
        int num=myData.load();
        Log.i("MainActivity","----------------------num="+num);


        
    }
}