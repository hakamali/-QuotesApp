package com.example.hakim.quotesapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changefragment(View view){
        Fragment fragment;
        if (view== findViewById(R.id.btn1)) {
            fragment = new fragment_one();
            FragmentManager fm1 = getSupportFragmentManager();
            FragmentTransaction ft1 = fm1.beginTransaction();
            ft1.replace((R.id.fragment_place), fragment);
            ft1.commit();
        }
        if (view==findViewById(R.id.btn2)){
            fragment=new fragment_two();
            FragmentManager fm2=getSupportFragmentManager();
            FragmentTransaction ft2=fm2.beginTransaction();
            ft2.replace((R.id.fragment_place),fragment);
            ft2.commit();
        }
        if (view==findViewById(R.id.btn3)){
            fragment=new fragment_three();
            FragmentManager fm3=getSupportFragmentManager();
            FragmentTransaction ft3=fm3.beginTransaction();
            ft3.replace((R.id.fragment_place),fragment);
            ft3.commit();
        }




    }
}
