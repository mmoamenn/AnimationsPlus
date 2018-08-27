package com.bluehomestudio.animationplusdemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;

import com.bluehomestudio.animationplus.animation.HeightAnimation;
import com.bluehomestudio.animationplus.animation.MarginAnimation;
import com.bluehomestudio.animationplus.enums.ViewDirection;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.view);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation animation = new MarginAnimation(view , ViewDirection.TOP, 400);
                animation.setInterpolator(new DecelerateInterpolator());
                animation.setDuration(2000);
                view.startAnimation(animation);

            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.clearAnimation();
                Animation animation1 = new MarginAnimation(view , ViewDirection.START, 400);
                animation1.setInterpolator(new DecelerateInterpolator());
                animation1.setDuration(2000);
                view.startAnimation(animation1);
            }
        }, 2000);

    }
}
