package o;

import com.nimbusds.jose.util.IntegerOverflowException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* renamed from: o.lambda$execute$0$androidx-room-QueryInterceptorStatement  reason: invalid class name */
/* loaded from: classes7.dex */
public class lambda$execute$0$androidxroomQueryInterceptorStatement {
    public static int ah$a(int i) {
        return i * 8;
    }

    public static byte[] values(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public static byte[] toString(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int valueOf(int i) throws IntegerOverflowException {
        long j = i * 8;
        int i2 = (int) j;
        if (i2 == j) {
            return i2;
        }
        throw new IntegerOverflowException();
    }

    public static int ag$a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return ah$a(bArr.length);
    }

    public static int valueOf(byte[] bArr) throws IntegerOverflowException {
        if (bArr == null) {
            return 0;
        }
        return valueOf(bArr.length);
    }

    public static int ag$a(int i) {
        return i / 8;
    }
}
