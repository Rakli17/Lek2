package com.example.lek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    private EditText etAddress;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        name = getIntent().getStringExtra(Constants.NAME_KEY);
        etAddress = (EditText) findViewById(R.id.etAddress);

        ((Button) findViewById(R.id.buttonNext2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToNextActivity();
            }
        });

        ((Button) findViewById(R.id.backButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishActivity();
            }
        });
    }


    private void redirectToNextActivity() {
        if (!TextUtils.isEmpty(etAddress.getText())) {
            Intent intent = new Intent(this, DateActivity.class);
            intent.putExtra(Constants.ADDRESS_KEY,etAddress.getText().toString());
            intent.putExtra(Constants.NAME_KEY,name);
            startActivity(intent);
        }
    }


    private void finishActivity(){
        finish();
    };

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Constants.TAG,"add_act_onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Constants.TAG,"add_act_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Constants.TAG,"add_act_onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Constants.TAG,"add_act_onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Constants.TAG,"add_act_onResume");
    }
}
