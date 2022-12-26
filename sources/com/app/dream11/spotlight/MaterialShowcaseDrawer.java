package com.app.dream11.spotlight;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.app.dream11.spotlight.interfaces.ShowcaseDrawer;
import com.app.dream11Pro.R;
/* loaded from: classes3.dex */
public class MaterialShowcaseDrawer implements ShowcaseDrawer {
    private int backgroundColor;
    private final Paint basicPaint;
    private final Paint eraserPaint;
    private final float radius;

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void setShowcaseColour(int i) {
    }

    public MaterialShowcaseDrawer(Resources resources) {
        this.radius = resources.getDimension(R.dimen.res_0x7f070524);
        Paint paint = new Paint();
        this.eraserPaint = paint;
        paint.setColor(resources.getColor(R.color.res_0x7f0605d6));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        paint.setAntiAlias(true);
        this.basicPaint = new Paint();
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void drawShowcase(Bitmap bitmap, float f, float f2, float f3) {
        new Canvas(bitmap).drawCircle(f, f2, this.radius, this.eraserPaint);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public int getShowcaseWidth() {
        return (int) (this.radius * 2.0f);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public int getShowcaseHeight() {
        return (int) (this.radius * 2.0f);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public float getBlockedRadius() {
        return this.radius;
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void setBackgroundColour(int i) {
        this.backgroundColor = i;
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void erase(Bitmap bitmap) {
        bitmap.eraseColor(this.backgroundColor);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void drawToCanvas(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.basicPaint);
    }
}
