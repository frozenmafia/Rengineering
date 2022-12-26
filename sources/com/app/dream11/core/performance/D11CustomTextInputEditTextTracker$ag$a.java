package com.app.dream11.core.performance;

import androidx.databinding.BindingAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class D11CustomTextInputEditTextTracker$ag$a {
    public /* synthetic */ D11CustomTextInputEditTextTracker$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private D11CustomTextInputEditTextTracker$ag$a() {
    }

    @BindingAdapter({"enableTracker"})
    public final void toString(D11CustomTextInputEditTextTracker d11CustomTextInputEditTextTracker, boolean z) {
        runAnimators.ag$a(d11CustomTextInputEditTextTracker, Promotion.ACTION_VIEW);
        D11CustomTextInputEditTextTracker.ah$a(d11CustomTextInputEditTextTracker, z);
    }

    @BindingAdapter({"loadInstanceId"})
    public final void ag$a(D11CustomTextInputEditTextTracker d11CustomTextInputEditTextTracker, String str) {
        runAnimators.ag$a(d11CustomTextInputEditTextTracker, Promotion.ACTION_VIEW);
        if (str == null) {
            return;
        }
        D11CustomTextInputEditTextTracker.valueOf(d11CustomTextInputEditTextTracker, str);
    }

    @BindingAdapter({"source"})
    public final void valueOf(D11CustomTextInputEditTextTracker d11CustomTextInputEditTextTracker, String str) {
        runAnimators.ag$a(d11CustomTextInputEditTextTracker, Promotion.ACTION_VIEW);
        if (str == null) {
            return;
        }
        D11CustomTextInputEditTextTracker.values(d11CustomTextInputEditTextTracker, str);
    }

    @BindingAdapter({"eventName"})
    public final void ah$a(D11CustomTextInputEditTextTracker d11CustomTextInputEditTextTracker, String str) {
        runAnimators.ag$a(d11CustomTextInputEditTextTracker, Promotion.ACTION_VIEW);
        if (str == null) {
            return;
        }
        D11CustomTextInputEditTextTracker.toString(d11CustomTextInputEditTextTracker, str);
    }
}
