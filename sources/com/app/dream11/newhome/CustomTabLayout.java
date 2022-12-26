package com.app.dream11.newhome;

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
    String ah$a;
    private Typeface values;

    public CustomTabLayout(Context context) {
        super(context);
        this.values = getM.toString(getContext(), this.ah$a);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTabLayout);
        try {
            String string = obtainStyledAttributes.getString(1);
            this.ah$a = string;
            if (string == null || string.equalsIgnoreCase("null")) {
                int i = obtainStyledAttributes.getInt(0, 0);
                if (i == 1) {
                    this.ah$a = context.getString(R.string.res_0x7f12000e);
                } else if (i == 2) {
                    this.ah$a = context.getString(R.string.res_0x7f12000d);
                } else if (i == 3) {
                    this.ah$a = context.getString(R.string.res_0x7f12000c);
                }
            }
            obtainStyledAttributes.recycle();
            String str = this.ah$a;
            if (str == null || str.equalsIgnoreCase("null")) {
                this.ah$a = context.getString(R.string.res_0x7f12000e);
            }
            this.values = getM.toString(getContext(), this.ah$a);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void ag$a(TabLayout$ah$b tabLayout$ah$b) {
        super.ag$a(tabLayout$ah$b);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) getChildAt(0)).getChildAt(tabLayout$ah$b.valueOf());
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(this.values);
            }
        }
    }
}
