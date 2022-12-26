package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class setBackgroundTintList implements Closeable, Flushable {
    private static final String[] ah$a = new String[128];
    private static final String[] valueOf;
    private final Writer HaptikSDK$a;
    private String HaptikSDK$b;
    private boolean HaptikSDK$c;
    private String ag$a;
    private boolean ah$b;
    private boolean toString;
    private String values;
    private int[] invoke = new int[32];
    private int HaptikSDK$e = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            ah$a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = ah$a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        valueOf = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public setBackgroundTintList(Writer writer) {
        ag$a(6);
        this.HaptikSDK$b = ":";
        this.HaptikSDK$c = true;
        Objects.requireNonNull(writer, "out == null");
        this.HaptikSDK$a = writer;
    }

    public final void ah$a(boolean z) {
        this.HaptikSDK$c = z;
    }

    public final boolean HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public setBackgroundTintList ah$a() throws IOException {
        getSignupData();
        return ah$a(1, "[");
    }

    public setBackgroundTintList valueOf() throws IOException {
        return ag$a(1, 2, "]");
    }

    public setBackgroundTintList values() throws IOException {
        getSignupData();
        return ah$a(3, "{");
    }

    public setBackgroundTintList ag$a() throws IOException {
        return ag$a(3, 5, "}");
    }

    private setBackgroundTintList ah$a(int i, String str) throws IOException {
        ah$b();
        ag$a(i);
        this.HaptikSDK$a.write(str);
        return this;
    }

    private setBackgroundTintList ag$a(int i, int i2, String str) throws IOException {
        int HaptikWebView = HaptikWebView();
        if (HaptikWebView != i2 && HaptikWebView != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.ag$a != null) {
            throw new IllegalStateException("Dangling name: " + this.ag$a);
        }
        this.HaptikSDK$e--;
        if (HaptikWebView == i2) {
            HaptikSDK$c();
        }
        this.HaptikSDK$a.write(str);
        return this;
    }

    private void ag$a(int i) {
        int i2 = this.HaptikSDK$e;
        int[] iArr = this.invoke;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.invoke = iArr2;
        }
        int[] iArr3 = this.invoke;
        int i3 = this.HaptikSDK$e;
        this.HaptikSDK$e = i3 + 1;
        iArr3[i3] = i;
    }

    private int HaptikWebView() {
        int i = this.HaptikSDK$e;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.invoke[i - 1];
    }

    private void ah$a(int i) {
        this.invoke[this.HaptikSDK$e - 1] = i;
    }

    public setBackgroundTintList ag$a(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.ag$a != null) {
            throw new IllegalStateException();
        }
        if (this.HaptikSDK$e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.ag$a = str;
        return this;
    }

    private void getSignupData() throws IOException {
        if (this.ag$a != null) {
            invoke();
            values(this.ag$a);
            this.ag$a = null;
        }
    }

    public setBackgroundTintList valueOf(String str) throws IOException {
        if (str == null) {
            return HaptikSDK$a();
        }
        getSignupData();
        ah$b();
        values(str);
        return this;
    }

    public setBackgroundTintList HaptikSDK$a() throws IOException {
        if (this.ag$a != null) {
            if (this.HaptikSDK$c) {
                getSignupData();
            } else {
                this.ag$a = null;
                return this;
            }
        }
        ah$b();
        this.HaptikSDK$a.write("null");
        return this;
    }

    public setBackgroundTintList values(boolean z) throws IOException {
        getSignupData();
        ah$b();
        this.HaptikSDK$a.write(z ? "true" : com.facebook.hermes.intl.Constants.CASEFIRST_FALSE);
        return this;
    }

    public setBackgroundTintList valueOf(Boolean bool) throws IOException {
        if (bool == null) {
            return HaptikSDK$a();
        }
        getSignupData();
        ah$b();
        this.HaptikSDK$a.write(bool.booleanValue() ? "true" : com.facebook.hermes.intl.Constants.CASEFIRST_FALSE);
        return this;
    }

    public setBackgroundTintList valueOf(long j) throws IOException {
        getSignupData();
        ah$b();
        this.HaptikSDK$a.write(Long.toString(j));
        return this;
    }

    public setBackgroundTintList values(Number number) throws IOException {
        if (number == null) {
            return HaptikSDK$a();
        }
        getSignupData();
        String obj = number.toString();
        if (!this.ah$b && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        ah$b();
        this.HaptikSDK$a.append((CharSequence) obj);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.HaptikSDK$e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.HaptikSDK$a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.HaptikSDK$a.close();
        int i = this.HaptikSDK$e;
        if (i > 1 || (i == 1 && this.invoke[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.HaptikSDK$e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void values(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.toString
            if (r0 == 0) goto L7
            java.lang.String[] r0 = o.setBackgroundTintList.valueOf
            goto L9
        L7:
            java.lang.String[] r0 = o.setBackgroundTintList.ah$a
        L9:
            java.io.Writer r1 = r8.HaptikSDK$a
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.HaptikSDK$a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.HaptikSDK$a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.HaptikSDK$a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.HaptikSDK$a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBackgroundTintList.values(java.lang.String):void");
    }

    private void HaptikSDK$c() throws IOException {
        if (this.values == null) {
            return;
        }
        this.HaptikSDK$a.write("\n");
        int i = this.HaptikSDK$e;
        for (int i2 = 1; i2 < i; i2++) {
            this.HaptikSDK$a.write(this.values);
        }
    }

    private void invoke() throws IOException {
        int HaptikWebView = HaptikWebView();
        if (HaptikWebView == 5) {
            this.HaptikSDK$a.write(44);
        } else if (HaptikWebView != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        HaptikSDK$c();
        ah$a(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$b() throws IOException {
        int HaptikWebView = HaptikWebView();
        if (HaptikWebView == 1) {
            ah$a(2);
            HaptikSDK$c();
        } else if (HaptikWebView == 2) {
            this.HaptikSDK$a.append(',');
            HaptikSDK$c();
        } else if (HaptikWebView != 4) {
            if (HaptikWebView != 6) {
                if (HaptikWebView == 7) {
                    if (!this.ah$b) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            ah$a(7);
        } else {
            this.HaptikSDK$a.append((CharSequence) this.HaptikSDK$b);
            ah$a(5);
        }
    }
}
