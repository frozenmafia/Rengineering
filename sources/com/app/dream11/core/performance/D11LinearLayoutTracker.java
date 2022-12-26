package com.app.dream11.core.performance;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.BindingAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getActionProvider;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class D11LinearLayoutTracker extends LinearLayout implements getActionProvider.values {
    public static final D11LinearLayoutTracker$ah$a toString = new D11LinearLayoutTracker$ah$a(null);
    private String ag$a;
    private boolean ah$a;
    private String ah$b;
    private String invoke;
    private getActionProvider valueOf;
    public Map<Integer, View> values;

    @BindingAdapter({"source"})
    public static final void toString(D11LinearLayoutTracker d11LinearLayoutTracker, String str) {
        toString.values(d11LinearLayoutTracker, str);
    }

    @BindingAdapter({"enableTracker"})
    public static final void values(D11LinearLayoutTracker d11LinearLayoutTracker, boolean z) {
        toString.values(d11LinearLayoutTracker, z);
    }

    public final void setLoadInstanceId(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$b = str;
    }

    public final void setSource(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.invoke = str;
    }

    public final void setEventName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ag$a = str;
    }

    public final void setEnableTracker(boolean z) {
        this.ah$a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11LinearLayoutTracker(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
        this.ah$b = "";
        this.invoke = "";
        this.ag$a = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11LinearLayoutTracker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.values = new LinkedHashMap();
        this.ah$b = "";
        this.invoke = "";
        this.ag$a = "";
        getActionProvider getactionprovider = new getActionProvider();
        this.valueOf = getactionprovider;
        getactionprovider.toString(this);
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getActionProvider getactionprovider = this.valueOf;
        if (getactionprovider == null) {
            runAnimators.valueOf("d11PerformanceTracker");
            getactionprovider = null;
        }
        getactionprovider.ag$a((String) getContentDescription(), this.ah$b, this.invoke, this.ag$a);
    }

    @Override // o.getActionProvider.values
    public boolean values() {
        return this.ah$a;
    }
}
