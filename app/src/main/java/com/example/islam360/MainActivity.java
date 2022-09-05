package com.example.islam360;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Animation toAnim , bottAnim;
    ImageView imageView;
    TextView txt,txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        toAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView  = (ImageView) findViewById(R.id.image);
        txt = (TextView) findViewById(R.id.textview);


        imageView.setAnimation(toAnim);
        txt.setAnimation(bottAnim);


        Handler Ahad = new Handler();
        Ahad.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "WellCome To Islam360", Toast.LENGTH_SHORT).show();
                Intent nextpage = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(nextpage);
            }
        },2000);
    }
}