package com.bluehomestudio.animationplus.animation;

import android.view.View;
import android.view.animation.Transformation;

import com.bluehomestudio.animationplus.base.ParamsBaseAnimation;
import com.bluehomestudio.animationplus.enums.ViewDirection;

public class MarginAnimation extends ParamsBaseAnimation {

    private int mMargin;

    public MarginAnimation(View view, ViewDirection direction, int margin) {
        super(view);
        mMargin = margin;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        mParams.leftMargin = (int) (mMargin * interpolatedTime);
        mView.setLayoutParams(mParams);
    }


}
