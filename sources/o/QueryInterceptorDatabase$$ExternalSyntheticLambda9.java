package o;

import com.app.dream11.newmycontests.model.CardVm;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.http.message.TokenParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class QueryInterceptorDatabase$$ExternalSyntheticLambda9 {
    protected static boolean[] ag$a;
    protected static boolean[] ah$a;
    protected static boolean[] toString;
    protected static boolean[] valueOf;
    protected static boolean[] values;
    protected final boolean HaptikSDK$a;
    protected final boolean HaptikSDK$b;
    protected final boolean HaptikSDK$c;
    protected final boolean HaptikSDK$d;
    protected final boolean HaptikSDK$e;
    protected QueryInterceptorDatabase$$ExternalSyntheticLambda3 HaptikWebView;
    protected String ICustomTabsCallback;
    protected final QueryInterceptorDatabase$$ExternalSyntheticLambda9$ag$a a = new QueryInterceptorDatabase$$ExternalSyntheticLambda9$ag$a(15);
    protected final boolean ah$b;
    protected final boolean aj$a;
    protected int ak;
    protected Object extraCallback;
    protected char getInitSettings;
    protected QueryInterceptorDatabase$$ExternalSyntheticLambda2 getSignupData;
    protected final boolean invoke;
    protected final boolean isLogoutPending;
    protected final boolean onXdkEvent;

    protected abstract void HaptikSDK$a() throws com.nimbusds.jose.shaded.json.parser.ParseException, IOException;

    abstract void HaptikSDK$c() throws IOException;

    protected abstract void ah$b() throws com.nimbusds.jose.shaded.json.parser.ParseException, IOException;

    protected abstract Object valueOf(boolean[] zArr) throws com.nimbusds.jose.shaded.json.parser.ParseException, IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void valueOf() throws IOException;

    protected abstract void values(boolean[] zArr) throws IOException;

    static {
        boolean[] zArr = new boolean[126];
        valueOf = zArr;
        boolean[] zArr2 = new boolean[126];
        values = zArr2;
        boolean[] zArr3 = new boolean[126];
        ag$a = zArr3;
        boolean[] zArr4 = new boolean[126];
        ah$a = zArr4;
        boolean[] zArr5 = new boolean[126];
        toString = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public QueryInterceptorDatabase$$ExternalSyntheticLambda9(int i) {
        this.HaptikSDK$c = (i & 4) > 0;
        this.ah$b = (i & 2) > 0;
        this.HaptikSDK$a = (i & 1) > 0;
        this.onXdkEvent = (i & 8) > 0;
        this.aj$a = (i & 16) > 0;
        this.HaptikSDK$b = (i & 32) > 0;
        this.invoke = (i & 64) > 0;
        this.isLogoutPending = (i & 128) > 0;
        this.HaptikSDK$d = (i & 768) == 0;
        this.HaptikSDK$e = (i & 512) == 0;
    }

    public void ah$a() throws com.nimbusds.jose.shaded.json.parser.ParseException {
        if (this.onXdkEvent) {
            return;
        }
        int length = this.ICustomTabsCallback.length();
        for (int i = 0; i < length; i++) {
            char charAt = this.ICustomTabsCallback.charAt(i);
            if (charAt >= 0) {
                if (charAt <= 31) {
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak + i, 0, Character.valueOf(charAt));
                }
                if (charAt == 127) {
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak + i, 0, Character.valueOf(charAt));
                }
            }
        }
    }

    public void values() throws com.nimbusds.jose.shaded.json.parser.ParseException {
        int length = this.ICustomTabsCallback.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.ICustomTabsCallback.equals(CardVm.PROMOTIONAL_CARD_BOTTOM_GRADIENT)) {
                throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 6, this.ICustomTabsCallback);
            }
            return;
        }
        char charAt = this.ICustomTabsCallback.charAt(0);
        char charAt2 = this.ICustomTabsCallback.charAt(1);
        if (charAt != '-') {
            if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 6, this.ICustomTabsCallback);
            }
            return;
        }
        char charAt3 = this.ICustomTabsCallback.charAt(2);
        if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
            throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 6, this.ICustomTabsCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Number ag$a() throws com.nimbusds.jose.shaded.json.parser.ParseException {
        if (!this.HaptikSDK$b) {
            values();
        }
        if (!this.isLogoutPending) {
            return Float.valueOf(Float.parseFloat(this.ICustomTabsCallback));
        }
        if (this.ICustomTabsCallback.length() > 18) {
            return new BigDecimal(this.ICustomTabsCallback);
        }
        return Double.valueOf(Double.parseDouble(this.ICustomTabsCallback));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object toString(QueryInterceptorDatabase$$ExternalSyntheticLambda2 queryInterceptorDatabase$$ExternalSyntheticLambda2, QueryInterceptorDatabase$$ExternalSyntheticLambda3 queryInterceptorDatabase$$ExternalSyntheticLambda3) throws com.nimbusds.jose.shaded.json.parser.ParseException {
        this.getSignupData = queryInterceptorDatabase$$ExternalSyntheticLambda2;
        this.HaptikWebView = queryInterceptorDatabase$$ExternalSyntheticLambda3;
        try {
            valueOf();
            queryInterceptorDatabase$$ExternalSyntheticLambda3.HaptikSDK$a();
            Object ag$a2 = ag$a(toString);
            queryInterceptorDatabase$$ExternalSyntheticLambda3.ah$a();
            if (this.HaptikSDK$d) {
                if (!this.HaptikSDK$e) {
                    getSignupData();
                }
                if (this.getInitSettings != 26) {
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak - 1, 1, Character.valueOf(this.getInitSettings));
                }
            }
            this.ICustomTabsCallback = null;
            this.extraCallback = null;
            return ag$a2;
        } catch (IOException e) {
            throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Number values(String str) throws com.nimbusds.jose.shaded.json.parser.ParseException {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int length = str.length();
        boolean z3 = false;
        if (str.charAt(0) == '-') {
            i = 20;
            if (!this.HaptikSDK$b && length >= 3 && str.charAt(1) == '0') {
                throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 6, str);
            }
            i2 = 1;
            z = true;
        } else if (!this.HaptikSDK$b && length >= 2 && str.charAt(0) == '0') {
            throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 6, str);
        } else {
            i = 19;
            i2 = 0;
            z = false;
        }
        if (length < i) {
            z2 = false;
        } else if (length > i) {
            return new BigInteger(str, 10);
        } else {
            length--;
            z2 = true;
        }
        long j = 0;
        while (i2 < length) {
            j = (j * 10) + ('0' - str.charAt(i2));
            i2++;
        }
        if (z2) {
            int i3 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
            if (i3 <= 0) {
                if (i3 >= 0) {
                    if (z) {
                    }
                }
                z3 = true;
            }
            if (z3) {
                return new BigInteger(str, 10);
            }
            j = (j * 10) + ('0' - str.charAt(i2));
        }
        if (z) {
            if (this.aj$a && j >= -2147483648L) {
                return Integer.valueOf((int) j);
            }
            return Long.valueOf(j);
        }
        long j2 = -j;
        if (this.aj$a && j2 <= 2147483647L) {
            return Integer.valueOf((int) j2);
        }
        return Long.valueOf(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r4 == ':') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r4 == ']') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r4 == '}') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r3 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r6.invoke == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r6.ak, 0, java.lang.Character.valueOf(r6.getInitSettings));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        valueOf();
        r6.HaptikWebView.values();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.List<java.lang.Object> invoke() throws com.nimbusds.jose.shaded.json.parser.ParseException, java.io.IOException {
        /*
            r6 = this;
            o.QueryInterceptorDatabase$$ExternalSyntheticLambda2 r0 = r6.getSignupData
            java.util.List r0 = r0.values()
            char r1 = r6.getInitSettings
            r2 = 91
            if (r1 != r2) goto L9e
            r6.valueOf()
            o.QueryInterceptorDatabase$$ExternalSyntheticLambda3 r1 = r6.HaptikWebView
            r1.HaptikSDK$c()
        L14:
            r1 = 1
            r2 = 0
            r3 = 0
        L17:
            char r4 = r6.getInitSettings
            r5 = 9
            if (r4 == r5) goto L99
            r5 = 10
            if (r4 == r5) goto L99
            r5 = 13
            if (r4 == r5) goto L99
            r5 = 26
            if (r4 == r5) goto L8d
            r5 = 32
            if (r4 == r5) goto L99
            r5 = 44
            if (r4 == r5) goto L73
            r1 = 58
            if (r4 == r1) goto L65
            r1 = 93
            if (r4 == r1) goto L47
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 == r1) goto L65
            boolean[] r1 = o.QueryInterceptorDatabase$$ExternalSyntheticLambda9.values
            java.lang.Object r1 = r6.ag$a(r1)
            r0.add(r1)
            goto L14
        L47:
            if (r3 == 0) goto L5c
            boolean r1 = r6.invoke
            if (r1 == 0) goto L4e
            goto L5c
        L4e:
            com.nimbusds.jose.shaded.json.parser.ParseException r0 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r1 = r6.ak
            char r3 = r6.getInitSettings
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r0.<init>(r1, r2, r3)
            throw r0
        L5c:
            r6.valueOf()
            o.QueryInterceptorDatabase$$ExternalSyntheticLambda3 r1 = r6.HaptikWebView
            r1.values()
            return r0
        L65:
            com.nimbusds.jose.shaded.json.parser.ParseException r0 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r1 = r6.ak
            char r3 = r6.getInitSettings
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r0.<init>(r1, r2, r3)
            throw r0
        L73:
            if (r3 == 0) goto L88
            boolean r3 = r6.invoke
            if (r3 == 0) goto L7a
            goto L88
        L7a:
            com.nimbusds.jose.shaded.json.parser.ParseException r0 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r1 = r6.ak
            char r3 = r6.getInitSettings
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r0.<init>(r1, r2, r3)
            throw r0
        L88:
            r6.valueOf()
            r3 = 1
            goto L17
        L8d:
            com.nimbusds.jose.shaded.json.parser.ParseException r0 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r6.ak
            int r2 = r2 - r1
            r1 = 3
            java.lang.String r3 = "EOF"
            r0.<init>(r2, r1, r3)
            throw r0
        L99:
            r6.valueOf()
            goto L17
        L9e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal Error"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.QueryInterceptorDatabase$$ExternalSyntheticLambda9.invoke():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0114, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r3.ak, 0, java.lang.Character.valueOf(r3.getInitSettings));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object ag$a(boolean[] r4) throws com.nimbusds.jose.shaded.json.parser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.QueryInterceptorDatabase$$ExternalSyntheticLambda9.ag$a(boolean[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fd, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r13.ak, 0, java.lang.Character.valueOf(r13.getInitSettings));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.Map<java.lang.String, java.lang.Object> HaptikSDK$b() throws com.nimbusds.jose.shaded.json.parser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.QueryInterceptorDatabase$$ExternalSyntheticLambda9.HaptikSDK$b():java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void HaptikSDK$d() throws com.nimbusds.jose.shaded.json.parser.ParseException, IOException {
        char c = this.getInitSettings;
        while (true) {
            valueOf();
            char c2 = this.getInitSettings;
            if (c2 == '\"' || c2 == '\'') {
                if (c == c2) {
                    valueOf();
                    this.ICustomTabsCallback = this.a.toString();
                    return;
                }
                this.a.valueOf(c2);
            } else if (c2 == '\\') {
                valueOf();
                char c3 = this.getInitSettings;
                if (c3 == '\"') {
                    this.a.valueOf('\"');
                } else if (c3 == '\'') {
                    this.a.valueOf('\'');
                } else if (c3 == '/') {
                    this.a.valueOf('/');
                } else if (c3 == '\\') {
                    this.a.valueOf(TokenParser.ESCAPE);
                } else if (c3 == 'b') {
                    this.a.valueOf('\b');
                } else if (c3 == 'f') {
                    this.a.valueOf('\f');
                } else if (c3 == 'n') {
                    this.a.valueOf('\n');
                } else if (c3 == 'r') {
                    this.a.valueOf(TokenParser.CR);
                } else if (c3 == 'x') {
                    this.a.valueOf(valueOf(2));
                } else if (c3 == 't') {
                    this.a.valueOf('\t');
                } else if (c3 == 'u') {
                    this.a.valueOf(valueOf(4));
                }
            } else {
                if (c2 != 127) {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            break;
                        case 26:
                            throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak - 1, 3, null);
                        default:
                            this.a.valueOf(c2);
                            break;
                    }
                }
                if (!this.onXdkEvent) {
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 0, Character.valueOf(this.getInitSettings));
                }
            }
        }
    }

    protected char valueOf(int i) throws com.nimbusds.jose.shaded.json.parser.ParseException, IOException {
        int i2;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            valueOf();
            char c = this.getInitSettings;
            if (c > '9' || c < '0') {
                if (c <= 'F' && c >= 'A') {
                    i2 = c - 'A';
                } else if (c < 'a' || c > 'f') {
                    if (c == 26) {
                        throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 3, "EOF");
                    }
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 4, Character.valueOf(this.getInitSettings));
                } else {
                    i2 = c - 'a';
                }
                i3 = i2 + 10;
            } else {
                i3 = c - '0';
            }
            i4 = (i4 * 16) + i3;
        }
        return (char) i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void HaptikSDK$e() throws IOException {
        while (true) {
            char c = this.getInitSettings;
            if (c < '0' || c > '9') {
                return;
            }
            HaptikSDK$c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(boolean[] zArr) throws IOException {
        while (true) {
            char c = this.getInitSettings;
            if (c == 26) {
                return;
            }
            if (c >= 0 && c < '~' && zArr[c]) {
                return;
            }
            HaptikSDK$c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void getSignupData() throws IOException {
        while (true) {
            char c = this.getInitSettings;
            if (c > ' ' || c == 26) {
                return;
            }
            HaptikSDK$c();
        }
    }
}
