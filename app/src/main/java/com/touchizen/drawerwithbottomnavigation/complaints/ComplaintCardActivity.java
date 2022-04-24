package com.touchizen.drawerwithbottomnavigation.complaints;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.touchizen.drawerwithbottomnavigation.R;

    public class ComplaintCardActivity extends AppCompatActivity {
        FloatingActionButton fab;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_complaint_card2);
            fab = findViewById(R.id.fab);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
            if(getSupportActionBar() == null) {
                setSupportActionBar(toolbar);
            }else toolbar.setVisibility(View.GONE);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), Complain_add.class);
                    startActivity(i);

                }
            });
        }
        @Override
        public void onBackPressed() {
            super.onBackPressed();
        }
    }
