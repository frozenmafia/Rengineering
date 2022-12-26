package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* loaded from: classes5.dex */
public class VisibilityAwareImageButton extends ImageButton {
    private int valueOf;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueOf = getVisibility();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        values(i, true);
    }

    public final void values(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.valueOf = i;
        }
    }

    public final int ah$b() {
        return this.valueOf;
    }
}
