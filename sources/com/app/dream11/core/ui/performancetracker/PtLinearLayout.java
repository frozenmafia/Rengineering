package com.app.dream11.core.ui.performancetracker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.Visibility;
import o.getAnimatedVisibility;
import o.getContentHeight;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PtLinearLayout extends LinearLayout implements getContentHeight {
    public Map<Integer, View> ah$a;
    private getAnimatedVisibility toString;
    private boolean valueOf;

    public final void setFlag(boolean z) {
        this.valueOf = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PtLinearLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = new LinkedHashMap();
        this.valueOf = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PtLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.ah$a = new LinkedHashMap();
        this.valueOf = true;
        this.toString = new getAnimatedVisibility();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.PerformanceTrackerViewAttr);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttrâ€¦rformanceTrackerViewAttr)");
        getAnimatedVisibility getanimatedvisibility = this.toString;
        if (getanimatedvisibility == null) {
            return;
        }
        getanimatedvisibility.toString(obtainStyledAttributes);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        String valueOf;
        super.onDraw(canvas);
        if (this.valueOf) {
            getAnimatedVisibility getanimatedvisibility = this.toString;
            if ((getanimatedvisibility == null || (valueOf = getanimatedvisibility.valueOf()) == null || Visibility.Mode.ag$a((CharSequence) valueOf)) ? false : true) {
                getAnimatedVisibility getanimatedvisibility2 = this.toString;
                if (getanimatedvisibility2 != null) {
                    getanimatedvisibility2.ah$a();
                }
                this.valueOf = false;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.valueOf = true;
    }

    @Override // o.getContentHeight
    public getAnimatedVisibility ag$a() {
        return this.toString;
    }
}
