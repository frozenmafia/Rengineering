package io.github.douglasjunior.androidSimpleTooltip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import o.smoothSlideClosed;
import o.smoothSlideTo;
/* loaded from: classes5.dex */
public class OverlayView extends View {
    private static final int ah$a = smoothSlideTo.toString.simpletooltip_overlay_alpha;
    private final float HaptikSDK$c;
    private boolean ag$a;
    private final int invoke;
    private Bitmap toString;
    private View valueOf;
    private final int values;

    @Override // android.view.View
    public boolean isInEditMode() {
        return true;
    }

    public OverlayView(Context context, View view, int i, float f, int i2) {
        super(context);
        this.ag$a = true;
        this.valueOf = view;
        this.HaptikSDK$c = f;
        this.values = i;
        this.invoke = i2;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.ag$a || (bitmap = this.toString) == null || bitmap.isRecycled()) {
            values();
        }
        Bitmap bitmap2 = this.toString;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.toString, 0.0f, 0.0f, (Paint) null);
    }

    private void values() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        Bitmap bitmap = this.toString;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.toString.recycle();
        }
        this.toString = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.toString);
        RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
        Paint paint = new Paint(1);
        paint.setColor(this.invoke);
        paint.setAntiAlias(true);
        paint.setAlpha(getResources().getInteger(ah$a));
        canvas.drawRect(rectF, paint);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        RectF ag$a = smoothSlideClosed.ag$a(this.valueOf);
        RectF ag$a2 = smoothSlideClosed.ag$a(this);
        float f = ag$a.left - ag$a2.left;
        float f2 = ag$a.top - ag$a2.top;
        float f3 = this.HaptikSDK$c;
        RectF rectF2 = new RectF(f - f3, f2 - f3, f + this.valueOf.getMeasuredWidth() + this.HaptikSDK$c, f2 + this.valueOf.getMeasuredHeight() + this.HaptikSDK$c);
        if (this.values == 1) {
            canvas.drawRect(rectF2, paint);
        } else {
            canvas.drawOval(rectF2, paint);
        }
        this.ag$a = false;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.ag$a = true;
    }

    public void setAnchorView(View view) {
        this.valueOf = view;
        invalidate();
    }
}
