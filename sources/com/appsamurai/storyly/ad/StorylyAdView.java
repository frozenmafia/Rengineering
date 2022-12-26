package com.appsamurai.storyly.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import o.Styleable;
import o.getTargetTypes;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public abstract class StorylyAdView extends FrameLayout {
    private Styleable.ArcMotion<setAnimationMatrix> toString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorylyAdView(Context context) {
        this(context, null, 0, 6, null);
        runAnimators.ag$a(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorylyAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        runAnimators.ag$a(context, "context");
    }

    public /* synthetic */ StorylyAdView(Context context, AttributeSet attributeSet, int i, int i2, getTargetTypes gettargettypes) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public abstract void HaptikSDK$a();

    public abstract long ag$a();

    public abstract void ah$a();

    public abstract void setLayers(Map<String, ? extends View> map);

    public final void setOnActionClicked(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        this.toString = arcMotion;
    }

    public abstract void valueOf();

    public abstract void values();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorylyAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
    }
}
