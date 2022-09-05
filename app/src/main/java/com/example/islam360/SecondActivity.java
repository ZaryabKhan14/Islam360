package com.example.islam360;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SecondActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Animation navbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_second);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//animation insert java

        navbar = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        bottomNavigationView = findViewById(R.id.bottom_navigationview);
//animation java
        bottomNavigationView.setAnimation(navbar);
       // getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new Quran()).commit();
        bottomNavigationView.setSelectedItemId(R.id.nav_quran);

        Fragment one = new homeBlankFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_quran)
                {
                    Fragment one = new Quran();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
                }
                else if (item.getItemId() == R.id.nav_hadith)
                {
                    Fragment one = new Hadees();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
                }
                else if (item.getItemId() == R.id.nav_home)
                {
                    Fragment one = new homeBlankFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
                }
                else if (item.getItemId() == R.id.nav_ibadat)
                {
                    Fragment one = new Ibadat();
                    getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();
            }
             else if (item.getItemId() == R.id.nav_more)
            {
                Fragment one = new More();
                getSupportFragmentManager().beginTransaction().replace(R.id.placeholder,one).commit();                }
                return true;
        }
        });
    }
}