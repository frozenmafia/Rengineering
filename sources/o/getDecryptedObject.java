package o;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.theartofdev.edmodo.cropper.CropOverlayView;
/* loaded from: classes5.dex */
public final class getDecryptedObject extends Animation implements Animation.AnimationListener {
    private final ImageView HaptikSDK$c;
    private final CropOverlayView values;
    private final float[] HaptikSDK$a = new float[8];
    private final float[] ag$a = new float[8];
    private final RectF ah$b = new RectF();
    private final RectF HaptikSDK$b = new RectF();
    private final float[] HaptikSDK$d = new float[9];
    private final float[] invoke = new float[9];
    private final RectF valueOf = new RectF();
    private final float[] toString = new float[8];
    private final float[] ah$a = new float[9];

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }

    public getDecryptedObject(ImageView imageView, CropOverlayView cropOverlayView) {
        this.HaptikSDK$c = imageView;
        this.values = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public void ag$a(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.HaptikSDK$a, 0, 8);
        this.ah$b.set(this.values.HaptikSDK$c());
        matrix.getValues(this.HaptikSDK$d);
    }

    public void valueOf(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.ag$a, 0, 8);
        this.HaptikSDK$b.set(this.values.HaptikSDK$c());
        matrix.getValues(this.invoke);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        this.valueOf.left = this.ah$b.left + ((this.HaptikSDK$b.left - this.ah$b.left) * f);
        this.valueOf.top = this.ah$b.top + ((this.HaptikSDK$b.top - this.ah$b.top) * f);
        this.valueOf.right = this.ah$b.right + ((this.HaptikSDK$b.right - this.ah$b.right) * f);
        this.valueOf.bottom = this.ah$b.bottom + ((this.HaptikSDK$b.bottom - this.ah$b.bottom) * f);
        this.values.setCropWindowRect(this.valueOf);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.toString;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.HaptikSDK$a;
            fArr[i2] = fArr2[i2] + ((this.ag$a[i2] - fArr2[i2]) * f);
            i2++;
        }
        this.values.setBounds(fArr, this.HaptikSDK$c.getWidth(), this.HaptikSDK$c.getHeight());
        while (true) {
            float[] fArr3 = this.ah$a;
            if (i < fArr3.length) {
                float[] fArr4 = this.HaptikSDK$d;
                fArr3[i] = fArr4[i] + ((this.invoke[i] - fArr4[i]) * f);
                i++;
            } else {
                Matrix imageMatrix = this.HaptikSDK$c.getImageMatrix();
                imageMatrix.setValues(this.ah$a);
                this.HaptikSDK$c.setImageMatrix(imageMatrix);
                this.HaptikSDK$c.invalidate();
                this.values.invalidate();
                return;
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.HaptikSDK$c.clearAnimation();
    }
}
