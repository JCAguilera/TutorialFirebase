package com.tutorial.firebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter {

    private final Activity context;
    private final ArrayList<ItemModel> itemArray;

    public ListAdapter(Activity context, ArrayList<ItemModel> items){
        super(context,R.layout.listview_row , items);
        this.context=context;
        this.itemArray = items;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        TextView titleTextField = (TextView) rowView.findViewById(R.id.title);
        TextView descTextField = (TextView) rowView.findViewById(R.id.desc);

        titleTextField.setText(itemArray.get(position).title);
        descTextField.setText(itemArray.get(position).desc);

        return rowView;
    }

}
