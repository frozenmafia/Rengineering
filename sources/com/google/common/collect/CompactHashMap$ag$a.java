package com.google.common.collect;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.getChangePayload;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class CompactHashMap$ag$a<T> implements Iterator<T> {
    int ag$a;
    int ah$a;
    int valueOf;
    final /* synthetic */ CompactHashMap values;

    abstract T values(int i);

    private CompactHashMap$ag$a(CompactHashMap compactHashMap) {
        int i;
        this.values = compactHashMap;
        i = compactHashMap.metadata;
        this.valueOf = i;
        this.ag$a = compactHashMap.firstEntryIndex();
        this.ah$a = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ag$a >= 0;
    }

    @Override // java.util.Iterator
    public T next() {
        ah$a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.ag$a;
        this.ah$a = i;
        T values = values(i);
        this.ag$a = this.values.getSuccessor(this.ag$a);
        return values;
    }

    @Override // java.util.Iterator
    public void remove() {
        ah$a();
        getChangePayload.toString(this.ah$a >= 0);
        values();
        CompactHashMap compactHashMap = this.values;
        compactHashMap.remove(compactHashMap.key(this.ah$a));
        this.ag$a = this.values.adjustAfterRemove(this.ag$a, this.ah$a);
        this.ah$a = -1;
    }

    void values() {
        this.valueOf += 32;
    }

    private void ah$a() {
        int i;
        i = this.values.metadata;
        if (i != this.valueOf) {
            throw new ConcurrentModificationException();
        }
    }
}
