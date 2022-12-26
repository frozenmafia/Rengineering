package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import o.Fragment;
import o.onGetHost;
/* loaded from: classes4.dex */
public class BitmapCounter {
    private int mCount;
    private final int mMaxCount;
    private final int mMaxSize;
    private long mSize;
    private final onGetHost<Bitmap> mUnpooledBitmapsReleaser;

    public BitmapCounter(int i, int i2) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i2 > 0));
        this.mMaxCount = i;
        this.mMaxSize = i2;
        this.mUnpooledBitmapsReleaser = new onGetHost<Bitmap>() { // from class: com.facebook.imagepipeline.memory.BitmapCounter.1
            @Override // o.onGetHost
            public void release(Bitmap bitmap) {
                try {
                    BitmapCounter.this.decrease(bitmap);
                } finally {
                    bitmap.recycle();
                }
            }
        };
    }

    public boolean increase(Bitmap bitmap) {
        synchronized (this) {
            int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
            int i = this.mCount;
            if (i < this.mMaxCount) {
                long j = this.mSize + sizeInBytes;
                if (j <= this.mMaxSize) {
                    this.mCount = i + 1;
                    this.mSize = j;
                    return true;
                }
            }
            return false;
        }
    }

    public void decrease(Bitmap bitmap) {
        synchronized (this) {
            int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
            Fragment.AnonymousClass8.valueOf(this.mCount > 0, "No bitmaps registered.");
            long j = sizeInBytes;
            Fragment.AnonymousClass8.ag$a(j <= this.mSize, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(sizeInBytes), Long.valueOf(this.mSize));
            this.mSize -= j;
            this.mCount--;
        }
    }

    public int getCount() {
        int i;
        synchronized (this) {
            i = this.mCount;
        }
        return i;
    }

    public long getSize() {
        long j;
        synchronized (this) {
            j = this.mSize;
        }
        return j;
    }

    public int getMaxCount() {
        int i;
        synchronized (this) {
            i = this.mMaxCount;
        }
        return i;
    }

    public int getMaxSize() {
        int i;
        synchronized (this) {
            i = this.mMaxSize;
        }
        return i;
    }

    public onGetHost<Bitmap> getReleaser() {
        return this.mUnpooledBitmapsReleaser;
    }
}
