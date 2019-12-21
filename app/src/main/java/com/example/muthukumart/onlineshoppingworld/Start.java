
package com.example.muthukumart.onlineshoppingworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Start extends AppCompatActivity {
    Button bu1,bu2,bu3,bu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        bu1=(Button)findViewById(R.id.bt2);
        bu2=(Button)findViewById(R.id.bt3);
        bu3=(Button)findViewById(R.id.bt4);
        bu4=(Button)findViewById(R.id.bt5);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j= new Intent(Start.this,Shopping.class);
                startActivity(j);
            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Start.this,ticketbooking.class);
                startActivity(k);
}       });
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(Start.this,roombooking.class);
                startActivity(l);
            }
        });
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Start.this,foodordering.class);
                startActivity(m);
            }
        });
    }
}
