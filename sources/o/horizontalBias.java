package o;

import o.Styleable;
/* loaded from: classes3.dex */
public final class horizontalBias implements clearVertical {
    private final int HaptikSDK$b;
    private final Integer HaptikSDK$c;
    private final int ag$a;
    private final boolean ah$a;
    private final String invoke;
    private final String toString;
    private final Styleable.ArcMotion<setAnimationMatrix> valueOf;
    private final enableHomeButtonByDefault values;

    public horizontalBias(enableHomeButtonByDefault enablehomebuttonbydefault, Integer num, String str, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(arcMotion, "careerStatsWinRateInfoClick");
        this.values = enablehomebuttonbydefault;
        this.HaptikSDK$c = num;
        this.toString = str;
        this.valueOf = arcMotion;
        this.ag$a = com.app.dream11Pro.R.color.d11_color_bg__neutralDarkest;
        boolean z = true;
        this.invoke = num == null ? null : ag$a().valueOf(com.app.dream11Pro.R.string.res_0x7f12019a, Integer.valueOf(num.intValue()));
        this.HaptikSDK$b = num == null ? 0 : num.intValue();
        if (num != null && str != null) {
            z = false;
        }
        this.ah$a = z;
    }

    public final enableHomeButtonByDefault ag$a() {
        return this.values;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> ah$a() {
        return this.valueOf;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final int values() {
        return this.ag$a;
    }

    public final String ah$b() {
        return this.invoke;
    }

    public final int HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final boolean invoke() {
        return this.ah$a;
    }
}
