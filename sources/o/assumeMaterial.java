package o;

import android.content.res.TypedArray;
import android.graphics.RectF;
/* loaded from: classes4.dex */
public class assumeMaterial {
    long ak;
    final float[] HaptikSDK$d = new float[4];
    final int[] HaptikSDK$a = new int[4];
    final RectF valueOf = new RectF();
    int ah$b = 0;
    int HaptikSDK$e = -1;
    int values = 1291845631;
    int onXdkEvent = 0;
    int HaptikWebView = 0;
    int invoke = 0;
    float ICustomTabsCallback = 1.0f;
    float getSignupData = 1.0f;
    float getInitSettings = 0.0f;
    float HaptikSDK$b = 0.5f;
    float a = 20.0f;
    public boolean HaptikSDK$c = true;
    boolean toString = true;
    boolean ag$a = true;
    int aj$a = -1;
    int isLogoutPending = 1;
    long ah$a = 1000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int toString(int i) {
        int i2 = this.HaptikWebView;
        return i2 > 0 ? i2 : Math.round(this.ICustomTabsCallback * i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int ag$a(int i) {
        int i2 = this.invoke;
        return i2 > 0 ? i2 : Math.round(this.getSignupData * i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        if (this.onXdkEvent != 1) {
            int[] iArr = this.HaptikSDK$a;
            int i = this.values;
            iArr[0] = i;
            int i2 = this.HaptikSDK$e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.HaptikSDK$a;
        int i3 = this.HaptikSDK$e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.values;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values() {
        if (this.onXdkEvent != 1) {
            this.HaptikSDK$d[0] = Math.max(((1.0f - this.getInitSettings) - this.HaptikSDK$b) / 2.0f, 0.0f);
            this.HaptikSDK$d[1] = Math.max(((1.0f - this.getInitSettings) - 0.001f) / 2.0f, 0.0f);
            this.HaptikSDK$d[2] = Math.min(((this.getInitSettings + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.HaptikSDK$d[3] = Math.min(((this.getInitSettings + 1.0f) + this.HaptikSDK$b) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.HaptikSDK$d;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.getInitSettings, 1.0f);
        this.HaptikSDK$d[2] = Math.min(this.getInitSettings + this.HaptikSDK$b, 1.0f);
        this.HaptikSDK$d[3] = 1.0f;
    }

    /* loaded from: classes.dex */
    public static class valueOf extends assumeMaterial$ag$a<valueOf> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.assumeMaterial$ag$a
        /* renamed from: ah$a */
        public valueOf valueOf() {
            return this;
        }

        public valueOf() {
            this.valueOf.ag$a = false;
        }

        public valueOf HaptikSDK$a(int i) {
            this.valueOf.HaptikSDK$e = i;
            return valueOf();
        }

        public valueOf HaptikSDK$b(int i) {
            this.valueOf.values = (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (this.valueOf.values & androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            return valueOf();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.assumeMaterial$ag$a
        /* renamed from: toString */
        public valueOf valueOf(TypedArray typedArray) {
            super.valueOf(typedArray);
            if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_base_color)) {
                HaptikSDK$b(typedArray.getColor(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_base_color, this.valueOf.values));
            }
            if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_highlight_color)) {
                HaptikSDK$a(typedArray.getColor(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_highlight_color, this.valueOf.HaptikSDK$e));
            }
            return valueOf();
        }
    }
}
