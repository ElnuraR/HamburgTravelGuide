package com.example.hamburgtravelguide;

import android.content.Context;

import java.util.ArrayList;

public class Views {

    public static void listOfViews(ArrayList<Place> list, Context context) {

        list.add(new Place(context.getString(R.string.first_view_name),
                context.getString(R.string.first_view_desc),
                context.getString(R.string.first_view_full_desc),
                context.getString(R.string.first_view_address), R.drawable.first_view));

        list.add(new Place(context.getString(R.string.second_view_name),
                context.getString(R.string.second_view_desc),
                context.getString(R.string.second_view_full_desc),
                context.getString(R.string.second_view_address), R.drawable.second_view));

        list.add(new Place(context.getString(R.string.third_view_name),
                context.getString(R.string.third_view_desc),
                context.getString(R.string.third_view_full_desc),
                context.getString(R.string.third_view_address),R.drawable.third_view));

        list.add(new Place(context.getString(R.string.fourth_view_name),
                context.getString(R.string.fourth_view_desc),
                context.getString(R.string.fourth_view_full_desc),
                context.getString(R.string.fourth_view_address), R.drawable.second_sight));
    }
}
