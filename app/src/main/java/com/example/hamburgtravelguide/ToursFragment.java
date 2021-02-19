package com.example.hamburgtravelguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ToursFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        Tours.listOfTours(places, getContext());

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
