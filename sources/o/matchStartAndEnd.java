package o;

import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
final class matchStartAndEnd extends copySize {
    private int ag$a;
    private final int[] ah$a;

    public matchStartAndEnd(int[] iArr) {
        runAnimators.ag$a(iArr, "array");
        this.ah$a = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ag$a < this.ah$a.length;
    }

    @Override // o.copySize
    public int nextInt() {
        try {
            int[] iArr = this.ah$a;
            int i = this.ag$a;
            this.ag$a = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.ag$a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
