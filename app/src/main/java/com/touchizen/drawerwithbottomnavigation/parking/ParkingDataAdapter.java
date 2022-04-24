package com.touchizen.drawerwithbottomnavigation.parking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.touchizen.drawerwithbottomnavigation.R;

import java.util.ArrayList;

public class ParkingDataAdapter extends RecyclerView.Adapter<ParkingDataAdapter.ParkingViewHolder> {
    Context contextpark;
    ArrayList<ParkingModelClass> parkingModelClassArrayList;

    public ParkingDataAdapter(Context contextpark, ArrayList<ParkingModelClass> parkingModelClassArrayList) {
        this.contextpark = contextpark;
        this.parkingModelClassArrayList = parkingModelClassArrayList;
    }

    @NonNull
    @Override
    public ParkingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parking_recycler_item, parent, false);
        ParkingDataAdapter.ParkingViewHolder holder = new ParkingDataAdapter.ParkingViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ParkingViewHolder holder, int position) {
    holder.txtblock.setText(parkingModelClassArrayList.get(position).getVehicle1());
    holder.txtname.setText(parkingModelClassArrayList.get(position).getVehicle2());
    }

    @Override
    public int getItemCount() {
        return parkingModelClassArrayList.size();
    }



    public class ParkingViewHolder extends RecyclerView.ViewHolder {
        TextView txtblock, txtname;
        LinearLayout linearLayoutpark;

        public ParkingViewHolder(@NonNull View itemView) {
            super(itemView);
            txtblock = itemView.findViewById(R.id.txt1_vehicle);
            txtname = itemView.findViewById(R.id.txt2_vehicle);
            linearLayoutpark = itemView.findViewById(R.id.parkLinear);

        }
    }
}
