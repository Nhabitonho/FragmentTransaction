package com.example.fragmenttransaction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager mFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();
    }

    public void addAndroid(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.add(R.id.liearlayoutContainer,androidFragment,"FragmentAndroid");
        fragmentTransaction.addToBackStack("stackAndroid");
        fragmentTransaction.commit();
    }

    public void addIos(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        IosFragment IOSFragment = new IosFragment();
        fragmentTransaction.add(R.id.liearlayoutContainer,IOSFragment,"FragmentIOS");
        fragmentTransaction.addToBackStack("stackIOS");
        fragmentTransaction.commit();
    }

    public void replaceAndroid(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.replace(R.id.liearlayoutContainer,androidFragment,"FragmentAndroid");
        fragmentTransaction.commit();
    }

    public void replaceIos(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        IosFragment IOSFragment = new IosFragment();
        fragmentTransaction.replace(R.id.liearlayoutContainer,IOSFragment,"FragmentIOS");
        fragmentTransaction.commit();
    }

    public void removeAndroid(View view) {
        AndroidFragment androidFragment = (AndroidFragment)mFragmentManager.findFragmentByTag("FragmentAndroid");
        if(androidFragment!=null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.remove(androidFragment);
            fragmentTransaction.commit();
        }
    }

    public void removeIos(View view) {
         IosFragment  iosFragment = (IosFragment)mFragmentManager.findFragmentByTag("FragmentIOS");
        if(iosFragment!=null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.remove(iosFragment);
            fragmentTransaction.commit();
        }
    }

    public void popbackstack(View view) {
        mFragmentManager.popBackStack(2,FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    public void detach(View view) {
        AndroidFragment androidFragment = (AndroidFragment)mFragmentManager.findFragmentByTag("FragmentAndroid");
        if(androidFragment!=null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.detach(androidFragment);
            fragmentTransaction.commit();
        }
    }

    public void attach(View view) {
        AndroidFragment androidFragment = (AndroidFragment)mFragmentManager.findFragmentByTag("FragmentAndroid");
        if(androidFragment!=null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.attach(androidFragment);
            fragmentTransaction.commit();
        }
    }
}