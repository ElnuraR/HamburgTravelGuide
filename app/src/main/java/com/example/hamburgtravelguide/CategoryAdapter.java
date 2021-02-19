package com.example.hamburgtravelguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new SightsFragment();
        } else if (position == 2) {
            return new ToursFragment();
        } else {
            return new ViewsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 2) {
            return mContext.getString(R.string.category_tours);
        } else {
            return mContext.getString(R.string.category_views);
        }
    }
}
