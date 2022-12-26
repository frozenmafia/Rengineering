package com.app.dream11.core.performance;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.BindingAdapter;
import com.apxor.androidsdk.core.ce.Constants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getActionProvider;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class D11RelativeLayoutTracker extends RelativeLayout implements getActionProvider.values {
    public static final toString ag$a = new toString(null);
    private getActionProvider ah$a;
    private String ah$b;
    private String invoke;
    private String toString;
    public Map<Integer, View> valueOf;
    private boolean values;

    @BindingAdapter({"source"})
    public static final void valueOf(D11RelativeLayoutTracker d11RelativeLayoutTracker, String str) {
        ag$a.valueOf(d11RelativeLayoutTracker, str);
    }

    @BindingAdapter({"enableTracker"})
    public static final void valueOf(D11RelativeLayoutTracker d11RelativeLayoutTracker, boolean z) {
        ag$a.values(d11RelativeLayoutTracker, z);
    }

    @BindingAdapter({"eventName"})
    public static final void values(D11RelativeLayoutTracker d11RelativeLayoutTracker, String str) {
        ag$a.toString(d11RelativeLayoutTracker, str);
    }

    public final void setLoadInstanceId(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.invoke = str;
    }

    public final void setSource(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$b = str;
    }

    public final void setEventName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final void setEnableTracker(boolean z) {
        this.values = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11RelativeLayoutTracker(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.invoke = "";
        this.ah$b = "";
        this.toString = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11RelativeLayoutTracker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
        this.invoke = "";
        this.ah$b = "";
        this.toString = "";
        getActionProvider getactionprovider = new getActionProvider();
        this.ah$a = getactionprovider;
        getactionprovider.toString(this);
        setWillNotDraw(false);
    }

    @Override // o.getActionProvider.values
    public boolean values() {
        return this.values;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getActionProvider getactionprovider = this.ah$a;
        if (getactionprovider == null) {
            runAnimators.valueOf("d11PerformanceTracker");
            getactionprovider = null;
        }
        getactionprovider.ag$a((String) getContentDescription(), this.invoke, this.ah$b, this.toString);
    }

    /* loaded from: classes2.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        @BindingAdapter({"enableTracker"})
        public final void values(D11RelativeLayoutTracker d11RelativeLayoutTracker, boolean z) {
            runAnimators.ag$a(d11RelativeLayoutTracker, Promotion.ACTION_VIEW);
            d11RelativeLayoutTracker.setEnableTracker(z);
        }

        @BindingAdapter({"loadInstanceId"})
        public final void values(D11RelativeLayoutTracker d11RelativeLayoutTracker, String str) {
            runAnimators.ag$a(d11RelativeLayoutTracker, Promotion.ACTION_VIEW);
            if (str == null) {
                return;
            }
            d11RelativeLayoutTracker.setLoadInstanceId(str);
        }

        @BindingAdapter({"source"})
        public final void valueOf(D11RelativeLayoutTracker d11RelativeLayoutTracker, String str) {
            runAnimators.ag$a(d11RelativeLayoutTracker, Promotion.ACTION_VIEW);
            if (str == null) {
                return;
            }
            d11RelativeLayoutTracker.setSource(str);
        }

        @BindingAdapter({"eventName"})
        public final void toString(D11RelativeLayoutTracker d11RelativeLayoutTracker, String str) {
            runAnimators.ag$a(d11RelativeLayoutTracker, Promotion.ACTION_VIEW);
            if (str == null) {
                return;
            }
            d11RelativeLayoutTracker.setEventName(str);
        }
    }
}
