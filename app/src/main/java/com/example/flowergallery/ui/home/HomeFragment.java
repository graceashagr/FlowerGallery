package com.example.flowergallery.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.flowergallery.data.FlowerData;
import com.example.flowergallery.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        FlowerData flowerData = new FlowerData();
        FlowersGalleryRecyclerView flowersListView= new FlowersGalleryRecyclerView(requireActivity(),
                flowerData.getFlowerList(),flowerData.getFlowerNames());
        binding.flowerList.setAdapter(flowersListView);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}