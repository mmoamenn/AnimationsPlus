package com.bluehomestudio.animationplus.animation;

import android.view.View;
import android.view.animation.Transformation;

import com.bluehomestudio.animationplus.base.BaseAnimation;

public class HeightAnimation extends BaseAnimation {
    private int mStartHeight, mTargetHeight;

    public HeightAnimation(View view, int startHeight, int targetHeight) {
        super(view);
        mStartHeight = startHeight;
        mTargetHeight = targetHeight;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        mView.getLayoutParams().height = (int) (mStartHeight + (mTargetHeight * interpolatedTime));
        mView.requestLayout();
    }

}
