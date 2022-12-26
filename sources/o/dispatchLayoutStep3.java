package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class dispatchLayoutStep3 implements predictiveItemAnimationsEnabled {
    private final String toString;
    private final String valueOf;
    private final byte[] values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dispatchLayoutStep3(String str, String str2, byte[] bArr) {
        this.valueOf = str;
        this.toString = str2;
        this.values = bArr;
    }

    @Override // o.predictiveItemAnimationsEnabled
    public String valueOf() {
        return this.toString;
    }

    @Override // o.predictiveItemAnimationsEnabled
    public InputStream ag$a() {
        if (HaptikSDK$a()) {
            return null;
        }
        return new ByteArrayInputStream(this.values);
    }

    @Override // o.predictiveItemAnimationsEnabled
    public CrashlyticsReport.values.toString values() {
        byte[] ah$a = ah$a();
        if (ah$a == null) {
            return null;
        }
        return CrashlyticsReport.values.toString.ag$a().values(ah$a).values(this.valueOf).values();
    }

    private boolean HaptikSDK$a() {
        byte[] bArr = this.values;
        return bArr == null || bArr.length == 0;
    }

    private byte[] ah$a() {
        if (HaptikSDK$a()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.values);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
