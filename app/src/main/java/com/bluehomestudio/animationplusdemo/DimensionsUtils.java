package com.bluehomestudio.animationplusdemo;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class DimensionsUtils {

    public static float convertDpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * (((float) metrics.densityDpi) / DisplayMetrics.DENSITY_DEFAULT);
    }


    public static float convertPixelsToDp(float px, Context context) {
        return px / ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

}
