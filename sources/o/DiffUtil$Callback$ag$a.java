package o;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class DiffUtil$Callback$ag$a implements Comparable<DiffUtil$Callback$ag$a> {
    private final byte[] values;

    private DiffUtil$Callback$ag$a(byte[] bArr) {
        this.values = Arrays.copyOf(bArr, bArr.length);
    }

    public int hashCode() {
        return Arrays.hashCode(this.values);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DiffUtil$Callback$ag$a) {
            return Arrays.equals(this.values, ((DiffUtil$Callback$ag$a) obj).values);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    /* renamed from: valueOf */
    public int compareTo(DiffUtil$Callback$ag$a diffUtil$Callback$ag$a) {
        int i;
        int i2;
        byte[] bArr = this.values;
        int length = bArr.length;
        byte[] bArr2 = diffUtil$Callback$ag$a.values;
        if (length != bArr2.length) {
            i = bArr.length;
            i2 = bArr2.length;
        } else {
            int i3 = 0;
            while (true) {
                byte[] bArr3 = this.values;
                if (i3 >= bArr3.length) {
                    return 0;
                }
                char c = bArr3[i3];
                byte[] bArr4 = diffUtil$Callback$ag$a.values;
                if (c != bArr4[i3]) {
                    i = bArr3[i3];
                    i2 = bArr4[i3];
                    break;
                }
                i3++;
            }
        }
        return i - i2;
    }

    public String toString() {
        return LayoutState.ag$a(this.values);
    }
}
