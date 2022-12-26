package com.app.dream11.newhome;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* loaded from: classes3.dex */
public class CustomSwipeToRefresh extends SwipeRefreshLayout {
    private boolean ah$a;
    private int toString;
    private float values;

    public CustomSwipeToRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.ah$a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.values = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.values) > this.toString) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void ag$a(boolean z) {
        this.ah$a = z;
        setEnabled(!z);
    }
}
