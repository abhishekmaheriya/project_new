package com.touchizen.drawerwithbottomnavigation.parking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

import com.touchizen.drawerwithbottomnavigation.R;

public class E_BLOCK extends AppCompatActivity {
    CardView c1, c2, c3, c4, c5, c6, c7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eblock);
        c1 = findViewById(R.id.c1_parking_eblock);
        c2 = findViewById(R.id.c2_parking_eblock);
        c3 = findViewById(R.id.c3_parking_eblock);
        c4 = findViewById(R.id.c4_parking_elock);
        c5 = findViewById(R.id.c5_parking_eblock);
        c6 = findViewById(R.id.c6_parking_eblock);
        c7 = findViewById(R.id.c7_parking_eblock);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }
    public void openDialog() {
        Example_parking_dialog example_parking_dialog = new Example_parking_dialog();
        example_parking_dialog.show(getSupportFragmentManager(), "vehicle parking");

    }
}