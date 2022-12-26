package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.setFragmentResult;
/* loaded from: classes4.dex */
public class getActiveFragmentsCount extends Drawable implements reportLoaderStart {
    private String HaptikSDK$a;
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private int HaptikSDK$e;
    private int ICustomTabsCallback;
    private int ag$a;
    private String ah$a;
    private int ah$b;
    private int ak$b;
    private int extraCallbackWithResult;
    private String getInitSettings;
    private int getSignupData;
    private String invoke;
    private setFragmentResult.valueOf isLogoutPending;
    private int valueOf;
    private long values;
    private HashMap<String, String> toString = new HashMap<>();
    private int extraCallback = 80;
    private final Paint onXdkEvent = new Paint(1);
    private final Matrix HaptikWebView = new Matrix();
    private final Rect a = new Rect();
    private final RectF ak = new RectF();
    private int HaptikSDK$d = -1;
    private int aj$a = 0;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public getActiveFragmentsCount() {
        valueOf();
    }

    public void valueOf() {
        this.extraCallbackWithResult = -1;
        this.HaptikSDK$b = -1;
        this.ah$b = -1;
        this.toString = new HashMap<>();
        this.HaptikSDK$c = -1;
        this.HaptikSDK$e = -1;
        this.invoke = null;
        values((String) null);
        this.values = -1L;
        this.getInitSettings = null;
        this.HaptikSDK$d = -1;
        invalidateSelf();
    }

    public void values(String str) {
        if (str == null) {
            str = "none";
        }
        this.ah$a = str;
        invalidateSelf();
    }

    public void ah$a(int i, int i2) {
        this.extraCallbackWithResult = i;
        this.HaptikSDK$b = i2;
        invalidateSelf();
    }

    public void toString(String str, int i) {
        this.getInitSettings = str;
        this.HaptikSDK$d = i;
        invalidateSelf();
    }

    public void ag$a(int i) {
        this.ah$b = i;
    }

    public void values(setFragmentResult.valueOf valueof) {
        this.isLogoutPending = valueof;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        valueOf(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.onXdkEvent.setStyle(Paint.Style.STROKE);
        this.onXdkEvent.setStrokeWidth(2.0f);
        this.onXdkEvent.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.onXdkEvent);
        this.onXdkEvent.setStyle(Paint.Style.FILL);
        this.onXdkEvent.setColor(this.aj$a);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.onXdkEvent);
        this.onXdkEvent.setStyle(Paint.Style.FILL);
        this.onXdkEvent.setStrokeWidth(0.0f);
        this.onXdkEvent.setColor(-1);
        this.ag$a = this.ICustomTabsCallback;
        this.valueOf = this.ak$b;
        String str = this.HaptikSDK$a;
        if (str != null) {
            toString(canvas, "IDs", toString("%s, %s", this.ah$a, str));
        } else {
            toString(canvas, "ID", this.ah$a);
        }
        toString(canvas, "D", toString("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        valueOf(canvas, "I", toString("%dx%d", Integer.valueOf(this.extraCallbackWithResult), Integer.valueOf(this.HaptikSDK$b)), toString(this.extraCallbackWithResult, this.HaptikSDK$b, this.isLogoutPending));
        toString(canvas, "I", toString("%d KiB", Integer.valueOf(this.ah$b / 1024)));
        String str2 = this.invoke;
        if (str2 != null) {
            toString(canvas, "i format", str2);
        }
        int i = this.HaptikSDK$c;
        if (i > 0) {
            toString(canvas, "anim", toString("f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.HaptikSDK$e)));
        }
        setFragmentResult.valueOf valueof = this.isLogoutPending;
        if (valueof != null) {
            valueOf(canvas, "scale", valueof);
        }
        long j = this.values;
        if (j >= 0) {
            toString(canvas, "t", toString("%d ms", Long.valueOf(j)));
        }
        String str3 = this.getInitSettings;
        if (str3 != null) {
            valueOf(canvas, "origin", str3, this.HaptikSDK$d);
        }
        for (Map.Entry<String, String> entry : this.toString.entrySet()) {
            toString(canvas, entry.getKey(), entry.getValue());
        }
    }

    private void valueOf(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.onXdkEvent.setTextSize(min);
        int i3 = min + 8;
        this.getSignupData = i3;
        if (this.extraCallback == 80) {
            this.getSignupData = i3 * (-1);
        }
        this.ICustomTabsCallback = rect.left + 10;
        this.ak$b = this.extraCallback == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    private static String toString(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void valueOf(Canvas canvas, String str, Object obj) {
        valueOf(canvas, str, String.valueOf(obj), -1);
    }

    private void toString(Canvas canvas, String str, String str2) {
        valueOf(canvas, str, str2, -1);
    }

    private void valueOf(Canvas canvas, String str, String str2, int i) {
        String str3 = str + ": ";
        float measureText = this.onXdkEvent.measureText(str3);
        float measureText2 = this.onXdkEvent.measureText(str2);
        this.onXdkEvent.setColor(1711276032);
        int i2 = this.ag$a;
        int i3 = this.valueOf;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + measureText + measureText2 + 4.0f, i3 + this.getSignupData + 8, this.onXdkEvent);
        this.onXdkEvent.setColor(-1);
        canvas.drawText(str3, this.ag$a, this.valueOf, this.onXdkEvent);
        this.onXdkEvent.setColor(i);
        canvas.drawText(str2, this.ag$a + measureText, this.valueOf, this.onXdkEvent);
        this.valueOf += this.getSignupData;
    }

    int toString(int i, int i2, setFragmentResult.valueOf valueof) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return androidx.core.internal.view.SupportMenu.CATEGORY_MASK;
        }
        if (valueof != null) {
            Rect rect = this.a;
            rect.top = 0;
            rect.left = 0;
            this.a.right = width;
            this.a.bottom = height;
            this.HaptikWebView.reset();
            valueof.valueOf(this.HaptikWebView, this.a, i, i2, 0.0f, 0.0f);
            RectF rectF = this.ak;
            rectF.top = 0.0f;
            rectF.left = 0.0f;
            this.ak.right = i;
            this.ak.bottom = i2;
            this.HaptikWebView.mapRect(this.ak);
            width = Math.min(width, (int) this.ak.width());
            height = Math.min(height, (int) this.ak.height());
        }
        float f = width;
        float f2 = height;
        int abs = Math.abs(i - width);
        int abs2 = Math.abs(i2 - height);
        float f3 = abs;
        if (f3 >= f * 0.1f || abs2 >= 0.1f * f2) {
            return (f3 >= f * 0.5f || ((float) abs2) >= f2 * 0.5f) ? androidx.core.internal.view.SupportMenu.CATEGORY_MASK : androidx.core.view.InputDeviceCompat.SOURCE_ANY;
        }
        return -16711936;
    }

    @Override // o.reportLoaderStart
    public void ah$a(long j) {
        this.values = j;
        invalidateSelf();
    }
}
