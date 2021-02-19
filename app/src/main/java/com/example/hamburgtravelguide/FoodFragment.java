package com.example.hamburgtravelguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        Food.listOfFood(places, getContext());

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}