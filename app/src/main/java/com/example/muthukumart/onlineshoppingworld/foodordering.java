package com.example.muthukumart.onlineshoppingworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URI;

public class foodordering extends AppCompatActivity {
    ImageButton i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodordering);
        i7=(ImageButton)findViewById(R.id.imageButton);
        i8=(ImageButton)findViewById(R.id.ib8);
        i9=(ImageButton)findViewById(R.id.ib9);
        i10=(ImageButton)findViewById(R.id.ib10);
        i11=(ImageButton)findViewById(R.id.ib11);
        i12=(ImageButton)findViewById(R.id.ib12);
        i13=(ImageButton)findViewById(R.id.ib13);
        i14=(ImageButton)findViewById(R.id.ib14);
        i15=(ImageButton)findViewById(R.id.ib15);
        i16=(ImageButton)findViewById(R.id.ib16);
        i17=(ImageButton)findViewById(R.id.ib17);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.foodpanda.com/");
                Intent p=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(p);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.foodrool.com/");
                Intent q=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(q);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.gloriafood.com/");
                Intent s=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(s);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.zomato.com/");
                Intent r=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(r);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.chownow.com/");
                Intent t=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(t);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.doordash.com/");
                Intent u=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(u);
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.hotels.com/");
                Intent o=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(o);
            }
        });
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.swiggy.com/");
                Intent w=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(w);
            }
        });
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.orderup.com/");
                Intent t=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(t);
            }
        });
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.ordersense.com/");
                Intent e=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(e);
            }
        });
        i17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.seamless.com/");
                Intent r=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(r);
            }
        });
    }
}
