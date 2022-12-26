package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import o.getSupportLoaderManager;
import o.markFragmentsCreated;
/* loaded from: classes4.dex */
public class GenericByteArrayPool extends BasePool<byte[]> implements markFragmentsCreated {
    private final int[] mBucketSizes;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getSizeInBytes(int i) {
        return i;
    }

    public GenericByteArrayPool(getSupportLoaderManager getsupportloadermanager, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(getsupportloadermanager, poolParams, poolStatsTracker);
        SparseIntArray sparseIntArray = (SparseIntArray) poolParams.bucketSizes.getClass();
        this.mBucketSizes = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.mBucketSizes[i] = sparseIntArray.keyAt(i);
        }
        initialize();
    }

    public int getMinBufferSize() {
        return this.mBucketSizes[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public byte[] alloc(int i) {
        return new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public void free(byte[] bArr) {
        bArr.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int getBucketedSize(int i) {
        int[] iArr;
        if (i <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.mBucketSizes) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getBucketedSizeForValue(byte[] bArr) {
        bArr.getClass();
        return bArr.length;
    }
}
