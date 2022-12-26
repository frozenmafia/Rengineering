package o;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class capturePropagationValues extends calculateMatrix {
    private int ag$a;
    private final long[] toString;

    public capturePropagationValues(long[] jArr) {
        runAnimators.ag$a(jArr, "array");
        this.toString = jArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ag$a < this.toString.length;
    }

    @Override // o.calculateMatrix
    public long nextLong() {
        try {
            long[] jArr = this.toString;
            int i = this.ag$a;
            this.ag$a = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.ag$a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
