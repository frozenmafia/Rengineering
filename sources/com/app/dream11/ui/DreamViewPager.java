package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class DreamViewPager extends EventsViewPager {
    private boolean ah$a;
    public Map<Integer, View> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamViewPager(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
        this.ah$a = true;
    }

    public final void setSwipeable(boolean z) {
        this.ah$a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attributeSet");
        this.values = new LinkedHashMap();
        this.ah$a = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.DreamViewPager);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…styleable.DreamViewPager)");
        try {
            this.ah$a = obtainStyledAttributes.getBoolean(0, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.ah$a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.ah$a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
