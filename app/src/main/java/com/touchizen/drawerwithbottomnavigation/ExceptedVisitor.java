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

public class  ExceptedVisitor extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {


    EditText guestDate, guestTime, name, mobilenumber, no_of_visitor, visiting_perpose;
    private int mYear, mMonth, mDay;
    Button button;
    String[] hours = { "1 hour", "2 hour", "4 hour", "8 hour", "12 hour","24 hour","48 hour"};
    FirebaseDatabase mdatabaseGuest = FirebaseDatabase.getInstance();
    DatabaseReference mrefGuest = mdatabaseGuest.getReference("Visitor");

    TimePickerDialog.OnTimeSetListener onTimeSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excepted_visitor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        guestDate = findViewById(R.id.visiting_date);
        guestTime = findViewById(R.id.visiting_Time);
        name = findViewById(R.id.visitor_name);
        mobilenumber = findViewById(R.id.mobile_number);
        no_of_visitor = findViewById(R.id.no_of_visitor);
        visiting_perpose = findViewById(R.id.visiting_purpose);
        button = findViewById(R.id.guest_add);




        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

//Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,hours);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        guestTime.setInputType(InputType.TYPE_NULL);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String VisitorName = name.getText().toString();
                String MobileNumber = mobilenumber.getText().toString();
                String VisitorPurpose = visiting_perpose.getText().toString();
                String guestdate = guestDate.getText().toString();
                String guesttime = guestTime.getText().toString();
                String noOfVisitor = no_of_visitor.getText().toString();

                if (VisitorName.isEmpty() || MobileNumber.isEmpty() || VisitorPurpose.isEmpty() ||guestdate.isEmpty() ||guesttime.isEmpty() ||noOfVisitor.isEmpty()){
                    Toast.makeText(ExceptedVisitor.this, "Please enter the field", Toast.LENGTH_SHORT).show();
                }else{
                    String userGuestData = mrefGuest.child("Guest Visitor").getKey();
                    VisitorDBModel3 visitorDBModel3 = new VisitorDBModel3();

                    visitorDBModel3.setVisitorName(VisitorName);
                    visitorDBModel3.setMobileNo(MobileNumber);
                    visitorDBModel3.setNoOfVisitor(noOfVisitor);
                    visitorDBModel3.setDate(guestdate);
                    visitorDBModel3.setVisitingTime(guesttime);
                    visitorDBModel3.setVisitingPurose(VisitorPurpose);

                    mrefGuest.child(userGuestData).push().setValue(visitorDBModel3, new DatabaseReference.CompletionListener() {
                        @Override
                        public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {

                            if (error == null){
                                Toast.makeText(ExceptedVisitor.this, "Insert Data Successfully", Toast.LENGTH_SHORT).show();
                                finish();
                            }else {
                                Toast.makeText(ExceptedVisitor.this, "Some issues are here", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        guestDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == guestDate) {

                    // Get Current Date
                    final Calendar c = Calendar.getInstance();
                    mYear = c.get(Calendar.YEAR);
                    mMonth = c.get(Calendar.MONTH);
                    mDay = c.get(Calendar.DAY_OF_MONTH);


                    DatePickerDialog datePickerDialog = new DatePickerDialog(ExceptedVisitor.this,
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {

                                    guestDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                                }
                            }, mYear, mMonth, mDay);
                    datePickerDialog.show();
                }
            }
        });

        guestTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(ExceptedVisitor.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                guestTime.setText(sHour + ":" + sMinute);
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