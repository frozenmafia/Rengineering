package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.Preference;
import o.Preference$BaseSavedState$ah$a;
import o.PreferenceFragment;
import o.PreferenceFragmentCompat;
import o.PreferenceGroup;
/* loaded from: classes7.dex */
public final class CircularProgressIndicatorSpec extends PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    public int HaptikSDK$a;
    public int HaptikSDK$b;
    public int ah$b;

    @Override // o.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    public void ah$a() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Preference.BaseSavedState.values.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.ag$a);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(Preference$BaseSavedState$ah$a.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(Preference$BaseSavedState$ah$a.mtrl_progress_circular_inset_medium);
        TypedArray scrollToPreferenceObserver = PreferenceFragment.ScrollToPreferenceObserver.toString(context, attributeSet, Preference.BaseSavedState.getSignupData.CircularProgressIndicator, i, i2, new int[0]);
        this.ah$b = Math.max(PreferenceGroup.AnonymousClass1.ah$a(context, scrollToPreferenceObserver, Preference.BaseSavedState.getSignupData.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.invoke * 2);
        this.HaptikSDK$a = PreferenceGroup.AnonymousClass1.ah$a(context, scrollToPreferenceObserver, Preference.BaseSavedState.getSignupData.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.HaptikSDK$b = scrollToPreferenceObserver.getInt(Preference.BaseSavedState.getSignupData.CircularProgressIndicator_indicatorDirectionCircular, 0);
        scrollToPreferenceObserver.recycle();
        ah$a();
    }
}
