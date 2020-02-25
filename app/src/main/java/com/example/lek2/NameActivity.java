package com.example.lek2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        etName = (EditText)findViewById(R.id.etName);

        ((Button) findViewById(R.id.buttonNext)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToNextActivity();
            }
        });


    }

    private void redirectToNextActivity() {
        if (!TextUtils.isEmpty(etName.getText())) {
            Intent intent = new Intent(this, AddressActivity.class);
            intent.putExtra(Constants.NAME_KEY, etName.getText().toString());
            startActivity(intent);
        }
    }

    private void finishActivity(){
        finish();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(Constants.TAG,"Name_act onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(Constants.TAG,"Name_act onRestoreInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Constants.TAG,"Name_act_onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Constants.TAG,"Name_act_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Constants.TAG,"Name_act_onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Constants.TAG,"Name_act_onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Constants.TAG,"Name_act_onResume");
    }
}
