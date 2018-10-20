package com.bluehomestudio.animationplus.animation;

import android.view.View;
import android.view.animation.Transformation;

import com.bluehomestudio.animationplus.base.BaseAnimation;
import com.bluehomestudio.animationplus.enums.AnimationDirection;

public class PaddingAnimation extends BaseAnimation {
    private int mStartPadding, mTargetPadding;
    private AnimationDirection mDirection;

    public PaddingAnimation(View view, AnimationDirection direction, int startPadding, int targetPadding) {
        super(view);
        mDirection = direction;
        mStartPadding = startPadding;
        mTargetPadding = targetPadding;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int newPadding = (int) (int) (mStartPadding + (mTargetPadding * interpolatedTime));
        switch (mDirection) {
            case START:
                mView.setPaddingRelative(newPadding, mView.getPaddingTop(), mView.getPaddingEnd(), mView.getPaddingBottom());
                break;
            case END:
                mView.setPaddingRelative(mView.getPaddingStart(), mView.getPaddingTop(), newPadding, mView.getPaddingBottom());
                break;
            case BOTTOM:
                mView.setPaddingRelative(mView.getPaddingStart(), mView.getPaddingTop(), mView.getPaddingEnd(), newPadding);
                break;
            case TOP:
                mView.setPaddingRelative(mView.getPaddingStart(), newPadding, mView.getPaddingEnd(), mView.getPaddingBottom());
                break;
            case ALL:
                mView.setPaddingRelative(newPadding, newPadding, newPadding, newPadding);
                break;
        }
    }
}
