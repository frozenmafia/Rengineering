package com.app.dream11.core.performance;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.databinding.BindingAdapter;
import com.app.dream11.ui.CustomTextInputEditText;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getActionProvider;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class D11CustomTextInputEditTextTracker extends CustomTextInputEditText implements getActionProvider.values {
    public static final D11CustomTextInputEditTextTracker$ag$a valueOf = new D11CustomTextInputEditTextTracker$ag$a(null);
    private String HaptikSDK$a;
    public Map<Integer, View> ag$a;
    private boolean ah$a;
    private String ah$b;
    private String invoke;
    private getActionProvider toString;

    @BindingAdapter({"enableTracker"})
    public static final void valueOf(D11CustomTextInputEditTextTracker d11CustomTextInputEditTextTracker, boolean z) {
        valueOf.toString(d11CustomTextInputEditTextTracker, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11CustomTextInputEditTextTracker(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ag$a = new LinkedHashMap();
        this.ah$b = "";
        this.invoke = "";
        this.HaptikSDK$a = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11CustomTextInputEditTextTracker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.ag$a = new LinkedHashMap();
        this.ah$b = "";
        this.invoke = "";
        this.HaptikSDK$a = "";
        getActionProvider getactionprovider = new getActionProvider();
        this.toString = getactionprovider;
        getactionprovider.toString(this);
    }

    @Override // o.getActionProvider.values
    public boolean values() {
        return this.ah$a;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getActionProvider getactionprovider = this.toString;
        if (getactionprovider == null) {
            runAnimators.valueOf("d11PerformanceTracker");
            getactionprovider = null;
        }
        getactionprovider.ag$a((String) getContentDescription(), this.ah$b, this.invoke, this.HaptikSDK$a);
    }
}
