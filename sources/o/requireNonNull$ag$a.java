package o;

import android.graphics.Bitmap;
import java.util.Arrays;
/* loaded from: classes3.dex */
final class requireNonNull$ag$a {
    private boolean HaptikSDK$c;
    private int ag$a;
    private int ah$a;
    private int ah$b;
    private int invoke;
    private int toString;
    private int valueOf;
    private final C$default$setContentDescription values = new C$default$setContentDescription();
    private final int[] HaptikSDK$b = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(C$default$setContentDescription c$default$setContentDescription, int i) {
        if (i % 5 != 2) {
            return;
        }
        c$default$setContentDescription.HaptikSDK$a(2);
        Arrays.fill(this.HaptikSDK$b, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
            int extraCallbackWithResult2 = c$default$setContentDescription.extraCallbackWithResult();
            int extraCallbackWithResult3 = c$default$setContentDescription.extraCallbackWithResult();
            int extraCallbackWithResult4 = c$default$setContentDescription.extraCallbackWithResult();
            int extraCallbackWithResult5 = c$default$setContentDescription.extraCallbackWithResult();
            double d = extraCallbackWithResult2;
            double d2 = extraCallbackWithResult3 - 128;
            double d3 = extraCallbackWithResult4 - 128;
            this.HaptikSDK$b[extraCallbackWithResult] = (getElevationDegrees.ah$a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (extraCallbackWithResult5 << 24) | (getElevationDegrees.ah$a((int) ((1.402d * d2) + d), 0, 255) << 16) | getElevationDegrees.ah$a((int) (d + (d3 * 1.772d)), 0, 255);
        }
        this.HaptikSDK$c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a(C$default$setContentDescription c$default$setContentDescription, int i) {
        int onRelationshipValidationResult;
        if (i < 4) {
            return;
        }
        c$default$setContentDescription.HaptikSDK$a(3);
        int i2 = i - 4;
        if ((c$default$setContentDescription.extraCallbackWithResult() & 128) != 0) {
            if (i2 < 7 || (onRelationshipValidationResult = c$default$setContentDescription.onRelationshipValidationResult()) < 4) {
                return;
            }
            this.toString = c$default$setContentDescription.ICustomTabsCallback$Default();
            this.valueOf = c$default$setContentDescription.ICustomTabsCallback$Default();
            this.values.valueOf(onRelationshipValidationResult - 4);
            i2 -= 7;
        }
        int valueOf = this.values.valueOf();
        int HaptikSDK$a = this.values.HaptikSDK$a();
        if (valueOf >= HaptikSDK$a || i2 <= 0) {
            return;
        }
        int min = Math.min(i2, HaptikSDK$a - valueOf);
        c$default$setContentDescription.valueOf(this.values.ah$a(), valueOf, min);
        this.values.HaptikSDK$b(valueOf + min);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void values(C$default$setContentDescription c$default$setContentDescription, int i) {
        if (i < 19) {
            return;
        }
        this.ah$b = c$default$setContentDescription.ICustomTabsCallback$Default();
        this.invoke = c$default$setContentDescription.ICustomTabsCallback$Default();
        c$default$setContentDescription.HaptikSDK$a(11);
        this.ag$a = c$default$setContentDescription.ICustomTabsCallback$Default();
        this.ah$a = c$default$setContentDescription.ICustomTabsCallback$Default();
    }

    public isCompatTintEnabled ah$a() {
        int i;
        if (this.ah$b == 0 || this.invoke == 0 || this.toString == 0 || this.valueOf == 0 || this.values.HaptikSDK$a() == 0 || this.values.valueOf() != this.values.HaptikSDK$a() || !this.HaptikSDK$c) {
            return null;
        }
        this.values.HaptikSDK$b(0);
        int i2 = this.toString * this.valueOf;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int extraCallbackWithResult = this.values.extraCallbackWithResult();
            if (extraCallbackWithResult != 0) {
                i = i3 + 1;
                iArr[i3] = this.HaptikSDK$b[extraCallbackWithResult];
            } else {
                int extraCallbackWithResult2 = this.values.extraCallbackWithResult();
                if (extraCallbackWithResult2 != 0) {
                    i = ((extraCallbackWithResult2 & 64) == 0 ? extraCallbackWithResult2 & 63 : ((extraCallbackWithResult2 & 63) << 8) | this.values.extraCallbackWithResult()) + i3;
                    Arrays.fill(iArr, i3, i, (extraCallbackWithResult2 & 128) == 0 ? 0 : this.HaptikSDK$b[this.values.extraCallbackWithResult()]);
                }
            }
            i3 = i;
        }
        return new isCompatTintEnabled$ah$a().values(Bitmap.createBitmap(iArr, this.toString, this.valueOf, Bitmap.Config.ARGB_8888)).toString(this.ag$a / this.ah$b).toString(0).toString(this.ah$a / this.invoke, 0).valueOf(0).ag$a(this.toString / this.ah$b).ah$a(this.valueOf / this.invoke).values();
    }

    public void valueOf() {
        this.ah$b = 0;
        this.invoke = 0;
        this.ag$a = 0;
        this.ah$a = 0;
        this.toString = 0;
        this.valueOf = 0;
        this.values.valueOf(0);
        this.HaptikSDK$c = false;
    }
}
