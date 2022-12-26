package com.facebook.react.fabric.events;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;
import o.isFragmentViewChild;
/* loaded from: classes6.dex */
public class EventBeatManager implements BatchEventDispatchedListener {
    private final HybridData mHybridData;

    private static native HybridData initHybrid();

    private native void tick();

    static {
        isFragmentViewChild.ag$a();
    }

    @Override // com.facebook.react.uimanager.events.BatchEventDispatchedListener
    public void onBatchEventDispatched() {
        tick();
    }
}
