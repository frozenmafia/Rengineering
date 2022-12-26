package o;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class excludeChildren extends postScale {
    private final short[] ag$a;
    private int valueOf;

    public excludeChildren(short[] sArr) {
        runAnimators.ag$a(sArr, "array");
        this.ag$a = sArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.valueOf < this.ag$a.length;
    }

    @Override // o.postScale
    public short valueOf() {
        try {
            short[] sArr = this.ag$a;
            int i = this.valueOf;
            this.valueOf = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.valueOf--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
