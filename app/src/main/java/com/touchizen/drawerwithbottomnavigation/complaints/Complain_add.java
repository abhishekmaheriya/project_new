package com.touchizen.drawerwithbottomnavigation.complaints;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.touchizen.drawerwithbottomnavigation.R;

import java.util.HashMap;

public class Complain_add extends AppCompatActivity {

    private ImageView photoview;
    int SELECT_PICTURE = 200;
    private Spinner spinner_complain;
    private Button submit;
    private EditText title, description;
    String[] country = {"Electrician", "plumbing", "Commen Area", "Car Parking", "Lift Service", "Water Leakage", "Security"};
    private FirebaseDatabase db1 = FirebaseDatabase.getInstance();
    private DatabaseReference root1 = db1.getReference("Complaints");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if (getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        } else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        photoview = findViewById(R.id.imageview_complaints);
        submit = findViewById(R.id.sbmitbutton);
        title = findViewById(R.id.complain_title);
        description = findViewById(R.id.addtext);
        photoview = findViewById(R.id.imageview_complaints);
        spinner_complain = findViewById(R.id.spinner_complain);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String desc1 = title.getText().toString();
                String comlaintitle = description.getText().toString();

                HashMap<String, String> usermap = new HashMap<>();
                usermap.put("Description", comlaintitle);
                usermap.put("Title", desc1);
                root1.push().setValue(usermap);
            }
        });

        photoview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choosePicture();
            }
        });

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner_complain.setAdapter(aa);

    }

    private void choosePicture() {
        Intent iphoto = new Intent();
        iphoto.setType("image/*");
        iphoto.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(iphoto, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
