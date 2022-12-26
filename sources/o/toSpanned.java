package o;
/* loaded from: classes3.dex */
public final class toSpanned {
    public final int HaptikSDK$a;
    public final int HaptikSDK$b;
    public final long HaptikSDK$c;
    private final SpannedStringKt[] HaptikSDK$e;
    public final long[] ag$a;
    public final createFromIcon ah$a;
    public final int ah$b;
    public final long invoke;
    public final long[] toString;
    public final long valueOf;
    public final int values;

    public toSpanned(int i, int i2, long j, long j2, long j3, createFromIcon createfromicon, int i3, SpannedStringKt[] spannedStringKtArr, int i4, long[] jArr, long[] jArr2) {
        this.values = i;
        this.HaptikSDK$b = i2;
        this.invoke = j;
        this.HaptikSDK$c = j2;
        this.valueOf = j3;
        this.ah$a = createfromicon;
        this.HaptikSDK$a = i3;
        this.HaptikSDK$e = spannedStringKtArr;
        this.ah$b = i4;
        this.toString = jArr;
        this.ag$a = jArr2;
    }

    public SpannedStringKt ag$a(int i) {
        SpannedStringKt[] spannedStringKtArr = this.HaptikSDK$e;
        if (spannedStringKtArr == null) {
            return null;
        }
        return spannedStringKtArr[i];
    }
}
