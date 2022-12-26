package o;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import o.getScaledVerticalScrollFactor;
import org.apache.http.message.TokenParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class getScaledVerticalScrollFactor$ah$a {
    private boolean HaptikSDK$b;
    private final long[] HaptikSDK$c;
    final /* synthetic */ getScaledVerticalScrollFactor ag$a;
    File[] ah$a;
    private long invoke;
    File[] toString;
    private getScaledVerticalScrollFactor.toString valueOf;
    private final String values;

    private getScaledVerticalScrollFactor$ah$a(getScaledVerticalScrollFactor getscaledverticalscrollfactor, String str) {
        this.ag$a = getscaledverticalscrollfactor;
        this.values = str;
        this.HaptikSDK$c = new long[getScaledVerticalScrollFactor.valueOf(getscaledverticalscrollfactor)];
        this.toString = new File[getScaledVerticalScrollFactor.valueOf(getscaledverticalscrollfactor)];
        this.ah$a = new File[getScaledVerticalScrollFactor.valueOf(getscaledverticalscrollfactor)];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < getScaledVerticalScrollFactor.valueOf(getscaledverticalscrollfactor); i++) {
            sb.append(i);
            this.toString[i] = new File(getScaledVerticalScrollFactor.toString(getscaledverticalscrollfactor), sb.toString());
            sb.append(".tmp");
            this.ah$a[i] = new File(getScaledVerticalScrollFactor.toString(getscaledverticalscrollfactor), sb.toString());
            sb.setLength(length);
        }
    }

    public String valueOf() throws IOException {
        long[] jArr;
        StringBuilder sb = new StringBuilder();
        for (long j : this.HaptikSDK$c) {
            sb.append(TokenParser.SP);
            sb.append(j);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(String[] strArr) throws IOException {
        if (strArr.length != getScaledVerticalScrollFactor.valueOf(this.ag$a)) {
            throw values(strArr);
        }
        for (int i = 0; i < strArr.length; i++) {
            try {
                this.HaptikSDK$c[i] = Long.parseLong(strArr[i]);
            } catch (NumberFormatException unused) {
                throw values(strArr);
            }
        }
    }

    private IOException values(String[] strArr) throws IOException {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    public File valueOf(int i) {
        return this.toString[i];
    }

    public File toString(int i) {
        return this.ah$a[i];
    }
}
