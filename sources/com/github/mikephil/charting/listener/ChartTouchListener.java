package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import o.MediaBrowserServiceCompat;
import o.MediaSessionManager;
/* loaded from: classes4.dex */
public abstract class ChartTouchListener<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    protected GestureDetector ag$a;
    protected MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 ah$a;
    protected T values;
    protected ChartGesture valueOf = ChartGesture.NONE;
    protected int toString = 0;

    /* loaded from: classes4.dex */
    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(T t) {
        this.values = t;
        this.ag$a = new GestureDetector(t.getContext(), this);
    }

    public void valueOf(MotionEvent motionEvent) {
        MediaSessionManager.RemoteUserInfoImpl warmup = this.values.warmup();
        if (warmup != null) {
            warmup.ah$a(motionEvent, this.valueOf);
        }
    }

    public void ah$a(MotionEvent motionEvent) {
        MediaSessionManager.RemoteUserInfoImpl warmup = this.values.warmup();
        if (warmup != null) {
            warmup.toString(motionEvent, this.valueOf);
        }
    }

    public void values(MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 anonymousClass2) {
        this.ah$a = anonymousClass2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void values(MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 anonymousClass2, MotionEvent motionEvent) {
        if (anonymousClass2 == null || anonymousClass2.values(this.ah$a)) {
            this.values.values(null, true);
            this.ah$a = null;
            return;
        }
        this.values.values(anonymousClass2, true);
        this.ah$a = anonymousClass2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static float ag$a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }
}
