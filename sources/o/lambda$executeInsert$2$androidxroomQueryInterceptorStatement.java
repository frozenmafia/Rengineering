package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
/* renamed from: o.lambda$executeInsert$2$androidx-room-QueryInterceptorStatement  reason: invalid class name */
/* loaded from: classes7.dex */
public class lambda$executeInsert$2$androidxroomQueryInterceptorStatement {
    public static byte[] valueOf(byte[] bArr) throws IOException {
        Deflater deflater;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            deflater = new Deflater(8, true);
            try {
                DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream2.write(bArr);
                    deflaterOutputStream2.close();
                    deflater.end();
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    deflaterOutputStream = deflaterOutputStream2;
                    if (deflaterOutputStream != null) {
                        deflaterOutputStream.close();
                    }
                    if (deflater != null) {
                        deflater.end();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            deflater = null;
        }
    }

    public static byte[] ah$a(byte[] bArr) throws IOException {
        Inflater inflater;
        InflaterInputStream inflaterInputStream = null;
        try {
            inflater = new Inflater(true);
            try {
                InflaterInputStream inflaterInputStream2 = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = inflaterInputStream2.read(bArr2);
                        if (read > 0) {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream2.close();
                            inflater.end();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inflaterInputStream = inflaterInputStream2;
                    if (inflaterInputStream != null) {
                        inflaterInputStream.close();
                    }
                    if (inflater != null) {
                        inflater.end();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inflater = null;
        }
    }
}
