package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import o.Fragment;
/* loaded from: classes4.dex */
public class BufferMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "BufferMemoryChunk";
    private ByteBuffer mBuffer;
    private final long mId = System.identityHashCode(this);
    private final int mSize;

    public BufferMemoryChunk(int i) {
        this.mBuffer = ByteBuffer.allocateDirect(i);
        this.mSize = i;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.mBuffer = null;
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mBuffer == null;
        }
        return z;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int getSize() {
        return this.mSize;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int write(int i, byte[] bArr, int i2, int i3) {
        int adjustByteCount;
        synchronized (this) {
            bArr.getClass();
            Fragment.AnonymousClass8.toString(!isClosed());
            this.mBuffer.getClass();
            adjustByteCount = MemoryChunkUtil.adjustByteCount(i, i3, this.mSize);
            MemoryChunkUtil.checkBounds(i, bArr.length, i2, adjustByteCount, this.mSize);
            this.mBuffer.position(i);
            this.mBuffer.put(bArr, i2, adjustByteCount);
        }
        return adjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int read(int i, byte[] bArr, int i2, int i3) {
        int adjustByteCount;
        synchronized (this) {
            bArr.getClass();
            Fragment.AnonymousClass8.toString(!isClosed());
            this.mBuffer.getClass();
            adjustByteCount = MemoryChunkUtil.adjustByteCount(i, i3, this.mSize);
            MemoryChunkUtil.checkBounds(i, bArr.length, i2, adjustByteCount, this.mSize);
            this.mBuffer.position(i);
            this.mBuffer.get(bArr, i2, adjustByteCount);
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
            if (i >= this.mSize) {
                z = false;
            }
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(z));
            this.mBuffer.getClass();
            b2 = this.mBuffer.get(i);
        }
        return b2;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public void copy(int i, MemoryChunk memoryChunk, int i2, int i3) {
        memoryChunk.getClass();
        if (memoryChunk.getUniqueId() == getUniqueId()) {
            Log.w(TAG, "Copying from BufferMemoryChunk " + Long.toHexString(getUniqueId()) + " to BufferMemoryChunk " + Long.toHexString(memoryChunk.getUniqueId()) + " which are the same ");
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

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public ByteBuffer getByteBuffer() {
        ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = this.mBuffer;
        }
        return byteBuffer;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getUniqueId() {
        return this.mId;
    }

    private void doCopy(int i, MemoryChunk memoryChunk, int i2, int i3) {
        if (!(memoryChunk instanceof BufferMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Fragment.AnonymousClass8.toString(!isClosed());
        Fragment.AnonymousClass8.toString(!memoryChunk.isClosed());
        this.mBuffer.getClass();
        MemoryChunkUtil.checkBounds(i, memoryChunk.getSize(), i2, i3, this.mSize);
        this.mBuffer.position(i);
        ByteBuffer byteBuffer = (ByteBuffer) memoryChunk.getByteBuffer().getClass();
        byteBuffer.position(i2);
        byte[] bArr = new byte[i3];
        this.mBuffer.get(bArr, 0, i3);
        byteBuffer.put(bArr, 0, i3);
    }
}
