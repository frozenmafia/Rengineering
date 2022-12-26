package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import o.getAdapters;
/* loaded from: classes7.dex */
final class LongAdder extends Striped64 implements Serializable, getAdapters {
    private static final long serialVersionUID = 7249069246863182397L;

    @Override // com.google.common.hash.Striped64
    final long fn(long j, long j2) {
        return j + j2;
    }

    @Override // o.getAdapters
    public void add(long j) {
        int length;
        Striped64$ah$a striped64$ah$a;
        Striped64$ah$a[] striped64$ah$aArr = this.cells;
        if (striped64$ah$aArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = threadHashCode.get();
        boolean z = true;
        if (iArr != null && striped64$ah$aArr != null && (length = striped64$ah$aArr.length) >= 1 && (striped64$ah$a = striped64$ah$aArr[(length - 1) & iArr[0]]) != null) {
            long j3 = striped64$ah$a.valueOf;
            z = striped64$ah$a.valueOf(j3, j3 + j);
            if (z) {
                return;
            }
        }
        retryUpdate(j, iArr, z);
    }

    @Override // o.getAdapters
    public void increment() {
        add(1L);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // o.getAdapters
    public long sum() {
        long j = this.base;
        Striped64$ah$a[] striped64$ah$aArr = this.cells;
        if (striped64$ah$aArr != null) {
            for (Striped64$ah$a striped64$ah$a : striped64$ah$aArr) {
                if (striped64$ah$a != null) {
                    j += striped64$ah$a.valueOf;
                }
            }
        }
        return j;
    }

    public void reset() {
        internalReset(0L);
    }

    public long sumThenReset() {
        long j = this.base;
        Striped64$ah$a[] striped64$ah$aArr = this.cells;
        this.base = 0L;
        if (striped64$ah$aArr != null) {
            for (Striped64$ah$a striped64$ah$a : striped64$ah$aArr) {
                if (striped64$ah$a != null) {
                    j += striped64$ah$a.valueOf;
                    striped64$ah$a.valueOf = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) sum();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = objectInputStream.readLong();
    }
}
