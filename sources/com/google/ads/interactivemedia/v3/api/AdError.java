package com.google.ads.interactivemedia.v3.api;
/* loaded from: classes4.dex */
public final class AdError extends Exception {
    private final AdErrorCode a;

    /* renamed from: b  reason: collision with root package name */
    private final AdErrorType f414b;

    /* loaded from: classes4.dex */
    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(200),
        VAST_LOAD_TIMEOUT(301),
        VAST_TOO_MANY_REDIRECTS(302),
        VIDEO_PLAY_ERROR(400),
        VAST_MEDIA_LOAD_TIMEOUT(402),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(500),
        OVERLAY_AD_LOADING_FAILED(502),
        VAST_NONLINEAR_ASSET_MISMATCH(503),
        COMPANION_AD_LOADING_FAILED(603),
        UNKNOWN_ERROR(900),
        VAST_EMPTY_RESPONSE(1009),
        FAILED_TO_REQUEST_ADS(1005),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(1012),
        INVALID_ARGUMENTS(1101),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f415b;

        AdErrorCode(int i) {
            this.f415b = i;
        }

        public boolean equals(int i) {
            return this.f415b == i;
        }

        public int getErrorNumber() {
            return this.f415b;
        }

        @Override // java.lang.Enum
        public String toString() {
            String name = name();
            int i = this.f415b;
            return "AdErrorCode [name: " + name + ", number: " + i + "]";
        }
    }

    /* loaded from: classes4.dex */
    public enum AdErrorType {
        LOAD,
        PLAY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdError(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode[] r0 = com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            int r4 = r3.getErrorNumber()
            if (r4 != r7) goto L11
            goto L1d
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            r0 = 1204(0x4b4, float:1.687E-42)
            if (r7 != r0) goto L1b
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode r3 = com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.INTERNAL_ERROR
            goto L1d
        L1b:
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode r3 = com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.UNKNOWN_ERROR
        L1d:
            r5.<init>(r6, r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.api.AdError.<init>(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, int, java.lang.String):void");
    }

    public AdErrorCode getErrorCode() {
        return this.a;
    }

    public int getErrorCodeNumber() {
        return this.a.getErrorNumber();
    }

    public AdErrorType getErrorType() {
        return this.f414b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        String valueOf = String.valueOf(this.f414b);
        String valueOf2 = String.valueOf(this.a);
        String message = getMessage();
        return "AdError [errorType: " + valueOf + ", errorCode: " + valueOf2 + ", message: " + message + "]";
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.f414b = adErrorType;
        this.a = adErrorCode;
    }
}
