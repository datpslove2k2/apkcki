package com.example.conganapk126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TomTatTP extends AppCompatActivity {
    private TextView name, mota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tom_tat_tp);
        Intent intent = getIntent();
        name = findViewById(R.id.txtName);
        mota = findViewById(R.id.txtMota);
        name.setText(intent.getStringExtra("name"));
        mota.setText(intent.getStringExtra("mota"));

    }
}