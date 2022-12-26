package com.app.dream11.core.performance;

import androidx.databinding.BindingAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class D11LinearLayoutTracker$ah$a {
    public /* synthetic */ D11LinearLayoutTracker$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private D11LinearLayoutTracker$ah$a() {
    }

    @BindingAdapter({"enableTracker"})
    public final void values(D11LinearLayoutTracker d11LinearLayoutTracker, boolean z) {
        runAnimators.ag$a(d11LinearLayoutTracker, Promotion.ACTION_VIEW);
        d11LinearLayoutTracker.setEnableTracker(z);
    }

    @BindingAdapter({"loadInstanceId"})
    public final void ag$a(D11LinearLayoutTracker d11LinearLayoutTracker, String str) {
        runAnimators.ag$a(d11LinearLayoutTracker, Promotion.ACTION_VIEW);
        if (str == null) {
            return;
        }
        d11LinearLayoutTracker.setLoadInstanceId(str);
    }

    @BindingAdapter({"source"})
    public final void values(D11LinearLayoutTracker d11LinearLayoutTracker, String str) {
        runAnimators.ag$a(d11LinearLayoutTracker, Promotion.ACTION_VIEW);
        if (str == null) {
            return;
        }
        d11LinearLayoutTracker.setSource(str);
    }

    @BindingAdapter({"eventName"})
    public final void valueOf(D11LinearLayoutTracker d11LinearLayoutTracker, String str) {
        runAnimators.ag$a(d11LinearLayoutTracker, Promotion.ACTION_VIEW);
        if (str == null) {
            return;
        }
        d11LinearLayoutTracker.setEventName(str);
    }
}
