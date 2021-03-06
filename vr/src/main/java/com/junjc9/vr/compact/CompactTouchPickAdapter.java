package com.junjc9.vr.compact;

import com.junjc9.vr.MDVRLibrary;
import com.junjc9.vr.MDVRLibrary.ITouchPickListener2;
import com.junjc9.vr.model.MDHitEvent;

/**
 * Created by hzqiujiadi on 2017/4/20.
 * hzqiujiadi ashqalcn@gmail.com
 */

public class CompactTouchPickAdapter implements ITouchPickListener2 {

    private final MDVRLibrary.ITouchPickListener listener;

    public CompactTouchPickAdapter(MDVRLibrary.ITouchPickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onHotspotHit(MDHitEvent hitEvent) {
        if (listener != null){
            listener.onHotspotHit(hitEvent.getHotspot(), hitEvent.getRay());
        }
    }
}
