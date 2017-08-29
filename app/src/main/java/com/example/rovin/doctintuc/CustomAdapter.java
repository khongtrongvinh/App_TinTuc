package com.example.rovin.doctintuc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;// thu vien picasso

import java.util.List;

/**
 * Created by rovin on 16-Jan-17.
 */

public class CustomAdapter extends ArrayAdapter<Doctintuc> {

    public CustomAdapter(Context context, int resource, List<Doctintuc> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.dong_layout_view, null);
        }
        Doctintuc p = getItem(position);
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txttitle = (TextView) view.findViewById(R.id.textViewtitle);
            txttitle.setText(p.title);

            ImageView imageView= (ImageView) view.findViewById(R.id.imageView);
            Picasso.with(getContext()).load(p.hinhanh).into(imageView); // ham lay hinh anh tu internet


        }
        return view;
    }

}