package com.touchizen.drawerwithbottomnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class Autocabvisitor extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{


    private EditText eText, eText1,name, mobilenumber, vehicleno,dateAV,timeAV,companyName;
    private int mYear1, mMonth1, mDay1;
    Button button;
    String[] hours = { "1 hour", "2 hour", "4 hour", "8 hour", "12 hour","24 hour","48 hour"};
    FirebaseDatabase mdatabaseAV = FirebaseDatabase.getInstance();
    DatabaseReference mrefAV = mdatabaseAV.getReference("Visitor");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocabvisitor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        name = findViewById(R.id.cab_driver_name);
        mobilenumber = findViewById(R.id.mobile_number);
        vehicleno = findViewById(R.id.vehicle_no);
        dateAV = findViewById(R.id.dateautocab);
        timeAV = findViewById(R.id.TimeAutocab);
        companyName = findViewById(R.id.company_nameAutocab);

        button= findViewById(R.id.Add_data);

        eText = findViewById(R.id.date);
        eText1 = findViewById(R.id.Time);

        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

//Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,hours);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);



//        eText1.setInputType(InputType.TYPE_NULL);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cabdriver = name.getText().toString();
                String mo_no = mobilenumber.getText().toString();
                String vh_no = vehicleno.getText().toString();
                String dateav = dateAV.getText().toString();
                String timeav = timeAV.getText().toString();
                String companyav = companyName.getText().toString();

                if (cabdriver.isEmpty() || mo_no.isEmpty() || vh_no.isEmpty() || dateav.isEmpty() ||timeav.isEmpty() || companyav.isEmpty()){
                    Toast.makeText(Autocabvisitor.this, "Please enter the field", Toast.LENGTH_SHORT).show();
                }else{
                    String userAutocabData = mrefAV.child("Autocab Visitor").getKey();
                    VisitorDBModel2 visitorDBModel2 =new VisitorDBModel2();

                    visitorDBModel2.setCarDriverNameAutocabVisitor(cabdriver);
                    visitorDBModel2.setMobileNoAutocabVisitor(mo_no);
                    visitorDBModel2.setVehicleNoAutocabVisitor(vh_no);
                    visitorDBModel2.setDateAuocabVisitor(dateav);
                    visitorDBModel2.setTimeAutocabVisitor(timeav);
                    visitorDBModel2.setCompanyNameAutocabVisitor(companyav);

                    mrefAV.child(userAutocabData).push().setValue(visitorDBModel2, new DatabaseReference.CompletionListener() {
                        @Override
                        public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                            if (error == null){
                                Toast.makeText(Autocabvisitor.this, "insert data is successfully", Toast.LENGTH_SHORT).show();
//                                Intent intent1 = new Intent(Autocabvisitor.this,DailyVisitorFragment.class);
//                                startActivity(intent1);
                                finish();

                            }else{
                                Toast.makeText(Autocabvisitor.this, "some issues are here ", Toast.LENGTH_SHORT).show();
                                    finish();
                            }
                        }
                    });
                }
            }


        });

        dateAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == dateAV) {

                    // Get Current Date
                    final Calendar c1 = Calendar.getInstance();
                    mYear1 = c1.get(Calendar.YEAR);
                    mMonth1 = c1.get(Calendar.MONTH);
                    mDay1= c1.get(Calendar.DAY_OF_MONTH);


                    DatePickerDialog datePickerDialog = new DatePickerDialog(Autocabvisitor.this,
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {

                                    dateAV.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                                }
                            }, mYear1, mMonth1, mDay1);
                    datePickerDialog.show();
                }
            }
        });

        timeAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(Autocabvisitor.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                timeAV.setText(sHour + ":" + sMinute);
                            }
                        }, hour, minutes, true);
                timePickerDialog.show();
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),hours[position] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}