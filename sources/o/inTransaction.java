package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class inTransaction implements Cloneable {
    private final int ag$a;
    private final int ah$a;
    private final int toString;
    private final int[] valueOf;

    public inTransaction(int i) {
        this(i, i);
    }

    public inTransaction(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.ah$a = i;
        this.ag$a = i2;
        int i3 = (i + 31) / 32;
        this.toString = i3;
        this.valueOf = new int[i3 * i2];
    }

    private inTransaction(int i, int i2, int i3, int[] iArr) {
        this.ah$a = i;
        this.ag$a = i2;
        this.toString = i3;
        this.valueOf = iArr;
    }

    public boolean ah$a(int i, int i2) {
        return ((this.valueOf[(i2 * this.toString) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void values(int i, int i2) {
        int i3 = (i2 * this.toString) + (i / 32);
        int[] iArr = this.valueOf;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void toString(int i, int i2) {
        int i3 = (i2 * this.toString) + (i / 32);
        int[] iArr = this.valueOf;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public void valueOf() {
        int length = this.valueOf.length;
        for (int i = 0; i < length; i++) {
            this.valueOf[i] = 0;
        }
    }

    public void values(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.ag$a || i5 > this.ah$a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.toString;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.valueOf;
                int i9 = (i8 / 32) + (i7 * i2);
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public int ag$a() {
        return this.ah$a;
    }

    public int values() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof inTransaction) {
            inTransaction intransaction = (inTransaction) obj;
            return this.ah$a == intransaction.ah$a && this.ag$a == intransaction.ag$a && this.toString == intransaction.toString && Arrays.equals(this.valueOf, intransaction.valueOf);
        }
        return false;
    }

    public int hashCode() {
        int i = this.ah$a;
        return (((((((i * 31) + i) * 31) + this.ag$a) * 31) + this.toString) * 31) + Arrays.hashCode(this.valueOf);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public String toString(String str, String str2) {
        return toString(str, str2, "\n");
    }

    private String toString(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.ag$a * (this.ah$a + 1));
        for (int i = 0; i < this.ag$a; i++) {
            for (int i2 = 0; i2 < this.ah$a; i2++) {
                sb.append(ah$a(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: ah$a */
    public inTransaction clone() {
        return new inTransaction(this.ah$a, this.ag$a, this.toString, (int[]) this.valueOf.clone());
    }
}
