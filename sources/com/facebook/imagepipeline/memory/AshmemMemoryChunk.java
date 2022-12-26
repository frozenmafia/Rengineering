package com.facebook.imagepipeline.memory;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import o.Fragment;
/* loaded from: classes4.dex */
public class AshmemMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "AshmemMemoryChunk";
    private ByteBuffer mByteBuffer;
    private final long mId;
    private SharedMemory mSharedMemory;

    public AshmemMemoryChunk(int i) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0));
        try {
            SharedMemory create = SharedMemory.create(TAG, i);
            this.mSharedMemory = create;
            this.mByteBuffer = create.mapReadWrite();
            this.mId = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    public AshmemMemoryChunk() {
        this.mSharedMemory = null;
        this.mByteBuffer = null;
        this.mId = System.identityHashCode(this);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.mSharedMemory;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.mByteBuffer;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.mByteBuffer = null;
                this.mSharedMemory = null;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            if (this.mByteBuffer != null) {
                z = this.mSharedMemory == null;
            }
        }
        return z;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int getSize() {
        this.mSharedMemory.getClass();
        return this.mSharedMemory.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int write(int i, byte[] bArr, int i2, int i3) {
        int adjustByteCount;
        synchronized (this) {
            bArr.getClass();
            this.mByteBuffer.getClass();
            adjustByteCount = MemoryChunkUtil.adjustByteCount(i, i3, getSize());
            MemoryChunkUtil.checkBounds(i, bArr.length, i2, adjustByteCount, getSize());
            this.mByteBuffer.position(i);
            this.mByteBuffer.put(bArr, i2, adjustByteCount);
        }
        return adjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int read(int i, byte[] bArr, int i2, int i3) {
        int adjustByteCount;
        synchronized (this) {
            bArr.getClass();
            this.mByteBuffer.getClass();
            adjustByteCount = MemoryChunkUtil.adjustByteCount(i, i3, getSize());
            MemoryChunkUtil.checkBounds(i, bArr.length, i2, adjustByteCount, getSize());
            this.mByteBuffer.position(i);
            this.mByteBuffer.get(bArr, i2, adjustByteCount);
        }
        return adjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public byte read(int i) {
        byte b2;
        synchronized (this) {
            boolean z = true;
            Fragment.AnonymousClass8.toString(!isClosed());
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
            if (i >= getSize()) {
                z = false;
            }
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(z));
            this.mByteBuffer.getClass();
            b2 = this.mByteBuffer.get(i);
        }
        return b2;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public ByteBuffer getByteBuffer() {
        return this.mByteBuffer;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getUniqueId() {
        return this.mId;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public void copy(int i, MemoryChunk memoryChunk, int i2, int i3) {
        memoryChunk.getClass();
        if (memoryChunk.getUniqueId() == getUniqueId()) {
            Log.w(TAG, "Copying from AshmemMemoryChunk " + Long.toHexString(getUniqueId()) + " to AshmemMemoryChunk " + Long.toHexString(memoryChunk.getUniqueId()) + " which are the same ");
            Fragment.AnonymousClass8.valueOf(false);
        }
        if (memoryChunk.getUniqueId() < getUniqueId()) {
            synchronized (memoryChunk) {
                synchronized (this) {
                    doCopy(i, memoryChunk, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (memoryChunk) {
                doCopy(i, memoryChunk, i2, i3);
            }
        }
    }

    private void doCopy(int i, MemoryChunk memoryChunk, int i2, int i3) {
        if (!(memoryChunk instanceof AshmemMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Fragment.AnonymousClass8.toString(!isClosed());
        Fragment.AnonymousClass8.toString(!memoryChunk.isClosed());
        this.mByteBuffer.getClass();
        memoryChunk.getByteBuffer().getClass();
        MemoryChunkUtil.checkBounds(i, memoryChunk.getSize(), i2, i3, getSize());
        this.mByteBuffer.position(i);
        memoryChunk.getByteBuffer().position(i2);
        byte[] bArr = new byte[i3];
        this.mByteBuffer.get(bArr, 0, i3);
        memoryChunk.getByteBuffer().put(bArr, 0, i3);
    }
}
