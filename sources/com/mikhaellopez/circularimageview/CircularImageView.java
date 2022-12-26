package com.mikhaellopez.circularimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import o.stopTrackingTable;
/* loaded from: classes5.dex */
public class CircularImageView extends ImageView {
    private static final ImageView.ScaleType values = ImageView.ScaleType.CENTER_CROP;
    private float HaptikSDK$a;
    private int HaptikSDK$b;
    private Paint HaptikSDK$c;
    private Bitmap ag$a;
    private int ah$a;
    private Paint invoke;
    private Drawable toString;
    private float valueOf;

    public CircularImageView(Context context) {
        this(context, null);
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HaptikSDK$b = ViewCompat.MEASURED_STATE_MASK;
        toString(context, attributeSet, i);
    }

    private void toString(Context context, AttributeSet attributeSet, int i) {
        Paint paint = new Paint();
        this.invoke = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.HaptikSDK$c = paint2;
        paint2.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, stopTrackingTable.toString.CircularImageView, i, 0);
        if (obtainStyledAttributes.getBoolean(stopTrackingTable.toString.CircularImageView_civ_border, true)) {
            setBorderWidth(obtainStyledAttributes.getDimension(stopTrackingTable.toString.CircularImageView_civ_border_width, getContext().getResources().getDisplayMetrics().density * 4.0f));
            setBorderColor(obtainStyledAttributes.getColor(stopTrackingTable.toString.CircularImageView_civ_border_color, -1));
        }
        if (obtainStyledAttributes.getBoolean(stopTrackingTable.toString.CircularImageView_civ_shadow, false)) {
            this.HaptikSDK$a = 8.0f;
            toString(obtainStyledAttributes.getFloat(stopTrackingTable.toString.CircularImageView_civ_shadow_radius, this.HaptikSDK$a), obtainStyledAttributes.getColor(stopTrackingTable.toString.CircularImageView_civ_shadow_color, this.HaptikSDK$b));
        }
    }

    public void setBorderWidth(float f) {
        this.valueOf = f;
        requestLayout();
        invalidate();
    }

    public void setBorderColor(int i) {
        Paint paint = this.HaptikSDK$c;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public void setShadowRadius(float f) {
        toString(f, this.HaptikSDK$b);
        invalidate();
    }

    public void setShadowColor(int i) {
        toString(this.HaptikSDK$a, i);
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return values;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != values) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported. ScaleType.CENTER_CROP is used by default. So you don't need to use ScaleType.", scaleType));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        values();
        if (this.ag$a == null) {
            return;
        }
        if (!isInEditMode()) {
            this.ah$a = canvas.getWidth();
            if (canvas.getHeight() < this.ah$a) {
                this.ah$a = canvas.getHeight();
            }
        }
        float f = this.valueOf;
        float f2 = ((int) (this.ah$a - (f * 2.0f))) / 2;
        float f3 = this.HaptikSDK$a;
        float f4 = f + f2;
        canvas.drawCircle(f4, f4, f4 - (f3 + (f3 / 2.0f)), this.HaptikSDK$c);
        float f5 = this.valueOf;
        float f6 = this.HaptikSDK$a;
        float f7 = f5 + f2;
        canvas.drawCircle(f7, f7, f2 - (f6 + (f6 / 2.0f)), this.invoke);
    }

    private void values() {
        if (this.toString == getDrawable()) {
            return;
        }
        Drawable drawable = getDrawable();
        this.toString = drawable;
        this.ag$a = toString(drawable);
        ag$a();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ah$a = i;
        if (i2 < i) {
            this.ah$a = i2;
        }
        if (this.ag$a != null) {
            ag$a();
        }
    }

    private void toString(float f, int i) {
        this.HaptikSDK$a = f;
        this.HaptikSDK$b = i;
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, this.HaptikSDK$c);
        }
        this.HaptikSDK$c.setShadowLayer(f, 0.0f, f / 2.0f, i);
    }

    private void ag$a() {
        Bitmap bitmap = this.ag$a;
        if (bitmap == null) {
            return;
        }
        this.ag$a = valueOf(bitmap);
        BitmapShader bitmapShader = new BitmapShader(this.ag$a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setScale(this.ah$a / this.ag$a.getWidth(), this.ah$a / this.ag$a.getHeight());
        bitmapShader.setLocalMatrix(matrix);
        this.invoke.setShader(bitmapShader);
    }

    private Bitmap valueOf(Bitmap bitmap) {
        if (bitmap.getWidth() >= bitmap.getHeight()) {
            return Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight());
        }
        return Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
    }

    private Bitmap toString(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                Log.e(getClass().toString(), "Encountered OutOfMemoryError while generating bitmap!");
            }
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(values(i), valueOf(i2));
    }

    private int values(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return (mode == 1073741824 || mode == Integer.MIN_VALUE) ? size : this.ah$a;
    }

    private int valueOf(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = this.ah$a;
        }
        return size + 2;
    }
}
