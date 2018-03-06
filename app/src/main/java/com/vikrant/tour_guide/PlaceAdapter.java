package com.vikrant.tour_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vikrant on 09-01-2018.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places){
        super(context,0,places);

    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listitemView=convertView;
        if(listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.place_item,parent,false);
        }
        Place currentitem=getItem(position);

        ImageView imageView=listitemView.findViewById(R.id.show_image);
        TextView nameview=listitemView.findViewById(R.id.show_name);
        TextView eventview=listitemView.findViewById(R.id.show_events);
        TextView resview=listitemView.findViewById(R.id.show_res);
        TextView historicalview=listitemView.findViewById(R.id.show_his);
        TextView hotelsview=listitemView.findViewById(R.id.show_hotels);

        imageView.setImageResource(currentitem.getImageResourceId());
        nameview.setText(currentitem.getName());
        eventview.setText(currentitem.getEvent());
        resview.setText(currentitem.getRestaurants());
        historicalview.setText(currentitem.getHist());
        hotelsview.setText(currentitem.getHotels());
        return listitemView;
    }
}
