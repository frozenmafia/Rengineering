package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
/* loaded from: classes3.dex */
public final class getFallback extends Drawable {
    public int HaptikSDK$a;
    public final float HaptikSDK$b;
    public float HaptikSDK$c;
    public Spannable ag$a;
    public final TextPaint ah$a;
    public int ah$b;
    public StaticLayout getSignupData;
    public int invoke;
    public Layout.Alignment toString;
    public int valueOf;
    public int values;

    public getFallback(Context context, int i) {
        runAnimators.ag$a(context, "context");
        this.valueOf = i;
        TextPaint textPaint = new TextPaint();
        this.ah$a = textPaint;
        this.toString = Layout.Alignment.ALIGN_CENTER;
        this.HaptikSDK$b = 1.0f;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setColor(-1);
    }

    public final void ag$a() {
        StaticLayout staticLayout;
        int lineCount;
        Spannable spannable = this.ag$a;
        if (spannable == null || spannable == null) {
            return;
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayout = StaticLayout.Builder.obtain(spannable.toString(), 0, spannable.length(), this.ah$a, this.valueOf).setAlignment(this.toString).setLineSpacing(0.0f, this.HaptikSDK$b).setIncludePad(false).build();
            runAnimators.ah$a(staticLayout, "{\n            StaticLayo…(false).build()\n        }");
        } else {
            staticLayout = new StaticLayout(spannable, this.ah$a, this.valueOf, this.toString, this.HaptikSDK$b, 0.0f, false);
        }
        this.getSignupData = staticLayout;
        StaticLayout staticLayout2 = null;
        if (staticLayout == null) {
            runAnimators.valueOf("staticlayout");
            staticLayout = null;
        }
        if (staticLayout != null && (lineCount = staticLayout.getLineCount()) >= 0) {
            int i2 = 0;
            while (true) {
                i = Math.max(i, loadTransition.values(staticLayout.getLineRight(i2) - staticLayout.getLineLeft(i2)));
                if (i2 == lineCount) {
                    break;
                }
                i2++;
            }
        }
        this.invoke = i + Math.round(0.0f);
        StaticLayout staticLayout3 = this.getSignupData;
        if (staticLayout3 == null) {
            runAnimators.valueOf("staticlayout");
        } else {
            staticLayout2 = staticLayout3;
        }
        this.HaptikSDK$a = staticLayout2.getHeight() + Math.round(0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        canvas.save();
        canvas.translate(this.values, this.ah$b);
        int i = 0;
        if (!TextUtils.isEmpty(this.ag$a)) {
            Spannable spannable = this.ag$a;
            runAnimators.toString(spannable);
            Spannable spannable2 = this.ag$a;
            runAnimators.toString(spannable2);
            ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = (ViewTreeObserver.OnPreDrawListener[]) spannable.getSpans(0, spannable2.length(), ViewTreeObserver.OnPreDrawListener.class);
            int length = onPreDrawListenerArr.length - 1;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    onPreDrawListenerArr[i2].onPreDraw();
                    if (i3 > length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        canvas.translate(0.0f, 0.0f);
        StaticLayout staticLayout = null;
        if (this.toString != Layout.Alignment.ALIGN_NORMAL) {
            StaticLayout staticLayout2 = this.getSignupData;
            if (staticLayout2 == null) {
                runAnimators.valueOf("staticlayout");
                staticLayout2 = null;
            }
            int i4 = Integer.MAX_VALUE;
            if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                int lineCount = staticLayout2.getLineCount();
                if (lineCount >= 0) {
                    while (true) {
                        i4 = Math.min(i4, (int) staticLayout2.getLineLeft(i));
                        if (i == lineCount) {
                            break;
                        }
                        i++;
                    }
                    i = i4;
                } else {
                    i = Integer.MAX_VALUE;
                }
            }
            canvas.rotate(this.HaptikSDK$c * (-1));
            canvas.save();
            canvas.translate(-i, 0.0f);
            StaticLayout staticLayout3 = this.getSignupData;
            if (staticLayout3 == null) {
                runAnimators.valueOf("staticlayout");
            } else {
                staticLayout = staticLayout3;
            }
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            StaticLayout staticLayout4 = this.getSignupData;
            if (staticLayout4 == null) {
                runAnimators.valueOf("staticlayout");
            } else {
                staticLayout = staticLayout4;
            }
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.HaptikSDK$a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.invoke;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        runAnimators.ag$a(rect, "rect");
        this.values = rect.left;
        this.ah$b = rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.ah$a.setAlpha(i);
        ag$a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ah$a.setColorFilter(colorFilter);
        ag$a();
        invalidateSelf();
    }
}
