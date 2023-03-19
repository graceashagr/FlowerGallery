package com.example.flowergallery.ui.favorites;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.flowergallery.FavoriteFlowerViewingSeasonDetails;
import com.example.flowergallery.data.FlowerData;
import com.example.flowergallery.databinding.ItemFavoriteFlowerBinding;

import java.util.ArrayList;

public class FavoriteFlowersAdapter extends RecyclerView.Adapter<FavoriteFlowersAdapter.ViewHolder> {
    ArrayList<FlowerData.Favorite> favoriteFlowers;
    ItemFavoriteFlowerBinding binding;
    Context context;
    public FavoriteFlowersAdapter(@NonNull Context context, ArrayList<FlowerData.Favorite> favorites) {
        this.context = context;
        this.favoriteFlowers = favorites;
    }

    @NonNull
    @Override
    public FavoriteFlowersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemFavoriteFlowerBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteFlowersAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(favoriteFlowers.get(holder.getBindingAdapterPosition()).imageResource).into(holder.favoriteFlowerImageView);
        holder.favoriteFlowerTextView.setText(favoriteFlowers.get(holder.getBindingAdapterPosition()).name);
        holder.layout.setOnClickListener(view -> {
            Intent intent = new Intent(context, FavoriteFlowerViewingSeasonDetails.class);
            intent.putExtra("favorite_flower", holder.getBindingAdapterPosition());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return favoriteFlowers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView favoriteFlowerImageView;
        TextView favoriteFlowerTextView;
        RelativeLayout layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            favoriteFlowerTextView = binding.favoriteFlower;
            favoriteFlowerImageView = binding.flowerImageView;
            layout = binding.fovoriteItemLayout;
        }
    }
}
