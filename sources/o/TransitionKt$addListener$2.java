package o;

import o.onTransitionPause;
/* loaded from: classes3.dex */
public final class TransitionKt$addListener$2 implements onTransitionPause {
    private int ag$a;
    private final C$default$setContentDescription ah$a = new C$default$setContentDescription(32);
    private boolean ah$b;
    private int toString;
    private final TransitionKt valueOf;
    private boolean values;

    public TransitionKt$addListener$2(TransitionKt transitionKt) {
        this.valueOf = transitionKt;
    }

    @Override // o.onTransitionPause
    public void ag$a(getCarrierFrequencyHz getcarrierfrequencyhz, markBefore markbefore, onTransitionPause.toString tostring) {
        this.valueOf.ag$a(getcarrierfrequencyhz, markbefore, tostring);
        this.ah$b = true;
    }

    @Override // o.onTransitionPause
    public void ah$a() {
        this.ah$b = true;
    }

    @Override // o.onTransitionPause
    public void ag$a(C$default$setContentDescription c$default$setContentDescription, int i) {
        boolean z = (i & 1) != 0;
        int valueOf = z ? c$default$setContentDescription.valueOf() + c$default$setContentDescription.extraCallbackWithResult() : -1;
        if (this.ah$b) {
            if (!z) {
                return;
            }
            this.ah$b = false;
            c$default$setContentDescription.HaptikSDK$b(valueOf);
            this.ag$a = 0;
        }
        while (c$default$setContentDescription.ag$a() > 0) {
            int i2 = this.ag$a;
            if (i2 < 3) {
                if (i2 == 0) {
                    int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
                    c$default$setContentDescription.HaptikSDK$b(c$default$setContentDescription.valueOf() - 1);
                    if (extraCallbackWithResult == 255) {
                        this.ah$b = true;
                        return;
                    }
                }
                int min = Math.min(c$default$setContentDescription.ag$a(), 3 - this.ag$a);
                c$default$setContentDescription.valueOf(this.ah$a.ah$a(), this.ag$a, min);
                int i3 = this.ag$a + min;
                this.ag$a = i3;
                if (i3 == 3) {
                    this.ah$a.HaptikSDK$b(0);
                    this.ah$a.values(3);
                    this.ah$a.HaptikSDK$a(1);
                    int extraCallbackWithResult2 = this.ah$a.extraCallbackWithResult();
                    int extraCallbackWithResult3 = this.ah$a.extraCallbackWithResult();
                    this.values = (extraCallbackWithResult2 & 128) != 0;
                    this.toString = (((extraCallbackWithResult2 & 15) << 8) | extraCallbackWithResult3) + 3;
                    int values = this.ah$a.values();
                    int i4 = this.toString;
                    if (values < i4) {
                        this.ah$a.toString(Math.min((int) androidx.core.view.InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, this.ah$a.values() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c$default$setContentDescription.ag$a(), this.toString - this.ag$a);
                c$default$setContentDescription.valueOf(this.ah$a.ah$a(), this.ag$a, min2);
                int i5 = this.ag$a + min2;
                this.ag$a = i5;
                int i6 = this.toString;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.values) {
                        if (getElevationDegrees.valueOf(this.ah$a.ah$a(), 0, this.toString, -1) != 0) {
                            this.ah$b = true;
                            return;
                        }
                        this.ah$a.values(this.toString - 4);
                    } else {
                        this.ah$a.values(i6);
                    }
                    this.ah$a.HaptikSDK$b(0);
                    this.valueOf.toString(this.ah$a);
                    this.ag$a = 0;
                }
            }
        }
    }
}
