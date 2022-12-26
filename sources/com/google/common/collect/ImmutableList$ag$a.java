package com.google.common.collect;

import o.getDiffCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ImmutableList$ag$a<E> extends getDiffCallback<E> {
    private final ImmutableList<E> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmutableList$ag$a(ImmutableList<E> immutableList, int i) {
        super(immutableList.size(), i);
        this.valueOf = immutableList;
    }

    @Override // o.getDiffCallback
    public E ah$a(int i) {
        return this.valueOf.get(i);
    }
}
