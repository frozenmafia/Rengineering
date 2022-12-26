package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.dream11Pro.R;
import o.AnyRes;
import o.ShortcutManagerCompat;
import o.getM;
import o.inflateColorStateList;
/* loaded from: classes6.dex */
public class CountDownView extends AppCompatTextView {
    private String ag$a;
    String ah$a;
    private Runnable ah$b;
    private ShortcutManagerCompat.ShortcutMatchFlags toString;
    private Handler valueOf;
    private Context values;

    public void setCallback(ShortcutManagerCompat.ShortcutMatchFlags shortcutMatchFlags) {
        this.toString = shortcutMatchFlags;
    }

    public CountDownView(Context context) {
        super(context);
        this.ag$a = "";
        this.valueOf = new Handler();
        this.ah$b = new Runnable() { // from class: com.app.dream11.ui.CountDownView.4
            @Override // java.lang.Runnable
            public void run() {
                CountDownView.this.ah$a();
            }
        };
        toString(context);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag$a = "";
        this.valueOf = new Handler();
        this.ah$b = new Runnable() { // from class: com.app.dream11.ui.CountDownView.4
            @Override // java.lang.Runnable
            public void run() {
                CountDownView.this.ah$a();
            }
        };
        toString(context);
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = "";
        this.valueOf = new Handler();
        this.ah$b = new Runnable() { // from class: com.app.dream11.ui.CountDownView.4
            @Override // java.lang.Runnable
            public void run() {
                CountDownView.this.ah$a();
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTextView);
        String string = obtainStyledAttributes.getString(6);
        this.ah$a = string;
        if (string == null || string.equalsIgnoreCase("null")) {
            this.ah$a = context.getString(R.string.res_0x7f12000e);
        }
        obtainStyledAttributes.recycle();
        toString(context);
    }

    public void toString(Context context) {
        this.values = context;
        setTag("");
        if (!isInEditMode()) {
            try {
                setTypeface(getM.toString(getContext(), this.ah$a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ah$a();
    }

    public void setExpiryTimestamp(long j) {
        setExpiryTimestamp(inflateColorStateList.ah$a("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", j));
    }

    public void setExpiryTimestamp(String str) {
        this.ag$a = str;
        this.valueOf.removeCallbacks(this.ah$b);
        ah$a();
    }

    public void ah$a() {
        String ag$a = inflateColorStateList.ag$a("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", this.ag$a);
        setText(ag$a);
        if (ag$a != null && !"".equalsIgnoreCase(ag$a)) {
            this.valueOf.postDelayed(this.ah$b, 1000L);
            return;
        }
        ShortcutManagerCompat.ShortcutMatchFlags shortcutMatchFlags = this.toString;
        if (shortcutMatchFlags != null) {
            shortcutMatchFlags.ag$a();
        }
    }
}
