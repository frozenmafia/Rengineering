package com.dream11.design.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.includeChildForAccessibility;
import o.mirror$ah$a;
import o.runAnimators;
/* loaded from: classes.dex */
public final class D11TextView extends AppCompatTextView implements TransformationMethod {
    public Map<Integer, View> ah$a;
    private int values;

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11TextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.ah$a = new LinkedHashMap();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mirror$ah$a.D11TextAppearance);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…leable.D11TextAppearance)");
        int i = obtainStyledAttributes.getInt(mirror$ah$a.D11TextAppearance_d11TextCaps, 0);
        this.values = i;
        if (i != 0) {
            setTransformationMethod(this);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return ag$a(charSequence);
    }

    private final CharSequence ag$a(CharSequence charSequence) {
        int i = this.values;
        if (i == 1) {
            String lowerCase = String.valueOf(charSequence).toLowerCase();
            runAnimators.ah$a(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    String upperCase = String.valueOf(charSequence).toUpperCase();
                    runAnimators.ah$a(upperCase, "this as java.lang.String).toUpperCase()");
                    return upperCase;
                }
                return String.valueOf(charSequence);
            }
            return includeChildForAccessibility.ah$a(String.valueOf(charSequence));
        } else {
            return includeChildForAccessibility.values(String.valueOf(charSequence));
        }
    }
}
