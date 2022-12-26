package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.dream11Pro.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$ah$b;
import o.AnyRes;
import o.getM;
/* loaded from: classes3.dex */
public class CustomTabLayout extends TabLayout {
    private Typeface ag$a;
    String values;

    public CustomTabLayout(Context context) {
        super(context);
        values();
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTabLayout);
        String string = obtainStyledAttributes.getString(1);
        this.values = string;
        if (string == null || string.equalsIgnoreCase("null")) {
            this.values = context.getString(R.string.res_0x7f12000e);
        }
        obtainStyledAttributes.recycle();
        values();
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTabLayout);
        String string = obtainStyledAttributes.getString(1);
        this.values = string;
        if (string == null || string.equalsIgnoreCase("null")) {
            this.values = context.getString(R.string.res_0x7f12000e);
        }
        obtainStyledAttributes.recycle();
        values();
    }

    private void values() {
        this.ag$a = getM.toString(getContext(), this.values);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void ag$a(TabLayout$ah$b tabLayout$ah$b) {
        super.ag$a(tabLayout$ah$b);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) getChildAt(0)).getChildAt(tabLayout$ah$b.valueOf());
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(this.ag$a, 0);
            }
        }
    }
}
