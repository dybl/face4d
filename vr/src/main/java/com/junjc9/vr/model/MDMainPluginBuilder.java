package com.junjc9.vr.model;

import com.junjc9.vr.MDDirectorCamUpdate;
import com.junjc9.vr.MDDirectorFilter;
import com.junjc9.vr.MDVRLibrary;
import com.junjc9.vr.strategy.projection.ProjectionModeManager;
import com.junjc9.vr.texture.MD360Texture;

/**
 * Created by hzqiujiadi on 16/8/20.
 * hzqiujiadi ashqalcn@gmail.com
 */
public class MDMainPluginBuilder {
    private MD360Texture texture;
    private int contentType = MDVRLibrary.ContentType.DEFAULT;
    private ProjectionModeManager projectionModeManager;
    private MDDirectorCamUpdate cameraUpdate;
    private MDDirectorFilter filter;

    public MDMainPluginBuilder() {
    }

    public MD360Texture getTexture() {
        return texture;
    }

    public int getContentType() {
        return contentType;
    }

    public ProjectionModeManager getProjectionModeManager() {
        return projectionModeManager;
    }

    public MDMainPluginBuilder setContentType(int contentType) {
        this.contentType = contentType;
        return this;
    }

    public MDDirectorCamUpdate getCameraUpdate() {
        return cameraUpdate;
    }

    public MDDirectorFilter getFilter() {
        return filter;
    }

    /**
     * set surface{@link MD360Texture} to this render
     * @param texture {@link MD360Texture} surface may used by multiple render{@link com.junjc9.vr.MD360Renderer}
     * @return builder
     */
    public MDMainPluginBuilder setTexture(MD360Texture texture){
        this.texture = texture;
        return this;
    }

    public MDMainPluginBuilder setProjectionModeManager(ProjectionModeManager projectionModeManager) {
        this.projectionModeManager = projectionModeManager;
        return this;
    }

    public MDMainPluginBuilder setCameraUpdate(MDDirectorCamUpdate cameraUpdate) {
        this.cameraUpdate = cameraUpdate;
        return this;
    }

    public MDMainPluginBuilder setFilter(MDDirectorFilter filter) {
        this.filter = filter;
        return this;
    }
}
