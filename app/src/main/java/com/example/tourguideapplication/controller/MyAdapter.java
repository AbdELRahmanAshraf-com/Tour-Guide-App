package com.example.tourguideapplication.controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tourguideapplication.R;
import com.example.tourguideapplication.module.Place;
import com.example.tourguideapplication.ui.main.PlaceInfoActivity;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {

    public MyAdapter(@NonNull Context context, ArrayList<Place> mPlace) {
        super(context, 0, mPlace);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_module, parent, false);
        }
        final Place place = (Place) getItem(position);
        ImageView placeImage = convertView.findViewById(R.id.image);
        TextView placeName = convertView.findViewById(R.id.name);
        LinearLayout mLinear = convertView.findViewById(R.id.linear1);
        placeImage.setImageResource(place.getImage());
        placeName.setText(place.getName());
        mLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), PlaceInfoActivity.class);
                intent.putExtra("placeName", place.getName());
                intent.putExtra("placeDis", place.getDiscription());
                intent.putExtra("placeImage", place.getImage());
                intent.putExtra("placeAd", place.getAdress());
                getContext().startActivity(intent);
            }
        });
        return convertView;
    }
}
