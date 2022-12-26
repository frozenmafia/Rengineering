package o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.fresco.ui.common.OnFadeListener;
import java.util.Arrays;
import o.Fragment;
/* loaded from: classes4.dex */
public class isFragmentClass extends retainNonConfig {
    long HaptikSDK$a;
    int[] HaptikSDK$b;
    private final int HaptikSDK$c;
    private OnFadeListener HaptikSDK$d;
    private final Drawable[] HaptikSDK$e;
    private boolean HaptikWebView;
    int ag$a;
    int ah$a;
    int ah$b;
    private boolean ak;
    private boolean getInitSettings;
    private final boolean getSignupData;
    private final int invoke;
    boolean[] toString;
    int[] valueOf;
    int values;

    public isFragmentClass(Drawable[] drawableArr, boolean z, int i) {
        super(drawableArr);
        this.getInitSettings = true;
        Fragment.AnonymousClass8.values(drawableArr.length >= 1, "At least one layer required!");
        this.HaptikSDK$e = drawableArr;
        this.HaptikSDK$b = new int[drawableArr.length];
        this.valueOf = new int[drawableArr.length];
        this.ah$a = 255;
        this.toString = new boolean[drawableArr.length];
        this.values = 0;
        this.getSignupData = z;
        this.HaptikSDK$c = z ? 255 : 0;
        this.invoke = i;
        HaptikSDK$e();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.values == 0) {
            super.invalidateSelf();
        }
    }

    public void ag$a() {
        this.values++;
    }

    public void valueOf() {
        this.values--;
        invalidateSelf();
    }

    public void ah$a(int i) {
        this.ag$a = i;
        if (this.ah$b == 1) {
            this.ah$b = 0;
        }
    }

    private void HaptikSDK$e() {
        this.ah$b = 2;
        Arrays.fill(this.HaptikSDK$b, this.HaptikSDK$c);
        this.HaptikSDK$b[0] = 255;
        Arrays.fill(this.valueOf, this.HaptikSDK$c);
        this.valueOf[0] = 255;
        Arrays.fill(this.toString, this.getSignupData);
        this.toString[0] = true;
    }

    public void toString(int i) {
        this.ah$b = 0;
        this.toString[i] = true;
        invalidateSelf();
    }

    public void values(int i) {
        this.ah$b = 0;
        this.toString[i] = false;
        invalidateSelf();
    }

    public void values() {
        this.ah$b = 0;
        Arrays.fill(this.toString, true);
        invalidateSelf();
    }

    public void ah$b() {
        this.ah$b = 2;
        for (int i = 0; i < this.HaptikSDK$e.length; i++) {
            this.valueOf[i] = this.toString[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    private boolean values(float f) {
        boolean z = true;
        for (int i = 0; i < this.HaptikSDK$e.length; i++) {
            boolean[] zArr = this.toString;
            int i2 = zArr[i] ? 1 : -1;
            int[] iArr = this.valueOf;
            iArr[i] = (int) (this.HaptikSDK$b[i] + (i2 * 255 * f));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (zArr[i] && iArr[i] < 255) {
                z = false;
            }
            if (!zArr[i] && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[LOOP:0: B:23:0x004f->B:25:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[EDGE_INSN: B:30:0x0070->B:26:0x0070 ?: BREAK  , SYNTHETIC] */
    @Override // o.retainNonConfig, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.ah$b
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L2a
            if (r0 == r2) goto La
            goto L4f
        La:
            int r0 = r8.ag$a
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            o.Fragment.AnonymousClass8.toString(r0)
            long r4 = r8.HaptikSDK$c()
            long r6 = r8.HaptikSDK$a
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.ag$a
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.values(r0)
            if (r0 == 0) goto L27
            r2 = 2
        L27:
            r8.ah$b = r2
            goto L4e
        L2a:
            int[] r0 = r8.valueOf
            int[] r4 = r8.HaptikSDK$b
            android.graphics.drawable.Drawable[] r5 = r8.HaptikSDK$e
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r1, r4, r1, r5)
            long r4 = r8.HaptikSDK$c()
            r8.HaptikSDK$a = r4
            int r0 = r8.ag$a
            if (r0 != 0) goto L41
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L42
        L41:
            r0 = 0
        L42:
            boolean r0 = r8.values(r0)
            r8.HaptikSDK$a()
            if (r0 == 0) goto L4c
            r2 = 2
        L4c:
            r8.ah$b = r2
        L4e:
            r2 = r0
        L4f:
            android.graphics.drawable.Drawable[] r0 = r8.HaptikSDK$e
            int r3 = r0.length
            if (r1 >= r3) goto L70
            r0 = r0[r1]
            int[] r3 = r8.valueOf
            r3 = r3[r1]
            int r4 = r8.ah$a
            int r3 = r3 * r4
            double r3 = (double) r3
            r5 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r3 = r3 / r5
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            r8.toString(r9, r0, r3)
            int r1 = r1 + 1
            goto L4f
        L70:
            if (r2 == 0) goto L79
            r8.invoke()
            r8.HaptikSDK$b()
            goto L7c
        L79:
            r8.invalidateSelf()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isFragmentClass.draw(android.graphics.Canvas):void");
    }

    private void HaptikSDK$b() {
        if (this.ak && this.ah$b == 2 && this.toString[this.invoke]) {
            OnFadeListener onFadeListener = this.HaptikSDK$d;
            if (onFadeListener != null) {
                onFadeListener.onShownImmediately();
            }
            this.ak = false;
        }
    }

    private void toString(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.values++;
        if (this.getInitSettings) {
            drawable.mutate();
        }
        drawable.setAlpha(i);
        this.values--;
        drawable.draw(canvas);
    }

    @Override // o.retainNonConfig, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.ah$a != i) {
            this.ah$a = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ah$a;
    }

    protected long HaptikSDK$c() {
        return SystemClock.uptimeMillis();
    }

    public void valueOf(OnFadeListener onFadeListener) {
        this.HaptikSDK$d = onFadeListener;
    }

    private void HaptikSDK$a() {
        int i;
        if (!this.HaptikWebView && (i = this.invoke) >= 0) {
            boolean[] zArr = this.toString;
            if (i < zArr.length && zArr[i]) {
                this.HaptikWebView = true;
                OnFadeListener onFadeListener = this.HaptikSDK$d;
                if (onFadeListener != null) {
                    onFadeListener.onFadeStarted();
                }
            }
        }
    }

    private void invoke() {
        if (this.HaptikWebView) {
            this.HaptikWebView = false;
            OnFadeListener onFadeListener = this.HaptikSDK$d;
            if (onFadeListener != null) {
                onFadeListener.onFadeFinished();
            }
        }
    }
}
