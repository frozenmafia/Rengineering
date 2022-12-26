package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes4.dex */
public interface RootView {
    void handleException(Throwable th);

    void onChildEndedNativeGesture(View view, MotionEvent motionEvent);

    void onChildStartedNativeGesture(MotionEvent motionEvent);

    void onChildStartedNativeGesture(View view, MotionEvent motionEvent);
}
