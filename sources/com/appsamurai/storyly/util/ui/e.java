package com.appsamurai.storyly.util.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ScrollView;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class e extends ScrollView {
    public boolean toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.toString && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            return this.toString && super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setScrollable(boolean z) {
        this.toString = z;
    }
}
