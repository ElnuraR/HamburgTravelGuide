package com.example.hamburgtravelguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Place currentPlace = getItem(position);

        ImageView imageLocation = listItemView.findViewById(R.id.image);
        Glide.with(imageLocation).load(currentPlace.getImageSrc()).into(imageLocation);

        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentPlace.getDescription());

        TextView fullDescriptionTextView = listItemView.findViewById(R.id.full_description);
        fullDescriptionTextView.setText(currentPlace.getFullDescription());

        TextView addressTextView = listItemView.findViewById(R.id.address);
        String address = currentPlace.getAddress();
        addressTextView.setText(address);

        addressTextView.setPaintFlags(addressTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        addressTextView.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + address));
            getContext().startActivity(intent);
        });

        TextView phoneTextView = listItemView.findViewById(R.id.phone);
        if (currentPlace.getNumber() != null) {
            phoneTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.phone_icon,0,0,0);
            phoneTextView.setText(currentPlace.getNumber());
        }

        CardView cardView = listItemView.findViewById(R.id.cv);

        fullDescriptionTextView.setVisibility(View.GONE);
        addressTextView.setVisibility(View.GONE);
        phoneTextView.setVisibility(View.GONE);

        cardView.setOnClickListener(v -> {
            if (fullDescriptionTextView.getVisibility() == View.VISIBLE && addressTextView.getVisibility() == View.VISIBLE && phoneTextView.getVisibility() == View.VISIBLE) {
                fullDescriptionTextView.setVisibility(View.GONE);
                addressTextView.setVisibility(View.GONE);
                phoneTextView.setVisibility(View.GONE);
            } else if (fullDescriptionTextView.getVisibility() == View.GONE && addressTextView.getVisibility() == View.GONE && phoneTextView.getVisibility() == View.GONE) {
                fullDescriptionTextView.setVisibility(View.VISIBLE);
                addressTextView.setVisibility(View.VISIBLE);
                phoneTextView.setVisibility(View.VISIBLE);
            }
        });

        return listItemView;
    }
}
