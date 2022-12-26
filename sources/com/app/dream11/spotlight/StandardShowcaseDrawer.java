package com.app.dream11.spotlight;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.app.dream11.spotlight.interfaces.ShowcaseDrawer;
import com.app.dream11Pro.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class StandardShowcaseDrawer implements ShowcaseDrawer {
    protected int backgroundColour;
    private final Paint basicPaint;
    protected final Paint eraserPaint;
    protected final Drawable showcaseDrawable;
    private final float showcaseRadius;

    public StandardShowcaseDrawer(Resources resources, Resources.Theme theme) {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY);
        Paint paint = new Paint();
        this.eraserPaint = paint;
        paint.setColor(ViewCompat.MEASURED_SIZE_MASK);
        paint.setAlpha(0);
        paint.setXfermode(porterDuffXfermode);
        paint.setAntiAlias(true);
        this.basicPaint = new Paint();
        this.showcaseRadius = resources.getDimension(R.dimen.res_0x7f070522);
        this.showcaseDrawable = ResourcesCompat.getDrawable(resources, R.drawable.red_down_flag, theme);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void setShowcaseColour(int i) {
        this.showcaseDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void drawShowcase(Bitmap bitmap, float f, float f2, float f3) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawCircle(f, f2, this.showcaseRadius, this.eraserPaint);
        int showcaseWidth = (int) (f - (getShowcaseWidth() / 2));
        int showcaseHeight = (int) (f2 - (getShowcaseHeight() / 2));
        this.showcaseDrawable.setBounds(showcaseWidth, showcaseHeight, getShowcaseWidth() + showcaseWidth, getShowcaseHeight() + showcaseHeight);
        this.showcaseDrawable.draw(canvas);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public int getShowcaseWidth() {
        return this.showcaseDrawable.getIntrinsicWidth();
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public int getShowcaseHeight() {
        return this.showcaseDrawable.getIntrinsicHeight();
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public float getBlockedRadius() {
        return this.showcaseRadius;
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void setBackgroundColour(int i) {
        this.backgroundColour = i;
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void erase(Bitmap bitmap) {
        bitmap.eraseColor(this.backgroundColour);
    }

    @Override // com.app.dream11.spotlight.interfaces.ShowcaseDrawer
    public void drawToCanvas(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.basicPaint);
    }
}
