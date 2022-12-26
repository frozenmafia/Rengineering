package com.facebook.imagepipeline.cache;

import java.util.LinkedHashSet;
/* loaded from: classes4.dex */
public class BoundedLinkedHashSet<E> {
    private LinkedHashSet<E> mLinkedHashSet;
    private int mMaxSize;

    public BoundedLinkedHashSet(int i) {
        this.mLinkedHashSet = new LinkedHashSet<>(i);
        this.mMaxSize = i;
    }

    public boolean contains(E e) {
        boolean contains;
        synchronized (this) {
            contains = this.mLinkedHashSet.contains(e);
        }
        return contains;
    }

    public boolean add(E e) {
        boolean add;
        synchronized (this) {
            if (this.mLinkedHashSet.size() == this.mMaxSize) {
                LinkedHashSet<E> linkedHashSet = this.mLinkedHashSet;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.mLinkedHashSet.remove(e);
            add = this.mLinkedHashSet.add(e);
        }
        return add;
    }
}
