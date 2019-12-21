package com.example.muthukumart.onlineshoppingworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class shopping2 extends AppCompatActivity {
    ImageButton IB1,IB2,IB3,IB4,IB5,IB6,IB7,IB8,IB9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping2);
        IB1=(ImageButton)findViewById(R.id.imageq1);
        IB2=(ImageButton)findViewById(R.id.imageq2);
        IB3=(ImageButton)findViewById(R.id.imageq3);
        IB4=(ImageButton)findViewById(R.id.imageq4);
        IB5=(ImageButton)findViewById(R.id.imageq5);
        IB6=(ImageButton)findViewById(R.id.imageq6);
        IB7=(ImageButton)findViewById(R.id.imageq7);
        IB8=(ImageButton)findViewById(R.id.imageq8);
        IB9=(ImageButton)findViewById(R.id.imageq9);

        IB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.shopaholic.com/");
                Intent p=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(p);
            }
        });
        IB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.fretron.com/");
                Intent q=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(q);
            }
        });
        IB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.mediadot.com/");
                Intent r=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(r);
            }
        });
        IB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.walmart.com/");
                Intent s=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(s);
            }
        });
        IB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.paytm.com/");
                Intent t=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(t);
            }
        });
        IB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.jabong.com/");
                Intent u=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(u);
            }
        });
        IB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.junglee.com/");
                Intent vo=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(vo);
            }
        });
        IB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.shopindeed.com/");
                Intent w=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(w);
            }
        });
        IB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.home18shop.com/");
                Intent x=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(x);
            }
        });
    }
}
