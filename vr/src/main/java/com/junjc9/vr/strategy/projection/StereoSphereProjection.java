package com.junjc9.vr.strategy.projection;

import android.app.Activity;

import com.junjc9.vr.MD360Director;
import com.junjc9.vr.MD360DirectorFactory;
import com.junjc9.vr.common.MDDirection;
import com.junjc9.vr.model.MDMainPluginBuilder;
import com.junjc9.vr.model.MDPosition;
import com.junjc9.vr.objects.MDAbsObject3D;
import com.junjc9.vr.objects.MDObject3DHelper;
import com.junjc9.vr.objects.MDStereoSphere3D;
import com.junjc9.vr.plugins.MDAbsPlugin;
import com.junjc9.vr.plugins.MDPanoramaPlugin;

/**
 * Created by hzqiujiadi on 16/6/26.
 * hzqiujiadi ashqalcn@gmail.com
 */
public class StereoSphereProjection extends AbsProjectionStrategy {

    private static class FixedDirectorFactory extends MD360DirectorFactory{
        @Override
        public MD360Director createDirector(int index) {
            return MD360Director.builder().build();
        }
    }

    private MDDirection direction;

    private MDAbsObject3D object3D;

    public StereoSphereProjection(MDDirection direction) {
        this.direction = direction;
    }

    @Override
    public void turnOnInGL(Activity activity) {
        object3D = new MDStereoSphere3D(direction);
        MDObject3DHelper.loadObj(activity, object3D);
    }

    @Override
    public void turnOffInGL(Activity activity) {

    }

    @Override
    public boolean isSupport(Activity activity) {
        return true;
    }

    @Override
    public MDAbsObject3D getObject3D() {
        return object3D;
    }

    @Override
    public MDPosition getModelPosition() {
        return MDPosition.getOriginalPosition();
    }

    @Override
    protected MD360DirectorFactory hijackDirectorFactory() {
        return new FixedDirectorFactory();
    }

    @Override
    public MDAbsPlugin buildMainPlugin(MDMainPluginBuilder builder) {
        return new MDPanoramaPlugin(builder);
    }
}
