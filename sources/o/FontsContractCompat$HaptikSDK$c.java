package o;

import o.FontsContractCompat$HaptikSDK$c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class FontsContractCompat$HaptikSDK$c<T extends FontsContractCompat$HaptikSDK$c<T>> {
    public final int ag$a;
    public final int ah$a;
    public final RoundedBitmapDrawableFactory toString;
    public final createFromIcon valueOf;

    public abstract boolean ah$a(T t);

    public abstract int valueOf();

    public FontsContractCompat$HaptikSDK$c(int i, RoundedBitmapDrawableFactory roundedBitmapDrawableFactory, int i2) {
        this.ag$a = i;
        this.toString = roundedBitmapDrawableFactory;
        this.ah$a = i2;
        this.valueOf = roundedBitmapDrawableFactory.ag$a(i2);
    }
}
