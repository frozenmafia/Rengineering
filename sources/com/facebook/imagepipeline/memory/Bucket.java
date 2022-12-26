package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import o.Fragment;
import o.FragmentActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Bucket<V> {
    private static final String TAG = "BUCKET";
    private final boolean mFixBucketsReinitialization;
    final Queue mFreeList;
    private int mInUseLength;
    public final int mItemSize;
    public final int mMaxLength;

    public Bucket(int i, int i2, int i3, boolean z) {
        Fragment.AnonymousClass8.toString(i > 0);
        Fragment.AnonymousClass8.toString(i2 >= 0);
        Fragment.AnonymousClass8.toString(i3 >= 0);
        this.mItemSize = i;
        this.mMaxLength = i2;
        this.mFreeList = new LinkedList();
        this.mInUseLength = i3;
        this.mFixBucketsReinitialization = z;
    }

    public boolean isMaxLengthExceeded() {
        return this.mInUseLength + getFreeListSize() > this.mMaxLength;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getFreeListSize() {
        return this.mFreeList.size();
    }

    @Deprecated
    public V get() {
        V pop = pop();
        if (pop != null) {
            this.mInUseLength++;
        }
        return pop;
    }

    public V pop() {
        return (V) this.mFreeList.poll();
    }

    public void incrementInUseCount() {
        this.mInUseLength++;
    }

    public void release(V v) {
        v.getClass();
        if (this.mFixBucketsReinitialization) {
            Fragment.AnonymousClass8.toString(this.mInUseLength > 0);
            this.mInUseLength--;
            addToFreeList(v);
            return;
        }
        int i = this.mInUseLength;
        if (i > 0) {
            this.mInUseLength = i - 1;
            addToFreeList(v);
            return;
        }
        FragmentActivity.valueOf(TAG, "Tried to release value %s from an empty bucket!", v);
    }

    void addToFreeList(V v) {
        this.mFreeList.add(v);
    }

    public void decrementInUseCount() {
        Fragment.AnonymousClass8.toString(this.mInUseLength > 0);
        this.mInUseLength--;
    }

    public int getInUseCount() {
        return this.mInUseLength;
    }
}
