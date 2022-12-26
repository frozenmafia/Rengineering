package com.apxor.androidsdk.plugins.realtimeui.h;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.TypedValue;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.utils.Logger;
/* loaded from: classes3.dex */
public class l extends com.apxor.androidsdk.plugins.realtimeui.h.a {
    private static final String a = "l";

    /* renamed from: b  reason: collision with root package name */
    private Point f352b;
    private Path c;
    private Paint d;
    private Paint e;
    private int f;
    private float g;
    private int h;
    private final d i;
    private final Rect j;
    private final int k;
    private final int l;
    private final float m;
    private final Point n = new Point();

    /* renamed from: o  reason: collision with root package name */
    private Rect f353o;
    private final String p;
    private final com.apxor.androidsdk.plugins.realtimeui.i.f q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i, int i2, float f, String str, d dVar, com.apxor.androidsdk.plugins.realtimeui.d dVar2, Rect rect) {
        this.c = new Path();
        this.g = 0.0f;
        this.i = dVar;
        this.k = i;
        this.j = rect;
        this.l = i2;
        this.m = f;
        this.p = str;
        this.q = dVar2.j();
        if (str != null) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        if (dVar2.A() != null) {
            try {
                int a2 = a(dVar2.B());
                if (a2 > 0) {
                    Paint paint2 = new Paint(1);
                    this.e = paint2;
                    paint2.setColor(Color.parseColor(dVar2.A()));
                    this.e.setStyle(Paint.Style.STROKE);
                    this.e.setStrokeWidth(a2);
                }
            } catch (Exception unused) {
                Logger.e(a, "Failed to set the bg_color", null);
            }
        }
        if (dVar2.M0()) {
            this.g = a((float) dVar2.G());
        }
        this.c = new Path();
    }

    private void a(Rect rect) {
        int i;
        int i2;
        int i3;
        LinearGradient a2;
        int i4 = rect.left;
        int i5 = this.f;
        int i6 = i4 + i5;
        int i7 = rect.right - i5;
        int i8 = rect.top + i5;
        int i9 = rect.bottom - i5;
        try {
            com.apxor.androidsdk.plugins.realtimeui.i.f fVar = this.q;
            if (fVar == null || (a2 = com.apxor.androidsdk.plugins.realtimeui.utils.b.a(fVar, this.f353o)) == null) {
                this.d.setColor(Color.parseColor(this.p));
            } else {
                this.d.setShader(a2);
            }
        } catch (Exception unused) {
            Logger.e(a, "Failed to set the bg_color", null);
        }
        int i10 = a.a[this.i.ordinal()];
        if (i10 == 1) {
            i7 = ((int) (this.f * 1.5f)) + rect.right;
        } else if (i10 == 2) {
            i6 = rect.left - ((int) (this.f * 1.5f));
        } else if (i10 == 3) {
            i9 = rect.bottom - ((int) (this.f * 1.5f));
        } else if (i10 == 4) {
            i8 = ((int) (this.f * 1.5f)) + rect.top;
        }
        float f = i9;
        float f2 = this.g;
        float f3 = f - f2;
        float f4 = i7;
        float f5 = f4 - f2;
        float f6 = i8;
        float f7 = f6 + f2;
        float f8 = i6;
        float f9 = f2 + f8;
        Point point = this.n;
        Point point2 = this.f352b;
        point.set(point2.x, point2.y);
        d dVar = this.i;
        d dVar2 = d.RIGHT;
        if (dVar == dVar2 || dVar == d.LEFT) {
            Point point3 = this.n;
            int i11 = point3.y;
            if (i11 >= i8 && i11 <= i9) {
                int i12 = i11 + i8;
                int i13 = this.h;
                if (i12 + i13 > f3) {
                    i = (int) ((f3 - i13) - f6);
                } else if (i12 - i13 < f7) {
                    i = (int) ((f7 + i13) - f6);
                }
                point3.y = i;
            }
        } else {
            Point point4 = this.n;
            int i14 = point4.x;
            if (i14 >= i6 && i14 <= i7 && i14 >= i6 && i14 <= i7) {
                int i15 = i14 + i6;
                int i16 = this.h;
                if (i15 + i16 > f5) {
                    i3 = (int) ((f5 - i16) - f8);
                } else if (i15 - i16 < f9) {
                    i3 = (int) ((f9 + i16) - f8);
                }
                point4.x = i3;
            }
        }
        Point point5 = this.n;
        if (point5.x < i6) {
            point5.x = i6;
        }
        if (point5.x > i7) {
            point5.x = i7;
        }
        int i17 = point5.y;
        if (i17 < i8) {
            point5.y = i8;
        } else if (i17 > i9) {
            point5.y = i9;
        }
        this.c.reset();
        int i18 = this.k;
        if (i18 == 1 && (i2 = this.j.left) > 0) {
            this.n.x -= i2;
        }
        if (i18 == 3 && this.j.left > 0) {
            this.n.x += this.l;
        }
        this.c.moveTo(this.g + f8, f6);
        int a3 = a(16.0f);
        int abs = Math.abs((i6 - this.n.x) - this.h);
        int i19 = Math.abs(i7 - (this.n.x + this.h)) < a3 ? -a3 : 0;
        int i20 = (abs < a3 ? a3 : (this.n.x - this.h) + i19) + i6;
        int i21 = this.n.x;
        int i22 = i6 + i21 + (abs < a3 ? a3 : i19);
        int i23 = i6 + (abs < a3 ? a3 + i21 + this.h : i21 + this.h + i19);
        if (this.i == d.BOTTOM) {
            this.c.lineTo(i20, f6);
            this.c.lineTo(i22, rect.top);
            this.c.lineTo(i23, f6);
        }
        this.c.lineTo(f4 - this.g, f6);
        this.c.quadTo(f4, f6, f4, this.g + f6);
        if (this.i == d.LEFT) {
            this.c.lineTo(f4, (this.n.y + i8) - this.h);
            this.c.lineTo(rect.right, this.n.y + i8);
            this.c.lineTo(f4, this.n.y + i8 + this.h);
        }
        this.c.lineTo(f4, f - this.g);
        this.c.quadTo(f4, f, f4 - this.g, f);
        if (this.i == d.TOP) {
            this.c.lineTo(i23, f);
            this.c.lineTo(i22, rect.bottom);
            this.c.lineTo(i20, f);
        }
        this.c.lineTo(this.g + f8, f);
        this.c.quadTo(f8, f, f8, f - this.g);
        if (this.i == dVar2) {
            this.c.lineTo(f8, this.n.y + i8 + this.h);
            this.c.lineTo(rect.left, this.n.y + i8);
            this.c.lineTo(f8, (i8 + this.n.y) - this.h);
        }
        this.c.lineTo(f8, this.g + f6);
        this.c.quadTo(f8, f6, this.g + f8, f6);
    }

    protected int a(float f) {
        return (int) TypedValue.applyDimension(1, f, SDKController.getInstance().getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Point point, int i, int i2, int i3, double d) {
        this.f = i3;
        this.h = com.apxor.androidsdk.plugins.realtimeui.utils.b.a(d, i3 / this.m);
        if (point != null) {
            this.f352b = new Point(point);
        }
        this.f353o = new Rect(0, 0, i, i2);
        if (getBounds().isEmpty()) {
            return;
        }
        a(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.d;
        if (paint != null) {
            canvas.drawPath(this.c, paint);
        }
        Paint paint2 = this.e;
        if (paint2 != null) {
            canvas.drawPath(this.c, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
