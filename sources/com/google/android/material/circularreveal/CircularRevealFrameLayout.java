package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.PreferenceDialogFragmentCompat;
import o.showIme;
/* loaded from: classes7.dex */
public class CircularRevealFrameLayout extends FrameLayout implements PreferenceDialogFragmentCompat {
    private final showIme ah$a;

    public CircularRevealFrameLayout(Context context) {
        this(context, null);
    }

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah$a = new showIme(this);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void valueOf() {
        this.ah$a.values();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void ah$a() {
        this.ah$a.ag$a();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public PreferenceDialogFragmentCompat.valueOf ah$b() {
        return this.ah$a.ah$a();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setRevealInfo(PreferenceDialogFragmentCompat.valueOf valueof) {
        this.ah$a.values(valueof);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public int ag$a() {
        return this.ah$a.valueOf();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setCircularRevealScrimColor(int i) {
        this.ah$a.toString(i);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.ah$a.values(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        showIme showime = this.ah$a;
        if (showime != null) {
            showime.ag$a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // o.showIme.values
    public void toString(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        showIme showime = this.ah$a;
        if (showime != null) {
            return showime.HaptikSDK$b();
        }
        return super.isOpaque();
    }

    @Override // o.showIme.values
    public boolean values() {
        return super.isOpaque();
    }
}
