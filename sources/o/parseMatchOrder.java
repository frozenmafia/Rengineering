package o;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class parseMatchOrder extends fetchRemoveGhostMethod {
    private int toString;
    private final float[] valueOf;

    public parseMatchOrder(float[] fArr) {
        runAnimators.ag$a(fArr, "array");
        this.valueOf = fArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.toString < this.valueOf.length;
    }

    @Override // o.fetchRemoveGhostMethod
    public float ah$a() {
        try {
            float[] fArr = this.valueOf;
            int i = this.toString;
            this.toString = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.toString--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
