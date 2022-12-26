package com.google.ads.interactivemedia.v3.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public class bnc implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final Reader f897b;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private String[] n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f898o;
    private boolean c = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    int a = 0;
    private int m = 1;

    static {
        bjv.a = new bnb();
    }

    public bnc(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.f898o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f897b = reader;
    }

    private final void A() throws IOException {
        if (!this.c) {
            throw w("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private final void B(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.l = Arrays.copyOf(iArr, i3);
            this.f898o = Arrays.copyOf(this.f898o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    private final void C(char c) throws IOException {
        char[] cArr = this.d;
        do {
            int i = this.e;
            int i2 = this.f;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.e = i3;
                    return;
                } else if (c2 == '\\') {
                    this.e = i3;
                    d();
                    i = this.e;
                    i2 = this.f;
                } else {
                    if (c2 == '\n') {
                        this.g++;
                        this.h = i3;
                    }
                    i = i3;
                }
            }
            this.e = i;
        } while (E(1));
        throw w("Unterminated string");
    }

    private final void D() throws IOException {
        char c;
        do {
            if (this.e >= this.f && !E(1)) {
                return;
            }
            char[] cArr = this.d;
            int i = this.e;
            int i2 = i + 1;
            this.e = i2;
            c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i2;
                return;
            }
        } while (c != '\r');
    }

    private final boolean E(int i) throws IOException {
        int i2;
        char[] cArr = this.d;
        int i3 = this.h;
        int i4 = this.e;
        this.h = i3 - i4;
        int i5 = this.f;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            Reader reader = this.f897b;
            int i7 = this.f;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.f + read;
            this.f = i2;
            if (this.g == 0 && this.h == 0 && i2 > 0 && cArr[0] == 65279) {
                this.e++;
                this.h = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean F(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A();
        return false;
    }

    private final char d() throws IOException {
        int i;
        if (this.e != this.f || E(1)) {
            char[] cArr = this.d;
            int i2 = this.e;
            int i3 = i2 + 1;
            this.e = i3;
            char c = cArr[i2];
            if (c == '\n') {
                this.g++;
                this.h = i3;
            } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c != 'n') {
                            if (c != 'r') {
                                if (c != 't') {
                                    if (c == 'u') {
                                        if (i3 + 4 <= this.f || E(4)) {
                                            int i4 = this.e;
                                            char c2 = 0;
                                            for (int i5 = i4; i5 < i4 + 4; i5++) {
                                                char[] cArr2 = this.d;
                                                char c3 = cArr2[i5];
                                                char c4 = (char) (c2 << 4);
                                                if (c3 >= '0' && c3 <= '9') {
                                                    i = c3 - '0';
                                                } else if (c3 >= 'a' && c3 <= 'f') {
                                                    i = c3 - 'W';
                                                } else if (c3 < 'A' || c3 > 'F') {
                                                    throw new NumberFormatException("\\u".concat(new String(cArr2, this.e, 4)));
                                                } else {
                                                    i = c3 - '7';
                                                }
                                                c2 = (char) (c4 + i);
                                            }
                                            this.e += 4;
                                            return c2;
                                        }
                                        throw w("Unterminated escape sequence");
                                    }
                                    throw w("Invalid escape sequence");
                                }
                                return '\t';
                            }
                            return TokenParser.CR;
                        }
                        return '\n';
                    }
                    return '\f';
                }
                return '\b';
            }
            return c;
        }
        throw w("Unterminated escape sequence");
    }

    private final int n(boolean z) throws IOException {
        int i;
        char[] cArr = this.d;
        int i2 = this.e;
        int i3 = this.f;
        while (true) {
            if (i2 == i3) {
                this.e = i2;
                if (!E(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(String.valueOf(t())));
                    }
                    return -1;
                }
                i2 = this.e;
                i3 = this.f;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.g++;
                this.h = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.e = i4;
                    if (i4 == i3) {
                        this.e = i4 - 1;
                        boolean E = E(2);
                        this.e++;
                        if (!E) {
                            return 47;
                        }
                    }
                    A();
                    int i5 = this.e;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.e = i5 + 1;
                        while (true) {
                            if (this.e + 2 <= this.f || E(2)) {
                                char[] cArr2 = this.d;
                                int i6 = this.e;
                                if (cArr2[i6] != '\n') {
                                    while (i < 2) {
                                        i = this.d[this.e + i] == "*/".charAt(i) ? i + 1 : 0;
                                    }
                                    i2 = 2 + this.e;
                                    i3 = this.f;
                                    break;
                                }
                                this.g++;
                                this.h = i6 + 1;
                                this.e++;
                            } else {
                                throw w("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.e = i5 + 1;
                        D();
                        i2 = this.e;
                        i3 = this.f;
                    }
                } else if (c != '#') {
                    this.e = i4;
                    return c;
                } else {
                    this.e = i4;
                    A();
                    D();
                    i2 = this.e;
                    i3 = this.f;
                }
            }
            i2 = i4;
        }
    }

    private final IOException w(String str) throws IOException {
        throw new bnf(str.concat(String.valueOf(t())));
    }

    private String x(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.m;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.l[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.f898o[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.n[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        r1 = r4 - r2;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        r1.append(r0, r2, r4 - r2);
        r9.e = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String y(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.d
            r1 = 0
        L3:
            int r2 = r9.e
            int r3 = r9.f
        L7:
            r4 = r2
        L8:
            r5 = 16
            r6 = 1
            if (r4 >= r3) goto L5a
            int r7 = r4 + 1
            char r4 = r0[r4]
            if (r4 != r10) goto L27
            r9.e = r7
            int r7 = r7 - r2
            int r7 = r7 - r6
            if (r1 != 0) goto L1f
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r2, r7)
            return r10
        L1f:
            r1.append(r0, r2, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L27:
            r8 = 92
            if (r4 != r8) goto L4d
            r9.e = r7
            int r7 = r7 - r2
            int r7 = r7 - r6
            if (r1 != 0) goto L3e
            int r1 = r7 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r3.<init>(r1)
            r1 = r3
        L3e:
            r1.append(r0, r2, r7)
            char r2 = r9.d()
            r1.append(r2)
            int r2 = r9.e
            int r3 = r9.f
            goto L7
        L4d:
            r5 = 10
            if (r4 != r5) goto L58
            int r4 = r9.g
            int r4 = r4 + r6
            r9.g = r4
            r9.h = r7
        L58:
            r4 = r7
            goto L8
        L5a:
            if (r1 != 0) goto L69
            int r1 = r4 - r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r3.<init>(r1)
            r1 = r3
        L69:
            int r3 = r4 - r2
            r1.append(r0, r2, r3)
            r9.e = r4
            boolean r2 = r9.E(r6)
            if (r2 == 0) goto L77
            goto L3
        L77:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.w(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bnc.y(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        A();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String z() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
        L1:
            r1 = 0
            r2 = 0
        L3:
            int r3 = r5.e
            int r3 = r3 + r2
            int r4 = r5.f
            if (r3 >= r4) goto L4c
            char[] r4 = r5.d
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.A()
            goto L58
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r5.E(r3)
            if (r3 != 0) goto L3
        L58:
            r1 = r2
            goto L7a
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            char[] r3 = r5.d
            int r4 = r5.e
            r0.append(r3, r4, r2)
            int r3 = r5.e
            int r3 = r3 + r2
            r5.e = r3
            r2 = 1
            boolean r2 = r5.E(r2)
            if (r2 != 0) goto L1
        L7a:
            if (r0 != 0) goto L86
            char[] r0 = r5.d
            int r2 = r5.e
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r2, r1)
            goto L91
        L86:
            char[] r2 = r5.d
            int r3 = r5.e
            r0.append(r2, r3, r1)
            java.lang.String r3 = r0.toString()
        L91:
            int r0 = r5.e
            int r0 = r0 + r1
            r5.e = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bnc.z():java.lang.String");
    }

    public double a() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            this.a = 0;
            int[] iArr = this.f898o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            char[] cArr = this.d;
            int i3 = this.e;
            int i4 = this.j;
            this.k = new String(cArr, i3, i4);
            this.e = i3 + i4;
        } else if (i == 8 || i == 9) {
            this.k = y(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.k = z();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + ((Object) bnd.a(r())) + t());
        }
        this.a = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (this.c || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.k = null;
            this.a = 0;
            int[] iArr2 = this.f898o;
            int i5 = this.m - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return parseDouble;
        }
        throw new bnf("JSON forbids NaN and infinities: " + parseDouble + t());
    }

    public int b() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.a = 0;
                int[] iArr = this.f898o;
                int i3 = this.m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.i + t());
        }
        if (i == 16) {
            char[] cArr = this.d;
            int i4 = this.e;
            int i5 = this.j;
            this.k = new String(cArr, i4, i5);
            this.e = i4 + i5;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.k = z();
            } else {
                this.k = y(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.k);
                this.a = 0;
                int[] iArr2 = this.f898o;
                int i6 = this.m - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + ((Object) bnd.a(r())) + t());
        }
        this.a = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i7 = (int) parseDouble;
        if (i7 == parseDouble) {
            this.k = null;
            this.a = 0;
            int[] iArr3 = this.f898o;
            int i8 = this.m - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.k + t());
    }

    public long c() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            this.a = 0;
            int[] iArr = this.f898o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            char[] cArr = this.d;
            int i3 = this.e;
            int i4 = this.j;
            this.k = new String(cArr, i3, i4);
            this.e = i3 + i4;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.k = z();
            } else {
                this.k = y(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.k);
                this.a = 0;
                int[] iArr2 = this.f898o;
                int i5 = this.m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + ((Object) bnd.a(r())) + t());
        }
        this.a = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.k = null;
            this.a = 0;
            int[] iArr3 = this.f898o;
            int i6 = this.m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.k + t());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a = 0;
        this.l[0] = 8;
        this.m = 1;
        this.f897b.close();
    }

    public String e() {
        return x(false);
    }

    public String f() {
        return x(true);
    }

    public String g() throws IOException {
        String y;
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 14) {
            y = z();
        } else if (i == 12) {
            y = y('\'');
        } else if (i == 13) {
            y = y('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + ((Object) bnd.a(r())) + t());
        }
        this.a = 0;
        this.n[this.m - 1] = y;
        return y;
    }

    public String h() throws IOException {
        String str;
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 10) {
            str = z();
        } else if (i == 8) {
            str = y('\'');
        } else if (i == 9) {
            str = y('\"');
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else if (i == 16) {
            String str2 = new String(this.d, this.e, this.j);
            this.e += this.j;
            str = str2;
        } else {
            throw new IllegalStateException("Expected a string but was " + ((Object) bnd.a(r())) + t());
        }
        this.a = 0;
        int[] iArr = this.f898o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public void i() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 3) {
            B(1);
            this.f898o[this.m - 1] = 0;
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) bnd.a(r())) + t());
    }

    public void j() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 1) {
            B(3);
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) bnd.a(r())) + t());
    }

    public void k() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 4) {
            int i2 = this.m - 1;
            this.m = i2;
            int[] iArr = this.f898o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) bnd.a(r())) + t());
    }

    public void l() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 2) {
            int i2 = this.m - 1;
            this.m = i2;
            this.n[i2] = null;
            int[] iArr = this.f898o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) bnd.a(r())) + t());
    }

    public void m() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 7) {
            this.a = 0;
            int[] iArr = this.f898o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + ((Object) bnd.a(r())) + t());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x009c, code lost:
        A();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bnc.o():void");
    }

    public boolean p() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public boolean q() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        if (i == 5) {
            this.a = 0;
            int[] iArr = this.f898o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.a = 0;
            int[] iArr2 = this.f898o;
            int i3 = this.m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + ((Object) bnd.a(r())) + t());
        }
    }

    public int r() throws IOException {
        int i = this.a;
        if (i == 0) {
            i = s();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0218, code lost:
        if (F(r1) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x021c, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x021d, code lost:
        if (r10 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x021f, code lost:
        if (r16 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0225, code lost:
        if (r6 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0227, code lost:
        if (r14 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0229, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x022b, code lost:
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x022e, code lost:
        if (r6 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0230, code lost:
        if (r3 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0232, code lost:
        if (r3 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0235, code lost:
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0236, code lost:
        r20.i = r6;
        r20.e += r11;
        r20.a = 15;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0244, code lost:
        r1 = 2;
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0246, code lost:
        if (r10 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0249, code lost:
        if (r10 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x024b, code lost:
        if (r10 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x024d, code lost:
        r20.j = r11;
        r20.a = 16;
        r14 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0288 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bnc.s():int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String t() {
        int i = this.g;
        int i2 = this.e;
        int i3 = this.h;
        return " at line " + (i + 1) + " column " + ((i2 - i3) + 1) + " path " + e();
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(String.valueOf(t()));
    }

    public final void u(boolean z) {
        this.c = z;
    }

    public final boolean v() {
        return this.c;
    }
}
