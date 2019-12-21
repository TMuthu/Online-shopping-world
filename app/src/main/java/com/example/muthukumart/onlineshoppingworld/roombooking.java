package com.example.muthukumart.onlineshoppingworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class roombooking extends AppCompatActivity{
    ImageButton I1,I2,I3,I4,I5,I6,I7,I8,I9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roombooking);
        I1=(ImageButton)findViewById(R.id.image1);
        I2=(ImageButton)findViewById(R.id.image2);
        I3=(ImageButton)findViewById(R.id.image3);
        I4=(ImageButton)findViewById(R.id.image4);
        I5=(ImageButton)findViewById(R.id.image5);
        I6=(ImageButton)findViewById(R.id.image6);
        I7=(ImageButton)findViewById(R.id.image7);
        I8=(ImageButton)findViewById(R.id.image8);
        I9=(ImageButton)findViewById(R.id.image9);

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.agoda.com/");
                Intent p=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(p);
            }
        });
        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.mercure.com/");
                Intent q=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(q);
            }
        });
        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.makemytrip.com/");
                Intent r=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(r);
            }
        });
        I4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.citypartner.com/");
                Intent s=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(s);
            }
        });
        I5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.oyo.com/");
                Intent t=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(t);
            }
        });
        I6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.taj.com/");
                Intent u=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(u);
            }
        });
        I7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.treebo.com/");
                Intent vp=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(vp);
            }
        });
        I8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.booking.com/");
                Intent w=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(w);
            }
        });
        I9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.hotels.com/");
                Intent x=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(x);
            }
        });
    }
}
