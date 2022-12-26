package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import o.PreferenceDialogFragmentCompat;
import o.showIme;
/* loaded from: classes7.dex */
public class CircularRevealGridLayout extends GridLayout implements PreferenceDialogFragmentCompat {
    private final showIme ag$a;

    public CircularRevealGridLayout(Context context) {
        this(context, null);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = new showIme(this);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void valueOf() {
        this.ag$a.values();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void ah$a() {
        this.ag$a.ag$a();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public PreferenceDialogFragmentCompat.valueOf ah$b() {
        return this.ag$a.ah$a();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setRevealInfo(PreferenceDialogFragmentCompat.valueOf valueof) {
        this.ag$a.values(valueof);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public int ag$a() {
        return this.ag$a.valueOf();
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setCircularRevealScrimColor(int i) {
        this.ag$a.toString(i);
    }

    @Override // o.PreferenceDialogFragmentCompat
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.ag$a.values(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        showIme showime = this.ag$a;
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
        showIme showime = this.ag$a;
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
