package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.app.dream11Pro.R;
import com.dream11.design.textview.D11TextView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class SkillScoreViewFP extends FrameLayout {
    private TextView HaptikSDK$a;
    private int HaptikSDK$c;
    private TextView ag$a;
    public Map<Integer, View> ah$a;
    private TextView invoke;
    private int toString;
    private TextView valueOf;
    private View values;

    public final void setScore(int i) {
        this.HaptikSDK$c = i;
        TextView textView = this.invoke;
        TextView textView2 = null;
        if (textView == null) {
            runAnimators.valueOf("thirdDigit");
            textView = null;
        }
        textView.setText(String.valueOf(i % 10));
        int i2 = i / 10;
        TextView textView3 = this.HaptikSDK$a;
        if (textView3 == null) {
            runAnimators.valueOf("secondDigit");
            textView3 = null;
        }
        textView3.setText(String.valueOf(i2 % 10));
        int i3 = i2 / 10;
        TextView textView4 = this.ag$a;
        if (textView4 == null) {
            runAnimators.valueOf("firstDigit");
        } else {
            textView2 = textView4;
        }
        textView2.setText(String.valueOf(i3 % 10));
        ag$a();
    }

    public final void setRemainingMatch(int i) {
        this.toString = i;
        TextView textView = this.valueOf;
        if (textView == null) {
            runAnimators.valueOf("lockMessage");
            textView = null;
        }
        textView.setText(getResources().getQuantityString(R.plurals.res_0x7f100023, i, Integer.valueOf(i)));
        ag$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillScoreViewFP(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkillScoreViewFP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillScoreViewFP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.ah$a = new LinkedHashMap();
        View inflate = LayoutInflater.from(context).inflate(R.layout.res_0x7f0d0428, (ViewGroup) this, false);
        D11TextView d11TextView = (D11TextView) inflate.findViewById(AnyRes.values.firstDigit);
        runAnimators.ah$a(d11TextView, "view.firstDigit");
        this.ag$a = d11TextView;
        D11TextView d11TextView2 = (D11TextView) inflate.findViewById(AnyRes.values.secondtDigit);
        runAnimators.ah$a(d11TextView2, "view.secondtDigit");
        this.HaptikSDK$a = d11TextView2;
        D11TextView d11TextView3 = (D11TextView) inflate.findViewById(AnyRes.values.thirdDigit);
        runAnimators.ah$a(d11TextView3, "view.thirdDigit");
        this.invoke = d11TextView3;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate.findViewById(AnyRes.values.lockWidget);
        runAnimators.ah$a(linearLayoutCompat, "view.lockWidget");
        LinearLayoutCompat linearLayoutCompat2 = linearLayoutCompat;
        this.values = linearLayoutCompat2;
        if (linearLayoutCompat2 == null) {
            runAnimators.valueOf("lockWidget");
            linearLayoutCompat2 = null;
        }
        D11TextView d11TextView4 = (D11TextView) linearLayoutCompat2.findViewById(AnyRes.values.text);
        runAnimators.ah$a(d11TextView4, "lockWidget.text");
        this.valueOf = d11TextView4;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnyRes.valueOf.SkillScoreViewFP, 0, 0);
        try {
            setScore(obtainStyledAttributes.getInteger(1, 0));
            setRemainingMatch(obtainStyledAttributes.getInteger(0, 0));
            obtainStyledAttributes.recycle();
            addView(inflate);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void ag$a() {
        if (this.toString > 0 || this.HaptikSDK$c == 0) {
            ah$a();
        } else {
            values();
        }
    }

    private final void ah$a() {
        TextView textView = this.ag$a;
        View view = null;
        if (textView == null) {
            runAnimators.valueOf("firstDigit");
            textView = null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.HaptikSDK$a;
        if (textView2 == null) {
            runAnimators.valueOf("secondDigit");
            textView2 = null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.invoke;
        if (textView3 == null) {
            runAnimators.valueOf("thirdDigit");
            textView3 = null;
        }
        textView3.setVisibility(8);
        View view2 = this.values;
        if (view2 == null) {
            runAnimators.valueOf("lockWidget");
        } else {
            view = view2;
        }
        view.setVisibility(0);
    }

    private final void values() {
        TextView textView = this.ag$a;
        View view = null;
        if (textView == null) {
            runAnimators.valueOf("firstDigit");
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.HaptikSDK$a;
        if (textView2 == null) {
            runAnimators.valueOf("secondDigit");
            textView2 = null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.invoke;
        if (textView3 == null) {
            runAnimators.valueOf("thirdDigit");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.values;
        if (view2 == null) {
            runAnimators.valueOf("lockWidget");
        } else {
            view = view2;
        }
        view.setVisibility(8);
    }
}
