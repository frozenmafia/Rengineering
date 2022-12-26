package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CTAFloatingButton extends FloatingButton {
    private boolean ag$a;
    public Map<Integer, View> ah$a;
    private int valueOf;
    private int values;

    public final void setButtonActive(boolean z) {
        this.ag$a = z;
        if (z) {
            valueOf();
        } else {
            invoke();
        }
    }

    public final void setInactiveBackgroundColor(int i) {
        this.valueOf = i;
    }

    public final void setInactiveTextColor(int i) {
        this.values = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTAFloatingButton(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = new LinkedHashMap();
        this.valueOf = -1;
        this.values = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTAFloatingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.ah$a = new LinkedHashMap();
        this.valueOf = -1;
        this.values = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CTAFloatingButton);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…leable.CTAFloatingButton)");
        try {
            this.valueOf = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.d11_color_border__neutralDark));
            this.values = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, R.color.d11_color_text__neutralLightest));
            setButtonActive(obtainStyledAttributes.getBoolean(2, false));
            setCardBackgroundColor(this.ag$a ? values() : this.valueOf);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void valueOf() {
        ag$a().setTextColor(ah$a());
        ag$a().setBackgroundColor(values());
        setCardBackgroundColor(values());
    }

    private final void invoke() {
        ag$a().setTextColor(this.values);
        ag$a().setBackgroundColor(this.valueOf);
        setCardBackgroundColor(this.valueOf);
    }
}
