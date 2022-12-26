package com.clevertap.android.sdk.customviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import o.setBoundsInScreen;
/* loaded from: classes3.dex */
public final class CloseImageView extends AppCompatImageView {
    private final int valueOf;

    public CloseImageView(Context context) {
        super(context);
        this.valueOf = values(40);
        setId(199272);
    }

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.valueOf = values(40);
        setId(199272);
    }

    public CloseImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueOf = values(40);
        setId(199272);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Context context = getContext();
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("ct_close", "drawable", context.getPackageName()), null);
            if (decodeResource != null) {
                int i = this.valueOf;
                canvas.drawBitmap(Bitmap.createScaledBitmap(decodeResource, i, i, true), 0.0f, 0.0f, new Paint());
            } else {
                setBoundsInScreen.values("Unable to find inapp notif close button image");
            }
        } catch (Throwable th) {
            setBoundsInScreen.valueOf("Error displaying the inapp notif close button image:", th);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.valueOf;
        setMeasuredDimension(i3, i3);
    }

    private int values(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }
}
