package o;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class matchNames extends removeGhost {
    private final double[] toString;
    private int valueOf;

    public matchNames(double[] dArr) {
        runAnimators.ag$a(dArr, "array");
        this.toString = dArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.valueOf < this.toString.length;
    }

    @Override // o.removeGhost
    public double values() {
        try {
            double[] dArr = this.toString;
            int i = this.valueOf;
            this.valueOf = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.valueOf--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
