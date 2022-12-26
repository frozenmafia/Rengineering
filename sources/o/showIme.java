package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import o.PreferenceDialogFragmentCompat;
import o.PreferenceFragmentCompat;
/* loaded from: classes7.dex */
public class showIme {
    public static final int valueOf;
    private final Path HaptikSDK$a;
    private final View HaptikSDK$b;
    private PreferenceDialogFragmentCompat.valueOf HaptikSDK$c;
    private Drawable ag$a;
    private final values ah$a;
    private final Paint ah$b;
    private final Paint invoke;
    private boolean toString;
    private boolean values;

    /* loaded from: classes7.dex */
    public interface values {
        void toString(Canvas canvas);

        boolean values();
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            valueOf = 2;
        } else if (Build.VERSION.SDK_INT >= 18) {
            valueOf = 1;
        } else {
            valueOf = 0;
        }
    }

    public showIme(values valuesVar) {
        this.ah$a = valuesVar;
        View view = (View) valuesVar;
        this.HaptikSDK$b = view;
        view.setWillNotDraw(false);
        this.HaptikSDK$a = new Path();
        this.ah$b = new Paint(7);
        Paint paint = new Paint(1);
        this.invoke = paint;
        paint.setColor(0);
    }

    public void values() {
        if (valueOf == 0) {
            this.values = true;
            this.toString = false;
            this.HaptikSDK$b.buildDrawingCache();
            Bitmap drawingCache = this.HaptikSDK$b.getDrawingCache();
            if (drawingCache == null && this.HaptikSDK$b.getWidth() != 0 && this.HaptikSDK$b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.HaptikSDK$b.getWidth(), this.HaptikSDK$b.getHeight(), Bitmap.Config.ARGB_8888);
                this.HaptikSDK$b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                this.ah$b.setShader(new BitmapShader(drawingCache, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            }
            this.values = false;
            this.toString = true;
        }
    }

    public void ag$a() {
        if (valueOf == 0) {
            this.toString = false;
            this.HaptikSDK$b.destroyDrawingCache();
            this.ah$b.setShader(null);
            this.HaptikSDK$b.invalidate();
        }
    }

    public void values(PreferenceDialogFragmentCompat.valueOf valueof) {
        if (valueof == null) {
            this.HaptikSDK$c = null;
        } else {
            PreferenceDialogFragmentCompat.valueOf valueof2 = this.HaptikSDK$c;
            if (valueof2 == null) {
                this.HaptikSDK$c = new PreferenceDialogFragmentCompat.valueOf(valueof);
            } else {
                valueof2.ah$a(valueof);
            }
            if (PreferenceFragmentCompat.AnonymousClass3.valueOf(valueof.ag$a, ag$a(valueof), 1.0E-4f)) {
                this.HaptikSDK$c.ag$a = Float.MAX_VALUE;
            }
        }
        invoke();
    }

    public PreferenceDialogFragmentCompat.valueOf ah$a() {
        PreferenceDialogFragmentCompat.valueOf valueof = this.HaptikSDK$c;
        if (valueof == null) {
            return null;
        }
        PreferenceDialogFragmentCompat.valueOf valueof2 = new PreferenceDialogFragmentCompat.valueOf(valueof);
        if (valueof2.values()) {
            valueof2.ag$a = ag$a(valueof2);
        }
        return valueof2;
    }

    public void toString(int i) {
        this.invoke.setColor(i);
        this.HaptikSDK$b.invalidate();
    }

    public int valueOf() {
        return this.invoke.getColor();
    }

    public void values(Drawable drawable) {
        this.ag$a = drawable;
        this.HaptikSDK$b.invalidate();
    }

    private void invoke() {
        if (valueOf == 1) {
            this.HaptikSDK$a.rewind();
            PreferenceDialogFragmentCompat.valueOf valueof = this.HaptikSDK$c;
            if (valueof != null) {
                this.HaptikSDK$a.addCircle(valueof.values, this.HaptikSDK$c.toString, this.HaptikSDK$c.ag$a, Path.Direction.CW);
            }
        }
        this.HaptikSDK$b.invalidate();
    }

    private float ag$a(PreferenceDialogFragmentCompat.valueOf valueof) {
        return PreferenceFragmentCompat.AnonymousClass3.valueOf(valueof.values, valueof.toString, 0.0f, 0.0f, this.HaptikSDK$b.getWidth(), this.HaptikSDK$b.getHeight());
    }

    public void ag$a(Canvas canvas) {
        if (HaptikSDK$c()) {
            int i = valueOf;
            if (i == 0) {
                canvas.drawCircle(this.HaptikSDK$c.values, this.HaptikSDK$c.toString, this.HaptikSDK$c.ag$a, this.ah$b);
                if (ah$b()) {
                    canvas.drawCircle(this.HaptikSDK$c.values, this.HaptikSDK$c.toString, this.HaptikSDK$c.ag$a, this.invoke);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.HaptikSDK$a);
                this.ah$a.toString(canvas);
                if (ah$b()) {
                    canvas.drawRect(0.0f, 0.0f, this.HaptikSDK$b.getWidth(), this.HaptikSDK$b.getHeight(), this.invoke);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.ah$a.toString(canvas);
                if (ah$b()) {
                    canvas.drawRect(0.0f, 0.0f, this.HaptikSDK$b.getWidth(), this.HaptikSDK$b.getHeight(), this.invoke);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.ah$a.toString(canvas);
            if (ah$b()) {
                canvas.drawRect(0.0f, 0.0f, this.HaptikSDK$b.getWidth(), this.HaptikSDK$b.getHeight(), this.invoke);
            }
        }
        valueOf(canvas);
    }

    private void valueOf(Canvas canvas) {
        if (HaptikSDK$a()) {
            Rect bounds = this.ag$a.getBounds();
            float width = this.HaptikSDK$c.values - (bounds.width() / 2.0f);
            float height = this.HaptikSDK$c.toString - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.ag$a.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    public boolean HaptikSDK$b() {
        return this.ah$a.values() && !HaptikSDK$c();
    }

    private boolean HaptikSDK$c() {
        PreferenceDialogFragmentCompat.valueOf valueof = this.HaptikSDK$c;
        boolean z = valueof == null || valueof.values();
        return valueOf == 0 ? !z && this.toString : !z;
    }

    private boolean ah$b() {
        return (this.values || Color.alpha(this.invoke.getColor()) == 0) ? false : true;
    }

    private boolean HaptikSDK$a() {
        return (this.values || this.ag$a == null || this.HaptikSDK$c == null) ? false : true;
    }
}
