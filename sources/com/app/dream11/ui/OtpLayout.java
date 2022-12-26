package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.app.dream11Pro.R;
import o.AnyRes;
import o.loadFont;
/* loaded from: classes3.dex */
public class OtpLayout extends LinearLayout implements TextWatcher {
    private EditText[] ag$a;
    protected int toString;
    private OtpLayout$ag$a valueOf;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public OtpLayout(Context context) {
        super(context);
        this.toString = 0;
        this.ag$a = null;
    }

    public OtpLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = 0;
        this.ag$a = null;
        ah$a(context, attributeSet);
    }

    public OtpLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.toString = 0;
        this.ag$a = null;
        ah$a(context, attributeSet);
    }

    protected void ah$a(Context context, AttributeSet attributeSet) {
        TypedArray otpLayout = toString(attributeSet, AnyRes.valueOf.OtpLayout, context);
        try {
            int otpLayout2 = toString(otpLayout, 0);
            this.toString = otpLayout2;
            this.ag$a = new EditText[otpLayout2];
            valueOf(this.toString, values());
        } finally {
            otpLayout.recycle();
        }
    }

    public TypedArray toString(AttributeSet attributeSet, int[] iArr, Context context) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public int toString(TypedArray typedArray, int i) {
        return typedArray.getInteger(i, 0);
    }

    protected void valueOf(int i, LayoutInflater layoutInflater) {
        for (int i2 = 0; i2 < i; i2++) {
            this.ag$a[i2] = ag$a(i2, layoutInflater);
            if (this.ag$a[i2].getParent() != null) {
                ((ViewGroup) this.ag$a[i2].getParent()).removeView(this.ag$a[i2]);
            }
            addView(this.ag$a[i2]);
        }
    }

    protected EditText ag$a(int i, LayoutInflater layoutInflater) {
        EditText editText = (EditText) layoutInflater.inflate(R.layout.res_0x7f0d03c7, (ViewGroup) null, false).findViewById(R.id.etOtpBox);
        editText.setTag(Integer.valueOf(i));
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.app.dream11.ui.OtpLayout.3
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return keyEvent.getKeyCode() != 4;
                }
                if (keyEvent.getKeyCode() == 67) {
                    if (((Integer) view.getTag()).intValue() > 0 && ((EditText) view).getText().length() == 0) {
                        OtpLayout.this.ag$a[((Integer) view.getTag()).intValue() - 1].setText("");
                        OtpLayout.this.ag$a[((Integer) view.getTag()).intValue() - 1].requestFocus();
                    } else if (((Integer) view.getTag()).intValue() >= 0) {
                        OtpLayout.this.ag$a[((Integer) view.getTag()).intValue()].setText("");
                    }
                }
                return false;
            }
        });
        editText.addTextChangedListener(this);
        return editText;
    }

    protected LayoutInflater values() {
        return LayoutInflater.from(getContext());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        for (int i = 0; i < this.toString; i++) {
            if (this.ag$a[i].getText().length() == 0) {
                if (this.ag$a[i].hasFocus()) {
                    return;
                }
                this.ag$a[i].requestFocus();
                return;
            }
            if (i == this.toString - 1) {
                ah$a(toString(this.ag$a));
            }
        }
    }

    private String toString(EditText[] editTextArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            EditText[] editTextArr2 = this.ag$a;
            if (i < editTextArr2.length) {
                sb.append(editTextArr2[i].getText().toString());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public void setOtpListener(OtpLayout$ag$a otpLayout$ag$a) {
        this.valueOf = otpLayout$ag$a;
    }

    private void ah$a(String str) {
        OtpLayout$ag$a otpLayout$ag$a = this.valueOf;
        if (otpLayout$ag$a != null) {
            otpLayout$ag$a.ag$a(str);
        }
    }

    public void setOtpText(String str) {
        if (loadFont.ak(str) || str.length() != this.toString) {
            return;
        }
        int i = 0;
        while (i < this.toString) {
            int i2 = i + 1;
            this.ag$a[i].setText(str.substring(i, i2));
            i = i2;
        }
    }

    public static void values(OtpLayout otpLayout, boolean z) {
        if (otpLayout.ag$a == null || !z) {
            return;
        }
        int i = 0;
        while (true) {
            EditText[] editTextArr = otpLayout.ag$a;
            if (i >= editTextArr.length) {
                return;
            }
            editTextArr[i].setText("");
            i++;
        }
    }

    public void valueOf(boolean z) {
        for (int i = 0; i < this.toString; i++) {
            this.ag$a[i].setText("");
        }
    }
}
