package com.example.tourguideapplication.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tourguideapplication.R;
import com.example.tourguideapplication.controller.MyAdapter;
import com.example.tourguideapplication.module.DataBase;
import com.example.tourguideapplication.module.Place;

import java.util.ArrayList;

public class BlankFragment4 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DataBase dataBase = new DataBase();
        ArrayList<Place> mArray = dataBase.hotelPlaces();
        ListView mList = view.findViewById(R.id.hotels);
        MyAdapter myAdapter = new MyAdapter(getContext(), mArray);
        mList.setAdapter(myAdapter);

    }
}
