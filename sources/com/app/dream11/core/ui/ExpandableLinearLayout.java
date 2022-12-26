package com.app.dream11.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.AnyRes;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class ExpandableLinearLayout extends LinearLayout {
    private final ExpandableLinearLayout HaptikSDK$b;
    private final int ag$a;
    public Map<Integer, View> ah$a;
    private int invoke;
    private long toString;
    private float valueOf;
    private final int values;

    public final ExpandableLinearLayout values() {
        return this.HaptikSDK$b;
    }

    public final boolean HaptikSDK$c() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return !getSignupData() ? marginLayoutParams.leftMargin != 0 : marginLayoutParams.rightMargin != 0;
    }

    public final boolean ah$a() {
        return !HaptikSDK$c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableLinearLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = new LinkedHashMap();
        this.ag$a = 1;
        this.invoke = 1;
        this.HaptikSDK$b = this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.ah$a = new LinkedHashMap();
        this.ag$a = 1;
        this.invoke = 1;
        this.HaptikSDK$b = this;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.ExpandableLinearLayout);
        runAnimators.ah$a(obtainStyledAttributes, "context.obtainStyledAttr…e.ExpandableLinearLayout)");
        try {
            this.invoke = obtainStyledAttributes.getInt(2, this.values);
            this.valueOf = obtainStyledAttributes.getDimension(1, 0.0f);
            this.toString = obtainStyledAttributes.getInt(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void valueOf() {
        if (ah$a()) {
            return;
        }
        if (getSignupData()) {
            HaptikSDK$a();
        } else {
            invoke();
        }
    }

    private final void HaptikSDK$a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        final float width = getWidth() - this.valueOf;
        Animation animation = new Animation() { // from class: com.app.dream11.core.ui.ExpandableLinearLayout$ah$a
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f, Transformation transformation) {
                marginLayoutParams.rightMargin = 0 - ((int) (width * f));
                this.setLayoutParams(marginLayoutParams);
            }
        };
        animation.setDuration(this.toString);
        startAnimation(animation);
    }

    private final void invoke() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        valueOf valueof = new valueOf((ViewGroup.MarginLayoutParams) layoutParams, getWidth() - this.valueOf, this);
        valueof.setDuration(this.toString);
        startAnimation(valueof);
    }

    /* loaded from: classes2.dex */
    public static final class valueOf extends Animation {
        final /* synthetic */ ExpandableLinearLayout ah$a;
        final /* synthetic */ ViewGroup.MarginLayoutParams toString;
        final /* synthetic */ float valueOf;

        valueOf(ViewGroup.MarginLayoutParams marginLayoutParams, float f, ExpandableLinearLayout expandableLinearLayout) {
            this.toString = marginLayoutParams;
            this.valueOf = f;
            this.ah$a = expandableLinearLayout;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation transformation) {
            this.toString.leftMargin = 0 - ((int) (this.valueOf * f));
            this.ah$a.setLayoutParams(this.toString);
        }
    }

    public final void ag$a() {
        if (HaptikSDK$c()) {
            return;
        }
        if (getSignupData()) {
            ah$b();
        } else {
            HaptikSDK$b();
        }
    }

    private final void ah$b() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        final int i = marginLayoutParams.rightMargin;
        Animation animation = new Animation() { // from class: com.app.dream11.core.ui.ExpandableLinearLayout$ag$a
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f, Transformation transformation) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                int i2 = i;
                marginLayoutParams2.rightMargin = i2 - ((int) (i2 * f));
                this.values().setLayoutParams(marginLayoutParams);
            }
        };
        animation.setDuration(this.toString);
        this.HaptikSDK$b.startAnimation(animation);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        runAnimators.ag$a(view, "child");
        if (getSignupData()) {
            addView(view, 0);
        } else {
            super.addView(view);
        }
    }

    private final boolean getSignupData() {
        return this.invoke == this.ag$a;
    }

    private final void HaptikSDK$b() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        toString tostring = new toString(marginLayoutParams, marginLayoutParams.leftMargin, this);
        tostring.setDuration(this.toString);
        this.HaptikSDK$b.startAnimation(tostring);
    }

    /* loaded from: classes2.dex */
    public static final class toString extends Animation {
        final /* synthetic */ ViewGroup.MarginLayoutParams toString;
        final /* synthetic */ ExpandableLinearLayout valueOf;
        final /* synthetic */ int values;

        toString(ViewGroup.MarginLayoutParams marginLayoutParams, int i, ExpandableLinearLayout expandableLinearLayout) {
            this.toString = marginLayoutParams;
            this.values = i;
            this.valueOf = expandableLinearLayout;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation transformation) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.toString;
            int i = this.values;
            marginLayoutParams.leftMargin = i - ((int) (i * f));
            this.valueOf.values().setLayoutParams(this.toString);
        }
    }
}
