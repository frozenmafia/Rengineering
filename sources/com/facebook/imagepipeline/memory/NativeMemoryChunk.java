package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader;
import java.io.Closeable;
import java.nio.ByteBuffer;
import o.ComputableLiveData;
import o.Fragment;
/* loaded from: classes4.dex */
public class NativeMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "NativeMemoryChunk";
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    private static native long nativeAllocate(int i);

    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeFree(long j);

    private static native void nativeMemcpy(long j, long j2, int i);

    private static native byte nativeReadByte(long j);

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public ByteBuffer getByteBuffer() {
        return null;
    }

    static {
        ComputableLiveData.values(ImagePipelineNativeLoader.DSO_NAME);
    }

    public NativeMemoryChunk(int i) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0));
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
    }

    public NativeMemoryChunk() {
        this.mSize = 0;
        this.mNativePtr = 0L;
        this.mIsClosed = true;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.mIsClosed) {
                this.mIsClosed = true;
                nativeFree(this.mNativePtr);
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mIsClosed;
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
            adjustByteCount = MemoryChunkUtil.adjustByteCount(i, i3, this.mSize);
            MemoryChunkUtil.checkBounds(i, bArr.length, i2, adjustByteCount, this.mSize);
            nativeCopyFromByteArray(this.mNativePtr + i, bArr, i2, adjustByteCount);
        }
        return adjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int read(int i, byte[] bArr, int i2, int i3) {
        int adjustByteCount;
        synchronized (this) {
            bArr.getClass();
            Fragment.AnonymousClass8.toString(!isClosed());
            adjustByteCount = MemoryChunkUtil.adjustByteCount(i, i3, this.mSize);
            MemoryChunkUtil.checkBounds(i, bArr.length, i2, adjustByteCount, this.mSize);
            nativeCopyToByteArray(this.mNativePtr + i, bArr, i2, adjustByteCount);
        }
        return adjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public byte read(int i) {
        byte nativeReadByte;
        synchronized (this) {
            boolean z = true;
            Fragment.AnonymousClass8.toString(!isClosed());
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
            if (i >= this.mSize) {
                z = false;
            }
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(z));
            nativeReadByte = nativeReadByte(this.mNativePtr + i);
        }
        return nativeReadByte;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getNativePtr() {
        return this.mNativePtr;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getUniqueId() {
        return this.mNativePtr;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public void copy(int i, MemoryChunk memoryChunk, int i2, int i3) {
        memoryChunk.getClass();
        if (memoryChunk.getUniqueId() == getUniqueId()) {
            Log.w(TAG, "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(memoryChunk)) + " which share the same address " + Long.toHexString(this.mNativePtr));
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
        if (!(memoryChunk instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Fragment.AnonymousClass8.toString(!isClosed());
        Fragment.AnonymousClass8.toString(!memoryChunk.isClosed());
        MemoryChunkUtil.checkBounds(i, memoryChunk.getSize(), i2, i3, this.mSize);
        nativeMemcpy(memoryChunk.getNativePtr() + i2, this.mNativePtr + i, i3);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w(TAG, "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
