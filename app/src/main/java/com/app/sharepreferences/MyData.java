package com.app.sharepreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class MyData {
    public int number;
    private Context context;
    public MyData(Context context){
        this.context=context;
    }
    public void save(){
        String name=context.getString(R.string.MY_DATA);
        SharedPreferences sharedPreferences= context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        String key= context.getString(R.string.MY_KEY);
        editor.putInt(key,number);
        editor.apply();
    }
    public int load(){
        String name=context.getString(R.string.MY_DATA);
        SharedPreferences sharedPreferences= context.getSharedPreferences(name, Context.MODE_PRIVATE);
        String key= context.getString(R.string.MY_KEY);
        number=sharedPreferences.getInt(key,context.getResources().getInteger(R.integer.default_value));
        return number;
    }







}
