package com.example.hamburgtravelguide;

import android.content.Context;

import java.util.ArrayList;

public class Sights {

    public static void listOfSights(ArrayList<Place> list, Context context) {

        list.add(new Place(context.getString(R.string.first_sight_name),
                context.getString(R.string.first_sight_desc),
                context.getString(R.string.first_sight_full_desc),
                context.getString(R.string.first_sight_address), R.drawable.first_sight));

        list.add(new Place(context.getString(R.string.second_sight_name),
                context.getString(R.string.second_sight_desc),
                context.getString(R.string.second_sight_full_desc),
                context.getString(R.string.second_sight_address), R.drawable.second_sight));

        list.add(new Place(context.getString(R.string.third_sight_name),
                context.getString(R.string.third_sight_desc),
                context.getString(R.string.third_sight_full_desc),
                context.getString(R.string.third_sight_address),R.drawable.third_sight));

        list.add(new Place(context.getString(R.string.fourth_sight_name),
                context.getString(R.string.fourth_sight_desc),
                context.getString(R.string.fourth_sight_full_desc),
                context.getString(R.string.fourth_sight_address), R.drawable.fourth_sight));
    }
}
