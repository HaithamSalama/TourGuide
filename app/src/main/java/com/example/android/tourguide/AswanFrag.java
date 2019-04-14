package com.example.android.tourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AswanFrag extends Fragment {


    public AswanFrag() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create a list of Places
        final ArrayList<Places> Places = new ArrayList();
        Places.add(new Places(getResources().getString(R.string.highDam), getResources().getString(R.string.highDamDes), R.drawable.high_dam));
        Places.add(new Places(getResources().getString(R.string.nileMuseum), getResources().getString(R.string.nileMuseumDes), R.drawable.nile_musuem));
        Places.add(new Places(getResources().getString(R.string.nubeMuseum), getResources().getString(R.string.nubeMuseumDes), R.drawable.nubian_musuem));
        Places.add(new Places(getResources().getString(R.string.fryalGarden), getResources().getString(R.string.fryalGardenDes), R.drawable.fryal_garden));
        Places.add(new Places(getResources().getString(R.string.aboSemple), getResources().getString(R.string.aboSempleDes), R.drawable.abu_simble));
        Places.add(new Places(getResources().getString(R.string.karnak), getResources().getString(R.string.karnakDes), R.drawable.karnak_temple));
        Places.add(new Places(getResources().getString(R.string.kingsValley), getResources().getString(R.string.kingsValleyDes), R.drawable.kings_valley));
        Places.add(new Places(getResources().getString(R.string.kebashRoad), getResources().getString(R.string.kebashRoadDes), R.drawable.kebash_road));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), Places, R.color.aswan_back);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            }
        });
        return rootView;
    }


}

