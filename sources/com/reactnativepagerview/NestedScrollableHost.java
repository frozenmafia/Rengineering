package com.reactnativepagerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class NestedScrollableHost extends FrameLayout {
    private Integer ag$a;
    private int ah$a;
    private float toString;
    private float values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.ah$a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final void setInitialIndex(Integer num) {
        this.ag$a = num;
    }

    public final Integer values() {
        return this.ag$a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[LOOP:0: B:6:0x000d->B:11:0x001b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000c -> B:6:0x000d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.viewpager2.widget.ViewPager2 ag$a() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1e
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 != 0) goto L1e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        L1e:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L25
            r2 = r0
            androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.NestedScrollableHost.ag$a():androidx.viewpager2.widget.ViewPager2");
    }

    private final View ah$a() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final boolean ag$a(int i, float f) {
        int i2 = -((int) Math.signum(f));
        if (i == 0) {
            View ah$a = ah$a();
            if (ah$a != null) {
                return ah$a.canScrollHorizontally(i2);
            }
        } else if (i == 1) {
            View ah$a2 = ah$a();
            if (ah$a2 != null) {
                return ah$a2.canScrollVertically(i2);
            }
        } else {
            throw new IllegalArgumentException();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, "e");
        ah$a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    private final void ah$a(MotionEvent motionEvent) {
        ViewPager2 ag$a = ag$a();
        Integer valueOf = ag$a == null ? null : Integer.valueOf(ag$a.getOrientation());
        if (valueOf == null) {
            return;
        }
        int intValue = valueOf.intValue();
        if (ag$a(intValue, -1.0f) || ag$a(intValue, 1.0f)) {
            if (motionEvent.getAction() == 0) {
                this.values = motionEvent.getX();
                this.toString = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.values;
                float y = motionEvent.getY() - this.toString;
                boolean z = intValue == 0;
                float abs = Math.abs(x) * (z ? 0.5f : 1.0f);
                float abs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
                float f = this.ah$a;
                if (abs > f || abs2 > f) {
                    if (z == (abs2 > abs)) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    if (!z) {
                        x = y;
                    }
                    if (ag$a(intValue, x)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }
}
