package com.vikrant.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vikrant on 09-01-2018.
 */

public class France extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Paris), getString(R.string.Fashion_Week), getString(R.string.Le_Cinq),
                getString(R.string.Bastilla_Opera), getString(R.string.Dauphine), R.drawable.venice));
        places.add(new Place(getString(R.string.Nice), getString(R.string.Mars_aux), getString(R.string.Las_Garcos),
                getString(R.string.Albert), getString(R.string.Mythos), R.drawable.lake_baikal));
        places.add(new Place(getString(R.string.French_Riveria), getString(R.string.Rolex_Monte), getString(R.string.Cafe_Milano),
                getString(R.string.Van_Der_Walk), getString(R.string.Occitan), R.drawable.madrid));
        places.add(new Place(getString(R.string.Chamonix), getString(R.string.Ice_hockey), getString(R.string.LaCaraVella),
                getString(R.string.LePerule), getString(R.string.All_Angelo), R.drawable.chamonix));
        places.add(new Place(getString(R.string.Stras_bourg), getString(R.string.Jazz), getString(R.string.GustoGiusto),
                getString(R.string.DelDuomo), getString(R.string.Kleber), R.drawable.strasbourg));
        places.add(new Place(getString(R.string.Lyon), getString(R.string.Sasha), getString(R.string.Gusto_Giusto),
                getString(R.string.ibis_Lyon), getString(R.string.Palais), R.drawable.suzdal));


        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}