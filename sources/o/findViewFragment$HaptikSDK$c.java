package o;

import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.throwException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class findViewFragment$HaptikSDK$c {
    public static final findViewFragment$HaptikSDK$c ah$a = new findViewFragment$HaptikSDK$c();

    private findViewFragment$HaptikSDK$c() {
    }

    public final void values(OutputStream outputStream, JSONObject jSONObject) throws IOException {
        runAnimators.ag$a(outputStream, "stream");
        runAnimators.ag$a(jSONObject, "header");
        String jSONObject2 = jSONObject.toString();
        runAnimators.ah$a(jSONObject2, "header.toString()");
        byte[] bytes = jSONObject2.getBytes(ViewUtilsApi29.ah$b);
        runAnimators.ah$a(bytes, "(this as java.lang.String).getBytes(charset)");
        outputStream.write(0);
        outputStream.write((bytes.length >> 16) & 255);
        outputStream.write((bytes.length >> 8) & 255);
        outputStream.write((bytes.length >> 0) & 255);
        outputStream.write(bytes);
    }

    public final JSONObject toString(InputStream inputStream) throws IOException {
        runAnimators.ag$a(inputStream, "stream");
        if (inputStream.read() != 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            int read = inputStream.read();
            if (read == -1) {
                throwException.ag$a.toString(LoggingBehavior.CACHE, findViewFragment.values.valueOf(), "readHeader: stream.read returned -1 while reading header size");
                return null;
            }
            i2 = (i2 << 8) + (read & 255);
        }
        byte[] bArr = new byte[i2];
        while (i < i2) {
            int read2 = inputStream.read(bArr, i, i2 - i);
            if (read2 < 1) {
                throwException.valueOf valueof = throwException.ag$a;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String valueOf = findViewFragment.values.valueOf();
                valueof.toString(loggingBehavior, valueOf, "readHeader: stream.read stopped at " + i + " when expected " + i2);
                return null;
            }
            i += read2;
        }
        try {
            Object nextValue = new JSONTokener(new String(bArr, ViewUtilsApi29.ah$b)).nextValue();
            if (!(nextValue instanceof JSONObject)) {
                throwException.ag$a.toString(LoggingBehavior.CACHE, findViewFragment.values.valueOf(), runAnimators.values("readHeader: expected JSONObject, got ", (Object) nextValue.getClass().getCanonicalName()));
                return null;
            }
            return (JSONObject) nextValue;
        } catch (JSONException e) {
            throw new IOException(e.getMessage());
        }
    }
}
