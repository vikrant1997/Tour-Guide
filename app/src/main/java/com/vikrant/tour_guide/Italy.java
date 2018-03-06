package com.vikrant.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vikrant on 09-01-2018.
 */

public class Italy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Rome), getString(R.string.Kerri), getString(R.string.LaPergola),
                getString(R.string.Roman_Fourm), getString(R.string.Quirinale), R.drawable.petergof));
        places.add(new Place(getString(R.string.Milan), getString(R.string.Wolf_Alice), getString(R.string.Pizza_hut),
                getString(R.string.CenaColo), getString(R.string.Mythos), R.drawable.moscow));
        places.add(new Place(getString(R.string.Amalfi), getString(R.string.LaPergola), getString(R.string.RoseWell),
                getString(R.string.Ravello), getString(R.string.Miramalfi), R.drawable.valencia));
        places.add(new Place(getString(R.string.Venice), getString(R.string.Chinese_Man), getString(R.string.LaCaraVella),
                getString(R.string.Venetian), getString(R.string.All_Angelo), R.drawable.venice));
        places.add(new Place(getString(R.string.Pisa), getString(R.string.JuneInFlourence), getString(R.string.Gusto_Giusto),
                getString(R.string.Del_Duomo), getString(R.string.SamRanieri), R.drawable.pisa));
        places.add(new Place(getString(R.string.LakeGarda), getString(R.string.FishFestival), getString(R.string.MarcoEDaniela),
                getString(R.string.Caseus), getString(R.string.GrotteDi), R.drawable.lake_garda));

        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
