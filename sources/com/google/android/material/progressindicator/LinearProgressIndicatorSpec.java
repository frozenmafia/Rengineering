package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.Preference;
import o.PreferenceFragment;
import o.PreferenceFragmentCompat;
/* loaded from: classes7.dex */
public final class LinearProgressIndicatorSpec extends PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    public boolean HaptikSDK$b;
    public int HaptikSDK$c;
    public int ah$b;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Preference.BaseSavedState.values.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.valueOf);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray scrollToPreferenceObserver = PreferenceFragment.ScrollToPreferenceObserver.toString(context, attributeSet, Preference.BaseSavedState.getSignupData.LinearProgressIndicator, Preference.BaseSavedState.values.linearProgressIndicatorStyle, LinearProgressIndicator.valueOf, new int[0]);
        this.HaptikSDK$c = scrollToPreferenceObserver.getInt(Preference.BaseSavedState.getSignupData.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.ah$b = scrollToPreferenceObserver.getInt(Preference.BaseSavedState.getSignupData.LinearProgressIndicator_indicatorDirectionLinear, 0);
        scrollToPreferenceObserver.recycle();
        ah$a();
        this.HaptikSDK$b = this.ah$b == 1;
    }

    @Override // o.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    public void ah$a() {
        if (this.HaptikSDK$c == 0) {
            if (this.values > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.valueOf.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
