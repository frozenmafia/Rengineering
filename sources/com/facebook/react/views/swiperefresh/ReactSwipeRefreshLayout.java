package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.NativeGestureUtil;
/* loaded from: classes4.dex */
public class ReactSwipeRefreshLayout extends SwipeRefreshLayout {
    private int HaptikSDK$a;
    private boolean ag$a;
    private boolean ah$a;
    private float toString;
    private boolean valueOf;
    private float values;

    public ReactSwipeRefreshLayout(ReactContext reactContext) {
        super(reactContext);
        this.valueOf = false;
        this.ah$a = false;
        this.toString = 0.0f;
        this.HaptikSDK$a = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        this.ah$a = z;
        if (this.valueOf) {
            super.setRefreshing(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.toString = f;
        if (this.valueOf) {
            int progressCircleDiameter = getProgressCircleDiameter();
            setProgressViewOffset(false, Math.round(PixelUtil.toPixelFromDIP(f)) - progressCircleDiameter, Math.round(PixelUtil.toPixelFromDIP(f + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        setProgressViewOffset(this.toString);
        setRefreshing(this.ah$a);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (ah$a(motionEvent) && super.onInterceptTouchEvent(motionEvent)) {
            NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        return false;
    }

    private boolean ah$a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.values = motionEvent.getX();
            this.ag$a = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.values);
            if (this.ag$a || abs > this.HaptikSDK$a) {
                this.ag$a = true;
                return false;
            }
        }
        return true;
    }
}
