package com.example.flowergallery.ui.favorites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.flowergallery.data.FlowerData;
import com.example.flowergallery.databinding.FragmentFavoritesBinding;


public class FavoritesFragment extends Fragment {
    private FragmentFavoritesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFavoritesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        FlowerData flowerData = new FlowerData();
        FavoriteFlowersAdapter favoriteFlowersAdapter = new FavoriteFlowersAdapter(requireActivity(),flowerData.getFlowerFavorites());
        binding.favoriteFlowersList.setAdapter(favoriteFlowersAdapter);
        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
