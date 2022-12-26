package o;
/* loaded from: classes5.dex */
protected final class getUnmodifiedPayloads$HaptikSDK$d extends hasAnyOfTheFlags<Long> {
    private static getUnmodifiedPayloads$HaptikSDK$d valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String HaptikSDK$a() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String ag$a() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String p_() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    private getUnmodifiedPayloads$HaptikSDK$d() {
    }

    public static getUnmodifiedPayloads$HaptikSDK$d ah$a() {
        getUnmodifiedPayloads$HaptikSDK$d getunmodifiedpayloads_haptiksdk_d;
        synchronized (getUnmodifiedPayloads$HaptikSDK$d.class) {
            if (valueOf == null) {
                valueOf = new getUnmodifiedPayloads$HaptikSDK$d();
            }
            getunmodifiedpayloads_haptiksdk_d = valueOf;
        }
        return getunmodifiedpayloads_haptiksdk_d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long valueOf() {
        return 100L;
    }
}
