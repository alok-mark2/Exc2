package com.example.kelasbsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kelasbsqlite.database.DBControler;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class TemanBaru extends AppCompatActivity {
    private TextInputEditText tNama,tTelpon;
    private Button simpanBtn;
    String nm,tlp;
    DBControler controler = new DBControler(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teman_baru);

        tNama = (TextInputEditTextText)findViewById(R.id.tietNama);
        tTelpon = (TextInputEditText)findViewById(R.id.tietTelpon);
        simpanBtn = (Button)findViewById(R.id.buttonSave);

        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tNama.getText().toString().equals("")||tTelpon.getText(.toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Data belum komplit !", Toast.LENGTH_SHORT).show();
                }else {
                    nm = tNama.getText().toString();
                    tlp = tTelpon.getText().toString();

                    HashMap<String.String> qvalues = new HashMap<>();
                    qvalues.put("nama" ,nm);
                    qvalues.put("telpon",tlp);


                    controler.InsertData(qvalues);
                    callHome();
                }
            }
        });
    }

    public void callHome(){
        intent intent = new intent( TemanBaru.this,MainActivity.class);
        startActivity(intent);
        finish();
}