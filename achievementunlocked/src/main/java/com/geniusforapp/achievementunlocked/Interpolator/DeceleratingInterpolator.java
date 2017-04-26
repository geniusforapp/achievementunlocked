package com.geniusforapp.achievementunlocked.Interpolator;

import android.animation.TimeInterpolator;

public class DeceleratingInterpolator implements TimeInterpolator {

    private int mBase;
    private final float mLogScale;

    public DeceleratingInterpolator(int base) {
        mBase = base;
        mLogScale = 1f / computeLog(1, mBase);
    }

    private static float computeLog(float t, int base) {
        return (float) -Math.pow(base, -t) + 1;
    }

    @Override
    public float getInterpolation(float t) {
        return computeLog(t, mBase) * mLogScale;
    }
}
