package o;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class onProgress implements ViewGroupKt<InputStream> {
    private final rotationXBy toString;

    public onProgress(rotationXBy rotationxby) {
        this.toString = rotationxby;
    }

    @Override // o.ViewGroupKt
    /* renamed from: ag$a */
    public boolean ah$a(InputStream inputStream, File file, setMargins setmargins) {
        FileOutputStream fileOutputStream;
        byte[] bArr = (byte[]) this.toString.ah$a(65536, byte[].class);
        boolean z = true;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                        this.toString.ag$a(bArr);
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.toString.ag$a(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            } catch (IOException e2) {
                e = e2;
            }
            this.toString.ag$a(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
