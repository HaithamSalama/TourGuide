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


public class GuizaFrag extends Fragment {


    public GuizaFrag() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create a list of Places
        final ArrayList<Places> Places = new ArrayList();
        Places.add(new Places(getResources().getString(R.string.guizaPyramids), getResources().getString(R.string.guizaPyramidsDes), R.drawable.great_pyramids));
        Places.add(new Places(getResources().getString(R.string.saqqaraPyramid), getResources().getString(R.string.saqqaraPyramidDes), R.drawable.saqqara_pyramid));
        Places.add(new Places(getResources().getString(R.string.pharonicVillage), getResources().getString(R.string.pharonicVillageDes), R.drawable.pharaonic_village));
        Places.add(new Places(getResources().getString(R.string.pharonicNileShip), getResources().getString(R.string.pharonicNileShipDes), R.drawable.pharaonic_ship));
        Places.add(new Places(getResources().getString(R.string.dahshourPyramid), getResources().getString(R.string.dahshourPyramidDes), R.drawable.dahshour_pyramid));
        Places.add(new Places(getResources().getString(R.string.tombOfTi), getResources().getString(R.string.tombOfTiDes), R.drawable.mastaba_of_ti));
        Places.add(new Places(getResources().getString(R.string.tahaHussinMuseum), getResources().getString(R.string.tahaHussinMuseumDes), R.drawable.taha_hussin));
        Places.add(new Places(getResources().getString(R.string.ahmedShawkyMuseum), getResources().getString(R.string.ahmedShawkyMuseumDes), R.drawable.ahmed_shawky));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), Places, R.color.guiza_back);

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

