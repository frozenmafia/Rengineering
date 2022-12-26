package com.app.dream11.core.performance;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.app.dream11.ui.CustomTabLayout;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getActionProvider;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class D11CustomTabLayoutTracker extends CustomTabLayout implements getActionProvider.values {
    public static final values ah$a = new values(null);
    private String ICustomTabsCallback$Stub;
    private boolean ag$a;
    private String asInterface;
    private String getDefaultImpl;
    private getActionProvider toString;
    public Map<Integer, View> valueOf;

    public final void setLoadInstanceId(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.getDefaultImpl = str;
    }

    public final void setSource(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ICustomTabsCallback$Stub = str;
    }

    public final void setEventName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.asInterface = str;
    }

    public final void setEnableTracker(boolean z) {
        this.ag$a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11CustomTabLayoutTracker(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.getDefaultImpl = "";
        this.ICustomTabsCallback$Stub = "";
        this.asInterface = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11CustomTabLayoutTracker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
        this.getDefaultImpl = "";
        this.ICustomTabsCallback$Stub = "";
        this.asInterface = "";
        getActionProvider getactionprovider = new getActionProvider();
        this.toString = getactionprovider;
        getactionprovider.toString(this);
        setWillNotDraw(false);
    }

    @Override // o.getActionProvider.values
    public boolean values() {
        return this.ag$a;
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.View
    public void onDraw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        super.onDraw(canvas);
        getActionProvider getactionprovider = this.toString;
        if (getactionprovider == null) {
            runAnimators.valueOf("d11PerformanceTracker");
            getactionprovider = null;
        }
        getactionprovider.ag$a((String) getContentDescription(), this.getDefaultImpl, this.ICustomTabsCallback$Stub, this.asInterface);
    }

    /* loaded from: classes2.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
