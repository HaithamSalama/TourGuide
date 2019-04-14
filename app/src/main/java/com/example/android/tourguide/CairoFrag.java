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


public class CairoFrag extends Fragment {


    public CairoFrag() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create a list of Places
        final ArrayList<Places> Places = new ArrayList();
        Places.add(new Places(getResources().getString(R.string.cairoTower), getResources().getString(R.string.cairoTowerDes), R.drawable.cairo_tower));
        Places.add(new Places(getResources().getString(R.string.salahCastle), getResources().getString(R.string.salahCastleDes), R.drawable.salah_el_dein_castle));
        Places.add(new Places(getResources().getString(R.string.azharPark), getResources().getString(R.string.azharParkDes), R.drawable.azhar_park));
        Places.add(new Places(getResources().getString(R.string.egyptianMuseum), getResources().getString(R.string.egyptianMuseumDes), R.drawable.egyptian_museum));
        Places.add(new Places(getResources().getString(R.string.hangingChurch), getResources().getString(R.string.hangingChurchDes), R.drawable.hanging_church));
        Places.add(new Places(getResources().getString(R.string.fortBabylon), getResources().getString(R.string.fortBabylonDes), R.drawable.coptic_cairo));
        Places.add(new Places(getResources().getString(R.string.khanElKhalili), getResources().getString(R.string.khanElKhaliliDes), R.drawable.khan_el_khalily));
        Places.add(new Places(getResources().getString(R.string.tahrirSquare), getResources().getString(R.string.tahrirSquareDes), R.drawable.tahrir_square));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), Places, R.color.cairo_back);

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

