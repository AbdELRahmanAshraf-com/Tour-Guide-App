package com.example.tourguideapplication.ui.main;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguideapplication.R;

public class PlaceInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);

        Bundle b = getIntent().getExtras();
        assert b != null;
        int placeName = b.getInt("placeName");
        int placeDis = b.getInt("placeDis");
        int placeImage = b.getInt("placeImage");
        int placeAd = b.getInt("placeAd");

        ImageView mplaceImage = findViewById(R.id.iv_placeImage);
        TextView mplaceName = findViewById(R.id.tv_placeName);
        TextView mplaceDis = findViewById(R.id.tv_placeDis);
        TextView mplaceAd = findViewById(R.id.tv_placeAd);
        mplaceImage.setImageResource(placeImage);
        mplaceName.setText(placeName);
        mplaceDis.setText(placeDis);
        mplaceAd.setText(placeAd);


    }
}
