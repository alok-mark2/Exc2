package com.example.kelasbsqlite;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView nama,notel;

    Bundle bundle = getIntent().getExtras();

    String nama = bundle.getString("a");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        switch (nama){

                nama.setText(nama;
                notel.setText(notel);
                break;


        }

    }
}