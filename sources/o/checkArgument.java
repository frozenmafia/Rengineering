package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class checkArgument {
    public final float HaptikSDK$a;
    public final int HaptikSDK$b;
    public final int HaptikSDK$c;
    public final int ag$a;
    public final String ah$a;
    public final float ah$b;
    public final float invoke;
    public final float toString;
    public final int valueOf;
    public final float values;

    public checkArgument(String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public checkArgument(String str, float f, float f2, int i, int i2, float f3, float f4, int i3, float f5, int i4) {
        this.ah$a = str;
        this.invoke = f;
        this.values = f2;
        this.valueOf = i;
        this.ag$a = i2;
        this.ah$b = f3;
        this.toString = f4;
        this.HaptikSDK$c = i3;
        this.HaptikSDK$a = f5;
        this.HaptikSDK$b = i4;
    }
}
