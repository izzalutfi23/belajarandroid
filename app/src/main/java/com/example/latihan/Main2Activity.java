package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nama, alamat;
    private String KEY_NAME = "nama";
    private String KEY_NAME2 = "alamat";
    private String getnama;
    private String getalamat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama = findViewById(R.id.tampil);
        alamat = findViewById(R.id.alamat);
        Intent i = getIntent();
        getnama = i.getStringExtra(KEY_NAME);
        getalamat = i.getStringExtra(KEY_NAME2);
        nama.setText("Nama : "+getnama);
        alamat.setText("Alamat : "+getalamat);

    }
}
