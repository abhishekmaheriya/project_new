package com.touchizen.drawerwithbottomnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

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

public class DeliverAddVisitor extends AppCompatActivity  implements
        AdapterView.OnItemSelectedListener {


    EditText selectvisitor, parcel, eText, eText1;
    Button button;
    private int mYear, mMonth, mDay;
    boolean isSelectvisitorValid,isDropParcel;
    String[] hours = { "1 hour", "2 hour", "4 hour", "8 hour", "12 hour","24 hour","48 hour"};

    FirebaseDatabase mdatabaseDV = FirebaseDatabase.getInstance();
    DatabaseReference mrefDV = mdatabaseDV.getReference("Visitor");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivervisitor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);


         parcel= findViewById(R.id.no_parcel);
         selectvisitor= findViewById(R.id.company);
         button = findViewById(R.id.add_data_deliver);
         eText=(EditText) findViewById(R.id.Time);
         eText1 = findViewById(R.id.date);
         eText.setInputType(InputType.TYPE_NULL);
         eText.setFocusableInTouchMode(true);

         spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,hours);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        eText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == eText1) {

                    // Get Current Date
                    final Calendar c = Calendar.getInstance();
                    mYear = c.get(Calendar.YEAR);
                    mMonth = c.get(Calendar.MONTH);
                    mDay = c.get(Calendar.DAY_OF_MONTH);


                    DatePickerDialog datePickerDialog = new DatePickerDialog(DeliverAddVisitor.this,
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {

                                    eText1.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                                }
                            }, mYear, mMonth, mDay);
                    datePickerDialog.show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String companynameDV = selectvisitor.getText().toString();
            String parcelVD = parcel.getText().toString();
            String timeDV = eText.getText().toString();
            String dateVD = eText1.getText().toString();

            if (companynameDV.isEmpty() || parcelVD.isEmpty() || timeDV.isEmpty() || dateVD.isEmpty()){
                Toast.makeText(DeliverAddVisitor.this, "Please Complete the field", Toast.LENGTH_SHORT).show();
            }else{
                String userPutData = mrefDV.child("Delivery Visitor").getKey();
                VisitorDatabaseModel visitorDatabaseModel = new VisitorDatabaseModel();
                visitorDatabaseModel.setCompanynameDVmodel(companynameDV);
                visitorDatabaseModel.setDateVDmodel(dateVD);
                visitorDatabaseModel.setParcelVDmodel(parcelVD);
                visitorDatabaseModel.setTimeDVmodel(timeDV);


                mrefDV.child(userPutData).push().setValue(visitorDatabaseModel, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if (error == null){
                            Toast.makeText(DeliverAddVisitor.this, "insert data is successfully", Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(DeliverAddVisitor.this,MyFragment.class);
//                            startActivity(intent);
                            finish();



                        }else{
                            Toast.makeText(DeliverAddVisitor.this, "some issues are here ", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
            }
            }
        });

        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(DeliverAddVisitor.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                eText.setText(sHour + ":" + sMinute);
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