package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.AnyRes;
import o.loadFont;
import o.runAnimators;
/* loaded from: classes3.dex */
public class FloatingButton extends CardView {
    private int ag$a;
    private int ah$a;
    public Map<Integer, View> toString;
    private TextView valueOf;
    private String values;

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView ag$a() {
        return this.valueOf;
    }

    public final void setActiveBackgroundColor(int i) {
        this.ah$a = i;
    }

    public final int values() {
        return this.ah$a;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final void setActiveTextColor(int i) {
        this.ag$a = i;
    }

    public final void setText(String str) {
        runAnimators.ag$a(str, "data");
        this.values = str;
        this.valueOf.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingButton(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0196, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
        this.valueOf = (TextView) inflate;
        this.ah$a = -1;
        this.ag$a = -1;
        this.values = "";
        setCardElevation(4.0f);
        setRadius(loadFont.values(getContext(), 20.0f));
        addView(this.valueOf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.toString = new LinkedHashMap();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0196, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
        this.valueOf = (TextView) inflate;
        this.ah$a = -1;
        this.ag$a = -1;
        this.values = "";
        setCardElevation(4.0f);
        setRadius(loadFont.values(getContext(), 20.0f));
        addView(this.valueOf);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.FloatingButton);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…styleable.FloatingButton)");
        try {
            String string = obtainStyledAttributes.getString(2);
            if (string != null) {
                setText(string);
            }
            this.ah$a = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.green_3));
            int color = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, R.color.res_0x7f0605d5));
            this.ag$a = color;
            this.valueOf.setTextColor(color);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.toString = new LinkedHashMap();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0196, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
        this.valueOf = (TextView) inflate;
        this.ah$a = -1;
        this.ag$a = -1;
        this.values = "";
        setCardElevation(4.0f);
        setRadius(loadFont.values(getContext(), 20.0f));
        addView(this.valueOf);
    }
}
