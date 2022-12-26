package com.dream11.react.dreamlist;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Objects;
import o.runAnimators;
/* loaded from: classes.dex */
public final class DreamListPressable extends ReactViewGroup {
    private int valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamListPressable(ReactContext reactContext) {
        super(reactContext);
        runAnimators.ag$a(reactContext, "context");
    }

    public final void setIndex(int i) {
        this.valueOf = i;
    }

    public final void values(int i) {
        RCTEventEmitter rCTEventEmitter;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("index", i);
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        if (reactContext == null || (rCTEventEmitter = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)) == null) {
            return;
        }
        rCTEventEmitter.receiveEvent(getId(), "onPress", writableNativeMap.copy());
    }
}
