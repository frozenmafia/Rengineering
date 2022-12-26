package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import o.onGetWindowAnimations;
/* loaded from: classes4.dex */
class OOMSoftReferenceBucket<V> extends Bucket<V> {
    private LinkedList<onGetWindowAnimations<V>> mSpareReferences;

    public OOMSoftReferenceBucket(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.mSpareReferences = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    public V pop() {
        onGetWindowAnimations<V> ongetwindowanimations = (onGetWindowAnimations) this.mFreeList.poll();
        ongetwindowanimations.getClass();
        V valueOf = ongetwindowanimations.valueOf();
        ongetwindowanimations.ah$a();
        this.mSpareReferences.add(ongetwindowanimations);
        return valueOf;
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    void addToFreeList(V v) {
        onGetWindowAnimations<V> poll = this.mSpareReferences.poll();
        if (poll == null) {
            poll = new onGetWindowAnimations<>();
        }
        poll.ah$a(v);
        this.mFreeList.add(poll);
    }
}
