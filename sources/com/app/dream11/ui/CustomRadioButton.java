package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.getM;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CustomRadioButton extends AppCompatRadioButton {
    private String ah$a;
    public Map<Integer, View> valueOf;

    public final void setFont(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRadioButton(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.ah$a = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
        this.ah$a = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomRadioButton);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…leable.CustomRadioButton)");
        try {
            int i = obtainStyledAttributes.getInt(0, 1);
            if (i == 1) {
                String string = context.getString(R.string.res_0x7f12000e);
                runAnimators.ah$a(string, "context.getString(R.string.D11Font_Regular)");
                this.ah$a = string;
            } else if (i == 2) {
                String string2 = context.getString(R.string.res_0x7f12000d);
                runAnimators.ah$a(string2, "context.getString(R.string.D11Font_Medium)");
                this.ah$a = string2;
            } else if (i == 3) {
                String string3 = context.getString(R.string.res_0x7f12000c);
                runAnimators.ah$a(string3, "context.getString(R.string.D11Font_Bold)");
                this.ah$a = string3;
            }
            obtainStyledAttributes.recycle();
            setTypeFace$app_proProdRelease();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
        this.ah$a = "";
    }

    public final void setTypeFace$app_proProdRelease() {
        if (isInEditMode()) {
            return;
        }
        try {
            setTypeface(getM.toString(getContext(), this.ah$a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
