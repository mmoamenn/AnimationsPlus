package com.bluehomestudio.animationplusdemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.bluehomestudio.animationplus.animation.HeightAnimation;
import com.bluehomestudio.animationplus.animation.MarginAnimation;
import com.bluehomestudio.animationplus.animation.PaddingAnimation;
import com.bluehomestudio.animationplus.animation.WidthAnimation;
import com.bluehomestudio.animationplus.enums.AnimationDirection;

public class MainActivity extends AppCompatActivity {

    FrameLayout view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.view);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                PaddingAnimation paddingAnimation = new PaddingAnimation(view, AnimationDirection.ALL  , 0, 100 );
                paddingAnimation.setDuration(1500);
                view.startAnimation(paddingAnimation);

            }
        }, 2000);


    }
}
