package com.example.hamburgtravelguide;

import android.content.Context;

import java.util.ArrayList;

public class Food {

    public static void listOfFood(ArrayList<Place> list, Context context) {

        list.add(new Place(context.getString(R.string.first_food_name),
                context.getString(R.string.first_food_desc),
                context.getString(R.string.first_food_full_desc),
                context.getString(R.string.first_food_address),
                context.getString(R.string.first_food_phone), R.drawable.first_food));

        list.add(new Place(context.getString(R.string.second_food_name),
                context.getString(R.string.second_food_desc),
                context.getString(R.string.second_food_full_desc),
                context.getString(R.string.second_food_address),
                context.getString(R.string.second_food_phone), R.drawable.second_food));

        list.add(new Place(context.getString(R.string.third_food_name),
                context.getString(R.string.third_food_desc),
                context.getString(R.string.third_food_full_desc),
                context.getString(R.string.third_food_address),
                context.getString(R.string.third_food_phone), R.drawable.third_food));

        list.add(new Place(context.getString(R.string.fourth_food_name),
                context.getString(R.string.fourth_food_desc),
                context.getString(R.string.fourth_food_full_desc),
                context.getString(R.string.fourth_food_address),
                context.getString(R.string.fourth_food_phone), R.drawable.fourth_food));
    }
}
