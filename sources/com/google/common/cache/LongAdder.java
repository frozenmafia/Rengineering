package com.google.common.cache;

import com.google.common.cache.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import o.AdapterListUpdateCallback;
/* loaded from: classes7.dex */
final class LongAdder extends Striped64 implements Serializable, AdapterListUpdateCallback {
    private static final long serialVersionUID = 7249069246863182397L;

    @Override // com.google.common.cache.Striped64
    final long fn(long j, long j2) {
        return j + j2;
    }

    @Override // o.AdapterListUpdateCallback
    public void add(long j) {
        int length;
        Striped64.valueOf valueof;
        Striped64.valueOf[] valueofArr = this.cells;
        if (valueofArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = threadHashCode.get();
        boolean z = true;
        if (iArr != null && valueofArr != null && (length = valueofArr.length) >= 1 && (valueof = valueofArr[(length - 1) & iArr[0]]) != null) {
            long j3 = valueof.ag$a;
            z = valueof.toString(j3, j3 + j);
            if (z) {
                return;
            }
        }
        retryUpdate(j, iArr, z);
    }

    @Override // o.AdapterListUpdateCallback
    public void increment() {
        add(1L);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // o.AdapterListUpdateCallback
    public long sum() {
        long j = this.base;
        Striped64.valueOf[] valueofArr = this.cells;
        if (valueofArr != null) {
            for (Striped64.valueOf valueof : valueofArr) {
                if (valueof != null) {
                    j += valueof.ag$a;
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
        Striped64.valueOf[] valueofArr = this.cells;
        this.base = 0L;
        if (valueofArr != null) {
            for (Striped64.valueOf valueof : valueofArr) {
                if (valueof != null) {
                    j += valueof.ag$a;
                    valueof.ag$a = 0L;
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
