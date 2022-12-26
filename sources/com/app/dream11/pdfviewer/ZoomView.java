package com.app.dream11.pdfviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.pdfviewer.ZoomView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ZoomView extends LinearLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public static final ZoomView$ag$a ag$a = new ZoomView$ag$a(null);
    private Mode HaptikSDK$a;
    private float HaptikSDK$b;
    private float HaptikSDK$c;
    private float HaptikWebView;
    private float ah$a;
    private float ah$b;
    private float invoke;
    private float toString;
    private float valueOf;
    public Map<Integer, View> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum Mode {
        NONE,
        DRAG,
        ZOOM
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ZoomView(Context context) {
        super(context);
        this.values = new LinkedHashMap();
        this.HaptikSDK$a = Mode.NONE;
        this.invoke = 1.0f;
        toString(context);
    }

    public ZoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.values = new LinkedHashMap();
        this.HaptikSDK$a = Mode.NONE;
        this.invoke = 1.0f;
        toString(context);
    }

    public ZoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.values = new LinkedHashMap();
        this.HaptikSDK$a = Mode.NONE;
        this.invoke = 1.0f;
        toString(context);
    }

    public final void toString(Context context) {
        final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        setOnTouchListener(new View.OnTouchListener() { // from class: o.parseIntAttributes
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean values;
                values = ZoomView.values(ZoomView.this, scaleGestureDetector, view, motionEvent);
                return values;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean values(ZoomView zoomView, ScaleGestureDetector scaleGestureDetector, View view, MotionEvent motionEvent) {
        runAnimators.ag$a(zoomView, "this$0");
        runAnimators.ag$a(scaleGestureDetector, "$scaleDetector");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                zoomView.HaptikSDK$a = Mode.NONE;
                zoomView.ah$b = zoomView.toString;
                zoomView.HaptikSDK$b = zoomView.ah$a;
            } else if (action != 2) {
                if (action == 5) {
                    zoomView.HaptikSDK$a = Mode.ZOOM;
                } else if (action == 6) {
                    zoomView.HaptikSDK$a = Mode.DRAG;
                }
            } else if (zoomView.HaptikSDK$a == Mode.DRAG) {
                zoomView.toString = motionEvent.getX() - zoomView.HaptikSDK$c;
                zoomView.ah$a = motionEvent.getY() - zoomView.HaptikWebView;
            }
        } else if (zoomView.invoke > 1.0f) {
            zoomView.HaptikSDK$a = Mode.DRAG;
            zoomView.HaptikSDK$c = motionEvent.getX() - zoomView.ah$b;
            zoomView.HaptikWebView = motionEvent.getY() - zoomView.HaptikSDK$b;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        if ((zoomView.HaptikSDK$a == Mode.DRAG && zoomView.invoke >= 1.0f) || zoomView.HaptikSDK$a == Mode.ZOOM) {
            zoomView.getParent().requestDisallowInterceptTouchEvent(true);
            float f = zoomView.invoke;
            float f2 = 2;
            float width = ((zoomView.values().getWidth() - (zoomView.values().getWidth() / f)) / f2) * f;
            float f3 = zoomView.invoke;
            float height = ((zoomView.values().getHeight() - (zoomView.values().getHeight() / f3)) / f2) * f3;
            zoomView.toString = Math.min(Math.max(zoomView.toString, -width), width);
            zoomView.ah$a = Math.min(Math.max(zoomView.ah$a, -height), height);
            zoomView.ag$a();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        runAnimators.ag$a(scaleGestureDetector, "scaleDetector");
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!(this.valueOf == 0.0f)) {
            if (!(Math.signum(scaleFactor) == Math.signum(this.valueOf))) {
                this.valueOf = 0.0f;
                return true;
            }
        }
        float f = this.invoke * scaleFactor;
        this.invoke = f;
        this.invoke = Math.max(1.0f, Math.min(f, 4.0f));
        this.valueOf = scaleFactor;
        return true;
    }

    private final void ag$a() {
        values().setScaleX(this.invoke);
        values().setScaleY(this.invoke);
        values().setTranslationX(this.toString);
        values().setTranslationY(this.ah$a);
    }

    private final View values() {
        View childAt = getChildAt(0);
        runAnimators.ah$a(childAt, "getChildAt(0)");
        return childAt;
    }
}
