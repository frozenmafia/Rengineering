package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.app.dream11Pro.R;
import o.AnyRes;
import o.getM;
/* loaded from: classes3.dex */
public class CustomButton extends AppCompatButton {
    String ag$a;

    public CustomButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ah$a();
    }

    public CustomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomButton);
        try {
            String string = obtainStyledAttributes.getString(0);
            this.ag$a = string;
            if (string == null || string.equalsIgnoreCase("null")) {
                int i = obtainStyledAttributes.getInt(1, 0);
                if (i == 1) {
                    this.ag$a = context.getString(R.string.res_0x7f12000e);
                } else if (i == 2) {
                    this.ag$a = context.getString(R.string.res_0x7f12000d);
                } else if (i == 3) {
                    this.ag$a = context.getString(R.string.res_0x7f12000c);
                }
            }
            obtainStyledAttributes.recycle();
            String str = this.ag$a;
            if (str == null || str.equalsIgnoreCase("null")) {
                this.ag$a = context.getString(R.string.res_0x7f12000e);
            }
            ah$a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CustomButton(Context context) {
        super(context);
        ah$a();
    }

    private void ah$a() {
        if (isInEditMode()) {
            return;
        }
        setTypeface(getM.toString(getContext(), this.ag$a));
    }
}
