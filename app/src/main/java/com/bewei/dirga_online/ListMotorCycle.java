package com.bewei.dirga_online;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ListMotorCycle extends ListActivity {
    String[] mob = new String[] { "honda", "ducati", "harley", "kawasaki", "ktm","piaggio","suzuki","yamaha" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        CustomDataMotorCycle cv = new CustomDataMotorCycle(this, mob);
        setListAdapter(cv);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

// getting the value of clicked item
        String clicked_item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, clicked_item, Toast.LENGTH_SHORT).show();
    }

}
