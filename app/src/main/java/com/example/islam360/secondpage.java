package com.example.islam360;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class secondpage extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    Animation navbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_secondpage);

        navbar = AnimationUtils.loadAnimation(this,R.anim.botom_animation);


        bottomNavigation = findViewById(R.id.Bottom);
        bottomNavigation.setAnimation(navbar);

        Fragment one = new Home();
        getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.Quran)
                {
                    Fragment one = new Quran();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
                }
                else if (item.getItemId() == R.id.Hadees)
                {
                    Fragment one = new Hadees();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
                }
                else if (item.getItemId() == R.id.Home)
                {
                    Fragment one = new Home();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
                }
                else if (item.getItemId() == R.id.Ibadat)
                {
                    Fragment one = new Ibadat();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
                }
                else if (item.getItemId() == R.id.More)
                {
                    Fragment one = new More();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();                }
                return true;
            }
        });
    }
}