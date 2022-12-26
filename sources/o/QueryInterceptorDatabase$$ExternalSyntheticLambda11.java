package o;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class QueryInterceptorDatabase$$ExternalSyntheticLambda11 {
    public static final values ag$a = new values();
    public static final QueryInterceptorDatabase$$ExternalSyntheticLambda11$ah$a values = new QueryInterceptorDatabase$$ExternalSyntheticLambda11$ah$a();
    public static final toString valueOf = new toString();
    public static final valueOf toString = new valueOf();
    public static final QueryInterceptorDatabase$$ExternalSyntheticLambda11$ag$a ah$a = new QueryInterceptorDatabase$$ExternalSyntheticLambda11$ag$a();

    /* loaded from: classes7.dex */
    public interface invoke {
        void toString(String str, Appendable appendable);
    }

    public static boolean ag$a(char c) {
        return (c >= 0 && c <= 31) || (c >= 127 && c <= 159) || (c >= 8192 && c <= 8447);
    }

    public static boolean ah$a(char c) {
        return c == '\b' || c == '\f' || c == '\n';
    }

    public static boolean toString(char c) {
        return c == '}' || c == ']' || c == ',' || c == ':';
    }

    public static boolean valueOf(char c) {
        return c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"';
    }

    public static boolean values(char c) {
        return c == '\r' || c == '\n' || c == '\t' || c == ' ';
    }

    QueryInterceptorDatabase$$ExternalSyntheticLambda11() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class values implements QueryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b {
        private values() {
        }

        @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b
        public boolean values(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length != 0 && str.trim() == str) {
                char charAt = str.charAt(0);
                if ((charAt < '0' || charAt > '9') && charAt != '-') {
                    for (int i = 0; i < length; i++) {
                        char charAt2 = str.charAt(i);
                        if (QueryInterceptorDatabase$$ExternalSyntheticLambda11.values(charAt2) || QueryInterceptorDatabase$$ExternalSyntheticLambda11.valueOf(charAt2) || QueryInterceptorDatabase$$ExternalSyntheticLambda11.ah$a(charAt2) || QueryInterceptorDatabase$$ExternalSyntheticLambda11.ag$a(charAt2)) {
                            return true;
                        }
                    }
                    return QueryInterceptorDatabase$$ExternalSyntheticLambda11.ah$a(str);
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class toString implements QueryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b {
        private toString() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
            if (r3 == '.') goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x006b, code lost:
            if (r7 >= r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
            if (r3 < '0') goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
            if (r3 <= '9') goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0078, code lost:
            if (r7 != r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x007a, code lost:
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
            if (r3 == 'E') goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0081, code lost:
            if (r3 != 'e') goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0085, code lost:
            if (r7 != r1) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
            if (r3 == '+') goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0090, code lost:
            if (r3 != '-') goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0092, code lost:
            r7 = r7 + 1;
            r10.charAt(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0097, code lost:
            if (r7 != r1) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x009a, code lost:
            if (r7 >= r1) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x009c, code lost:
            r3 = r10.charAt(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
            if (r3 < '0') goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00a2, code lost:
            if (r3 <= '9') goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00a5, code lost:
            r7 = r7 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00a8, code lost:
            if (r7 != r1) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x00aa, code lost:
            return true;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0076 -> B:44:0x006b). Please submit an issue!!! */
        @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean values(java.lang.String r10) {
            /*
                r9 = this;
                r0 = 0
                if (r10 != 0) goto L4
                return r0
            L4:
                int r1 = r10.length()
                r2 = 1
                if (r1 != 0) goto Lc
                return r2
            Lc:
                java.lang.String r3 = r10.trim()
                if (r3 == r10) goto L13
                return r2
            L13:
                char r3 = r10.charAt(r0)
                boolean r4 = o.QueryInterceptorDatabase$$ExternalSyntheticLambda11.valueOf(r3)
                if (r4 != 0) goto Lac
                boolean r3 = o.QueryInterceptorDatabase$$ExternalSyntheticLambda11.ag$a(r3)
                if (r3 == 0) goto L25
                goto Lac
            L25:
                r3 = 1
            L26:
                if (r3 >= r1) goto L3d
                char r4 = r10.charAt(r3)
                boolean r5 = o.QueryInterceptorDatabase$$ExternalSyntheticLambda11.toString(r4)
                if (r5 != 0) goto L3c
                boolean r4 = o.QueryInterceptorDatabase$$ExternalSyntheticLambda11.ag$a(r4)
                if (r4 == 0) goto L39
                goto L3c
            L39:
                int r3 = r3 + 1
                goto L26
            L3c:
                return r2
            L3d:
                boolean r3 = o.QueryInterceptorDatabase$$ExternalSyntheticLambda11.ah$a(r10)
                if (r3 == 0) goto L44
                return r2
            L44:
                char r3 = r10.charAt(r0)
                r4 = 45
                r5 = 57
                r6 = 48
                if (r3 < r6) goto L52
                if (r3 <= r5) goto L54
            L52:
                if (r3 != r4) goto Lab
            L54:
                r7 = 1
            L55:
                if (r7 >= r1) goto L63
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L63
                if (r3 <= r5) goto L60
                goto L63
            L60:
                int r7 = r7 + 1
                goto L55
            L63:
                if (r7 != r1) goto L66
                return r2
            L66:
                r8 = 46
                if (r3 != r8) goto L6b
                goto L76
            L6b:
                if (r7 >= r1) goto L78
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto L78
                if (r3 <= r5) goto L76
                goto L78
            L76:
                int r7 = r7 + r2
                goto L6b
            L78:
                if (r7 != r1) goto L7b
                return r2
            L7b:
                r8 = 69
                if (r3 == r8) goto L83
                r8 = 101(0x65, float:1.42E-43)
                if (r3 != r8) goto L97
            L83:
                int r7 = r7 + 1
                if (r7 != r1) goto L88
                return r0
            L88:
                char r3 = r10.charAt(r7)
                r8 = 43
                if (r3 == r8) goto L92
                if (r3 != r4) goto L97
            L92:
                int r7 = r7 + 1
                r10.charAt(r7)
            L97:
                if (r7 != r1) goto L9a
                return r0
            L9a:
                if (r7 >= r1) goto La8
                char r3 = r10.charAt(r7)
                if (r3 < r6) goto La8
                if (r3 <= r5) goto La5
                goto La8
            La5:
                int r7 = r7 + 1
                goto L9a
            La8:
                if (r7 != r1) goto Lab
                return r2
            Lab:
                return r0
            Lac:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.QueryInterceptorDatabase$$ExternalSyntheticLambda11.toString.values(java.lang.String):boolean");
        }
    }

    public static boolean ah$a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            return str.equals("null");
        }
        if (charAt == 't') {
            return str.equals("true");
        }
        if (charAt == 'f') {
            return str.equals(com.facebook.hermes.intl.Constants.CASEFIRST_FALSE);
        }
        if (charAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class valueOf implements invoke {
        private valueOf() {
        }

        @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda11.invoke
        public void toString(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == '\f') {
                        appendable.append("\\f");
                    } else if (charAt == '\r') {
                        appendable.append("\\r");
                    } else if (charAt == '\"') {
                        appendable.append("\\\"");
                    } else if (charAt == '\\') {
                        appendable.append("\\\\");
                    } else {
                        switch (charAt) {
                            case '\b':
                                appendable.append("\\b");
                                continue;
                            case '\t':
                                appendable.append("\\t");
                                continue;
                            case '\n':
                                appendable.append("\\n");
                                continue;
                            default:
                                if (charAt >= 0) {
                                    if (charAt > 31) {
                                    }
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                    continue;
                                }
                                if ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447)) {
                                    appendable.append(charAt);
                                    break;
                                }
                                appendable.append("\\u");
                                appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                continue;
                        }
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exeption");
            }
        }
    }
}
