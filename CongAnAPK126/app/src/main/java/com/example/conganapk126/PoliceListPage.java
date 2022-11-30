package com.example.conganapk126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PoliceListPage extends AppCompatActivity {
    private ListView lvPolice;
    private ArrayList <PoliceItem> arrayListPolice;
    private PoliceAdapter adapter;
    private ImageView btnBackLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_list_page);
        AnhXa();
        adapter = new PoliceAdapter(this, R.layout.police, arrayListPolice);
        lvPolice.setAdapter(adapter);
        btnBackLogin = (ImageView) findViewById(R.id.imgBackLogin);
        btnBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoliceListPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        lvPolice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    if(i==0) {
                        Intent intent = new Intent(PoliceListPage.this, Detail.class);
                        intent.putExtra("name", "J.K.Rowling");
                        intent.putExtra("tacpham", "Roy Royal");
                        startActivity(intent);
                    }
                    if(i==1) {
                        Intent intent = new Intent(PoliceListPage.this, Detail.class);
                        intent.putExtra("name", "Stephenie Meyer");
                        intent.putExtra("tacpham", "Stephen Natalya");
                        startActivity(intent);
                    }
                    if(i==2) {
                        Intent intent = new Intent(PoliceListPage.this, Detail.class);
                        intent.putExtra("name", "Margaret Mitchell");
                        intent.putExtra("tacpham", "Violet");
                        startActivity(intent);
                    }
                    if(i==3) {
                        Intent intent = new Intent(PoliceListPage.this, Detail.class);
                        intent.putExtra("name", "JD Salinger");
                        intent.putExtra("tacpham", "Wiro Akaghi");
                        startActivity(intent);
                    }
                    if(i==4) {
                        Intent intent = new Intent(PoliceListPage.this, Detail.class);
                        intent.putExtra("name", "William Shakespeare");
                        intent.putExtra("tacpham", "Mono");
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(PoliceListPage.this, "No Detail Clicked", Toast.LENGTH_SHORT).show();
                    }


            }
        });
    }
    private void AnhXa() {
        lvPolice = (ListView) findViewById(R.id.list_item_tacpham);
        arrayListPolice = new ArrayList<>();
        arrayListPolice.add(new PoliceItem("J.K.Rowling", "Nhà văn", "Anh", 5, R.drawable.library_1));
        arrayListPolice.add(new PoliceItem("Stephenie Meyer", "Tiểu thuyết gia", "Mỹ", 4, R.drawable.library_2));
        arrayListPolice.add(new PoliceItem("Margaret Mitchell", "Tiểu thuyết gia", "Mỹ", 5, R.drawable.library_3));
        arrayListPolice.add(new PoliceItem("JD Salinger", "Nhà văn", "Mỹ", 3, R.drawable.library_4));
        arrayListPolice.add(new PoliceItem("William Shakespeare", "Nhà văn", "Anh", 3, R.drawable.library_5));

    }
}