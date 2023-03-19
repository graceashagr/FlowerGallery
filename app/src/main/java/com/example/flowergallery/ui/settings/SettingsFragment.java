package com.example.flowergallery.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.flowergallery.R;
import com.example.flowergallery.databinding.FragmentSettingsBinding;


public class SettingsFragment extends Fragment {
    private FragmentSettingsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Animation fadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in);
        binding.fadeInButton.setOnClickListener(view -> {
            binding.fadeInTextview.setVisibility(View.VISIBLE);
            binding.fadeInTextview.startAnimation(fadeInAnimation);
        });
        Animation fadeOutAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_out);
        binding.fadeOutButton.setOnClickListener(view -> {
            binding.fadeOutTextview.setVisibility(View.VISIBLE);
            binding.fadeOutTextview.startAnimation(fadeOutAnimation);
        });
        Animation zoomInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.zoom_in);
        binding.zoomInButton.setOnClickListener(view -> {
            binding.zoomInTextview.setVisibility(View.VISIBLE);
            binding.zoomInTextview.startAnimation(zoomInAnimation);
        });
        Animation zoomOutAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.zoom_out);
        binding.zoomOutButton.setOnClickListener(view -> {
            binding.zoomOutTextview.setVisibility(View.VISIBLE);
            binding.zoomOutTextview.startAnimation(zoomOutAnimation);
        });
        Animation blinkAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.blink);
        binding.blinkButton.setOnClickListener(view -> {
            binding.blinkTextview.setVisibility(View.VISIBLE);
            binding.blinkTextview.startAnimation(blinkAnimation);
        });
        Animation moveAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.move);
        binding.moveButton.setOnClickListener(view -> {
            binding.moveTextview.setVisibility(View.VISIBLE);
            binding.moveTextview.startAnimation(moveAnimation);
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
