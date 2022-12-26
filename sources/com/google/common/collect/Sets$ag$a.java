package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Collection;
import o.removeViewIfHidden;
/* loaded from: classes5.dex */
public abstract class Sets$ag$a<E> extends AbstractSet<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: ah$a */
    public abstract removeViewIfHidden<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Sets$ag$a(Sets.AnonymousClass4 anonymousClass4) {
        this();
    }

    private Sets$ag$a() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }
}
