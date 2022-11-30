package com.example.conganapk126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {
    private TextView name;
    private ListView lvTacPham;
    private ArrayList<listTPitem> arrayListTP;
    private listAdapter adapter;
    private TextView txtDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        name = findViewById(R.id.name);

        name.setText(intent.getStringExtra("name"));
        txtDetail = (TextView) findViewById(R.id.list_detail);
        txtDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail.this, TomTatTP.class);
                startActivity(intent);
            }
        });

        AnhXa();
        adapter = new listAdapter(this, R.layout.tacpham, arrayListTP);
        lvTacPham.setAdapter(adapter);

        lvTacPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent = new Intent(Detail.this, TomTatTP.class);
                    intent.putExtra("name", "William Shakespeare");
                    intent.putExtra("mota", "Roy Royal");
                    startActivity(intent);
                }
                if(i==1) {
                    Intent intent = new Intent(Detail.this, TomTatTP.class);
                    intent.putExtra("name", "William Vbion");
                    intent.putExtra("mota", "Tác phẩm mang phong cách truyền thuyết");
                    startActivity(intent);
                }
                else  {
                    Toast.makeText(Detail.this, "No Item Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void AnhXa() {
        lvTacPham = (ListView) findViewById(R.id.list_item_tacpham);
        arrayListTP = new ArrayList<>();
        arrayListTP.add(new listTPitem("William Shakespeare", "Tác phẩm siêu kinh điển của nhà văn William Shakespeare"));
        arrayListTP.add(new listTPitem("William Vbion", "Tác phẩm mang phong cách truyền thuyết"));

    }
}