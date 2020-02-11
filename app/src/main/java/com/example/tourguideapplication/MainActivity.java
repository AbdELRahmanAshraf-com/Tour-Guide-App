package com.example.tourguideapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.tourguideapplication.ui.main.BlankFragment1;
import com.example.tourguideapplication.ui.main.BlankFragment2;
import com.example.tourguideapplication.ui.main.BlankFragment3;
import com.example.tourguideapplication.ui.main.BlankFragment4;
import com.example.tourguideapplication.ui.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fragment> arrayOfFragments = new ArrayList<Fragment>();
        arrayOfFragments.add(new BlankFragment1());
        arrayOfFragments.add(new BlankFragment2());
        arrayOfFragments.add(new BlankFragment3());
        arrayOfFragments.add(new BlankFragment4());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, arrayOfFragments, getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


    }
}