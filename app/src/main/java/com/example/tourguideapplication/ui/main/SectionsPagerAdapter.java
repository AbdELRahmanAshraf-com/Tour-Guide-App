package com.example.tourguideapplication.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourguideapplication.R;

import java.util.ArrayList;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;
    private ArrayList<Fragment> arrayOfFragments;

    public SectionsPagerAdapter(Context context, ArrayList<Fragment> arrayOfFragments, FragmentManager fm) {
        super(fm);
        mContext = context;
        this.arrayOfFragments = arrayOfFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return arrayOfFragments.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return arrayOfFragments.size();
    }
}