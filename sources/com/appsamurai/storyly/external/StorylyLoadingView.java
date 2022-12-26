package com.appsamurai.storyly.external;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public abstract class StorylyLoadingView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorylyLoadingView(Context context) {
        this(context, null, 0, 6, null);
        runAnimators.ag$a(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorylyLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        runAnimators.ag$a(context, "context");
    }

    public /* synthetic */ StorylyLoadingView(Context context, AttributeSet attributeSet, int i, int i2, getTargetTypes gettargettypes) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public abstract void ah$a();

    public abstract void values();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorylyLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
    }
}
