package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
/* loaded from: classes5.dex */
public class RNCMaskedView extends ReactViewGroup {
    private Bitmap ag$a;
    private PorterDuffXfermode ah$a;
    private Paint values;

    public RNCMaskedView(Context context) {
        super(context);
        this.ag$a = null;
        setLayerType(1, null);
        this.values = new Paint(1);
        this.ah$a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        values();
        if (this.ag$a != null) {
            this.values.setXfermode(this.ah$a);
            canvas.drawBitmap(this.ag$a, 0.0f, 0.0f, this.values);
            this.values.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            values();
        }
    }

    private void values() {
        Bitmap bitmap = this.ag$a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        View childAt = getChildAt(0);
        childAt.setVisibility(0);
        this.ag$a = ag$a(childAt);
        childAt.setVisibility(4);
    }

    public static Bitmap ag$a(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
