package com.bluehomestudio.animationplus.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public abstract class ParamsBaseAnimation extends BaseAnimation {

    protected ViewGroup.MarginLayoutParams mParams;

    public ParamsBaseAnimation(View view) {
        super(view);
        mParams = checkLayoutParamType(view);
    }

    private ViewGroup.MarginLayoutParams checkLayoutParamType(View view) {

        ViewParent parent = view.getParent();

        if (parent instanceof RelativeLayout) {
            mParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        } else if (parent instanceof ConstraintLayout) {
            mParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        } else if (parent instanceof FrameLayout) {
            mParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        }else if (parent instanceof LinearLayout ) {
            mParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        } else {
            mParams = null;
        }

        return mParams;
    }
}
