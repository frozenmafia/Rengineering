package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
/* loaded from: classes5.dex */
public class onPanelSlide extends updatePreferences {
    private int ag$a;
    private final Paint ah$a;
    private final RectF toString;

    onPanelSlide() {
        this(null);
    }

    public onPanelSlide(areItemsTheSame areitemsthesame) {
        super(areitemsthesame == null ? new areItemsTheSame() : areitemsthesame);
        this.ah$a = new Paint(1);
        values();
        this.toString = new RectF();
    }

    private void values() {
        this.ah$a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ah$a.setColor(-1);
        this.ah$a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public boolean ag$a() {
        return !this.toString.isEmpty();
    }

    void ah$a(float f, float f2, float f3, float f4) {
        if (f == this.toString.left && f2 == this.toString.top && f3 == this.toString.right && f4 == this.toString.bottom) {
            return;
        }
        this.toString.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void ag$a(RectF rectF) {
        ah$a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void ah$a() {
        ah$a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // o.updatePreferences, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ah$a(canvas);
        super.draw(canvas);
        valueOf(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updatePreferences
    public void ag$a(Canvas canvas) {
        if (this.toString.isEmpty()) {
            super.ag$a(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.ag$a(canvas2);
        canvas2.drawRect(this.toString, this.ah$a);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    private void ah$a(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (ag$a(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        toString(canvas);
    }

    private void toString(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.ag$a = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.ag$a = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    private void valueOf(Canvas canvas) {
        if (ag$a(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.ag$a);
    }

    private boolean ag$a(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
