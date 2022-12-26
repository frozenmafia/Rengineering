package com.bugsnag.android.repackaged.dslplatform.json;

import com.dreampay.commons.constants.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;
import o.ViewCompat;
/* loaded from: classes3.dex */
public final class JsonReader<TContext> {
    private static final EOFException HaptikSDK$a;
    private static final Charset HaptikSDK$d = Charset.forName("UTF-8");
    private static final boolean[] invoke;
    protected final ErrorInfo HaptikSDK$b;
    public final int HaptikSDK$c;
    private int HaptikSDK$e;
    private int HaptikWebView;
    private final byte[] ICustomTabsCallback;
    private final ViewCompat.OnReceiveContentListenerAdapter ICustomTabsCallback$Default;
    private final int a;
    public final TContext ag$a;
    public final int ah$a;
    public final UnknownNumberParsing ah$b;
    private int aj$a;
    private byte ak;
    private final int ak$a;
    private final char[] ak$b;
    private int extraCallback;
    private InputStream extraCallbackWithResult;
    private long getInitSettings;
    private final StringBuilder getSignupData;
    private final ViewCompat.OnReceiveContentListenerAdapter isLogoutPending;
    private int onNavigationEvent;
    private final ViewCompat.OnUnhandledKeyEventListenerCompat onPostMessage;
    private final Formatter onXdkEvent;
    public char[] toString;
    public final DoublePrecision valueOf;
    public byte[] values;

    /* loaded from: classes3.dex */
    public enum ErrorInfo {
        WITH_STACK_TRACE,
        DESCRIPTION_AND_POSITION,
        DESCRIPTION_ONLY,
        MINIMAL
    }

    /* loaded from: classes3.dex */
    public enum UnknownNumberParsing {
        LONG_AND_BIGDECIMAL,
        LONG_AND_DOUBLE,
        BIGDECIMAL,
        DOUBLE
    }

    /* loaded from: classes3.dex */
    public interface toString<T extends ViewCompat.FocusRealDirection> {
        T values(JsonReader jsonReader) throws IOException;
    }

    /* loaded from: classes3.dex */
    public interface values<T> {
        T toString(JsonReader jsonReader) throws IOException;
    }

    static {
        boolean[] zArr = new boolean[256];
        invoke = zArr;
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
        HaptikSDK$a = new EmptyEOFException();
    }

    /* loaded from: classes3.dex */
    public enum DoublePrecision {
        EXACT(0),
        HIGH(1),
        DEFAULT(3),
        LOW(4);
        
        final int level;

        DoublePrecision(int i) {
            this.level = i;
        }
    }

    private JsonReader(char[] cArr, byte[] bArr, int i, TContext tcontext, ViewCompat.OnReceiveContentListenerAdapter onReceiveContentListenerAdapter, ViewCompat.OnReceiveContentListenerAdapter onReceiveContentListenerAdapter2, ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i2, int i3) {
        this.HaptikWebView = 0;
        this.getInitSettings = 0L;
        this.ak = (byte) 32;
        StringBuilder sb = new StringBuilder(0);
        this.getSignupData = sb;
        this.onXdkEvent = new Formatter(sb);
        this.ak$b = cArr;
        this.values = bArr;
        this.aj$a = i;
        this.HaptikSDK$e = bArr.length - 38;
        this.ag$a = tcontext;
        this.toString = cArr;
        this.isLogoutPending = onReceiveContentListenerAdapter;
        this.ICustomTabsCallback$Default = onReceiveContentListenerAdapter2;
        this.onPostMessage = onUnhandledKeyEventListenerCompat;
        this.HaptikSDK$b = errorInfo;
        this.valueOf = doublePrecision;
        this.ah$b = unknownNumberParsing;
        this.HaptikSDK$c = i2;
        this.a = i3;
        this.ah$a = doublePrecision.level + 15;
        this.ICustomTabsCallback = bArr;
        this.ak$a = this.HaptikSDK$e;
    }

