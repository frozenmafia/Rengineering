package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.app.dream11Pro.R;
import o.AnyRes;
import o.fromJch;
import o.getM;
import o.getShortcutIds;
/* loaded from: classes3.dex */
public class CustomEditTextView extends AppCompatEditText {
    boolean ag$a;
    String ah$a;
    private getShortcutIds valueOf;

    /* JADX WARN: Finally extract failed */
    public CustomEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag$a = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomEditTextView);
        try {
            String string = obtainStyledAttributes.getString(1);
            this.ah$a = string;
            if (string == null || string.equalsIgnoreCase("null")) {
                int i2 = obtainStyledAttributes.getInt(2, 0);
                if (i2 == 1) {
                    this.ah$a = context.getString(R.string.res_0x7f12000e);
                } else if (i2 == 2) {
                    this.ah$a = context.getString(R.string.res_0x7f12000d);
                } else if (i2 == 3) {
                    this.ah$a = context.getString(R.string.res_0x7f12000c);
                }
            }
            this.ag$a = obtainStyledAttributes.getInt(0, 0) == 1;
            String str = this.ah$a;
            if (str == null || str.equalsIgnoreCase("null")) {
                this.ah$a = context.getString(R.string.res_0x7f12000e);
            }
            obtainStyledAttributes.recycle();
            values();
            ag$a();
        } catch (Throwable th) {
            String str2 = this.ah$a;
            if (str2 == null || str2.equalsIgnoreCase("null")) {
                this.ah$a = context.getString(R.string.res_0x7f12000e);
            }
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CustomEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomEditTextView);
        try {
            String string = obtainStyledAttributes.getString(1);
            this.ah$a = string;
            if (string == null || string.equalsIgnoreCase("null")) {
                int i = obtainStyledAttributes.getInt(2, 0);
                if (i == 1) {
                    this.ah$a = context.getString(R.string.res_0x7f12000e);
                } else if (i == 2) {
                    this.ah$a = context.getString(R.string.res_0x7f12000d);
                } else if (i == 3) {
                    this.ah$a = context.getString(R.string.res_0x7f12000c);
                }
            }
            this.ag$a = obtainStyledAttributes.getInt(0, 0) == 1;
            obtainStyledAttributes.recycle();
            String str = this.ah$a;
            if (str == null || str.equalsIgnoreCase("null")) {
                this.ah$a = context.getString(R.string.res_0x7f12000e);
            }
            values();
            ag$a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CustomEditTextView(Context context) {
        super(context);
        this.ag$a = false;
        ag$a();
    }

    private void ag$a() {
        if (isInEditMode()) {
            return;
        }
        try {
            setTypeface(getM.toString(getContext(), this.ah$a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void values() {
        InputFilter[] filters;
        if (this.ag$a) {
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

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            getShortcutIds getshortcutids = this.valueOf;
            if (getshortcutids != null) {
                getshortcutids.onKeyboardBackClick();
                return false;
            }
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setKeyListener(getShortcutIds getshortcutids) {
        this.valueOf = getshortcutids;
    }

    public static void setOnEditTextListener(CustomEditTextView customEditTextView, getShortcutIds getshortcutids) {
        if (customEditTextView != null) {
            customEditTextView.setKeyListener(getshortcutids);
        }
    }
}
