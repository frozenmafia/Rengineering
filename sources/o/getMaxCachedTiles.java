package o;

import java.util.Arrays;
/* loaded from: classes7.dex */
public class getMaxCachedTiles<K> extends extendRangeInto<K> {
    private transient int HaptikSDK$c;
    transient long[] ah$b;
    private transient int invoke;

    getMaxCachedTiles() {
        this(3);
    }

    public getMaxCachedTiles(int i) {
        this(i, 1.0f);
    }

    getMaxCachedTiles(int i, float f) {
        super(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.extendRangeInto
    public void toString(int i, float f) {
        super.toString(i, f);
        this.HaptikSDK$c = -2;
        this.invoke = -2;
        long[] jArr = new long[i];
        this.ah$b = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.extendRangeInto
    public int ag$a() {
        int i = this.HaptikSDK$c;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.extendRangeInto
    public int HaptikSDK$c(int i) {
        int HaptikSDK$d = HaptikSDK$d(i);
        if (HaptikSDK$d == -2) {
            return -1;
        }
        return HaptikSDK$d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.extendRangeInto
    public int values(int i, int i2) {
        return i == valueOf() ? i2 : i;
    }

    private int HaptikSDK$b(int i) {
        return (int) (this.ah$b[i] >>> 32);
    }

    private int HaptikSDK$d(int i) {
        return (int) this.ah$b[i];
    }

    private void valueOf(int i, int i2) {
        long[] jArr = this.ah$b;
        jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & 4294967295L);
    }

    private void ag$a(int i, int i2) {
        long[] jArr = this.ah$b;
        jArr[i] = (jArr[i] & 4294967295L) | (i2 << 32);
    }

    private void ah$a(int i, int i2) {
        if (i == -2) {
            this.HaptikSDK$c = i2;
        } else {
            valueOf(i, i2);
        }
        if (i2 == -2) {
            this.invoke = i;
        } else {
            ag$a(i2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.extendRangeInto
    public void toString(int i, K k, int i2, int i3) {
        super.toString(i, k, i2, i3);
        ah$a(this.invoke, i);
        ah$a(i, -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.extendRangeInto
    public void invoke(int i) {
        int valueOf = valueOf() - 1;
        ah$a(HaptikSDK$b(i), HaptikSDK$d(i));
        if (i < valueOf) {
            ah$a(HaptikSDK$b(valueOf), i);
            ah$a(i, HaptikSDK$d(valueOf));
        }
        super.invoke(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.extendRangeInto
    public void HaptikSDK$a(int i) {
        super.HaptikSDK$a(i);
        long[] jArr = this.ah$b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.ah$b = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }

    @Override // o.extendRangeInto
    public void values() {
        super.values();
        this.HaptikSDK$c = -2;
        this.invoke = -2;
    }
}
