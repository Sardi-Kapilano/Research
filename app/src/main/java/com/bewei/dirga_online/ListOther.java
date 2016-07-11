package com.bewei.dirga_online;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ListOther extends ListActivity {
    String[] mob = new String[] { "Bearing", "Breakpad", "Breakshoe", "Busi", "FilterR2","Clutch" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        CustomOther cv = new CustomOther(this, mob);
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
