package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input_nama, input_alamat;
    Button proses;
    private String KEY_NAME = "nama";
    private  String KEY_NAME2 = "alamat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_nama = findViewById(R.id.nama);
        input_alamat = findViewById(R.id.alamat);
        proses = findViewById(R.id.btn_proses);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputnama = input_nama.getText().toString();
                String inputalamat = input_alamat.getText().toString();

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra(KEY_NAME, inputnama);
                i.putExtra(KEY_NAME2, inputalamat);
                startActivity(i);
            }
        });
    }
}
