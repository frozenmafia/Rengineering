package com.app.dream11.ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import o.AnyRes;
/* loaded from: classes6.dex */
public class ExpandableTextView extends CustomTextView {
    private TimeInterpolator ag$a;
    private long ah$a;
    private TimeInterpolator toString;
    private final int valueOf;
    private values values;

    /* loaded from: classes6.dex */
    public interface values {
    }

    public ExpandableTextView(Context context) {
        this(context, null);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.ExpandableTextView, i, 0);
        this.ah$a = obtainStyledAttributes.getInt(0, 750);
        obtainStyledAttributes.recycle();
        this.valueOf = getMaxLines();
        this.ag$a = new AccelerateDecelerateInterpolator();
        this.toString = new AccelerateDecelerateInterpolator();
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return super.getMaxLines();
    }

    public void setAnimationDuration(long j) {
        this.ah$a = j;
    }

    public void setOnExpandListener(values valuesVar) {
        this.values = valuesVar;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.ag$a = timeInterpolator;
        this.toString = timeInterpolator;
    }

    public void setExpandInterpolator(TimeInterpolator timeInterpolator) {
        this.ag$a = timeInterpolator;
    }

    public void setCollapseInterpolator(TimeInterpolator timeInterpolator) {
        this.toString = timeInterpolator;
    }
}
