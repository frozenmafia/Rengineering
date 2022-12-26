package o;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class matchItemIds extends GhostView {
    private int valueOf;
    private final byte[] values;

    public matchItemIds(byte[] bArr) {
        runAnimators.ag$a(bArr, "array");
        this.values = bArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.valueOf < this.values.length;
    }

    @Override // o.GhostView
    public byte ah$a() {
        try {
            byte[] bArr = this.values;
            int i = this.valueOf;
            this.valueOf = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.valueOf--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
