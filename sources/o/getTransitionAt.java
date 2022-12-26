package o;

import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
public final class getTransitionAt extends calculateMatrix {
    private boolean ag$a;
    private final long toString;
    private final long valueOf;
    private long values;

    public getTransitionAt(long j, long j2, long j3) {
        this.toString = j3;
        this.valueOf = j2;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean z = j3 <= 0 ? i >= 0 : i <= 0;
        this.ag$a = z;
        this.values = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ag$a;
    }

    @Override // o.calculateMatrix
    public long nextLong() {
        long j = this.values;
        if (j == this.valueOf) {
            if (!this.ag$a) {
                throw new NoSuchElementException();
            }
            this.ag$a = false;
        } else {
            this.values = this.toString + j;
        }
        return j;
    }
}
