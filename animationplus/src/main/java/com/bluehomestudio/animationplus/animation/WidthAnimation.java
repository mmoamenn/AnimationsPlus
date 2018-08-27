package com.bluehomestudio.animationplus.animation;

import android.view.View;
import android.view.animation.Transformation;

import com.bluehomestudio.animationplus.base.BaseAnimation;

public class WidthAnimation extends BaseAnimation {
    private int mCurrentWidth, mTargetWidth;

    public WidthAnimation(View view, int currentWidth, int targetWidth) {
        super(view);
        mCurrentWidth = currentWidth;
        mTargetWidth = targetWidth;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        mView.getLayoutParams().width = (int) (mCurrentWidth + (mTargetWidth * interpolatedTime));
        mView.requestLayout();
    }
}
