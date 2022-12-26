package com.app.dream11.core.performance;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.databinding.BindingAdapter;
import com.app.dream11.ui.creatteamcomponent.TabLayoutWithCount;
import com.apxor.androidsdk.core.ce.Constants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getActionProvider;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class D11TabLayoutTrackerWithCount extends TabLayoutWithCount implements getActionProvider.values {
    public static final values valueOf = new values(null);
    private String ICustomTabsCallback$Stub;
    public Map<Integer, View> ah$a;
    private String asBinder;
    private boolean asInterface;
    private String getDefaultImpl;
    private getActionProvider values;

    @BindingAdapter({"eventName"})
    public static final void toString(D11CustomTabLayoutTracker d11CustomTabLayoutTracker, String str) {
        valueOf.toString(d11CustomTabLayoutTracker, str);
    }

    @BindingAdapter({"enableTracker"})
    public static final void values(D11CustomTabLayoutTracker d11CustomTabLayoutTracker, boolean z) {
        valueOf.values(d11CustomTabLayoutTracker, z);
    }

    public final void setLoadInstanceId(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.asBinder = str;
    }

    public final void setSource(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ICustomTabsCallback$Stub = str;
    }

    public final void setEventName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.getDefaultImpl = str;
    }

    public final void setEnableTracker(boolean z) {
        this.asInterface = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11TabLayoutTrackerWithCount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.ah$a = new LinkedHashMap();
        this.asBinder = "";
        this.ICustomTabsCallback$Stub = "";
        this.getDefaultImpl = "";
        getActionProvider getactionprovider = new getActionProvider();
        this.values = getactionprovider;
        getactionprovider.toString(this);
        setWillNotDraw(false);
    }

    @Override // o.getActionProvider.values
    public boolean values() {
        return this.asInterface;
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.View
    public void onDraw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        super.onDraw(canvas);
        getActionProvider getactionprovider = this.values;
        if (getactionprovider == null) {
            runAnimators.valueOf("d11PerformanceTracker");
            getactionprovider = null;
        }
        getactionprovider.ag$a((String) getContentDescription(), this.asBinder, this.ICustomTabsCallback$Stub, this.getDefaultImpl);
    }

    /* loaded from: classes2.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        @BindingAdapter({"enableTracker"})
        public final void values(D11CustomTabLayoutTracker d11CustomTabLayoutTracker, boolean z) {
            runAnimators.ag$a(d11CustomTabLayoutTracker, Promotion.ACTION_VIEW);
            d11CustomTabLayoutTracker.setEnableTracker(z);
        }

        @BindingAdapter({"loadInstanceId"})
        public final void ag$a(D11CustomTabLayoutTracker d11CustomTabLayoutTracker, String str) {
            runAnimators.ag$a(d11CustomTabLayoutTracker, Promotion.ACTION_VIEW);
            if (str == null) {
                return;
            }
            d11CustomTabLayoutTracker.setLoadInstanceId(str);
        }

        @BindingAdapter({"source"})
        public final void valueOf(D11CustomTabLayoutTracker d11CustomTabLayoutTracker, String str) {
            runAnimators.ag$a(d11CustomTabLayoutTracker, Promotion.ACTION_VIEW);
            if (str == null) {
                return;
            }
            d11CustomTabLayoutTracker.setSource(str);
        }

        @BindingAdapter({"eventName"})
        public final void toString(D11CustomTabLayoutTracker d11CustomTabLayoutTracker, String str) {
            runAnimators.ag$a(d11CustomTabLayoutTracker, Promotion.ACTION_VIEW);
            if (str == null) {
                return;
            }
            d11CustomTabLayoutTracker.setEventName(str);
        }
    }
}
