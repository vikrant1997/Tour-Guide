package com.vikrant.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vikrant on 09-01-2018.
 */

public class Spain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Barcelona), getString(R.string.Lady_Gaga), getString(R.string.LaPergola),
                getString(R.string.Axel), getString(R.string.Quirinale), R.drawable.saint_petersburg));
        places.add(new Place(getString(R.string.Madrid), getString(R.string.RoloTomassi), getString(R.string.Pizza_Hut),
                getString(R.string.CenaColo), getString(R.string.Mythos), R.drawable.madrid));
        places.add(new Place(getString(R.string.Granada), getString(R.string.LaPergola), getString(R.string.RoseWell),
                getString(R.string.Melia), getString(R.string.Miramalfi), R.drawable.strasbourg));
        places.add(new Place(getString(R.string.Valencia), getString(R.string.Ice_hockey), getString(R.string.LaCaraVella),
                getString(R.string.Le_Perule), getString(R.string.All_Angelo), R.drawable.valencia));
        places.add(new Place(getString(R.string.Majorca), getString(R.string.Jazz), getString(R.string.Gusto),
                getString(R.string.Del_Dumo), getString(R.string.Kleber), R.drawable.lake_baikal));
        places.add(new Place(getString(R.string.Ibiza), getString(R.string.SpotLightParty), getString(R.string.Can_Domingo),
                getString(R.string.Playsol), getString(R.string.Torre_Des_Molar), R.drawable.venice));


        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}