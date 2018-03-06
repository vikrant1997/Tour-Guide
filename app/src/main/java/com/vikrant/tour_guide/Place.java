package com.vikrant.tour_guide;

/**
 * Created by Vikrant on 09-01-2018.
 */

public class Place {
    private int a=-1;
    private int mImageResourceId=a;
    private String mName,mEvent,mRestaurants,mHist,mHotels;

    public Place(String Name,String Event,String Restaurants,String Hotels,String Hist,int ImageResouceId){
        mName=Name;
        mEvent=Event;
        mRestaurants=Restaurants;
        mHist=Hist;
        mHotels=Hotels;
        mImageResourceId=ImageResouceId;
    }
    public String getName(){return mName;}
    public String getEvent(){return mEvent;}
    public String getRestaurants(){return mRestaurants;}
    public String getHist(){return mHist;}
    public String getHotels(){return mHotels;}

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        if (mImageResourceId==a)
            return false;
        else return true;
    }

}
