package androidx.core.net;

import o.moveToFirst;
/* loaded from: classes6.dex */
public final class UriCompat {
    private static char ag$a = 30903;
    private static char ah$a = 50639;
    private static int invoke = 1;
    private static char toString = 38605;
    private static char valueOf = 24016;
    private static int values;

    private UriCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
        if ((r0 % 2) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ae, code lost:
        r13.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b3, code lost:
        r0 = 99 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b7, code lost:
        r13.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01be, code lost:
        return r13.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if ((r0 == null) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r0.equalsIgnoreCase("tel") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        r6 = androidx.core.net.UriCompat.values + 47;
        androidx.core.net.UriCompat.invoke = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        if ((r6 % 2) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        r7 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r0.equalsIgnoreCase("sip") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r6 == true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
        if (r0.equalsIgnoreCase("sip") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
        if (r0.equalsIgnoreCase("sms") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (r6 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
        if (r0.equalsIgnoreCase("smsto") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
        if (r0.equalsIgnoreCase("mailto") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
        if (r0.equalsIgnoreCase("nfc") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
        if (r0.equalsIgnoreCase(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
        r6 = androidx.core.net.UriCompat.invoke + 103;
        androidx.core.net.UriCompat.values = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r0.equalsIgnoreCase(ag$a(new char[]{41522, 19050, 65383, 40574, 13496, 19733}, 6 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))).intern()) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r0.equalsIgnoreCase("ftp") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
        if (r6 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
        if (r0.equalsIgnoreCase("rtsp") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("//");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13.getHost() == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
        if (r6 == true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
        r6 = r13.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ed, code lost:
        r6 = androidx.core.net.UriCompat.values + 43;
        androidx.core.net.UriCompat.invoke = r6 % 128;
        r6 = r6 % 2;
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
        r5.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
        if (r13.getPort() == (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0102, code lost:
        r7 = ":" + r13.getPort();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0117, code lost:
        r5.append(r7);
        r5.append("/...");
        r5 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
        r13 = new java.lang.StringBuilder(64);
        r13.append(r0);
        r13.append(':');
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
        if (r5 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
        r0 = androidx.core.net.UriCompat.invoke + 111;
        androidx.core.net.UriCompat.values = r0 % 128;
        r0 = r0 % 2;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (r0 >= r5.length()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
        r1 = androidx.core.net.UriCompat.values + 41;
        androidx.core.net.UriCompat.invoke = r1 % 128;
        r1 = r1 % 2;
        r1 = r5.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0152, code lost:
        if (r1 == '-') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0156, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0157, code lost:
        if (r6 == true) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0159, code lost:
        if (r1 == '@') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015d, code lost:
        if (r1 != '.') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0160, code lost:
        r13.append('x');
        r1 = androidx.core.net.UriCompat.values + 41;
        androidx.core.net.UriCompat.invoke = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0170, code lost:
        r13.append(r1);
        r1 = androidx.core.net.UriCompat.values + 61;
        androidx.core.net.UriCompat.invoke = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017d, code lost:
        r1 = r1 % 2;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0184, code lost:
        return r13.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0185, code lost:
        r13 = new java.lang.StringBuilder(64);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018c, code lost:
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018e, code lost:
        r6 = ']';
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0191, code lost:
        r6 = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0193, code lost:
        if (r6 == ']') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0196, code lost:
        r13.append(r0);
        r13.append(':');
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019c, code lost:
        if (r5 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019f, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a0, code lost:
        if (r4 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a2, code lost:
        r0 = androidx.core.net.UriCompat.invoke + 67;
        androidx.core.net.UriCompat.values = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((r0 == null) != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String toSafeString(android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.net.UriCompat.toSafeString(android.net.Uri):java.lang.String");
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + valueOf)) ^ ((cArr3[0] >>> 5) + ag$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + toString)) ^ ((cArr3[1] >>> 5) + ah$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
