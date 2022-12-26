package o;

import java.lang.reflect.Array;
/* loaded from: classes5.dex */
public final class doBinds {
    private int ag$a;
    private final lambda$execute$1[] toString;
    private final int valueOf;
    private final int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public doBinds(int i, int i2) {
        this.toString = new lambda$execute$1[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.toString[i3] = new lambda$execute$1(((i2 + 4) * 17) + 1);
        }
        this.values = i2 * 17;
        this.valueOf = i;
        this.ag$a = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        this.ag$a++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public lambda$execute$1 ah$a() {
        return this.toString[this.ag$a];
    }

    public byte[][] toString(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.valueOf * i2, this.values * i);
        int i3 = this.valueOf * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.toString[i4 / i2].ag$a(i);
        }
        return bArr;
    }
}
