package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
/* loaded from: classes5.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #0 {Exception -> 0x0093, blocks: (B:7:0x0027, B:28:0x0071, B:29:0x0077, B:30:0x007c, B:31:0x007d, B:33:0x0085, B:14:0x004b, B:17:0x0055, B:20:0x005f), top: B:51:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.rtsp.RtspTrackTiming> parseTrackTiming(java.lang.String r18, android.net.Uri r19) throws com.google.android.exoplayer2.ParserException {
        /*
            com.google.common.collect.ImmutableList$valueOf r0 = new com.google.common.collect.ImmutableList$valueOf
            r0.<init>()
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.split(r2, r1)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto Lca
            r5 = r1[r4]
            java.lang.String r6 = ";"
            java.lang.String[] r6 = com.google.android.exoplayer2.util.Util.split(r5, r6)
            int r7 = r6.length
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 0
            r14 = -1
        L23:
            if (r12 >= r7) goto L99
            r15 = r6[r12]
            java.lang.String r10 = "="
            java.lang.String[] r10 = com.google.android.exoplayer2.util.Util.splitAtFirst(r15, r10)     // Catch: java.lang.Exception -> L93
            r11 = r10[r3]     // Catch: java.lang.Exception -> L93
            r3 = 1
            r10 = r10[r3]     // Catch: java.lang.Exception -> L93
            int r3 = r11.hashCode()     // Catch: java.lang.Exception -> L93
            r16 = r1
            r1 = 113759(0x1bc5f, float:1.5941E-40)
            r17 = r2
            r2 = 2
            if (r3 == r1) goto L5f
            r1 = 116079(0x1c56f, float:1.62661E-40)
            if (r3 == r1) goto L55
            r1 = 1524180539(0x5ad9263b, float:3.05610524E16)
            if (r3 == r1) goto L4b
            goto L69
        L4b:
            java.lang.String r1 = "rtptime"
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L69
            r1 = 2
            goto L6a
        L55:
            java.lang.String r1 = "url"
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L69
            r1 = 0
            goto L6a
        L5f:
            java.lang.String r1 = "seq"
            boolean r1 = r11.equals(r1)     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = -1
        L6a:
            if (r1 == 0) goto L85
            r3 = 1
            if (r1 == r3) goto L7d
            if (r1 != r2) goto L77
            long r1 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Exception -> L93
            r8 = r1
            goto L82
        L77:
            r0 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r11, r0)     // Catch: java.lang.Exception -> L93
            throw r0     // Catch: java.lang.Exception -> L93
        L7d:
            int r1 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L93
            r14 = r1
        L82:
            r1 = r19
            goto L8b
        L85:
            r1 = r19
            android.net.Uri r13 = resolveUri(r10, r1)     // Catch: java.lang.Exception -> L93
        L8b:
            int r12 = r12 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L23
        L93:
            r0 = move-exception
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r15, r0)
            throw r0
        L99:
            r16 = r1
            r17 = r2
            r1 = r19
            if (r13 == 0) goto Lc4
            java.lang.String r2 = r13.getScheme()
            if (r2 == 0) goto Lc4
            r2 = -1
            if (r14 != r2) goto Lb3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 == 0) goto Lc4
        Lb3:
            com.google.android.exoplayer2.source.rtsp.RtspTrackTiming r2 = new com.google.android.exoplayer2.source.rtsp.RtspTrackTiming
            r2.<init>(r8, r14, r13)
            r0.toString(r2)
            int r4 = r4 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L10
        Lc4:
            r0 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r5, r0)
            throw r0
        Lca:
            com.google.common.collect.ImmutableList r0 = r0.ah$a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtspTrackTiming.parseTrackTiming(java.lang.String, android.net.Uri):com.google.common.collect.ImmutableList");
    }

    static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        if (((String) Assertions.checkNotNull(parse2.getHost())).equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return UriUtil.resolveToUri(uri2, str);
        }
        return UriUtil.resolveToUri(uri2 + "/", str);
    }

    private RtspTrackTiming(long j, int i, Uri uri) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i;
        this.uri = uri;
    }
}
