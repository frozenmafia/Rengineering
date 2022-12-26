package o;

import java.io.IOException;
import o.QueryInterceptorDatabase$$ExternalSyntheticLambda11;
/* loaded from: classes7.dex */
class QueryInterceptorDatabase$$ExternalSyntheticLambda11$ag$a implements QueryInterceptorDatabase$$ExternalSyntheticLambda11.invoke {
    private QueryInterceptorDatabase$$ExternalSyntheticLambda11$ag$a() {
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
                } else if (charAt == '/') {
                    appendable.append("\\/");
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
            throw new RuntimeException("Impossible Error");
        }
    }
}
