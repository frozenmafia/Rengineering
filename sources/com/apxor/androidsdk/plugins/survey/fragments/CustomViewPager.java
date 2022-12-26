package com.apxor.androidsdk.plugins.survey.fragments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
/* loaded from: classes6.dex */
public class CustomViewPager extends b {
    private boolean k0;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k0 = true;
        this.k0 = true;
    }

    @Override // com.apxor.androidsdk.plugins.survey.fragments.b, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.k0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.apxor.androidsdk.plugins.survey.fragments.b, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.k0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnabled(boolean z) {
        this.k0 = z;
    }
}
