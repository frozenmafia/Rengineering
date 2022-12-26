package com.apxor.androidsdk.plugins.realtimeui.h;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
/* loaded from: classes3.dex */
class k extends a {
    private final Path a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f351b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, double d, boolean z) {
        this.c = z;
        Paint paint = new Paint(1);
        this.f351b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.parseColor(str));
        paint.setAlpha((int) (d * 255.0d));
        this.a = new Path();
    }

    private void a(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        int abs = Math.abs(i2 - i4);
        this.a.reset();
        if (!this.c) {
            float f = i;
            float f2 = i2;
            this.a.moveTo(f, f2);
            float f3 = i3;
            float f4 = abs / 2.0f;
            float f5 = f3 - f4;
            this.a.lineTo(f5, f2);
            this.a.lineTo(f3, f4 + f2);
            float f6 = i4;
            this.a.lineTo(f5, f6);
            this.a.lineTo(f, f6);
            this.a.lineTo(f, f2);
            return;
        }
        float f7 = i;
        float f8 = i2;
        float f9 = abs / 2.0f;
        float f10 = f8 + f9;
        this.a.moveTo(f7, f10);
        float f11 = f9 + f7;
        this.a.lineTo(f11, f8);
        float f12 = i3;
        this.a.lineTo(f12, f8);
        float f13 = i4;
        this.a.lineTo(f12, f13);
        this.a.lineTo(f11, f13);
        this.a.lineTo(f7, f10);
    }

    public void a() {
        if (getBounds().isEmpty()) {
            return;
        }
        a(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        a(getBounds());
        canvas.drawPath(this.a, this.f351b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
