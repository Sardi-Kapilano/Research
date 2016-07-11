package com.bewei.dirga_online;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private ProgressDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {
                    // Showing progress dialog
                    pDialog = new ProgressDialog(Main2Activity.this);
                    pDialog.setMessage("Please wait...");
                    pDialog.setCancelable(false);
                    pDialog.show();


                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(),ListMotorCycle.class);

                startActivity(i);
                Toast.makeText(getApplicationContext(), "You Choice For Motorcycle", Toast.LENGTH_LONG).show();

            }

        });

        ImageButton imageButton4=(ImageButton)findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(),ListDataCar.class);

                startActivity(i);

                Toast.makeText(getApplicationContext(), "You Choice For Car", Toast.LENGTH_LONG).show();
            }

        });

        ImageButton imageButton5=(ImageButton)findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(),ListDataCar.class);

                startActivity(i);

                Toast.makeText(getApplicationContext(), "You Choice Other", Toast.LENGTH_LONG).show();
            }

        });


    }
}