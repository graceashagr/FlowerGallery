package com.example.flowergallery.ui.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.flowergallery.FlowerDetailsActivity;
import com.example.flowergallery.MainActivity;
import com.example.flowergallery.R;
import com.example.flowergallery.databinding.ItemFlowerCardBinding;

import java.util.ArrayList;


public class FlowersGalleryRecyclerView extends RecyclerView.Adapter<FlowersGalleryRecyclerView.ViewHolder> {
    private ArrayList<Integer> images;
    private ArrayList<String> names;
    private Context context;
    ItemFlowerCardBinding binding;

    public FlowersGalleryRecyclerView(@NonNull Context context, ArrayList<Integer> images, ArrayList<String> names) {
       this.images = images;
       this.names = names;
       this.context = context;
    }

    @NonNull
    @Override
    public FlowersGalleryRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemFlowerCardBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull FlowersGalleryRecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).load(images.get(holder.getBindingAdapterPosition())).into(holder.flowerImage);
        holder.flowerName.setText(names.get(holder.getBindingAdapterPosition()));
        holder.flowerImage.setOnClickListener(view -> {
            Intent intent = new Intent(context,FlowerDetailsActivity.class);
            intent.putExtra("flower_info",position);
            context.startActivity(intent);
            ((MainActivity)context).overridePendingTransition(R.anim.from_left, R.anim.to_right);
        });
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView flowerImage;
        TextView flowerName;

        public ViewHolder(View view) {
            super(view);
            flowerImage = binding.flowerImageView;
            flowerName = binding.flowerTextView;
        }
    }
}
