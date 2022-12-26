package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import o.getSupportLoaderManager;
/* loaded from: classes4.dex */
public class LruBitmapPool implements BitmapPool {
    private int mCurrentSize;
    private int mMaxBitmapSize;
    private final int mMaxPoolSize;
    private final PoolStatsTracker mPoolStatsTracker;
    protected final PoolBackend<Bitmap> mStrategy = new BitmapPoolBackend();

    public LruBitmapPool(int i, int i2, PoolStatsTracker poolStatsTracker, getSupportLoaderManager getsupportloadermanager) {
        this.mMaxPoolSize = i;
        this.mMaxBitmapSize = i2;
        this.mPoolStatsTracker = poolStatsTracker;
        if (getsupportloadermanager != null) {
            getsupportloadermanager.ag$a(this);
        }
    }

    @Override // o.onNewIntent
    public void trim(MemoryTrimType memoryTrimType) {
        trimTo((int) (this.mMaxPoolSize * (1.0d - memoryTrimType.getSuggestedTrimRatio())));
    }

    private void trimTo(int i) {
        Bitmap pop;
        synchronized (this) {
            while (this.mCurrentSize > i && (pop = this.mStrategy.pop()) != null) {
                int size = this.mStrategy.getSize(pop);
                this.mCurrentSize -= size;
                this.mPoolStatsTracker.onFree(size);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.getSupportFragmentManager
    public Bitmap get(int i) {
        synchronized (this) {
            int i2 = this.mCurrentSize;
            int i3 = this.mMaxPoolSize;
            if (i2 > i3) {
                trimTo(i3);
            }
            Bitmap bitmap = this.mStrategy.get(i);
            if (bitmap != null) {
                int size = this.mStrategy.getSize(bitmap);
                this.mCurrentSize -= size;
                this.mPoolStatsTracker.onValueReuse(size);
                return bitmap;
            }
            return alloc(i);
        }
    }

    private Bitmap alloc(int i) {
        this.mPoolStatsTracker.onAlloc(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    @Override // o.getSupportFragmentManager, o.onGetHost
    public void release(Bitmap bitmap) {
        int size = this.mStrategy.getSize(bitmap);
        if (size <= this.mMaxBitmapSize) {
            this.mPoolStatsTracker.onValueRelease(size);
            this.mStrategy.put(bitmap);
            synchronized (this) {
                this.mCurrentSize += size;
            }
        }
    }
}
