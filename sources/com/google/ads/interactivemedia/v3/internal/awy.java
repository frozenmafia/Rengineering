package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class awy extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return axb.h(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        atc.k(collection);
        return super.retainAll(collection);
    }
}
