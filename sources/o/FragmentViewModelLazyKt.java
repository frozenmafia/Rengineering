package o;

import android.text.Spannable;
/* loaded from: classes.dex */
public class FragmentViewModelLazyKt {
    private final int HaptikSDK$a;
    private final float HaptikSDK$b;
    private final float HaptikSDK$c;
    private final int HaptikSDK$d;
    private final int HaptikSDK$e;
    private final boolean ag$a;
    private final int ah$a;
    private final float ah$b;
    private final Spannable getSignupData;
    private final int invoke;
    private final int toString;
    public boolean valueOf;
    private final float values;

    public FragmentViewModelLazyKt(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4) {
        this(spannable, i, z, f, f2, f3, f4, i2, i3, i4, -1, -1);
    }

    public FragmentViewModelLazyKt(Spannable spannable, int i, boolean z, int i2, int i3, int i4) {
        this(spannable, i, z, -1.0f, -1.0f, -1.0f, -1.0f, i2, i3, i4, -1, -1);
    }

    public FragmentViewModelLazyKt(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, int i6) {
        this.getSignupData = spannable;
        this.ah$a = i;
        this.ag$a = z;
        this.ah$b = f;
        this.HaptikSDK$c = f2;
        this.HaptikSDK$b = f3;
        this.values = f4;
        this.HaptikSDK$e = i2;
        this.HaptikSDK$d = i3;
        this.HaptikSDK$a = i5;
        this.invoke = i6;
        this.toString = i4;
    }

    public static FragmentViewModelLazyKt valueOf(Spannable spannable, int i, int i2, int i3, int i4, boolean z) {
        FragmentViewModelLazyKt fragmentViewModelLazyKt = new FragmentViewModelLazyKt(spannable, i, false, i2, i3, i4);
        fragmentViewModelLazyKt.valueOf = z;
        return fragmentViewModelLazyKt;
    }

    public Spannable HaptikWebView() {
        return this.getSignupData;
    }

    public int valueOf() {
        return this.ah$a;
    }

    public boolean values() {
        return this.ag$a;
    }

    public float invoke() {
        return this.ah$b;
    }

    public float HaptikSDK$c() {
        return this.HaptikSDK$c;
    }

    public float ah$b() {
        return this.HaptikSDK$b;
    }

    public float ah$a() {
        return this.values;
    }

    public int HaptikSDK$e() {
        return this.HaptikSDK$e;
    }

    public int getSignupData() {
        return this.HaptikSDK$d;
    }

    public int ag$a() {
        return this.toString;
    }

    public int HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public int HaptikSDK$a() {
        return this.invoke;
    }
}
