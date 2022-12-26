package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import o.Fragment;
/* loaded from: classes4.dex */
public class FragmentKt extends Drawable implements onStartActivityFromFragment {
    float[] ag$a;
    private final float[] HaptikSDK$e = new float[8];
    final float[] values = new float[8];
    final Paint valueOf = new Paint(1);
    private boolean HaptikSDK$b = false;
    private float ah$b = 0.0f;
    private float getInitSettings = 0.0f;
    private int HaptikSDK$c = 0;
    private boolean getSignupData = false;
    private boolean HaptikSDK$d = false;
    final Path toString = new Path();
    final Path ah$a = new Path();
    private int HaptikSDK$a = 0;
    private final RectF HaptikWebView = new RectF();
    private int invoke = 255;

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public FragmentKt(int i) {
        toString(i);
    }

    public static FragmentKt valueOf(ColorDrawable colorDrawable) {
        return new FragmentKt(colorDrawable.getColor());
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ag$a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.valueOf.setColor(restoreSaveState.valueOf(this.HaptikSDK$a, this.invoke));
        this.valueOf.setStyle(Paint.Style.FILL);
        this.valueOf.setFilterBitmap(valueOf());
        canvas.drawPath(this.toString, this.valueOf);
        if (this.ah$b != 0.0f) {
            this.valueOf.setColor(restoreSaveState.valueOf(this.HaptikSDK$c, this.invoke));
            this.valueOf.setStyle(Paint.Style.STROKE);
            this.valueOf.setStrokeWidth(this.ah$b);
            canvas.drawPath(this.ah$a, this.valueOf);
        }
    }

    @Override // o.onStartActivityFromFragment
    public void toString(boolean z) {
        this.HaptikSDK$b = z;
        ag$a();
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ag$a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.HaptikSDK$e, 0.0f);
        } else {
            Fragment.AnonymousClass8.valueOf(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.HaptikSDK$e, 0, 8);
        }
        ag$a();
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void toString(float f) {
        Fragment.AnonymousClass8.valueOf(f >= 0.0f, "radius should be non negative");
        Arrays.fill(this.HaptikSDK$e, f);
        ag$a();
        invalidateSelf();
    }

    public void toString(int i) {
        if (this.HaptikSDK$a != i) {
            this.HaptikSDK$a = i;
            invalidateSelf();
        }
    }

    @Override // o.onStartActivityFromFragment
    public void ah$a(int i, float f) {
        if (this.HaptikSDK$c != i) {
            this.HaptikSDK$c = i;
            invalidateSelf();
        }
        if (this.ah$b != f) {
            this.ah$b = f;
            ag$a();
            invalidateSelf();
        }
    }

    @Override // o.onStartActivityFromFragment
    public void ag$a(float f) {
        if (this.getInitSettings != f) {
            this.getInitSettings = f;
            ag$a();
            invalidateSelf();
        }
    }

    @Override // o.onStartActivityFromFragment
    public void ah$a(boolean z) {
        if (this.getSignupData != z) {
            this.getSignupData = z;
            ag$a();
            invalidateSelf();
        }
    }

    @Override // o.onStartActivityFromFragment
    public void values(boolean z) {
        if (this.HaptikSDK$d != z) {
            this.HaptikSDK$d = z;
            invalidateSelf();
        }
    }

    public boolean valueOf() {
        return this.HaptikSDK$d;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.invoke) {
            this.invoke = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.invoke;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return restoreSaveState.values(restoreSaveState.valueOf(this.HaptikSDK$a, this.invoke));
    }

    private void ag$a() {
        float[] fArr;
        float[] fArr2;
        this.toString.reset();
        this.ah$a.reset();
        this.HaptikWebView.set(getBounds());
        RectF rectF = this.HaptikWebView;
        float f = this.ah$b / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        if (this.HaptikSDK$b) {
            this.ah$a.addCircle(this.HaptikWebView.centerX(), this.HaptikWebView.centerY(), Math.min(this.HaptikWebView.width(), this.HaptikWebView.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.values;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.HaptikSDK$e[i2] + this.getInitSettings) - (this.ah$b / 2.0f);
                i2++;
            }
            this.ah$a.addRoundRect(this.HaptikWebView, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.HaptikWebView;
        float f2 = (-this.ah$b) / 2.0f;
        rectF2.inset(f2, f2);
        float f3 = this.getInitSettings + (this.getSignupData ? this.ah$b : 0.0f);
        this.HaptikWebView.inset(f3, f3);
        if (this.HaptikSDK$b) {
            this.toString.addCircle(this.HaptikWebView.centerX(), this.HaptikWebView.centerY(), Math.min(this.HaptikWebView.width(), this.HaptikWebView.height()) / 2.0f, Path.Direction.CW);
        } else if (this.getSignupData) {
            if (this.ag$a == null) {
                this.ag$a = new float[8];
            }
            while (true) {
                fArr2 = this.ag$a;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.HaptikSDK$e[i] - this.ah$b;
                i++;
            }
            this.toString.addRoundRect(this.HaptikWebView, fArr2, Path.Direction.CW);
        } else {
            this.toString.addRoundRect(this.HaptikWebView, this.HaptikSDK$e, Path.Direction.CW);
        }
        float f4 = -f3;
        this.HaptikWebView.inset(f4, f4);
    }
}
