package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class rf extends Exception {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1244b;
    public final rd c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rf(com.google.ads.interactivemedia.v3.internal.s r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: ["
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = "], "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r6 = r11.l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            r14.append(r0)
            java.lang.String r0 = "neg_"
            r14.append(r0)
            r14.append(r11)
            java.lang.String r4 = r1.toString()
            java.lang.String r9 = r14.toString()
            r8 = 0
            r3 = r10
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.rf.<init>(com.google.ads.interactivemedia.v3.internal.s, java.lang.Throwable, boolean, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ rf a(rf rfVar, rf rfVar2) {
        return new rf(rfVar.getMessage(), rfVar.getCause(), rfVar.a, rfVar.f1244b, rfVar.c, rfVar.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rf(com.google.ads.interactivemedia.v3.internal.s r11, java.lang.Throwable r12, boolean r13, com.google.ads.interactivemedia.v3.internal.rd r14) {
        /*
            r10 = this;
            java.lang.String r0 = r14.a
            java.lang.String r1 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Decoder init failed: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r11.l
            int r11 = com.google.ads.interactivemedia.v3.internal.cp.a
            r0 = 21
            if (r11 < r0) goto L33
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L33
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            goto L34
        L33:
            r11 = 0
        L34:
            r9 = r11
            r3 = r10
            r5 = r12
            r7 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.rf.<init>(com.google.ads.interactivemedia.v3.internal.s, java.lang.Throwable, boolean, com.google.ads.interactivemedia.v3.internal.rd):void");
    }

    private rf(String str, Throwable th, String str2, boolean z, rd rdVar, String str3) {
        super(str, th);
        this.a = str2;
        this.f1244b = z;
        this.c = rdVar;
        this.d = str3;
    }
}
