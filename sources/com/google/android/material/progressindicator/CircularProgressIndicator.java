package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$e;
import o.getOnExpandButtonClickListener;
import o.isOnSameScreenAsChildren;
/* loaded from: classes7.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int ag$a = Preference$BaseSavedState$HaptikSDK$e.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Preference.BaseSavedState.values.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, ag$a);
        HaptikSDK$b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: ah$a */
    public CircularProgressIndicatorSpec toString(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    private void HaptikSDK$b() {
        setIndeterminateDrawable(isOnSameScreenAsChildren.ah$a(getContext(), (CircularProgressIndicatorSpec) this.ah$a));
        setProgressDrawable(getOnExpandButtonClickListener.values(getContext(), (CircularProgressIndicatorSpec) this.ah$a));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.ah$a).ah$a();
    }

    public void setIndicatorInset(int i) {
        if (((CircularProgressIndicatorSpec) this.ah$a).HaptikSDK$a != i) {
            ((CircularProgressIndicatorSpec) this.ah$a).HaptikSDK$a = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, valueOf() * 2);
        if (((CircularProgressIndicatorSpec) this.ah$a).ah$b != max) {
            ((CircularProgressIndicatorSpec) this.ah$a).ah$b = max;
            ((CircularProgressIndicatorSpec) this.ah$a).ah$a();
            invalidate();
        }
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.ah$a).HaptikSDK$b = i;
        invalidate();
    }
}
