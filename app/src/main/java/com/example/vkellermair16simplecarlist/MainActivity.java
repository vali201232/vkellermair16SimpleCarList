package com.example.vkellermair16simplecarlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String file = "customers_data.csv";
        try {
            String line = "";


            BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open(file)));
            br.readLine();
            line = br.readLine();
            do {
                String[] stringarr = line.split(",");

                line = br.readLine();
            } while (line != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
