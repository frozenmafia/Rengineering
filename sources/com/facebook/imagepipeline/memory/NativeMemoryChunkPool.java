package com.facebook.imagepipeline.memory;

import o.getSupportLoaderManager;
/* loaded from: classes4.dex */
public class NativeMemoryChunkPool extends MemoryChunkPool {
    public NativeMemoryChunkPool(getSupportLoaderManager getsupportloadermanager, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(getsupportloadermanager, poolParams, poolStatsTracker);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.MemoryChunkPool, com.facebook.imagepipeline.memory.BasePool
    public MemoryChunk alloc(int i) {
        return new NativeMemoryChunk(i);
    }
}
