package com.example.fragmenttransaction;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AndroidFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BBB","onCreate Android Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("BBB","onCreate View Android Fragment");
        return inflater.inflate(R.layout.fragment_android, container, false);
    }

    @Override
    public void onDestroyView() {
        Log.d("BBB","onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BBB","onDetach");
    }
}