    public JsonReader(byte[] bArr, int i, TContext tcontext, char[] cArr, ViewCompat.OnReceiveContentListenerAdapter onReceiveContentListenerAdapter, ViewCompat.OnReceiveContentListenerAdapter onReceiveContentListenerAdapter2, ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i2, int i3) {
        this(cArr, bArr, i, tcontext, onReceiveContentListenerAdapter, onReceiveContentListenerAdapter2, onUnhandledKeyEventListenerCompat, errorInfo, doublePrecision, unknownNumberParsing, i2, i3);
        if (cArr == null) {
            throw new IllegalArgumentException("tmp buffer provided as null.");
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        }
        if (i < bArr.length) {
            bArr[i] = 0;
        }
    }

    public final void isLogoutPending() {
        this.values = this.ICustomTabsCallback;
        this.HaptikSDK$e = this.ak$a;
        this.HaptikWebView = 0;
        this.aj$a = 0;
        this.extraCallback = 0;
        this.extraCallbackWithResult = null;
    }

    public final JsonReader<TContext> ah$a(InputStream inputStream) throws IOException {
        this.getInitSettings = 0L;
        this.HaptikWebView = 0;
        this.extraCallbackWithResult = inputStream;
        if (inputStream != null) {
            int i = this.aj$a;
            int i2 = this.HaptikSDK$e;
            if (i >= i2) {
                i = i2;
            }
            this.extraCallback = i;
            int values2 = values(this.values, inputStream, 0);
            int i3 = this.HaptikSDK$e;
            if (values2 < i3) {
                i3 = values2;
            }
            this.extraCallback = i3;
            this.aj$a = values2;
        }
        return this;
    }

    public final int ah$b() {
        return this.aj$a;
    }

    public String toString() {
        return new String(this.values, 0, this.aj$a, HaptikSDK$d);
    }

    private static int values(byte[] bArr, InputStream inputStream, int i) throws IOException {
        int read;
        while (i < bArr.length && (read = inputStream.read(bArr, i, bArr.length - i)) != -1) {
            i += read;
        }
        return i;
    }

    /* loaded from: classes3.dex */
    static class EmptyEOFException extends EOFException {
        private EmptyEOFException() {
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }

    boolean ak$a() {
        return this.HaptikSDK$b == ErrorInfo.WITH_STACK_TRACE;
    }

    public final byte invoke() throws IOException {
        if (this.extraCallbackWithResult != null && this.HaptikWebView > this.extraCallback) {
            ak$b();
        }
        int i = this.HaptikWebView;
        if (i >= this.aj$a) {
            throw ParsingException.create("Unexpected end of JSON input", HaptikSDK$a, ak$a());
        }
        byte[] bArr = this.values;
        this.HaptikWebView = i + 1;
        byte b2 = bArr[i];
        this.ak = b2;
        return b2;
    }

    private int ak$b() throws IOException {
        int i = this.aj$a;
        int i2 = this.HaptikWebView;
        int i3 = i - i2;
        byte[] bArr = this.values;
        System.arraycopy(bArr, i2, bArr, 0, i3);
        int values2 = values(this.values, this.extraCallbackWithResult, i3);
        long j = this.getInitSettings;
        int i4 = this.HaptikWebView;
        this.getInitSettings = j + i4;
        if (values2 == i3) {
            int i5 = this.aj$a - i4;
            this.extraCallback = i5;
            this.aj$a = i5;
            this.HaptikWebView = 0;
        } else {
            int i6 = this.HaptikSDK$e;
            if (values2 < i6) {
                i6 = values2;
            }
            this.extraCallback = i6;
            this.aj$a = values2;
            this.HaptikWebView = 0;
        }
        return values2;
    }

    public final boolean HaptikSDK$b() throws IOException {
        return this.extraCallbackWithResult == null ? this.aj$a == this.HaptikWebView : this.aj$a == this.HaptikWebView && ak$b() == 0;
    }

    public final byte HaptikSDK$a() {
        return this.ak;
    }

