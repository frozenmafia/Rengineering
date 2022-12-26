package com.app.dream11.ui.createteamprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.AnyRes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CreateTeamStepLayout extends LinearLayout {
    private float HaptikSDK$a;
    private int HaptikSDK$c;
    private int ag$a;
    private int ah$a;
    private int invoke;
    private int toString;
    public Map<Integer, View> valueOf;
    private int values;

    public final void setNumberOfSteps(int i) {
        this.HaptikSDK$c = i;
        if (i == 0) {
            removeAllViews();
        }
        valueOf();
    }

    public final void setActiveColor(int i) {
        this.toString = i;
    }

    public final void setInactiveColor(int i) {
        this.ah$a = i;
    }

    public final void setActiveTextColor(int i) {
        this.ag$a = i;
    }

    public final void setInactiveTextColor(int i) {
        this.invoke = i;
    }

    public final void setTextSize(float f) {
        this.HaptikSDK$a = f;
    }

    public final void setCurrentStep(int i) {
        this.values = i;
        values();
    }

    private final void values() {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.app.dream11.ui.createteamprogressbar.CreateTeamStepper");
            CreateTeamStepper createTeamStepper = (CreateTeamStepper) childAt;
            boolean z = true;
            createTeamStepper.setActive(i < this.values);
            if (i2 != this.values && i != this.HaptikSDK$c - 1) {
                z = false;
            }
            createTeamStepper.setNumberToBeShown(z);
            i = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamStepLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.HaptikSDK$c = 10;
        this.toString = -1;
        this.ah$a = -1;
        this.ag$a = -1;
        this.invoke = -1;
        setOrientation(0);
        setGravity(17);
    }

    public CreateTeamStepLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.valueOf = new LinkedHashMap();
        this.HaptikSDK$c = 10;
        this.toString = -1;
        this.ah$a = -1;
        this.ag$a = -1;
        this.invoke = -1;
        setOrientation(0);
        setGravity(17);
        runAnimators.toString(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CreateTeamStepLayout);
        runAnimators.ah$a(obtainStyledAttributes, "context!!.obtainStyledAt…ble.CreateTeamStepLayout)");
        try {
            this.toString = obtainStyledAttributes.getColor(0, -16711936);
            this.ah$a = obtainStyledAttributes.getColor(2, SupportMenu.CATEGORY_MASK);
            this.ag$a = obtainStyledAttributes.getColor(1, -16776961);
            this.invoke = obtainStyledAttributes.getColor(3, ViewCompat.MEASURED_STATE_MASK);
            this.HaptikSDK$a = obtainStyledAttributes.getDimension(4, getResources().getDimension(R.dimen.res_0x7f0705c8));
            valueOf();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void valueOf() {
        removeAllViews();
        if (this.HaptikSDK$c == 0 || getWidth() == 0) {
            return;
        }
        float width = (float) (getWidth() * 0.0172d);
        int i = this.HaptikSDK$c;
        float f = i;
        float width2 = (getWidth() - (getPaddingLeft() + getPaddingRight())) + (f * width);
        int i2 = (int) (width2 / f);
        int i3 = (int) (width2 * 0.0025d);
        int i4 = (int) width;
        int i5 = 0;
        while (i5 < i) {
            int i6 = i5 + 1;
            CreateTeamStepper createTeamStepper = new CreateTeamStepper(getContext(), false, this.toString, this.ah$a, i6, this.invoke, this.ag$a, i5 == this.HaptikSDK$c - 1, width + 5, this.HaptikSDK$a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2 - i3, getHeight());
            if (i5 != 0) {
                layoutParams.setMargins(0 - i4, 0, 0, 0);
            }
            createTeamStepper.setLayoutParams(layoutParams);
            createTeamStepper.invalidate();
            addView(createTeamStepper);
            i5 = i6;
        }
        values();
    }

    public CreateTeamStepLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueOf = new LinkedHashMap();
        this.HaptikSDK$c = 10;
        this.toString = -1;
        this.ah$a = -1;
        this.ag$a = -1;
        this.invoke = -1;
        setOrientation(0);
        setGravity(17);
    }
}
