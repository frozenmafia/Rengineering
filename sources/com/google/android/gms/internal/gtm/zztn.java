package com.google.android.gms.internal.gtm;

import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
final class zztn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(zzps zzpsVar) {
        zzto zztoVar = new zzto(zzpsVar);
        StringBuilder sb = new StringBuilder(zztoVar.size());
        for (int i = 0; i < zztoVar.size(); i++) {
            byte zzak = zztoVar.zzak(i);
            if (zzak == 34) {
                sb.append("\\\"");
            } else if (zzak == 39) {
                sb.append("\\'");
            } else if (zzak != 92) {
                switch (zzak) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zzak >= 32 && zzak <= 126) {
                            sb.append((char) zzak);
                            continue;
                        } else {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((zzak >>> 6) & 3) + 48));
                            sb.append((char) (((zzak >>> 3) & 7) + 48));
                            sb.append((char) ((zzak & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
