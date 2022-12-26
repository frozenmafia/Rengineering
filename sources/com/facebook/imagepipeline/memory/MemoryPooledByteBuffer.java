package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class MemoryPooledByteBuffer implements PooledByteBuffer {
    FragmentActivity.AnonymousClass1<MemoryChunk> mBufRef;
    private final int mSize;

    public MemoryPooledByteBuffer(FragmentActivity.AnonymousClass1<MemoryChunk> anonymousClass1, int i) {
        anonymousClass1.getClass();
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0 && i <= anonymousClass1.HaptikSDK$c().getSize()));
        this.mBufRef = anonymousClass1.clone();
        this.mSize = i;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public int size() {
        int i;
        synchronized (this) {
            ensureValid();
            i = this.mSize;
        }
        return i;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public byte read(int i) {
        byte read;
        synchronized (this) {
            ensureValid();
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i < this.mSize));
            read = this.mBufRef.HaptikSDK$c().read(i);
        }
        return read;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public int read(int i, byte[] bArr, int i2, int i3) {
        int read;
        synchronized (this) {
            ensureValid();
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i + i3 <= this.mSize));
            read = this.mBufRef.HaptikSDK$c().read(i, bArr, i2, i3);
        }
        return read;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public long getNativePtr() throws UnsupportedOperationException {
        long nativePtr;
        synchronized (this) {
            ensureValid();
            nativePtr = this.mBufRef.HaptikSDK$c().getNativePtr();
        }
        return nativePtr;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public ByteBuffer getByteBuffer() {
        ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = this.mBufRef.HaptikSDK$c().getByteBuffer();
        }
        return byteBuffer;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public boolean isClosed() {
        boolean ah$a;
        synchronized (this) {
            ah$a = FragmentActivity.AnonymousClass1.ah$a(this.mBufRef);
        }
        return !ah$a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            FragmentActivity.AnonymousClass1.valueOf(this.mBufRef);
            this.mBufRef = null;
        }
    }

    void ensureValid() {
        synchronized (this) {
            if (isClosed()) {
                throw new PooledByteBuffer.ClosedException();
            }
        }
    }

    FragmentActivity.AnonymousClass1<MemoryChunk> getCloseableReference() {
        return this.mBufRef;
    }
}
