package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import o.Fragment;
import o.FragmentActivity;
import o.FragmentAnim;
import o.onStateNotSaved;
/* loaded from: classes4.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    private static Method sGetFileDescriptorMethod;
    private final FragmentAnim.AnonymousClass3 mWebpBitmapFactory = FragmentAnim.AnonymousClass2.AnonymousClass1.valueOf();

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeByteArrayAsPurgeable(FragmentActivity.AnonymousClass1<PooledByteBuffer> anonymousClass1, BitmapFactory.Options options) {
        return decodeFileDescriptorAsPurgeable(anonymousClass1, anonymousClass1.HaptikSDK$c().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeJPEGByteArrayAsPurgeable(FragmentActivity.AnonymousClass1<PooledByteBuffer> anonymousClass1, int i, BitmapFactory.Options options) {
        return decodeFileDescriptorAsPurgeable(anonymousClass1, i, endsWithEOI(anonymousClass1, i) ? null : EOI, options);
    }

    private static MemoryFile copyToMemoryFile(FragmentActivity.AnonymousClass1<PooledByteBuffer> anonymousClass1, int i, byte[] bArr) throws IOException {
        OutputStream outputStream;
        FragmentActivity.HostCallbacks hostCallbacks;
        onStateNotSaved onstatenotsaved = null;
        r3 = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            onStateNotSaved onstatenotsaved2 = new onStateNotSaved(anonymousClass1.HaptikSDK$c());
            try {
                hostCallbacks = new FragmentActivity.HostCallbacks(onstatenotsaved2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    Fragment.AnonymousClass5.toString(hostCallbacks, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    FragmentActivity.AnonymousClass1.valueOf(anonymousClass1);
                    Fragment.AnonymousClass2.valueOf(onstatenotsaved2);
                    Fragment.AnonymousClass2.valueOf(hostCallbacks);
                    Fragment.AnonymousClass2.ag$a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    onstatenotsaved = onstatenotsaved2;
                    FragmentActivity.AnonymousClass1.valueOf(anonymousClass1);
                    Fragment.AnonymousClass2.valueOf(onstatenotsaved);
                    Fragment.AnonymousClass2.valueOf(hostCallbacks);
                    Fragment.AnonymousClass2.ag$a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                hostCallbacks = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            hostCallbacks = null;
        }
    }

    private Method getFileDescriptorMethod() {
        Method method;
        synchronized (this) {
            if (sGetFileDescriptorMethod == null) {
                try {
                    sGetFileDescriptorMethod = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
                } catch (Exception e) {
                    throw Fragment.OnPreAttachedListener.ag$a(e);
                }
            }
            method = sGetFileDescriptorMethod;
        }
        return method;
    }

    private FileDescriptor getMemoryFileDescriptor(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) getFileDescriptorMethod().invoke(memoryFile, new Object[0]).getClass();
        } catch (Exception e) {
            throw Fragment.OnPreAttachedListener.ag$a(e);
        }
    }

    private Bitmap decodeFileDescriptorAsPurgeable(FragmentActivity.AnonymousClass1<PooledByteBuffer> anonymousClass1, int i, byte[] bArr, BitmapFactory.Options options) {
        Throwable th;
        MemoryFile memoryFile;
        MemoryFile memoryFile2 = null;
        try {
            try {
                memoryFile = copyToMemoryFile(anonymousClass1, i, bArr);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
            memoryFile = memoryFile2;
        }
        try {
            FileDescriptor memoryFileDescriptor = getMemoryFileDescriptor(memoryFile);
            FragmentAnim.AnonymousClass3 anonymousClass3 = this.mWebpBitmapFactory;
            if (anonymousClass3 != null) {
                Bitmap bitmap = (Bitmap) Fragment.AnonymousClass8.values(anonymousClass3.decodeFileDescriptor(memoryFileDescriptor, null, options), "BitmapFactory returned null");
                if (memoryFile != null) {
                    memoryFile.close();
                }
                return bitmap;
            }
            throw new IllegalStateException("WebpBitmapFactory is null");
        } catch (IOException e2) {
            e = e2;
            memoryFile2 = memoryFile;
            throw Fragment.OnPreAttachedListener.ag$a(e);
        } catch (Throwable th3) {
            th = th3;
            if (memoryFile != null) {
                memoryFile.close();
            }
            throw th;
        }
    }
}
