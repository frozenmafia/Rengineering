package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.WindowInsetsControllerCompat;
import o.getSystemWindowInsetTop;
/* loaded from: classes3.dex */
public class getStableInsetBottom extends Drawable implements getSystemWindowInsetTop.values, android.graphics.drawable.Animatable, androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private int HaptikSDK$a;
    private boolean HaptikSDK$b;
    private Paint HaptikSDK$c;
    private final values HaptikSDK$e;
    private boolean ag$a;
    private List<Animatable2Compat.AnimationCallback> ah$a;
    private boolean ah$b;
    private int invoke;
    private Rect toString;
    private boolean valueOf;
    private boolean values;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public getStableInsetBottom(Context context, getScaledPagingTouchSlop getscaledpagingtouchslop, ViewGroupKt$iterator$1<Bitmap> viewGroupKt$iterator$1, int i, int i2, Bitmap bitmap) {
        this(new values(new getSystemWindowInsetTop(Glide.ag$a(context), getscaledpagingtouchslop, i, i2, viewGroupKt$iterator$1, bitmap)));
    }

    getStableInsetBottom(values valuesVar) {
        this.ah$b = true;
        this.invoke = -1;
        this.HaptikSDK$e = (values) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(valuesVar);
    }

    public int HaptikSDK$c() {
        return this.HaptikSDK$e.valueOf.ah$b();
    }

    public Bitmap ah$a() {
        return this.HaptikSDK$e.valueOf.invoke();
    }

    public void toString(ViewGroupKt$iterator$1<Bitmap> viewGroupKt$iterator$1, Bitmap bitmap) {
        this.HaptikSDK$e.valueOf.ag$a(viewGroupKt$iterator$1, bitmap);
    }

    public ByteBuffer valueOf() {
        return this.HaptikSDK$e.valueOf.ah$a();
    }

    public int ag$a() {
        return this.HaptikSDK$e.valueOf.HaptikSDK$b();
    }

    public int values() {
        return this.HaptikSDK$e.valueOf.ag$a();
    }

    private void getSignupData() {
        this.HaptikSDK$a = 0;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.HaptikSDK$b = true;
        getSignupData();
        if (this.ah$b) {
            HaptikSDK$e();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.HaptikSDK$b = false;
        getInitSettings();
    }

    private void HaptikSDK$e() {
        WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(!this.values, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.HaptikSDK$e.valueOf.HaptikSDK$b() == 1) {
            invalidateSelf();
        } else if (this.valueOf) {
        } else {
            this.valueOf = true;
            this.HaptikSDK$e.valueOf.toString(this);
            invalidateSelf();
        }
    }

    private void getInitSettings() {
        this.valueOf = false;
        this.HaptikSDK$e.valueOf.ag$a(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(!this.values, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.ah$b = z;
        if (!z) {
            getInitSettings();
        } else if (this.HaptikSDK$b) {
            HaptikSDK$e();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.HaptikSDK$e.valueOf.HaptikSDK$c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.HaptikSDK$e.valueOf.HaptikSDK$a();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.valueOf;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.ag$a = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.values) {
            return;
        }
        if (this.ag$a) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), HaptikSDK$b());
            this.ag$a = false;
        }
        canvas.drawBitmap(this.HaptikSDK$e.valueOf.valueOf(), (Rect) null, HaptikSDK$b(), HaptikWebView());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        HaptikWebView().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        HaptikWebView().setColorFilter(colorFilter);
    }

    private Rect HaptikSDK$b() {
        if (this.toString == null) {
            this.toString = new Rect();
        }
        return this.toString;
    }

    private Paint HaptikWebView() {
        if (this.HaptikSDK$c == null) {
            this.HaptikSDK$c = new Paint(2);
        }
        return this.HaptikSDK$c;
    }

    private Drawable.Callback HaptikSDK$a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // o.getSystemWindowInsetTop.values
    public void ah$b() {
        if (HaptikSDK$a() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (values() == ag$a() - 1) {
            this.HaptikSDK$a++;
        }
        int i = this.invoke;
        if (i == -1 || this.HaptikSDK$a < i) {
            return;
        }
        HaptikSDK$d();
        stop();
    }

    private void HaptikSDK$d() {
        List<Animatable2Compat.AnimationCallback> list = this.ah$a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.ah$a.get(i).onAnimationEnd(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.HaptikSDK$e;
    }

    public void invoke() {
        this.values = true;
        this.HaptikSDK$e.valueOf.values();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.ah$a == null) {
            this.ah$a = new ArrayList();
        }
        this.ah$a.add(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.ah$a;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.ah$a;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class values extends Drawable.ConstantState {
        final getSystemWindowInsetTop valueOf;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        values(getSystemWindowInsetTop getsystemwindowinsettop) {
            this.valueOf = getsystemwindowinsettop;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new getStableInsetBottom(this);
        }
    }
}