    private void ah$a(int i, StringBuilder sb) {
        sb.append("at position: ");
        sb.append(ah$a(i));
        int i2 = this.HaptikWebView;
        if (i2 > i) {
            try {
                int min = Math.min(i2 - i, 20);
                String str = new String(this.values, (this.HaptikWebView - i) - min, min, HaptikSDK$d);
                sb.append(", following: `");
                sb.append(str);
                sb.append('`');
            } catch (Exception unused) {
            }
        }
        int i3 = this.HaptikWebView;
        int i4 = this.extraCallback;
        if (i3 - i < i4) {
            try {
                String str2 = new String(this.values, this.HaptikWebView - i, Math.min((i4 - i3) + i, 20), HaptikSDK$d);
                sb.append(", before: `");
                sb.append(str2);
                sb.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    public final ParsingException valueOf(String str) {
        return values(str, 0);
    }

    public final ParsingException values(String str, int i) {
        if (this.HaptikSDK$b == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.getSignupData.setLength(0);
        this.getSignupData.append(str);
        this.getSignupData.append(". Found ");
        this.getSignupData.append((char) this.ak);
        if (this.HaptikSDK$b == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.getSignupData.toString(), false);
        }
        this.getSignupData.append(Constants.WHITE_SPACE);
        ah$a(i, this.getSignupData);
        return ParsingException.create(this.getSignupData.toString(), ak$a());
    }

    public final ParsingException ag$a(String str, int i) {
        if (this.HaptikSDK$b == ErrorInfo.MINIMAL || this.HaptikSDK$b == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(str, false);
        }
        this.getSignupData.setLength(0);
        this.getSignupData.append(str);
        this.getSignupData.append(Constants.WHITE_SPACE);
        ah$a(i, this.getSignupData);
        return ParsingException.create(this.getSignupData.toString(), ak$a());
    }

    public final ParsingException valueOf(String str, int i, Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("cause can't be null");
        }
        if (this.HaptikSDK$b == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, exc, false);
        }
        this.getSignupData.setLength(0);
        String message = exc.getMessage();
        if (message != null && message.length() > 0) {
            this.getSignupData.append(message);
            if (!message.endsWith(".")) {
                this.getSignupData.append(".");
            }
            this.getSignupData.append(Constants.WHITE_SPACE);
        }
        this.getSignupData.append(str);
        if (this.HaptikSDK$b == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.getSignupData.toString(), exc, false);
        }
        this.getSignupData.append(Constants.WHITE_SPACE);
        ah$a(i, this.getSignupData);
        return ParsingException.create(this.getSignupData.toString(), ak$a());
    }

    public final ParsingException ag$a(String str, int i, String str2, Object... objArr) {
        if (this.HaptikSDK$b == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.getSignupData.setLength(0);
        this.onXdkEvent.format(str2, objArr);
        if (this.HaptikSDK$b == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.getSignupData.toString(), false);
        }
        this.getSignupData.append(Constants.WHITE_SPACE);
        ah$a(i, this.getSignupData);
        return ParsingException.create(this.getSignupData.toString(), ak$a());
    }

    public final ParsingException valueOf(String str, Object obj) {
        return values(str, 0, "", str, obj, "");
    }

    public final ParsingException values(String str, int i, String str2, String str3, Object obj, String str4) {
        if (this.HaptikSDK$b == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.getSignupData.setLength(0);
        this.getSignupData.append(str2);
        this.getSignupData.append(str3);
        if (obj != null) {
            this.getSignupData.append(": '");
            this.getSignupData.append(obj.toString());
            this.getSignupData.append("'");
        }
        this.getSignupData.append(str4);
        if (this.HaptikSDK$b == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.getSignupData.toString(), false);
        }
        this.getSignupData.append(Constants.WHITE_SPACE);
        ah$a(i, this.getSignupData);
        return ParsingException.create(this.getSignupData.toString(), ak$a());
    }

