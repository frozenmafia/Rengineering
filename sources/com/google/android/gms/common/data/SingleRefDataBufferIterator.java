package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            int i = this.zab;
            throw new NoSuchElementException("Cannot advance the iterator beyond " + i);
        }
        int i2 = this.zab + 1;
        this.zab = i2;
        if (i2 == 0) {
            Object checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = checkNotNull;
            if (!(checkNotNull instanceof DataBufferRef)) {
                String valueOf = String.valueOf(checkNotNull.getClass());
                throw new IllegalStateException("DataBuffer reference of type " + valueOf + " is not movable");
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
