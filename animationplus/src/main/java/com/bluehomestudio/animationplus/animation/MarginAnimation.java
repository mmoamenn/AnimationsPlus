package com.bluehomestudio.animationplus.animation;

import android.view.View;
import android.view.animation.Transformation;

import com.bluehomestudio.animationplus.base.ParamsBaseAnimation;
import com.bluehomestudio.animationplus.enums.ViewDirection;

public class MarginAnimation extends ParamsBaseAnimation {

    private int mMargin;
    private ViewDirection mDirection;

    public MarginAnimation(View view, ViewDirection direction, int margin) {
        super(view);
        mMargin = margin;
        mDirection = direction;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int newMargin = (int) (mMargin * interpolatedTime);
        switch (mDirection) {
            case START:
                mParams.setMarginStart(newMargin);
                break;
            case END:
                mParams.setMarginEnd(newMargin);
                break;
            case BOTTOM:
                mParams.bottomMargin = newMargin;
                break;
            case TOP:
                mParams.topMargin = newMargin;
                break;
        }
        mView.setLayoutParams(mParams);
    }


}