    public final int ag$a() {
        return this.onNavigationEvent;
    }

    public final int valueOf() {
        return this.HaptikWebView;
    }

    public final int onXdkEvent() {
        int i = this.HaptikWebView;
        this.onNavigationEvent = i - 1;
        byte b2 = this.ak;
        int i2 = 1;
        while (i < this.aj$a && (b2 = this.values[i]) != 44 && b2 != 125 && b2 != 93) {
            i2++;
            i++;
        }
        this.HaptikWebView += i2 - 1;
        this.ak = b2;
        return this.onNavigationEvent;
    }

    public final char[] ah$a(int i, int i2) throws ParsingException {
        char[] cArr;
        if (i2 > this.HaptikSDK$c) {
            throw values("Too many digits detected in number", i2, "", "Too many digits detected in number", Integer.valueOf(i2), "");
        }
        while (true) {
            cArr = this.toString;
            if (cArr.length >= i2) {
                break;
            }
            this.toString = Arrays.copyOf(cArr, cArr.length * 2);
        }
        byte[] bArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) bArr[i + i3];
        }
        return cArr;
    }

    public final boolean valueOf(int i, int i2) {
        byte[] bArr = this.values;
        while (i < i2) {
            if (!invoke[bArr[i] + 128]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final String HaptikWebView() throws ParsingException {
        char[] cArr;
        if (this.ak != 34) {
            throw valueOf("Expecting '\"' for string start");
        }
        int i = this.HaptikWebView;
        int i2 = 0;
        while (true) {
            try {
                cArr = this.ak$b;
                if (i2 >= cArr.length) {
                    break;
                }
                int i3 = i + 1;
                byte b2 = this.values[i];
                if (b2 == 34) {
                    i = i3;
                    break;
                }
                cArr[i2] = (char) b2;
                i2++;
                i = i3;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ag$a("JSON string was not closed with a double quote", 0);
            }
        }
        if (i > this.aj$a) {
            throw ag$a("JSON string was not closed with a double quote", 0);
        }
        this.HaptikWebView = i;
        return new String(cArr, 0, i2);
    }

    public final char[] HaptikSDK$d() throws ParsingException {
        char[] cArr;
        if (this.ak != 34) {
            throw valueOf("Expecting '\"' for string start");
        }
        int i = this.HaptikWebView;
        this.onNavigationEvent = i;
        int i2 = 0;
        while (true) {
            try {
                cArr = this.ak$b;
                if (i2 >= cArr.length) {
                    break;
                }
                int i3 = i + 1;
                byte b2 = this.values[i];
                if (b2 == 34) {
                    i = i3;
                    break;
                }
                cArr[i2] = (char) b2;
                i2++;
                i = i3;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ag$a("JSON string was not closed with a double quote", 0);
            }
        }
        if (i > this.aj$a) {
            throw ag$a("JSON string was not closed with a double quote", 0);
        }
        this.HaptikWebView = i;
        return cArr;
    }

    public final String getSignupData() throws IOException {
        int HaptikSDK$c = HaptikSDK$c();
        ViewCompat.OnReceiveContentListenerAdapter onReceiveContentListenerAdapter = this.ICustomTabsCallback$Default;
        return onReceiveContentListenerAdapter == null ? new String(this.toString, 0, HaptikSDK$c) : onReceiveContentListenerAdapter.values(this.toString, HaptikSDK$c);
    }

    public final StringBuilder ah$a(StringBuilder sb) throws IOException {
        sb.append(this.toString, 0, HaptikSDK$c());
        return sb;
    }

    public final StringBuffer toString(StringBuffer stringBuffer) throws IOException {
        stringBuffer.append(this.toString, 0, HaptikSDK$c());
        return stringBuffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cd, code lost:
        throw valueOf("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ce, code lost:
        r4[r5] = (char) r0;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01db, code lost:
        throw ag$a("JSON string was not closed with a double quote", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r6 != r4.length) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        r1 = r15.toString;
        r4 = r1.length * 2;
        r6 = r15.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (r4 > r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        r4 = java.util.Arrays.copyOf(r1, r4);
        r15.toString = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        throw valueOf("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        r1 = r4.length;
        r15.HaptikWebView = r5;
        r5 = r5 - 1;
        r15.HaptikWebView = r5;
        r5 = r5 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (HaptikSDK$b() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        r0 = invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r0 != 34) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r0 != 92) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r5 < (r1 - 6)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        r0 = r15.toString;
        r1 = r0.length * 2;
        r4 = r15.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
        if (r1 > r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
        r4 = java.util.Arrays.copyOf(r0, r1);
        r15.toString = r4;
        r1 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        throw valueOf("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        r0 = r15.values;
        r10 = r15.HaptikWebView;
        r11 = r10 + 1;
        r15.HaptikWebView = r11;
        r10 = r0[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (r10 == 34) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
        if (r10 == 47) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
        if (r10 == 92) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
        if (r10 == 98) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
        if (r10 == 102) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        if (r10 == 110) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
        if (r10 == 114) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
        if (r10 == 116) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
        if (r10 != 117) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b3, code lost:
        r15.HaptikWebView = r11 + 1;
        r0 = values(r0[r11]);
        r7 = r15.values;
        r10 = r15.HaptikWebView;
        r15.HaptikWebView = r10 + 1;
        r7 = values(r7[r10]);
        r10 = r15.values;
        r11 = r15.HaptikWebView;
        r15.HaptikWebView = r11 + 1;
        r0 = ((r0 << 12) + (r7 << 8)) + (values(r10[r11]) << 4);
        r6 = r15.values;
        r7 = r15.HaptikWebView;
        r15.HaptikWebView = r7 + 1;
        r6 = values(r6[r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
        throw valueOf("Invalid escape combination detected", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
        r0 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
        r0 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
        r0 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
        r0 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010b, code lost:
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:
        if ((r0 & 128) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0118, code lost:
        if (r5 < (r1 - 4)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
        r1 = r15.toString;
        r4 = r1.length * 2;
        r6 = r15.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0121, code lost:
        if (r4 > r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0123, code lost:
        r1 = java.util.Arrays.copyOf(r1, r4);
        r15.toString = r1;
        r4 = r1;
        r1 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0136, code lost:
        throw valueOf("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0137, code lost:
        r6 = r15.values;
        r7 = r15.HaptikWebView;
        r10 = r7 + 1;
        r15.HaptikWebView = r10;
        r7 = r6[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
        if ((r0 & 224) != 192) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
        r0 = (r0 & 31) << 6;
        r6 = r7 & 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014e, code lost:
        r11 = r10 + 1;
        r15.HaptikWebView = r11;
        r10 = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0158, code lost:
        if ((r0 & 240) != 224) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
        r0 = ((r0 & 15) << 12) + ((r7 & 63) << 6);
        r6 = r10 & 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0164, code lost:
        r0 = r0 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0166, code lost:
        r15.HaptikWebView = r11 + 1;
        r6 = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
        if ((r0 & 248) != 240) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0174, code lost:
        r0 = ((((r0 & 7) << 18) + ((r7 & 63) << 12)) + ((r10 & 63) << 6)) + (r6 & 63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0186, code lost:
        if (r0 < 65536) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018a, code lost:
        if (r0 >= 1114112) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018c, code lost:
        r0 = r0 - 65536;
        r6 = r5 + 1;
        r4[r5] = (char) ((r0 >>> 10) + 55296);
        r5 = r6 + 1;
        r4[r6] = (char) ((r0 & com.google.android.exoplayer2.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a9, code lost:
        throw ag$a("Invalid unicode character detected", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ae, code lost:
        throw ag$a("Invalid unicode character detected", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01af, code lost:
        if (r5 < r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b1, code lost:
        r1 = r15.toString;
        r4 = r1.length * 2;
        r6 = r15.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
        if (r4 > r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
        r1 = java.util.Arrays.copyOf(r1, r4);
        r15.toString = r1;
        r4 = r1;
        r1 = r1.length;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int HaptikSDK$c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.JsonReader.HaptikSDK$c():int");
    }

    private int values(byte b2) throws ParsingException {
        if (b2 < 48 || b2 > 57) {
            if (b2 < 65 || b2 > 70) {
                if (b2 < 97 || b2 > 102) {
                    throw valueOf("Could not parse unicode escape, expected a hexadecimal digit", Byte.valueOf(b2));
                }
                return b2 - 87;
            }
            return b2 - 55;
        }
        return b2 - 48;
    }

    private boolean extraCallbackWithResult() {
        byte b2 = this.ak;
        if (b2 != -96 && b2 != 32) {
            switch (b2) {
                case -31:
                    int i = this.HaptikWebView;
                    int i2 = i + 1;
                    if (i2 < this.aj$a) {
                        byte[] bArr = this.values;
                        if (bArr[i] == -102 && bArr[i2] == Byte.MIN_VALUE) {
                            this.HaptikWebView = i + 2;
                            this.ak = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                case -30:
                    int i3 = this.HaptikWebView;
                    int i4 = i3 + 1;
                    if (i4 < this.aj$a) {
                        byte[] bArr2 = this.values;
                        byte b3 = bArr2[i3];
                        byte b4 = bArr2[i4];
                        if (b3 == -127 && b4 == -97) {
                            this.HaptikWebView = i3 + 2;
                            this.ak = (byte) 32;
                            return true;
                        } else if (b3 != Byte.MIN_VALUE) {
                            return false;
                        } else {
                            if (b4 != -88 && b4 != -87 && b4 != -81) {
                                switch (b4) {
                                    case Byte.MIN_VALUE:
                                    case -127:
                                    case -126:
                                    case -125:
                                    case -124:
                                    case -123:
                                    case -122:
                                    case -121:
                                    case -120:
                                    case -119:
                                    case -118:
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            this.HaptikWebView = i3 + 2;
                            this.ak = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                case -29:
                    int i5 = this.HaptikWebView;
                    int i6 = i5 + 1;
                    if (i6 < this.aj$a) {
                        byte[] bArr3 = this.values;
                        if (bArr3[i5] == Byte.MIN_VALUE && bArr3[i6] == Byte.MIN_VALUE) {
                            this.HaptikWebView = i5 + 2;
                            this.ak = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                default:
                    switch (b2) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final byte ah$a() throws IOException {
        invoke();
        if (invoke[this.ak + 128]) {
            while (extraCallbackWithResult()) {
                invoke();
            }
        }
        return this.ak;
    }

    public final long ah$a(int i) {
        return (this.getInitSettings + this.HaptikWebView) - i;
    }

    public final byte[] getInitSettings() throws IOException {
        if (this.extraCallbackWithResult != null && ViewCompat.Api21Impl.AnonymousClass1.ag$a(this.values, this.HaptikWebView) == this.values.length) {
            int HaptikSDK$c = HaptikSDK$c();
            byte[] bArr = new byte[HaptikSDK$c];
            for (int i = 0; i < HaptikSDK$c; i++) {
                bArr[i] = (byte) this.toString[i];
            }
            return ViewCompat.Api21Impl.AnonymousClass1.ag$a(bArr, 0, HaptikSDK$c);
        } else if (this.ak != 34) {
            throw valueOf("Expecting '\"' for base64 start");
        } else {
            int i2 = this.HaptikWebView;
            int ag$a = ViewCompat.Api21Impl.AnonymousClass1.ag$a(this.values, i2);
            this.HaptikWebView = ag$a;
            byte[] bArr2 = this.values;
            int i3 = ag$a + 1;
            this.HaptikWebView = i3;
            byte b2 = bArr2[ag$a];
            this.ak = b2;
            if (b2 != 34) {
                throw valueOf("Expecting '\"' for base64 end");
            }
            return ViewCompat.Api21Impl.AnonymousClass1.ag$a(bArr2, i2, i3 - 1);
        }
    }

    public final String HaptikSDK$e() throws IOException {
        int HaptikSDK$c = HaptikSDK$c();
        ViewCompat.OnReceiveContentListenerAdapter onReceiveContentListenerAdapter = this.isLogoutPending;
        String values2 = onReceiveContentListenerAdapter != null ? onReceiveContentListenerAdapter.values(this.toString, HaptikSDK$c) : new String(this.toString, 0, HaptikSDK$c);
        if (ah$a() != 58) {
            throw valueOf("Expecting ':' after attribute name");
        }
        ah$a();
        return values2;
    }

    public final boolean aj$a() throws ParsingException {
        if (this.ak == 110) {
            int i = this.HaptikWebView;
            int i2 = i + 2;
            if (i2 < this.aj$a) {
                byte[] bArr = this.values;
                if (bArr[i] == 117 && bArr[i + 1] == 108 && bArr[i2] == 108) {
                    this.HaptikWebView = i + 3;
                    this.ak = (byte) 108;
                    return true;
                }
            }
            throw ag$a("Invalid null constant found", 0);
        }
        return false;
    }

    public final boolean ak() throws ParsingException {
        if (this.ak == 116) {
            int i = this.HaptikWebView;
            int i2 = i + 2;
            if (i2 < this.aj$a) {
                byte[] bArr = this.values;
                if (bArr[i] == 114 && bArr[i + 1] == 117 && bArr[i2] == 101) {
                    this.HaptikWebView = i + 3;
                    this.ak = (byte) 101;
                    return true;
                }
            }
            throw ag$a("Invalid true constant found", 0);
        }
        return false;
    }

    public final boolean a() throws ParsingException {
        if (this.ak == 102) {
            int i = this.HaptikWebView;
            int i2 = i + 3;
            if (i2 < this.aj$a) {
                byte[] bArr = this.values;
                if (bArr[i] == 97 && bArr[i + 1] == 108 && bArr[i + 2] == 115 && bArr[i2] == 101) {
                    this.HaptikWebView = i + 4;
                    this.ak = (byte) 101;
                    return true;
                }
            }
            throw ag$a("Invalid false constant found", 0);
        }
        return false;
    }

    public final void values() throws IOException {
        if (this.ak != 93) {
            if (this.HaptikWebView < this.aj$a) {
                throw valueOf("Expecting ']' as array end");
            }
            throw valueOf("Unexpected end of JSON in collection", 0, HaptikSDK$a);
        }
    }

    public final <T, S extends T> ArrayList<T> valueOf(values<S> valuesVar) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        values(valuesVar, arrayList);
        return arrayList;
    }

    public final <T, S extends T> void values(values<S> valuesVar, Collection<T> collection) throws IOException {
        if (aj$a()) {
            collection.add(null);
        } else {
            collection.add(valuesVar.toString(this));
        }
        while (ah$a() == 44) {
            ah$a();
            if (aj$a()) {
                collection.add(null);
            } else {
                collection.add(valuesVar.toString(this));
            }
        }
        values();
    }

    public final <T extends ViewCompat.FocusRealDirection> ArrayList<T> ag$a(toString<T> tostring) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        ah$a(tostring, arrayList);
        return arrayList;
    }

    public final <T extends ViewCompat.FocusRealDirection> void ah$a(toString<T> tostring, Collection<T> collection) throws IOException {
        if (this.ak == 123) {
            ah$a();
            collection.add(tostring.values(this));
        } else if (aj$a()) {
            collection.add(null);
        } else {
            throw valueOf("Expecting '{' as collection start");
        }
        while (ah$a() == 44) {
            if (ah$a() == 123) {
                ah$a();
                collection.add(tostring.values(this));
            } else if (aj$a()) {
                collection.add(null);
            } else {
                throw valueOf("Expecting '{' as object start within a collection");
            }
        }
        values();
    }
}
