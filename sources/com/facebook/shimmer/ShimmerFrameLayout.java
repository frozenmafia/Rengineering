package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.ActionBarDrawerToggle$SlideDrawable$ah$a;
import o.LookupTableInterpolator;
import o.assumeMaterial;
import o.assumeMaterial$ag$a;
import o.assumeMaterial$ah$a;
/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    private final Paint ah$a;
    private final LookupTableInterpolator toString;
    private boolean values;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.ah$a = new Paint();
        this.toString = new LookupTableInterpolator();
        this.values = true;
        ag$a(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah$a = new Paint();
        this.toString = new LookupTableInterpolator();
        this.values = true;
        ag$a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ah$a = new Paint();
        this.toString = new LookupTableInterpolator();
        this.values = true;
        ag$a(context, attributeSet);
    }

    private void ag$a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.toString.setCallback(this);
        if (attributeSet == null) {
            ah$a(new assumeMaterial$ag$a<assumeMaterial$ah$a>() { // from class: o.assumeMaterial$ah$a
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.assumeMaterial$ag$a
                /* renamed from: ah$a */
                public assumeMaterial$ah$a valueOf() {
                    return this;
                }

                {
                    this.valueOf.ag$a = true;
                }
            }.ag$a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout, 0, 0);
        try {
            ah$a(((obtainStyledAttributes.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_colored) && obtainStyledAttributes.getBoolean(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_colored, false)) ? new assumeMaterial.valueOf() : new assumeMaterial$ag$a<assumeMaterial$ah$a>() { // from class: o.assumeMaterial$ah$a
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.assumeMaterial$ag$a
                /* renamed from: ah$a */
                public assumeMaterial$ah$a valueOf() {
                    return this;
                }

                {
                    this.valueOf.ag$a = true;
                }
            }).valueOf(obtainStyledAttributes).ag$a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShimmerFrameLayout ah$a(assumeMaterial assumematerial) {
        this.toString.values(assumematerial);
        if (assumematerial != null && assumematerial.HaptikSDK$c) {
            setLayerType(2, this.ah$a);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    public void ah$a() {
        this.toString.ah$a();
    }

    public void HaptikSDK$b() {
        this.toString.ag$a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.toString.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.toString.values();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HaptikSDK$b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.values) {
            this.toString.draw(canvas);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.toString;
    }
}
