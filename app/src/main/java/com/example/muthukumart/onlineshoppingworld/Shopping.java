package com.example.muthukumart.onlineshoppingworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.net.URL;

public class Shopping extends AppCompatActivity {
  ImageButton ib1,ib2,ib3,ib4,ib5,ib6;
    Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        ib1=(ImageButton)findViewById(R.id.imageButton2);
        ib2=(ImageButton)findViewById(R.id.imageButton3);
        ib3=(ImageButton)findViewById(R.id.imageButton4);
        ib4=(ImageButton)findViewById(R.id.imageButton5);
        ib5=(ImageButton)findViewById(R.id.imageButton6);
        ib6=(ImageButton)findViewById(R.id.imageButton7);
        butt=(Button)findViewById(R.id.but1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Uri uri=Uri.parse("https://www.flipkart.com/");
                    Intent j=new Intent(Intent.ACTION_VIEW,uri);
                     startActivity(j);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.amazon.com/");
                Intent a=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(a);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.myntra.com/");
                Intent b=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(b);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.snapdeal.com/");
                Intent c=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(c);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.ebay.com/");
                Intent d=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(d);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.shopclues.com/");
                Intent e=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(e);
            }
        });
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q=new Intent(Shopping.this,shopping2.class);
                startActivity(q);
            }
        });
    }
}
