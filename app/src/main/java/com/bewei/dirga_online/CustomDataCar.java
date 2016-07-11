package com.bewei.dirga_online;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BWI-02 on 5/20/2016.
 */
public class CustomDataCar extends ArrayAdapter{

    private final Context context;
    private final String[] values;

    public CustomDataCar(Context context, String[] values) {
        super(context, R.layout.activity_list_data_car, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_list_data_car, parent, false);
        TextView tv = (TextView) rowView.findViewById(R.id.label);
        ImageView iv = (ImageView) rowView.findViewById(R.id.logo);

        String item_value = values[position];
        if (item_value.equals("bmw")) {
            iv.setImageResource(R.drawable.bmw);
            tv.setText(item_value);
        } else if (item_value.equals("chevrolet")) {
            iv.setImageResource(R.drawable.chevrolet);
            tv.setText(item_value);
        } else if (item_value.equals("daihatsu")) {
            iv.setImageResource(R.drawable.daihatsu);
            tv.setText(item_value);
        } else if (item_value.equals("honda")) {
            iv.setImageResource(R.drawable.honda);
            tv.setText(item_value);
        } else if (item_value.equals("mazda")) {
            iv.setImageResource(R.drawable.mazda);
            tv.setText(item_value);
        }else if (item_value.equals("nissan")) {
            iv.setImageResource(R.drawable.nissan);
            tv.setText(item_value);
        }

        return rowView;
    }
}
