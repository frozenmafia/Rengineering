package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import o.getSupportLoaderManager;
/* loaded from: classes4.dex */
public class BucketsBitmapPool extends BasePool<Bitmap> implements BitmapPool {
    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int getBucketedSize(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int getSizeInBytes(int i) {
        return i;
    }

    public BucketsBitmapPool(getSupportLoaderManager getsupportloadermanager, PoolParams poolParams, PoolStatsTracker poolStatsTracker, boolean z) {
        super(getsupportloadermanager, poolParams, poolStatsTracker, z);
        initialize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public Bitmap alloc(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public void free(Bitmap bitmap) {
        bitmap.getClass();
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getBucketedSizeForValue(Bitmap bitmap) {
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public boolean isReusable(Bitmap bitmap) {
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public Bitmap getValue(Bucket<Bitmap> bucket) {
        Bitmap bitmap = (Bitmap) super.getValue((Bucket<Object>) bucket);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }
}
