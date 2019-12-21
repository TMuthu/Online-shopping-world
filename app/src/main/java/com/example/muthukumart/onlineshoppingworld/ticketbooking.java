package com.example.muthukumart.onlineshoppingworld;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URI;

public class ticketbooking extends AppCompatActivity {
    ImageButton i18,i19,i20,i21,i22,i23,i24,i25,i26,i27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketbooking);
        i18=(ImageButton)findViewById(R.id.ib18);
        i19=(ImageButton)findViewById(R.id.ib19);
        i20=(ImageButton)findViewById(R.id.ib20);
        i21=(ImageButton)findViewById(R.id.ib21);
        i22=(ImageButton)findViewById(R.id.ib22);
        i23=(ImageButton)findViewById(R.id.ib23);
        i24=(ImageButton)findViewById(R.id.ib24);
        i25=(ImageButton)findViewById(R.id.ib25);
        i26=(ImageButton)findViewById(R.id.ib26);
        i27=(ImageButton)findViewById(R.id.ib27);
        i18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.redbus.com/");
                Intent q=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(q);
            }
        });
        i19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.bookmytrain.com/");
                Intent w=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(w);
            }
        });
        i20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.airtours.com/");
                Intent e=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(e);
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.flywidus.com/");
                Intent r=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(r);
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.onetravel.com/");
                Intent t=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(t);
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.smarttrip.com/");
                Intent y=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(y);
            }
        });
        i24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.tracelocity.com/");
                Intent u=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(u);
            }
        });
        i25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.booking.com/");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        i26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.orbitz.com/");
                Intent o=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(o);
            }
        });
        i27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://www.priceline.com/");
                Intent p=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(p);
            }
        });
    }
}
