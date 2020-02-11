package com.example.tourguideapplication.module;

import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class DataBase {
    public ArrayList<Place> touristicPlaces() {
        ArrayList<Place> mTouristicPlaces = new ArrayList<>();
        mTouristicPlaces.add(new Place(R.string.n1TouristicName, R.string.n1TouristicDisc, R.drawable.onetouristic, R.string.n1TouristicAd));
        mTouristicPlaces.add(new Place(R.string.n2TouristicName, R.string.n2TouristicDisc, R.drawable.twotouristic, R.string.n2TouristicAd));
        mTouristicPlaces.add(new Place(R.string.n3TouristicName, R.string.n3TouristicDisc, R.drawable.threetouristic, R.string.n3TouristicAd));
        mTouristicPlaces.add(new Place(R.string.n4TouristicName, R.string.n4TouristicDisc, R.drawable.fourtouristic, R.string.n4TouristicAd));
        mTouristicPlaces.add(new Place(R.string.n5TouristicName, R.string.n5TouristicDisc, R.drawable.fivetouristic, R.string.n5TouristicAd));
        mTouristicPlaces.add(new Place(R.string.n6TouristicName, R.string.n6TouristicDisc, R.drawable.sixtouristic, R.string.n6TouristicAd));
        return mTouristicPlaces;
    }

    public ArrayList<Place> shoppingPlaces() {
        ArrayList<Place> mShoppingPlaces = new ArrayList<>();
        mShoppingPlaces.add(new Place(R.string.n1ShoppingName, R.string.n1ShoppingDisc, R.drawable.oneshop, R.string.n1ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n2ShoppingName, R.string.n2ShoppingDisc, R.drawable.twoshop, R.string.n2ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n3ShoppingName, R.string.n3ShoppingDisc, R.drawable.threeshop, R.string.n3ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n4ShoppingName, R.string.n4ShoppingDisc, R.drawable.fourshop, R.string.n4ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n5ShoppingName, R.string.n5ShoppingDisc, R.drawable.fiveshop, R.string.n5ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n6ShoppingName, R.string.n6ShoppingDisc, R.drawable.sixshop, R.string.n6ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n7ShoppingName, R.string.n7ShoppingDisc, R.drawable.sevenshop, R.string.n7ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n8ShoppingName, R.string.n8ShoppingDisc, R.drawable.eightshop, R.string.n8ShoppingAd));
        mShoppingPlaces.add(new Place(R.string.n9ShoppingName, R.string.n9ShoppingDisc, R.drawable.nineshop, R.string.n9ShoppingAd));
        return mShoppingPlaces;
    }

    public ArrayList<Place> foodPlaces() {
        ArrayList<Place> mFoodPlaces = new ArrayList<>();
        mFoodPlaces.add(new Place(R.string.n1foodName, R.string.n1foodDisc, R.drawable.onefood, R.string.n1foodAd));
        mFoodPlaces.add(new Place(R.string.n2foodName, R.string.n2foodDisc, R.drawable.twofood, R.string.n2foodAd));
        mFoodPlaces.add(new Place(R.string.n3foodName, R.string.n3foodDisc, R.drawable.threefood, R.string.n3foodAd));
        mFoodPlaces.add(new Place(R.string.n4foodName, R.string.n4foodDisc, R.drawable.fourfood, R.string.n4foodAd));
        mFoodPlaces.add(new Place(R.string.n5foodName, R.string.n5foodDisc, R.drawable.fivefood, R.string.n5foodAd));
        mFoodPlaces.add(new Place(R.string.n6foodName, R.string.n6foodDisc, R.drawable.sixfood, R.string.n6foodAd));
        mFoodPlaces.add(new Place(R.string.n7foodName, R.string.n7foodDisc, R.drawable.sevenfood, R.string.n7foodAd));
        mFoodPlaces.add(new Place(R.string.n8foodName, R.string.n8foodDisc, R.drawable.eightfood, R.string.n8foodAd));
        mFoodPlaces.add(new Place(R.string.n9foodName, R.string.n9foodDisc, R.drawable.ninefood, R.string.n9foodAd));
        return mFoodPlaces;
    }

    public ArrayList<Place> hotelPlaces() {
        ArrayList<Place> mHotels = new ArrayList<>();
        mHotels.add(new Place(R.string.n1hotelName, R.string.n1hotelDis, R.drawable.onehotel, R.string.n1hotelAd));
        mHotels.add(new Place(R.string.n2hotelName, R.string.n2hotelDis, R.drawable.twohotel, R.string.n2hotelAd));
        mHotels.add(new Place(R.string.n3hotelName, R.string.n3hotelDis, R.drawable.threehotel, R.string.n3hotelAd));
        mHotels.add(new Place(R.string.n4hotelName, R.string.n4hotelDis, R.drawable.fourhotel, R.string.n4hotelAd));
        mHotels.add(new Place(R.string.n5hotelName, R.string.n5hotelDis, R.drawable.fivehotel, R.string.n5hotelAd));
        mHotels.add(new Place(R.string.n6hotelName, R.string.n6hotelDis, R.drawable.sixhotel, R.string.n6hotelAd));
        mHotels.add(new Place(R.string.n7hotelName, R.string.n7hotelDis, R.drawable.sevenhotel, R.string.n7hotelAd));
        mHotels.add(new Place(R.string.n8hotelName, R.string.n8hotelDis, R.drawable.eighthotel, R.string.n8hotelAd));
        mHotels.add(new Place(R.string.n9hotelName, R.string.n9hotelDis, R.drawable.ninehotel, R.string.n9hotelAd));
        return mHotels;
    }
}
