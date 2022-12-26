package o;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes7.dex */
public class processAdapterUpdatesAndSetAnimationFlags {
    processAdapterUpdatesAndSetAnimationFlags() {
    }

    public static void ah$a(File file, List<predictiveItemAnimationsEnabled> list) {
        for (predictiveItemAnimationsEnabled predictiveitemanimationsenabled : list) {
            InputStream inputStream = null;
            try {
                inputStream = predictiveitemanimationsenabled.ag$a();
                if (inputStream != null) {
                    toString(inputStream, new File(file, predictiveitemanimationsenabled.valueOf()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.ag$a(inputStream);
                throw th;
            }
            CommonUtils.ag$a(inputStream);
        }
    }

    private static void toString(InputStream inputStream, File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        CommonUtils.ag$a(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.ag$a(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
