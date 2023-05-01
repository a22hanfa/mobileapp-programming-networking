package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MountainRecyclerViewAdapter extends RecyclerView.Adapter<MountainRecyclerViewAdapter.MountainViewHolder> {

    private ArrayList<Mountain> mountains;

    public MountainRecyclerViewAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mountain_item, parent, false);

        return new MountainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position) {
        Mountain mountain = mountains.get(position);
        holder.nameTextView.setText(mountain.getName());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public static class MountainViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;

        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }
}
