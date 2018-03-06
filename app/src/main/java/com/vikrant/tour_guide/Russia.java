package com.vikrant.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vikrant on 09-01-2018.
 */

public class Russia extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();


        places.add(new Place(getString(R.string.Moscow), getString(R.string.White_nights), getString(R.string.Savva),
                getString(R.string.Matreshka), getString(R.string.Quirinale), R.drawable.moscow));
        places.add(new Place(getString(R.string.Saint_Petersburg), getString(R.string.Wolf_Alice), getString(R.string.Pizza_hut),
                getString(R.string.CenaColo), getString(R.string.Mythos), R.drawable.saint_petersburg));
        places.add(new Place(getString(R.string.Lake_Baikal), getString(R.string.LaPergola), getString(R.string.RoseWell),
                getString(R.string.Ravello), getString(R.string.Miramalfi), R.drawable.lake_baikal));
        places.add(new Place(getString(R.string.Petergof), getString(R.string.ChineseMan), getString(R.string.LaCaraVella),
                getString(R.string.Venetian), getString(R.string.All_Angelo), R.drawable.petergof));
        places.add(new Place(getString(R.string.Suzdal), getString(R.string.June_In_Flourence), getString(R.string.Gusto_Giusto),
                getString(R.string.Del_Dumo), getString(R.string.Sam_Ranieri), R.drawable.suzdal));
        places.add(new Place(getString(R.string.Kazan), getString(R.string.Sabantuy), getString(R.string.Pashmir),
                getString(R.string.Korston), getString(R.string.Kazan_Kremlin), R.drawable.lake_garda));


        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
