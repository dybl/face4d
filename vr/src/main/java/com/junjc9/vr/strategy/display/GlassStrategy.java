package com.junjc9.vr.strategy.display;

import android.app.Activity;
import android.content.Context;

/**
 * Created by hzqiujiadi on 16/3/19.
 * hzqiujiadi ashqalcn@gmail.com
 */
public class GlassStrategy extends AbsDisplayStrategy {

    public GlassStrategy() {}

    @Override
    public void turnOnInGL(Activity activity) {}

    @Override
    public void turnOffInGL(Activity activity) {}

    @Override
    public boolean isSupport(Activity activity) {
        return true;
    }

    @Override
    public int getVisibleSize() {
        return 2;
    }
}
