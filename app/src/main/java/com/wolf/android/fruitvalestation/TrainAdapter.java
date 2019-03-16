package com.wolf.android.fruitvalestation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrainAdapter extends ArrayAdapter<Train> {

    Context context;
    ArrayList<Train> trainsList;

    public TrainAdapter(Context context, ArrayList<Train> trainsList) {
        super(context, 0, trainsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.train_list_item, parent,
                false);
        Train train = getItem(position);
        TextView trainTime = convertView.findViewById(R.id.train_time);
        trainTime.setText(train.getTrainMinutes());
        TextView trainPlatform = convertView.findViewById(R.id.train_platform);
        trainPlatform.setText(train.getTrainPlatform());
        TextView trainColor = convertView.findViewById(R.id.train_color);
        trainColor.setText(train.getTrainColor());

        return convertView;
    }


}
