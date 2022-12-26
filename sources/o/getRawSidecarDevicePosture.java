package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
/* loaded from: classes5.dex */
public final class getRawSidecarDevicePosture {
    private final String[] HaptikSDK$b;
    private final Reader HaptikSDK$c;
    private int ag$a;
    private int ah$a;
    private int invoke;
    private int toString;
    private final char[] valueOf;
    private int values;

    public getRawSidecarDevicePosture(Reader reader, int i) {
        this.HaptikSDK$b = new String[512];
        isWindowLayoutProviderValid.ag$a(reader);
        isWindowLayoutProviderValid.toString(reader.markSupported());
        this.HaptikSDK$c = reader;
        this.valueOf = new char[i > 32768 ? 32768 : i];
        ak();
    }

    public getRawSidecarDevicePosture(Reader reader) {
        this(reader, 32768);
    }

    public getRawSidecarDevicePosture(String str) {
        this(new StringReader(str), str.length());
    }

    private void ak() {
        int i = this.values;
        if (i < this.ah$a) {
            return;
        }
        try {
            this.invoke += i;
            this.HaptikSDK$c.skip(i);
            this.HaptikSDK$c.mark(32768);
            this.ag$a = this.HaptikSDK$c.read(this.valueOf);
            this.HaptikSDK$c.reset();
            this.values = 0;
            this.toString = 0;
            int i2 = this.ag$a;
            if (i2 > 24576) {
                i2 = 24576;
            }
            this.ah$a = i2;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public int isLogoutPending() {
        return this.invoke + this.values;
    }

    public boolean getSignupData() {
        return this.values >= this.ag$a;
    }

    public char HaptikWebView() {
        ak();
        if (getSignupData()) {
            return (char) 65535;
        }
        return this.valueOf[this.values];
    }

    public char ah$a() {
        ak();
        char c = getSignupData() ? (char) 65535 : this.valueOf[this.values];
        this.values++;
        return c;
    }

    public void onXdkEvent() {
        this.values--;
    }

    public void ag$a() {
        this.values++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$e() {
        this.toString = this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.values = this.toString;
    }

    int toString(char c) {
        ak();
        for (int i = this.values; i < this.ag$a; i++) {
            if (c == this.valueOf[i]) {
                return i - this.values;
            }
        }
        return -1;
    }

    int valueOf(CharSequence charSequence) {
        ak();
        char charAt = charSequence.charAt(0);
        int i = this.values;
        while (i < this.ag$a) {
            if (charAt != this.valueOf[i]) {
                do {
                    i++;
                    if (i >= this.ag$a) {
                        break;
                    }
                } while (charAt != this.valueOf[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.ag$a;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.valueOf[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.values;
                }
            }
            i = i2;
        }
        return -1;
    }

    public String values(char c) {
        int getrawsidecardeviceposture = toString(c);
        if (getrawsidecardeviceposture != -1) {
            String ah$a = ah$a(this.valueOf, this.HaptikSDK$b, this.values, getrawsidecardeviceposture);
            this.values += getrawsidecardeviceposture;
            return ah$a;
        }
        return ah$b();
    }

    public String toString(String str) {
        int valueOf = valueOf((CharSequence) str);
        if (valueOf != -1) {
            String ah$a = ah$a(this.valueOf, this.HaptikSDK$b, this.values, valueOf);
            this.values += valueOf;
            return ah$a;
        }
        return ah$b();
    }

    public String ah$a(char... cArr) {
        ak();
        int i = this.values;
        int i2 = this.ag$a;
        char[] cArr2 = this.valueOf;
        loop0: while (this.values < i2) {
            for (char c : cArr) {
                if (cArr2[this.values] == c) {
                    break loop0;
                }
            }
            this.values++;
        }
        int i3 = this.values;
        return i3 > i ? ah$a(this.valueOf, this.HaptikSDK$b, i, i3 - i) : "";
    }

    public String ag$a(char... cArr) {
        ak();
        int i = this.values;
        int i2 = this.ag$a;
        char[] cArr2 = this.valueOf;
        while (true) {
            int i3 = this.values;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.values++;
        }
        int i4 = this.values;
        return i4 > i ? ah$a(this.valueOf, this.HaptikSDK$b, i, i4 - i) : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        return ah$a(r6.valueOf, r6.HaptikSDK$b, r0, r3 - r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String values() {
        /*
            r6 = this;
            r6.ak()
            int r0 = r6.values
            int r1 = r6.ag$a
            char[] r2 = r6.valueOf
        L9:
            int r3 = r6.values
            if (r3 >= r1) goto L1f
            char r4 = r2[r3]
            r5 = 38
            if (r4 == r5) goto L1f
            r5 = 60
            if (r4 == r5) goto L1f
            if (r4 != 0) goto L1a
            goto L1f
        L1a:
            int r3 = r3 + 1
            r6.values = r3
            goto L9
        L1f:
            if (r3 <= r0) goto L2b
            char[] r1 = r6.valueOf
            java.lang.String[] r2 = r6.HaptikSDK$b
            int r3 = r3 - r0
            java.lang.String r0 = ah$a(r1, r2, r0, r3)
            goto L2d
        L2b:
            java.lang.String r0 = ""
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRawSidecarDevicePosture.values():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return ah$a(r6.valueOf, r6.HaptikSDK$b, r0, r3 - r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String HaptikSDK$b() {
        /*
            r6 = this;
            r6.ak()
            int r0 = r6.values
            int r1 = r6.ag$a
            char[] r2 = r6.valueOf
        L9:
            int r3 = r6.values
            if (r3 >= r1) goto L33
            char r4 = r2[r3]
            r5 = 9
            if (r4 == r5) goto L33
            r5 = 10
            if (r4 == r5) goto L33
            r5 = 13
            if (r4 == r5) goto L33
            r5 = 12
            if (r4 == r5) goto L33
            r5 = 32
            if (r4 == r5) goto L33
            r5 = 47
            if (r4 == r5) goto L33
            r5 = 62
            if (r4 == r5) goto L33
            if (r4 != 0) goto L2e
            goto L33
        L2e:
            int r3 = r3 + 1
            r6.values = r3
            goto L9
        L33:
            if (r3 <= r0) goto L3f
            char[] r1 = r6.valueOf
            java.lang.String[] r2 = r6.HaptikSDK$b
            int r3 = r3 - r0
            java.lang.String r0 = ah$a(r1, r2, r0, r3)
            goto L41
        L3f:
            java.lang.String r0 = ""
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRawSidecarDevicePosture.HaptikSDK$b():java.lang.String");
    }

    String ah$b() {
        ak();
        char[] cArr = this.valueOf;
        String[] strArr = this.HaptikSDK$b;
        int i = this.values;
        String ah$a = ah$a(cArr, strArr, i, this.ag$a - i);
        this.values = this.ag$a;
        return ah$a;
    }

    public String HaptikSDK$c() {
        char c;
        ak();
        int i = this.values;
        while (true) {
            int i2 = this.values;
            if (i2 >= this.ag$a || (((c = this.valueOf[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.values++;
        }
        return ah$a(this.valueOf, this.HaptikSDK$b, i, this.values - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String HaptikSDK$a() {
        char c;
        ak();
        int i = this.values;
        while (true) {
            int i2 = this.values;
            if (i2 >= this.ag$a || (((c = this.valueOf[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.values++;
        }
        while (!getSignupData()) {
            char[] cArr = this.valueOf;
            int i3 = this.values;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.values = i3 + 1;
        }
        return ah$a(this.valueOf, this.HaptikSDK$b, i, this.values - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String invoke() {
        int i;
        char c;
        ak();
        int i2 = this.values;
        while (true) {
            i = this.values;
            if (i >= this.ag$a || (((c = this.valueOf[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.values = i + 1;
        }
        return ah$a(this.valueOf, this.HaptikSDK$b, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String valueOf() {
        int i;
        char c;
        ak();
        int i2 = this.values;
        while (true) {
            i = this.values;
            if (i >= this.ag$a || (c = this.valueOf[i]) < '0' || c > '9') {
                break;
            }
            this.values = i + 1;
        }
        return ah$a(this.valueOf, this.HaptikSDK$b, i2, i - i2);
    }

    public boolean valueOf(char c) {
        return !getSignupData() && this.valueOf[this.values] == c;
    }

    boolean values(String str) {
        ak();
        int length = str.length();
        if (length > this.ag$a - this.values) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.valueOf[this.values + i]) {
                return false;
            }
        }
        return true;
    }

    boolean HaptikSDK$c(String str) {
        ak();
        int length = str.length();
        if (length > this.ag$a - this.values) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.valueOf[this.values + i])) {
                return false;
            }
        }
        return true;
    }

    public boolean values(char... cArr) {
        if (getSignupData()) {
            return false;
        }
        ak();
        char c = this.valueOf[this.values];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean toString(char[] cArr) {
        ak();
        return !getSignupData() && Arrays.binarySearch(cArr, this.valueOf[this.values]) >= 0;
    }

    public boolean HaptikSDK$d() {
        if (getSignupData()) {
            return false;
        }
        char c = this.valueOf[this.values];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getInitSettings() {
        char c;
        return !getSignupData() && (c = this.valueOf[this.values]) >= '0' && c <= '9';
    }

    public boolean valueOf(String str) {
        ak();
        if (values(str)) {
            this.values += str.length();
            return true;
        }
        return false;
    }

    public boolean ah$a(String str) {
        if (HaptikSDK$c(str)) {
            this.values += str.length();
            return true;
        }
        return false;
    }

    public boolean ag$a(String str) {
        return valueOf((CharSequence) str.toLowerCase(Locale.ENGLISH)) > -1 || valueOf((CharSequence) str.toUpperCase(Locale.ENGLISH)) > -1;
    }

    public String toString() {
        char[] cArr = this.valueOf;
        int i = this.values;
        return new String(cArr, i, this.ag$a - i);
    }

    private static String ah$a(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        } else if (ag$a(cArr, i, i2, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i, i2);
            strArr[length] = str3;
            return str3;
        }
    }

    static boolean ag$a(char[] cArr, int i, int i2, String str) {
        if (i2 == str.length()) {
            int i3 = 0;
            while (i2 != 0) {
                if (cArr[i] != str.charAt(i3)) {
                    return false;
                }
                i++;
                i2--;
                i3++;
            }
            return true;
        }
        return false;
    }
}
