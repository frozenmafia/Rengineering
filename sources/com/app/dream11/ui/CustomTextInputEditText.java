package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import o.AnyRes;
import o.fromJch;
/* loaded from: classes3.dex */
public class CustomTextInputEditText extends TextInputEditText {
    boolean values;

    public CustomTextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.values = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTextInputEditText);
        try {
            this.values = obtainStyledAttributes.getInt(0, 0) == 1;
            obtainStyledAttributes.recycle();
            ah$a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CustomTextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.values = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTextInputEditText);
        try {
            this.values = obtainStyledAttributes.getInt(0, 0) == 1;
            obtainStyledAttributes.recycle();
            ah$a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CustomTextInputEditText(Context context) {
        super(context);
        this.values = false;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        try {
            setSelection(charSequence.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ah$a() {
        InputFilter[] filters;
        if (this.values) {
            try {
                InputFilter[] inputFilterArr = new InputFilter[getFilters().length + 1];
                Integer num = null;
                int i = 0;
                for (InputFilter inputFilter : getFilters()) {
                    inputFilterArr[i] = inputFilter;
                    if (inputFilter instanceof InputFilter.LengthFilter) {
                        num = Integer.valueOf(((InputFilter.LengthFilter) inputFilter).getMax());
                    }
                    i++;
                }
                inputFilterArr[i] = new fromJch(num);
                setFilters(inputFilterArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
