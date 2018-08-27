package com.bluehomestudio.animationplus.base;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public abstract class BaseAnimation extends Animation {
    protected View mView ;

    public BaseAnimation(View view){
        mView = view;
    }

    @Override
    abstract protected void applyTransformation(float interpolatedTime, Transformation t);

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    @Override
    public boolean willChangeBounds() {
        return true;
    }
}
