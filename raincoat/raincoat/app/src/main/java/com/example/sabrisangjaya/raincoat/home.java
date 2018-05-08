package com.example.sabrisangjaya.raincoat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button btnkeluar,btntambah,btnhewansaya,btninfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btntambah=(Button)findViewById(R.id.btnTambahhewan);
        btninfo=(Button)findViewById(R.id.btnInfo);
        btnhewansaya=(Button)findViewById(R.id.btnHewansaya);
        btnkeluar=(Button)findViewById(R.id.btnKeluar);
        btnkeluar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(home.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btninfo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(home.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btntambah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(home.this,tambahhewan.class);
                startActivity(intent);
            }
        });
        btnhewansaya.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(home.this,hewansaya.class);
                startActivity(intent);
            }
        });
    }
}
