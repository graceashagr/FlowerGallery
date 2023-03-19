package com.example.flowergallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.flowergallery.databinding.ActivityFlowerDetailsBinding;
import com.example.flowergallery.data.FlowerData;

public class FlowerDetailsActivity extends AppCompatActivity {

    ActivityFlowerDetailsBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar()!=null)getSupportActionBar().hide();
        binding = ActivityFlowerDetailsBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        FlowerData flowerData = new FlowerData();
        int position = getIntent().getIntExtra("flower_info",0);
        Glide.with(this).load(flowerData.getFlowerList().get(position)).into(binding.imageView);
        binding.flowerTextView.setText(flowerData.getFlowerNames().get(position));
        binding.textView.setText(flowerData.getFlowerInfo().get(position));
        binding.back.setOnClickListener(view -> finish());
    }
}
