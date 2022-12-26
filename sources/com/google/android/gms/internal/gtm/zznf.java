package com.google.android.gms.internal.gtm;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import o.move;
/* loaded from: classes7.dex */
public final class zznf {
    private static int ag$a = 0;
    private static long ah$a = 4268422369874498191L;
    private static char[] toString = {'i', 21227};
    private static int values = 1;
    private String zzafk = "https://www.google-analytics.com";

    public final String zzb(zzmk zzmkVar) {
        String str = this.zzafk;
        String str2 = "";
        if ((zzmkVar.zzlg() ? '>' : '_') != '_') {
            int i = ag$a + 113;
            values = i % 128;
            if (!(i % 2 == 0)) {
                str2 = zzmkVar.zzlh();
            } else {
                str2 = zzmkVar.zzlh();
                Object[] objArr = null;
                int length = objArr.length;
            }
        } else if (zzmkVar != null) {
            String trim = zzmkVar.zzli().trim().equals("") ? false : true ? zzmkVar.zzli().trim() : "-1";
            StringBuilder sb = new StringBuilder();
            if (zzmkVar.zzle() == null) {
                sb.append(ah$a(2 - TextUtils.indexOf("", "", 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0)).intern());
            } else {
                int i2 = ag$a + 121;
                values = i2 % 128;
                int i3 = i2 % 2;
                sb.append(zzmkVar.zzle());
            }
            sb.append("=");
            sb.append(zzbs(zzmkVar.getContainerId()));
            sb.append("&pv=");
            sb.append(zzbs(trim));
            sb.append("&rv=5.0");
            if (zzmkVar.zzlg()) {
                sb.append("&gtm_debug=x");
            }
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("/gtm/android?");
        sb2.append(str2);
        return sb2.toString();
    }

    private static String zzbs(String str) {
        String concat;
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                try {
                    concat = "Cannot encode the string: ".concat(valueOf);
                } catch (Exception e) {
                    throw e;
                }
            } else {
                concat = new String("Cannot encode the string: ");
                int i = ag$a + 79;
                values = i % 128;
                int i2 = i % 2;
            }
            zzev.zzav(concat);
            int i3 = values + 15;
            ag$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 5 : (char) 21) != 21) {
                int i4 = 34 / 0;
                return "";
            }
            return "";
        }
    }

    private static String ah$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((toString[move.values + i2] ^ (move.values * ah$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
