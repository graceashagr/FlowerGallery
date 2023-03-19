package com.example.flowergallery;

import android.os.Bundle;

import com.example.flowergallery.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_favorites, R.id.navigation_settings)
                .build();
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_activity_main);
        NavController navController = Objects.requireNonNull(navHostFragment).getNavController();
        BottomNavigationView bottomNavigationView= binding.navView;
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
        NavOptions navoptions =  new NavOptions.Builder()
                .setPopUpTo(R.id.navigation_home,false)
                .setEnterAnim(R.anim.from_left)
                .setExitAnim(R.anim.to_right)
                .setPopEnterAnim(R.anim.from_left)
                .setPopExitAnim(R.anim.to_right)
                .setLaunchSingleTop(true).build();
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if(item.getItemId() != bottomNavigationView.getSelectedItemId())
                        navController.navigate(R.id.navigation_home, null, navoptions);
                    return true;
                case R.id.navigation_favorites:
                    navController.navigate(R.id.favoritesFragment,null,navoptions);
                    return true;
                case R.id.navigation_settings:
                    navController.navigate(R.id.settingsFragment,null,navoptions);
                    return true;
            }
            return false;
        });

    }

    @Override
    public void onBackPressed() {
        // On back update the UI for the Bottom Navigation
        if (!binding.navView.getMenu().getItem(0).isChecked()) {
            binding.navView.getMenu().getItem(0).setChecked(true);
        }
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}