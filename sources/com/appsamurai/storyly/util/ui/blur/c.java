package com.appsamurai.storyly.util.ui.blur;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.dispatchApplyWindowInsets;
import o.dispatchFinishTemporaryDetach;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class c extends FrameLayout {
    public static final String ag$a = "c";
    public int valueOf;
    public dispatchFinishTemporaryDetach values;

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, null, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null ? false : dispatchfinishtemporarydetach.ag$a(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            Log.e(ag$a, "BlurView can't be used in not hardware-accelerated window!");
            return;
        }
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null) {
            return;
        }
        dispatchfinishtemporarydetach.values(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null) {
            return;
        }
        dispatchfinishtemporarydetach.values(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null) {
            return;
        }
        dispatchfinishtemporarydetach.ag$a();
    }

    public final void setBlurAutoUpdate(boolean z) {
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null) {
            return;
        }
        dispatchfinishtemporarydetach.values(z);
    }

    public final void setBlurEnabled(boolean z) {
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null) {
            return;
        }
        dispatchfinishtemporarydetach.valueOf(z);
    }

    public final void setBlurRadius(float f) {
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null) {
            return;
        }
        dispatchfinishtemporarydetach.valueOf(f);
    }

    public final void setOverlayColor(int i) {
        this.valueOf = i;
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach == null) {
            return;
        }
        dispatchfinishtemporarydetach.ag$a(i);
    }

    public final dispatchFinishTemporaryDetach toString(ViewGroup viewGroup) {
        runAnimators.ag$a(viewGroup, "rootView");
        dispatchApplyWindowInsets dispatchapplywindowinsets = new dispatchApplyWindowInsets(this, viewGroup, this.valueOf);
        dispatchFinishTemporaryDetach dispatchfinishtemporarydetach = this.values;
        if (dispatchfinishtemporarydetach != null) {
            dispatchfinishtemporarydetach.values();
        }
        this.values = dispatchapplywindowinsets;
        return dispatchapplywindowinsets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.valueOf = i2;
    }
}
