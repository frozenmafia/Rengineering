package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import o.extract;
/* loaded from: classes3.dex */
public final class getBackgroundTintMode extends Drawable implements Choreographer.FrameCallback {
    public final TextPaint HaptikSDK$a;
    public long HaptikSDK$b;
    public final List<getBackgroundTintMode$ag$a> HaptikSDK$c;
    public boolean HaptikSDK$e;
    public final int ag$a;
    public final List<getBackgroundTintMode$ag$a> ah$a;
    public final Rect ah$b;
    public getBackgroundTintMode$ag$a getSignupData;
    public Drawable invoke;
    public final Context toString;
    public final int valueOf;
    public final int values;

    public getBackgroundTintMode(Context context) {
        runAnimators.ag$a(context, "context");
        this.toString = context;
        this.valueOf = context.getResources().getDimensionPixelSize(extract.values.slider_particle_system_particle_min_size);
        this.values = context.getResources().getDimensionPixelSize(extract.values.slider_particle_system_particle_max_size);
        this.ag$a = context.getResources().getDimensionPixelSize(extract.values.slider_particle_system_anchor_offset);
        this.ah$a = new ArrayList();
        this.HaptikSDK$c = new ArrayList();
        this.ah$b = new Rect();
        this.HaptikSDK$a = new TextPaint(1);
    }

    public final void ag$a(Canvas canvas, getBackgroundTintMode$ag$a getbackgroundtintmode_ag_a) {
        this.invoke = getClipBounds.toString(this.toString, getbackgroundtintmode_ag_a.toString, getbackgroundtintmode_ag_a.ag$a, Float.valueOf(getbackgroundtintmode_ag_a.ah$b));
        float f = getbackgroundtintmode_ag_a.ah$b;
        int i = 150;
        if (f >= -30.0f && f <= 30.0f) {
            float width = getbackgroundtintmode_ag_a.values - (this.ah$b.width() / 2.0f);
            if (width < 50.0f) {
                width = 50.0f;
            }
            float f2 = getbackgroundtintmode_ag_a.ah$b;
            if (f2 < 0.0f) {
                width += 100;
            }
            canvas.rotate(f2, this.ah$b.centerX(), getbackgroundtintmode_ag_a.ah$a);
            canvas.translate(width, ((getbackgroundtintmode_ag_a.ah$a + getbackgroundtintmode_ag_a.valueOf) - 150) - (getbackgroundtintmode_ag_a.ag$a / 2.0f));
            Drawable drawable = this.invoke;
            if (drawable == null) {
                return;
            }
            drawable.draw(canvas);
            return;
        }
        if (f > 30.0f && f <= 90.0f) {
            i = -150;
        }
        float width2 = getbackgroundtintmode_ag_a.values - (this.ah$b.width() / 2.0f);
        float f3 = getbackgroundtintmode_ag_a.ah$a;
        float f4 = getbackgroundtintmode_ag_a.valueOf;
        float f5 = i;
        float f6 = getbackgroundtintmode_ag_a.ag$a / 2.0f;
        if (width2 < 100.0f) {
            width2 = 100.0f;
        }
        canvas.translate(width2, ((f3 + f4) - f5) - f6);
        Drawable drawable2 = this.invoke;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        canvas.rotate(getbackgroundtintmode_ag_a.ah$b, this.ah$b.exactCenterX(), getbackgroundtintmode_ag_a.ah$a);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        getBackgroundTintMode$ag$a getbackgroundtintmode_ag_a = this.getSignupData;
        if (getbackgroundtintmode_ag_a != null) {
            getbackgroundtintmode_ag_a.valueOf = (float) ((Math.sin(Math.toRadians(System.currentTimeMillis() / 8)) * 16.0d) - this.ag$a);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.HaptikSDK$b;
        if (j2 != 0) {
            float f = ((float) (currentTimeMillis - j2)) / 1000.0f;
            for (getBackgroundTintMode$ag$a getbackgroundtintmode_ag_a2 : this.ah$a) {
                float f2 = getbackgroundtintmode_ag_a2.HaptikSDK$a + (1000 * f);
                getbackgroundtintmode_ag_a2.HaptikSDK$a = f2;
                float f3 = getbackgroundtintmode_ag_a2.ah$a - (f2 * f);
                getbackgroundtintmode_ag_a2.ah$a = f3;
                float f4 = getbackgroundtintmode_ag_a2.ag$a;
                if (f3 < getBounds().top - (2 * f4) || f4 < 0.0f) {
                    this.HaptikSDK$c.add(getbackgroundtintmode_ag_a2);
                }
            }
            if (!this.HaptikSDK$c.isEmpty()) {
                this.ah$a.removeAll(this.HaptikSDK$c);
                this.HaptikSDK$c.clear();
            }
        }
        this.HaptikSDK$b = currentTimeMillis;
        if (this.getSignupData == null && this.ah$a.isEmpty()) {
            this.HaptikSDK$e = false;
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        getBackgroundTintMode$ag$a getbackgroundtintmode_ag_a = this.getSignupData;
        if (getbackgroundtintmode_ag_a != null) {
            ag$a(canvas, getbackgroundtintmode_ag_a);
        }
        int i = 0;
        int size = this.ah$a.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            ag$a(canvas, this.ah$a.get(i));
            if (i2 > size) {
                return;
            }
            i = i2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.HaptikSDK$a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.HaptikSDK$a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
