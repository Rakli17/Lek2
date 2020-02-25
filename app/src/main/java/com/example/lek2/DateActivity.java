package com.example.lek2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;

public class DateActivity extends AppCompatActivity {

    private String name;
    private String address;
    private DatePicker datePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        Intent intent = getIntent();
        name = getIntent().getStringExtra(Constants.NAME_KEY);
        address = getIntent().getStringExtra(Constants.ADDRESS_KEY);


        datePicker = (DatePicker) findViewById(R.id.DatePicker);
        datePicker.updateDate(1980,1,1);


        ((Button) findViewById(R.id.buttonNext3)).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                redirectToNextActivity();

            }
        });

        ((Button) findViewById(R.id.backButton2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishActivity();
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void redirectToNextActivity(){
        Intent i = new Intent(this,SummaryActivity.class);
        i.putExtra(Constants.ADDRESS_KEY, address);
        i.putExtra(Constants.NAME_KEY, name);

        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int day = datePicker.getDayOfMonth();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(calendar.getTime());
        i.putExtra(Constants.DATE_OF_BIRTH_KEY,formattedDate);

        startActivity(i);

    }

    private void finishActivity() {
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Constants.TAG,"date_act_onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Constants.TAG,"date_act_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Constants.TAG,"date_act_onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Constants.TAG,"date_act_onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Constants.TAG,"date_act_onResume");
    }
}
