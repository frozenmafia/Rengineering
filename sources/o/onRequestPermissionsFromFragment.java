package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Arrays;
import o.Fragment;
/* loaded from: classes4.dex */
public abstract class onRequestPermissionsFromFragment extends Drawable implements onStartActivityFromFragment, FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0 {
    float[] HaptikSDK$b;
    RectF HaptikSDK$c;
    Matrix ah$b;
    private final Drawable extraCallback;
    private clearFragmentResultListener onPostMessage;
    Matrix onXdkEvent;
    protected boolean HaptikSDK$d = false;
    protected boolean isLogoutPending = false;
    protected float ag$a = 0.0f;
    protected final Path HaptikWebView = new Path();
    protected boolean getSignupData = true;
    protected int values = 0;
    protected final Path ah$a = new Path();
    private final float[] ICustomTabsCallback = new float[8];
    final float[] toString = new float[8];
    final RectF ak$b = new RectF();
    final RectF a = new RectF();
    final RectF valueOf = new RectF();
    final RectF invoke = new RectF();
    final Matrix HaptikSDK$a = new Matrix();
    final Matrix aj$a = new Matrix();
    final Matrix getInitSettings = new Matrix();
    final Matrix ak = new Matrix();
    final Matrix HaptikSDK$e = new Matrix();
    final Matrix extraCallbackWithResult = new Matrix();
    private float onRelationshipValidationResult = 0.0f;
    private boolean ICustomTabsCallback$Default = false;
    private boolean onMessageChannelReady = false;
    private boolean ak$a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onRequestPermissionsFromFragment(Drawable drawable) {
        this.extraCallback = drawable;
    }

