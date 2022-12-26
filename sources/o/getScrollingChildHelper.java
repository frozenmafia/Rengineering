package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class getScrollingChildHelper implements predictiveItemAnimationsEnabled {
    private final File ah$a;
    private final String toString;
    private final String valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getScrollingChildHelper(String str, String str2, File file) {
        this.toString = str;
        this.valueOf = str2;
        this.ah$a = file;
    }

    @Override // o.predictiveItemAnimationsEnabled
    public String valueOf() {
        return this.valueOf;
    }

    @Override // o.predictiveItemAnimationsEnabled
    public InputStream ag$a() {
        if (this.ah$a.exists() && this.ah$a.isFile()) {
            try {
                return new FileInputStream(this.ah$a);
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // o.predictiveItemAnimationsEnabled
    public CrashlyticsReport.values.toString values() {
        byte[] ah$a = ah$a();
        if (ah$a != null) {
            return CrashlyticsReport.values.toString.ag$a().values(ah$a).values(this.toString).values();
        }
        return null;
    }

    private byte[] ah$a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream ag$a = ag$a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (ag$a != null) {
                while (true) {
                    try {
                        int read = ag$a.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        gZIPOutputStream.write(bArr, 0, read);
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (ag$a != null) {
                    ag$a.close();
                }
                return byteArray;
            }
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (ag$a != null) {
                ag$a.close();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
