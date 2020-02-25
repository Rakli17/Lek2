package com.example.lek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    TextView name;
    TextView address;
    TextView dateOfBith;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        name = findViewById(R.id.ID);
        address = findViewById(R.id.addressId);
        dateOfBith = findViewById(R.id.dateId);


        Intent intent = getIntent();


        name.setText(intent.getStringExtra(Constants.NAME_KEY));
        address.setText(intent.getStringExtra(Constants.ADDRESS_KEY));
        dateOfBith.setText(intent.getStringExtra(Constants.DATE_OF_BIRTH_KEY));


    }


    private void finishActivity(){
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Constants.TAG,"sum_act_onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Constants.TAG,"sum_act_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Constants.TAG,"sum_act_onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Constants.TAG,"sum_act_onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Constants.TAG,"sum_act_onResume");
    }
}
