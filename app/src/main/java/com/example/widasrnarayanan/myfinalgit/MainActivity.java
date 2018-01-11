package com.example.widasrnarayanan.myfinalgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rajalibrary.RajaSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RajaSDK rajaSDK=new RajaSDK();
        Toast.makeText(getApplicationContext(),rajaSDK.getName(),Toast.LENGTH_LONG).show();
    }

}
