package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class acx {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final String f473b;
    public final zy c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r6.equals(com.google.android.exoplayer2.C.CENC_TYPE_cenc) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public acx(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r11 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2 = r2 ^ r3
            com.google.ads.interactivemedia.v3.internal.af.u(r2)
            r4.a = r5
            r4.f473b = r6
            r4.d = r7
            r4.e = r11
            r5 = 2
            if (r6 != 0) goto L1f
            goto L75
        L1f:
            int r7 = r6.hashCode()
            r11 = 3
            switch(r7) {
                case 3046605: goto L45;
                case 3046671: goto L3b;
                case 3049879: goto L32;
                case 3049895: goto L28;
                default: goto L27;
            }
        L27:
            goto L4f
        L28:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            r0 = 1
            goto L50
        L32:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            goto L50
        L3b:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            r0 = 3
            goto L50
        L45:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            r0 = 2
            goto L50
        L4f:
            r0 = -1
        L50:
            if (r0 == 0) goto L75
            if (r0 == r1) goto L75
            if (r0 == r5) goto L74
            if (r0 == r11) goto L74
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Unsupported protection scheme type '"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "TrackEncryptionBox"
            com.google.ads.interactivemedia.v3.internal.cc.e(r6, r5)
            goto L75
        L74:
            r1 = 2
        L75:
            com.google.ads.interactivemedia.v3.internal.zy r5 = new com.google.ads.interactivemedia.v3.internal.zy
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acx.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
