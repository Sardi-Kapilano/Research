package com.bewei.dirga_online;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ListDataCar extends ListActivity {
    String[] mob = new String[] { "bmw", "chevrolet", "daihatsu", "honda", "mazda","nissan" };

    @Override 
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        CustomDataCar cv = new CustomDataCar(this, mob);
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
