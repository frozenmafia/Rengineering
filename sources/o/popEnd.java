package o;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes7.dex */
public final class popEnd {
    private static final Class<?> ah$a;
    private static final ThreadLocal<SoftReference<byte[]>> toString = new ThreadLocal<>();
    private static final long valueOf;

    private static boolean toString(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    static {
        Class<?> ag$a = ag$a("java.io.FileOutputStream");
        ah$a = ag$a;
        valueOf = values(ag$a);
    }

    public static void values(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!ag$a(byteBuffer, outputStream)) {
                byte[] ah$a2 = ah$a(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), ah$a2.length);
                    byteBuffer.get(ah$a2, 0, min);
                    outputStream.write(ah$a2, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    private static byte[] ah$a(int i) {
        int max = Math.max(i, 1024);
        byte[] ag$a = ag$a();
        if (ag$a == null || toString(max, ag$a.length)) {
            ag$a = new byte[max];
            if (max <= 16384) {
                toString(ag$a);
            }
        }
        return ag$a;
    }

    private static byte[] ag$a() {
        SoftReference<byte[]> softReference = toString.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static void toString(byte[] bArr) {
        toString.set(new SoftReference<>(bArr));
    }

    private static boolean ag$a(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        Object invoke;
        long j = valueOf;
        if (j < 0 || !ah$a.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            invoke = lambda$insert$4.onXdkEvent.invoke(outputStream, j);
            writableByteChannel = (WritableByteChannel) invoke;
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel != null) {
            writableByteChannel.write(byteBuffer);
            return true;
        }
        return false;
    }

    private static Class<?> ag$a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static long values(Class<?> cls) {
        if (cls != null) {
            try {
                if (lambda$insert$4.valueOf()) {
                    return lambda$insert$4.valueOf(cls.getDeclaredField("channel"));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }
}
