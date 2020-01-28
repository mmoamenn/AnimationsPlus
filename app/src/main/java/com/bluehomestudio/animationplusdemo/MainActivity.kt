package com.bluehomestudio.animationplusdemo

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import com.bluehomestudio.animationplus.animation.PaddingAnimation
import com.bluehomestudio.animationplus.enums.AnimationDirection
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val paddingAnimation = PaddingAnimation(view, AnimationDirection.ALL, 0, 100)
            paddingAnimation.duration = 1500
            view.startAnimation(paddingAnimation)
        }, 2000)
    }

}
