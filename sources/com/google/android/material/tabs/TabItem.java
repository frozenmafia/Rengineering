package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import o.Preference;
/* loaded from: classes5.dex */
public class TabItem extends View {
    public final int ag$a;
    public final CharSequence toString;
    public final Drawable values;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, Preference.BaseSavedState.getSignupData.TabItem);
        this.toString = obtainStyledAttributes.getText(Preference.BaseSavedState.getSignupData.TabItem_android_text);
        this.values = obtainStyledAttributes.getDrawable(Preference.BaseSavedState.getSignupData.TabItem_android_icon);
        this.ag$a = obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
