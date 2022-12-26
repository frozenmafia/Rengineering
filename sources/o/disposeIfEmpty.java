package o;

import java.util.Iterator;
/* loaded from: classes5.dex */
public final class disposeIfEmpty<T> implements ViewOverlayApi14<T> {
    private final invalidateChildInParent<T> ag$a;
    private final int values;

    /* JADX WARN: Multi-variable type inference failed */
    public disposeIfEmpty(invalidateChildInParent<? extends T> invalidatechildinparent, int i) {
        runAnimators.ag$a(invalidatechildinparent, com.apxor.androidsdk.core.ce.Constants.SEQUENCE_NO);
        this.ag$a = invalidatechildinparent;
        this.values = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.ViewOverlayApi14
    public invalidateChildInParent<T> toString(int i) {
        int i2 = this.values + i;
        return i2 < 0 ? new disposeIfEmpty(this, i) : new disposeIfEmpty(this.ag$a, i2);
    }

    @Override // o.invalidateChildInParent
    public Iterator<T> iterator() {
        return new disposeIfEmpty$ag$a(this);
    }
}
