package o;

import java.lang.reflect.Array;
import java.util.Arrays;
/* loaded from: classes5.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 {
    private final int ah$a;
    private final int valueOf;
    private final byte[][] values;

    public AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0(int i, int i2) {
        this.values = (byte[][]) Array.newInstance(Byte.TYPE, i2, i);
        this.ah$a = i;
        this.valueOf = i2;
    }

    public int ag$a() {
        return this.valueOf;
    }

    public int values() {
        return this.ah$a;
    }

    public byte ag$a(int i, int i2) {
        return this.values[i2][i];
    }

    public byte[][] ah$a() {
        return this.values;
    }

    public void ah$a(int i, int i2, int i3) {
        this.values[i2][i] = (byte) i3;
    }

    public void toString(int i, int i2, boolean z) {
        this.values[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public void valueOf(byte b2) {
        for (byte[] bArr : this.values) {
            Arrays.fill(bArr, b2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.ah$a * 2 * this.valueOf) + 2);
        for (int i = 0; i < this.valueOf; i++) {
            byte[] bArr = this.values[i];
            for (int i2 = 0; i2 < this.ah$a; i2++) {
                byte b2 = bArr[i2];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 == 1) {
                    sb.append(" 1");
                } else {
                    sb.append("  ");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
