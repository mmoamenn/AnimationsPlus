package com.bluehomestudio.animationplusdemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;

import com.bluehomestudio.animationplus.animation.HeightAnimation;
import com.bluehomestudio.animationplus.animation.MarginAnimation;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        view = findViewById(R.id.view);
        final int startHeight = (int) DimensionsUtils.convertDpToPixel(100, this);
        final int targetHeight = (int) DimensionsUtils.convertDpToPixel(400, this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation animation = new MarginAnimation(view , null , 400);
                animation.setInterpolator(new DecelerateInterpolator());
                animation.setDuration(2000);
                view.startAnimation(animation);
            }
        }, 1000);
    }
}
