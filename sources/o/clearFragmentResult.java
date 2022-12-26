package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.lang.ref.WeakReference;
/* loaded from: classes4.dex */
public class clearFragmentResult extends onRequestPermissionsFromFragment {
    private final Bitmap ICustomTabsCallback;
    private final Paint ICustomTabsCallback$Default;
    private final Paint ak$a;
    private WeakReference<Bitmap> extraCallback;

    public clearFragmentResult(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.ICustomTabsCallback$Default = paint2;
        Paint paint3 = new Paint(1);
        this.ak$a = paint3;
        this.ICustomTabsCallback = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // o.onRequestPermissionsFromFragment, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("RoundedBitmapDrawable#draw");
        }
        if (!values()) {
            super.draw(canvas);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
                return;
            }
            return;
        }
        ag$a();
        valueOf();
        HaptikSDK$c();
        int save = canvas.save();
        canvas.concat(this.HaptikSDK$e);
        canvas.drawPath(this.HaptikWebView, this.ICustomTabsCallback$Default);
        if (this.ag$a > 0.0f) {
            this.ak$a.setStrokeWidth(this.ag$a);
            this.ak$a.setColor(restoreSaveState.valueOf(this.values, this.ICustomTabsCallback$Default.getAlpha()));
            canvas.drawPath(this.ah$a, this.ak$a);
        }
        canvas.restoreToCount(save);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    private void HaptikSDK$c() {
        WeakReference<Bitmap> weakReference = this.extraCallback;
        if (weakReference == null || weakReference.get() != this.ICustomTabsCallback) {
            this.extraCallback = new WeakReference<>(this.ICustomTabsCallback);
            this.ICustomTabsCallback$Default.setShader(new BitmapShader(this.ICustomTabsCallback, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            this.getSignupData = true;
        }
        if (this.getSignupData) {
            this.ICustomTabsCallback$Default.getShader().setLocalMatrix(this.extraCallbackWithResult);
            this.getSignupData = false;
        }
        this.ICustomTabsCallback$Default.setFilterBitmap(ah$a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onRequestPermissionsFromFragment
    public boolean values() {
        return super.values() && this.ICustomTabsCallback != null;
    }

    @Override // o.onRequestPermissionsFromFragment, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.ICustomTabsCallback$Default.getAlpha()) {
            this.ICustomTabsCallback$Default.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // o.onRequestPermissionsFromFragment, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.ICustomTabsCallback$Default.setColorFilter(colorFilter);
    }
}
