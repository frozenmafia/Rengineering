package o;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes7.dex */
public final class findFirstKeyLessThan {
    private static final Class<?> ag$a;
    private static final long valueOf;
    private static final ThreadLocal<SoftReference<byte[]>> values = new ThreadLocal<>();

    private static boolean ag$a(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    static {
        Class<?> values2 = values("java.io.FileOutputStream");
        ag$a = values2;
        valueOf = ag$a(values2);
    }

    public static void values(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!toString(byteBuffer, outputStream)) {
                byte[] findfirstkeylessthan = toString(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), findfirstkeylessthan.length);
                    byteBuffer.get(findfirstkeylessthan, 0, min);
                    outputStream.write(findfirstkeylessthan, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    private static byte[] toString(int i) {
        int max = Math.max(i, 1024);
        byte[] ah$a = ah$a();
        if (ah$a == null || ag$a(max, ah$a.length)) {
            ah$a = new byte[max];
            if (max <= 16384) {
                ah$a(ah$a);
            }
        }
        return ah$a;
    }

    private static byte[] ah$a() {
        SoftReference<byte[]> softReference = values.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static void ah$a(byte[] bArr) {
        values.set(new SoftReference<>(bArr));
    }

    private static boolean toString(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        Object ah$b;
        long j = valueOf;
        if (j < 0 || !ag$a.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            ah$b = getSwipeVelocityThreshold.ak.ah$b(outputStream, j);
            writableByteChannel = (WritableByteChannel) ah$b;
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel != null) {
            writableByteChannel.write(byteBuffer);
            return true;
        }
        return false;
    }

    private static Class<?> values(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static long ag$a(Class<?> cls) {
        boolean z;
        if (cls != null) {
            try {
                z = getSwipeVelocityThreshold.HaptikSDK$e;
                if (z) {
                    return getSwipeVelocityThreshold.values(cls.getDeclaredField("channel"));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }
}
