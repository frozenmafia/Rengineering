package o;

import java.util.NoSuchElementException;
import o.FragmentTransitionSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getRunningAnimators extends FragmentTransitionSupport.AnonymousClass6 {
    private int toString;
    private final boolean[] valueOf;

    public getRunningAnimators(boolean[] zArr) {
        runAnimators.ag$a(zArr, "array");
        this.valueOf = zArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.toString < this.valueOf.length;
    }

    @Override // o.FragmentTransitionSupport.AnonymousClass6
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.valueOf;
            int i = this.toString;
            this.toString = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.toString--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
