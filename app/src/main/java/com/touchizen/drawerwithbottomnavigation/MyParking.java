package com.touchizen.drawerwithbottomnavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.touchizen.drawerwithbottomnavigation.parking.ParkingDataAdapter;
import com.touchizen.drawerwithbottomnavigation.parking.ParkingModelClass;
import com.touchizen.drawerwithbottomnavigation.parking.Request_Parking;

import java.util.ArrayList;


public class MyParking extends Fragment {

    FloatingActionButton fab;
    TextView vhcl1, vhcl2;
    FirebaseDatabase mdatabse;
    DatabaseReference mref;
    RecyclerView recyclerViewparking;
    ArrayList<ParkingModelClass> arrparkingModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_my_parking, container, false);

        fab = root.findViewById(R.id.fab);
        vhcl1 = root.findViewById(R.id.txt1_vehicle);
        vhcl2 = root.findViewById(R.id.txt2_vehicle);
        recyclerViewparking = root.findViewById(R.id.parking_recycler);
        mdatabse = FirebaseDatabase.getInstance();
        mref = mdatabse.getReference("Parking");
        arrparkingModel = new ArrayList<>();


        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                arrparkingModel.clear();
                for (DataSnapshot ds: snapshot.getChildren() ){

                    ParkingModelClass cmodel = ds.getValue(ParkingModelClass.class);
                   arrparkingModel.add(cmodel);
                }

                ParkingDataAdapter parkingDataAdapter = new ParkingDataAdapter(getContext(),arrparkingModel);
                recyclerViewparking.setAdapter(parkingDataAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Request_Parking.class);
                startActivity(i);

            }
        });
        return root;
    }
}