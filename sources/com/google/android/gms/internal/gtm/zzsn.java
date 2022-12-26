package com.google.android.gms.internal.gtm;

import com.sendbird.android.constant.StringSet;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzsn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzsk zzskVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzskVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0254, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f1, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ff, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0210, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0222, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.gtm.zzsk r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzsn.zza(com.google.android.gms.internal.gtm.zzsk, java.lang.StringBuilder, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(TokenParser.SP);
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zztn.zzd(zzps.zzcy((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzps) {
                sb.append(": \"");
                sb.append(zztn.zzd((zzps) obj));
                sb.append('\"');
            } else if (obj instanceof zzrc) {
                sb.append(" {");
                zza((zzrc) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zza(sb, i4, StringSet.key, entry2.getKey());
                zza(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String zzdd(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