    @Override // o.onStartActivityFromFragment
    public void toString(boolean z) {
        this.HaptikSDK$d = z;
        this.ak$a = true;
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void toString(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        Fragment.AnonymousClass8.toString(i >= 0);
        Arrays.fill(this.ICustomTabsCallback, f);
        this.isLogoutPending = i != 0;
        this.ak$a = true;
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ag$a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.ICustomTabsCallback, 0.0f);
            this.isLogoutPending = false;
        } else {
            Fragment.AnonymousClass8.valueOf(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.ICustomTabsCallback, 0, 8);
            this.isLogoutPending = false;
            for (int i = 0; i < 8; i++) {
                this.isLogoutPending |= fArr[i] > 0.0f;
            }
        }
        this.ak$a = true;
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ah$a(int i, float f) {
        if (this.values == i && this.ag$a == f) {
            return;
        }
        this.values = i;
        this.ag$a = f;
        this.ak$a = true;
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ag$a(float f) {
        if (this.onRelationshipValidationResult != f) {
            this.onRelationshipValidationResult = f;
            this.ak$a = true;
            invalidateSelf();
        }
    }

    @Override // o.onStartActivityFromFragment
    public void ah$a(boolean z) {
        if (this.ICustomTabsCallback$Default != z) {
            this.ICustomTabsCallback$Default = z;
            this.ak$a = true;
            invalidateSelf();
        }
    }

    @Override // o.onStartActivityFromFragment
    public void values(boolean z) {
        if (this.onMessageChannelReady != z) {
            this.onMessageChannelReady = z;
            invalidateSelf();
        }
    }

    public boolean ah$a() {
        return this.onMessageChannelReady;
    }

    @Override // o.FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0
    public void values(clearFragmentResultListener clearfragmentresultlistener) {
        this.onPostMessage = clearfragmentresultlistener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag$a() {
        Matrix matrix;
        clearFragmentResultListener clearfragmentresultlistener = this.onPostMessage;
        if (clearfragmentresultlistener != null) {
            clearfragmentresultlistener.toString(this.getInitSettings);
            this.onPostMessage.ah$a(this.ak$b);
        } else {
            this.getInitSettings.reset();
            this.ak$b.set(getBounds());
        }
        this.valueOf.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.invoke.set(this.extraCallback.getBounds());
        this.HaptikSDK$a.setRectToRect(this.valueOf, this.invoke, Matrix.ScaleToFit.FILL);
        if (this.ICustomTabsCallback$Default) {
            RectF rectF = this.HaptikSDK$c;
            if (rectF == null) {
                this.HaptikSDK$c = new RectF(this.ak$b);
            } else {
                rectF.set(this.ak$b);
            }
            RectF rectF2 = this.HaptikSDK$c;
            float f = this.ag$a;
            rectF2.inset(f, f);
            if (this.ah$b == null) {
                this.ah$b = new Matrix();
            }
            this.ah$b.setRectToRect(this.ak$b, this.HaptikSDK$c, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.ah$b;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.getInitSettings.equals(this.ak) || !this.HaptikSDK$a.equals(this.aj$a) || ((matrix = this.ah$b) != null && !matrix.equals(this.onXdkEvent))) {
            this.getSignupData = true;
            this.getInitSettings.invert(this.HaptikSDK$e);
            this.extraCallbackWithResult.set(this.getInitSettings);
            if (this.ICustomTabsCallback$Default) {
                this.extraCallbackWithResult.postConcat(this.ah$b);
            }
            this.extraCallbackWithResult.preConcat(this.HaptikSDK$a);
            this.ak.set(this.getInitSettings);
            this.aj$a.set(this.HaptikSDK$a);
            if (this.ICustomTabsCallback$Default) {
                Matrix matrix3 = this.onXdkEvent;
                if (matrix3 == null) {
                    this.onXdkEvent = new Matrix(this.ah$b);
                } else {
                    matrix3.set(this.ah$b);
                }
            } else {
                Matrix matrix4 = this.onXdkEvent;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.ak$b.equals(this.a)) {
            return;
        }
        this.ak$a = true;
        this.a.set(this.ak$b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void valueOf() {
        float[] fArr;
        if (this.ak$a) {
            this.ah$a.reset();
            RectF rectF = this.ak$b;
            float f = this.ag$a / 2.0f;
            rectF.inset(f, f);
            if (this.HaptikSDK$d) {
                this.ah$a.addCircle(this.ak$b.centerX(), this.ak$b.centerY(), Math.min(this.ak$b.width(), this.ak$b.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.toString;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.ICustomTabsCallback[i] + this.onRelationshipValidationResult) - (this.ag$a / 2.0f);
                    i++;
                }
                this.ah$a.addRoundRect(this.ak$b, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.ak$b;
            float f2 = (-this.ag$a) / 2.0f;
            rectF2.inset(f2, f2);
            this.HaptikWebView.reset();
            float f3 = this.onRelationshipValidationResult + (this.ICustomTabsCallback$Default ? this.ag$a : 0.0f);
            this.ak$b.inset(f3, f3);
            if (this.HaptikSDK$d) {
                this.HaptikWebView.addCircle(this.ak$b.centerX(), this.ak$b.centerY(), Math.min(this.ak$b.width(), this.ak$b.height()) / 2.0f, Path.Direction.CW);
            } else if (this.ICustomTabsCallback$Default) {
                if (this.HaptikSDK$b == null) {
                    this.HaptikSDK$b = new float[8];
                }
                for (int i2 = 0; i2 < this.toString.length; i2++) {
                    this.HaptikSDK$b[i2] = this.ICustomTabsCallback[i2] - this.ag$a;
                }
                this.HaptikWebView.addRoundRect(this.ak$b, this.HaptikSDK$b, Path.Direction.CW);
            } else {
                this.HaptikWebView.addRoundRect(this.ak$b, this.ICustomTabsCallback, Path.Direction.CW);
            }
            float f4 = -f3;
            this.ak$b.inset(f4, f4);
            this.HaptikWebView.setFillType(Path.FillType.WINDING);
            this.ak$a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean values() {
        return this.HaptikSDK$d || this.isLogoutPending || this.ag$a > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.extraCallback.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.extraCallback.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.extraCallback.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.extraCallback.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.extraCallback.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.extraCallback.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.extraCallback.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.extraCallback.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.extraCallback.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.extraCallback.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("RoundedDrawable#draw");
        }
        this.extraCallback.draw(canvas);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }
}
