package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Transition;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ChangeTransform$Transforms$ag$a implements Iterator<CircularPropagation>, Transition.ArrayListManager {
    private final short[] ah$a;
    private int values;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ChangeTransform$Transforms$ag$a(short[] sArr) {
        runAnimators.ag$a(sArr, "array");
        this.ah$a = sArr;
    }

    @Override // java.util.Iterator
    public /* synthetic */ CircularPropagation next() {
        return CircularPropagation.valueOf(ag$a());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.values < this.ah$a.length;
    }

    public short ag$a() {
        int i = this.values;
        short[] sArr = this.ah$a;
        if (i < sArr.length) {
            this.values = i + 1;
            return CircularPropagation.ag$a(sArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(this.values));
    }
}
