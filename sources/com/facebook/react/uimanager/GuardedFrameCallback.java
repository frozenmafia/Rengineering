package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import o.burpActive$ag$a;
/* loaded from: classes4.dex */
public abstract class GuardedFrameCallback extends burpActive$ag$a {
    private final ReactContext mReactContext;

    protected abstract void doFrameGuarded(long j);

    public GuardedFrameCallback(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // o.burpActive$ag$a
    public final void doFrame(long j) {
        try {
            doFrameGuarded(j);
        } catch (RuntimeException e) {
            this.mReactContext.handleException(e);
        }
    }
}
