package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private int HaptikSDK$a;
    private VelocityTracker HaptikSDK$b;
    private int ag$a;
    OverScroller ah$a;
    private int toString;
    private Runnable valueOf;
    private boolean values;

    void valueOf(CoordinatorLayout coordinatorLayout, V v) {
    }

    boolean values(V v) {
        return false;
    }

    public HeaderBehavior() {
        this.toString = -1;
        this.HaptikSDK$a = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = -1;
        this.HaptikSDK$a = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.HaptikSDK$a < 0) {
            this.HaptikSDK$a = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.values) {
            int i = this.toString;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.ag$a) > this.HaptikSDK$a) {
                this.ag$a = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.toString = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = values(v) && coordinatorLayout.isPointInChildBounds(v, x, y2);
            this.values = z;
            if (z) {
                this.ag$a = y2;
                this.toString = motionEvent.getPointerId(0);
                valueOf();
                OverScroller overScroller = this.ah$a;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.ah$a.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.HaptikSDK$b;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.toString = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.ag$a = r12
            goto L4c
        L2d:
            int r0 = r11.toString
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.ag$a
            r11.ag$a = r0
            int r7 = r1 - r0
            int r8 = r11.ag$a(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.ah$a(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.HaptikSDK$b
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.HaptikSDK$b
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.HaptikSDK$b
            int r4 = r11.toString
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.toString(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.ag$a(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.values = r3
            r11.toString = r1
            android.view.VelocityTracker r13 = r11.HaptikSDK$b
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.HaptikSDK$b = r13
        L81:
            android.view.VelocityTracker r13 = r11.HaptikSDK$b
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.values
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int ah$a(CoordinatorLayout coordinatorLayout, V v, int i) {
        return toString(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int toString(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int ag$a = ag$a();
        if (i2 == 0 || ag$a < i2 || ag$a > i3 || ag$a == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        toString(clamp);
        return ag$a - clamp;
    }

    int ah$a() {
        return ag$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ah$a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return toString(coordinatorLayout, v, ah$a() - i, i2, i3);
    }

    final boolean ag$a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.valueOf;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.valueOf = null;
        }
        if (this.ah$a == null) {
            this.ah$a = new OverScroller(v.getContext());
        }
        this.ah$a.fling(0, ag$a(), 0, Math.round(f), 0, 0, i, i2);
        if (this.ah$a.computeScrollOffset()) {
            toString tostring = new toString(coordinatorLayout, v);
            this.valueOf = tostring;
            ViewCompat.postOnAnimation(v, tostring);
            return true;
        }
        valueOf(coordinatorLayout, v);
        return false;
    }

    int ag$a(V v) {
        return -v.getHeight();
    }

    int toString(V v) {
        return v.getHeight();
    }

    private void valueOf() {
        if (this.HaptikSDK$b == null) {
            this.HaptikSDK$b = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class toString implements Runnable {
        private final CoordinatorLayout toString;
        private final V values;

        toString(CoordinatorLayout coordinatorLayout, V v) {
            this.toString = coordinatorLayout;
            this.values = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.values == null || HeaderBehavior.this.ah$a == null) {
                return;
            }
            if (HeaderBehavior.this.ah$a.computeScrollOffset()) {
                HeaderBehavior headerBehavior = HeaderBehavior.this;
                headerBehavior.ah$a(this.toString, this.values, headerBehavior.ah$a.getCurrY());
                ViewCompat.postOnAnimation(this.values, this);
                return;
            }
            HeaderBehavior.this.valueOf(this.toString, this.values);
        }
    }
}
