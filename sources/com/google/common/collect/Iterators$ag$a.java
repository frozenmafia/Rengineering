package com.google.common.collect;

import o.ChildHelper;
import o.getDiffCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Iterators$ag$a<T> extends getDiffCallback<T> {
    static final ChildHelper.Bucket<Object> valueOf = new Iterators$ag$a(new Object[0], 0, 0, 0);
    private final T[] ag$a;
    private final int values;

    Iterators$ag$a(T[] tArr, int i, int i2, int i3) {
        super(i2, i3);
        this.ag$a = tArr;
        this.values = i;
    }

    @Override // o.getDiffCallback
    public T ah$a(int i) {
        return this.ag$a[this.values + i];
    }
}
