package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.dream11Pro.R;
import java.util.Date;
import o.AnyRes;
import o.getM;
import o.inflateColorStateList;
import o.loadFont;
/* loaded from: classes3.dex */
public class CustomTextView extends AppCompatTextView {
    protected String HaptikSDK$a;

    public CustomTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ag$a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTextView);
        try {
            String string = obtainStyledAttributes.getString(6);
            this.HaptikSDK$a = string;
            if (string == null || string.equalsIgnoreCase("null")) {
                int i2 = obtainStyledAttributes.getInt(1, 0);
                if (i2 == 1) {
                    this.HaptikSDK$a = context.getString(R.string.res_0x7f12000e);
                } else if (i2 == 2) {
                    this.HaptikSDK$a = context.getString(R.string.res_0x7f12000d);
                } else if (i2 == 3) {
                    this.HaptikSDK$a = context.getString(R.string.res_0x7f12000c);
                }
            }
            obtainStyledAttributes.recycle();
            String str = this.HaptikSDK$a;
            if (str == null || str.equalsIgnoreCase("null")) {
                this.HaptikSDK$a = context.getString(R.string.res_0x7f12000e);
            }
            ag$a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public CustomTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomTextView(Context context, String str) {
        super(context);
        this.HaptikSDK$a = str;
        ag$a();
    }

    public static void setTypeface(CustomTextView customTextView, String str) {
        if (customTextView == null || str == null || str.isEmpty()) {
            return;
        }
        customTextView.HaptikSDK$a = str;
        customTextView.ag$a();
    }

    public static void setRelativeTime(CustomTextView customTextView, Date date) {
        if (customTextView == null || date == null) {
            return;
        }
        customTextView.setText(loadFont.valueOf(date.getTime(), customTextView.getContext()));
    }

    public static void setDateHeader(CustomTextView customTextView, Long l) {
        customTextView.setText(inflateColorStateList.values(l.longValue(), customTextView.getContext().getString(R.string.res_0x7f120d07), customTextView.getContext().getString(R.string.res_0x7f120e60)));
    }

    private void ag$a() {
        if (isInEditMode()) {
            return;
        }
        try {
            setTypeface(getM.toString(getContext(), this.HaptikSDK$a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
