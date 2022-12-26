package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.getChangePayload;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class EnumMultiset$ah$a<T> implements Iterator<T> {
    final /* synthetic */ EnumMultiset ag$a;
    int ah$a = 0;
    int valueOf = -1;

    abstract T ag$a(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public EnumMultiset$ah$a(EnumMultiset enumMultiset) {
        this.ag$a = enumMultiset;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (this.ah$a < this.ag$a.enumConstants.length) {
            int[] iArr = this.ag$a.counts;
            int i = this.ah$a;
            if (iArr[i] > 0) {
                return true;
            }
            this.ah$a = i + 1;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T ag$a = ag$a(this.ah$a);
        int i = this.ah$a;
        this.valueOf = i;
        this.ah$a = i + 1;
        return ag$a;
    }

    @Override // java.util.Iterator
    public void remove() {
        getChangePayload.toString(this.valueOf >= 0);
        if (this.ag$a.counts[this.valueOf] > 0) {
            EnumMultiset.access$210(this.ag$a);
            EnumMultiset enumMultiset = this.ag$a;
            EnumMultiset.access$322(enumMultiset, enumMultiset.counts[this.valueOf]);
            this.ag$a.counts[this.valueOf] = 0;
        }
        this.valueOf = -1;
    }
}
