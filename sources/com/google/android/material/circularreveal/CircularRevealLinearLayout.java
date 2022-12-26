package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import o.PreferenceDialogFragmentCompat;
import o.showIme;
/* loaded from: classes7.dex */
public class CircularRevealLinearLayout extends LinearLayout implements PreferenceDialogFragmentCompat {
    private final showIme valueOf;

    public CircularRevealLinearLayout(Context context) {
        this(context, null);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.valueOf = new showIme(this);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void valueOf() {
        this.valueOf.values();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void ah$a() {
        this.valueOf.ag$a();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public PreferenceDialogFragmentCompat.valueOf ah$b() {
        return this.valueOf.ah$a();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setRevealInfo(PreferenceDialogFragmentCompat.valueOf valueof) {
        this.valueOf.values(valueof);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public int ag$a() {
        return this.valueOf.valueOf();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setCircularRevealScrimColor(int i) {
        this.valueOf.toString(i);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.valueOf.values(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        showIme showime = this.valueOf;
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
        showIme showime = this.valueOf;
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
