package com.facebook.imagepipeline.memory;

import o.getSupportLoaderManager;
/* loaded from: classes4.dex */
public class AshmemMemoryChunkPool extends MemoryChunkPool {
    public AshmemMemoryChunkPool(getSupportLoaderManager getsupportloadermanager, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(getsupportloadermanager, poolParams, poolStatsTracker);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.MemoryChunkPool, com.facebook.imagepipeline.memory.BasePool
    public MemoryChunk alloc(int i) {
        return new AshmemMemoryChunk(i);
    }
}
