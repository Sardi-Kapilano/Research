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
public class CustomDataMotorCycle extends ArrayAdapter{

    private final Context context;
    private final String[] values;

    public CustomDataMotorCycle(Context context, String[] values) {
        super(context, R.layout.activity_list_motor_cycle, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_list_motor_cycle, parent, false);
        TextView tv = (TextView) rowView.findViewById(R.id.label);
        ImageView iv = (ImageView) rowView.findViewById(R.id.logo);

        String item_value = values[position];
        if (item_value.equals("honda")) {
            iv.setImageResource(R.drawable.hondamotor);
            tv.setText(item_value);
        } else if (item_value.equals("ducati")) {
            iv.setImageResource(R.drawable.ducati);
            tv.setText(item_value);
        } else if (item_value.equals("harley")) {
            iv.setImageResource(R.drawable.harley);
            tv.setText(item_value);
        } else if (item_value.equals("kawasaki")) {
            iv.setImageResource(R.drawable.kawasaki);
            tv.setText(item_value);
        } else if (item_value.equals("ktm")) {
            iv.setImageResource(R.drawable.ktm);
            tv.setText(item_value);
        }else if (item_value.equals("piaggio")) {
            iv.setImageResource(R.drawable.piaggio);
            tv.setText(item_value);
        }else if (item_value.equals("suzuki")) {
            iv.setImageResource(R.drawable.suzuki);
            tv.setText(item_value);
        }else if (item_value.equals("yamaha")) {
            iv.setImageResource(R.drawable.yamaha);
            tv.setText(item_value);
        }

        return rowView;
    }
}
