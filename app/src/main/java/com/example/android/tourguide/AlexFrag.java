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


public class AlexFrag extends Fragment {


    public AlexFrag() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create a list of Places
        final ArrayList<Places> Places = new ArrayList();
        Places.add(new Places(getResources().getString(R.string.qaitbay), getResources().getString(R.string.qaitbayDes), R.drawable.qaitbey_citadel));
        Places.add(new Places(getResources().getString(R.string.montaza), getResources().getString(R.string.montazaDes), R.drawable.montaza_park));
        Places.add(new Places(getResources().getString(R.string.antoniads), getResources().getString(R.string.antoniadsDes), R.drawable.alex_antoniadis));
        Places.add(new Places(getResources().getString(R.string.alexLibrary), getResources().getString(R.string.alexLibraryDes), R.drawable.alex_library));
        Places.add(new Places(getResources().getString(R.string.alexMuseum), getResources().getString(R.string.alexMuseumDes), R.drawable.alex_museum));
        Places.add(new Places(getResources().getString(R.string.stanlyBridge), getResources().getString(R.string.stanlyBridgeDes), R.drawable.stanly_bridge));
        Places.add(new Places(getResources().getString(R.string.rasTein), getResources().getString(R.string.rasTeinDes), R.drawable.ras_el_tein));
        Places.add(new Places(getResources().getString(R.string.cleopatra), getResources().getString(R.string.cleopatraDes), R.drawable.cleopatra_pallace));
        Places.add(new Places(getResources().getString(R.string.aboAbas), getResources().getString(R.string.aboAbasDes), R.drawable.abo_abas));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), Places, R.color.alex_back);

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

