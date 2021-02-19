package com.example.hamburgtravelguide;

import android.content.Context;

import java.util.ArrayList;

public class Tours {

    public static void listOfTours(ArrayList<Place> list, Context context) {

        list.add(new Place(context.getString(R.string.first_tour_name),
                context.getString(R.string.first_tour_desc),
                context.getString(R.string.first_tour_full_desc),
                context.getString(R.string.first_tour_address), R.drawable.first_tour));

        list.add(new Place(context.getString(R.string.second_tour_name),
                context.getString(R.string.second_tour_desc),
                context.getString(R.string.second_tour_full_desc),
                context.getString(R.string.second_tour_address), R.drawable.second_tour));

        list.add(new Place(context.getString(R.string.third_tour_name),
                context.getString(R.string.third_tour_desc),
                context.getString(R.string.third_tour_full_desc),
                context.getString(R.string.third_tour_address),R.drawable.third_tour));

        list.add(new Place(context.getString(R.string.fourth_tour_name),
                context.getString(R.string.fourth_tour_desc),
                context.getString(R.string.fourth_tour_full_desc),
                context.getString(R.string.fourth_tour_address), R.drawable.fourth_tour));
    }
}
