package com.example.flowergallery;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.flowergallery.data.FlowerData;
import com.example.flowergallery.databinding.ActivityFlowerViewingDetailsBinding;

public class FavoriteFlowerViewingSeasonDetails extends AppCompatActivity {

    ActivityFlowerViewingDetailsBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar()!=null)getSupportActionBar().hide();
        binding = ActivityFlowerViewingDetailsBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        int position = getIntent().getIntExtra("favorite_flower",0);
        FlowerData flowerData = new FlowerData();
        binding.textFlowerViewing.setText(flowerData.getFlowerFavorites().get(position).viewingSeason);
    }
}
