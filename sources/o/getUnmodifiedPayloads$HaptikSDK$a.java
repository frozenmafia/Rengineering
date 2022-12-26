package o;
/* loaded from: classes5.dex */
protected final class getUnmodifiedPayloads$HaptikSDK$a extends hasAnyOfTheFlags<Long> {
    private static getUnmodifiedPayloads$HaptikSDK$a ah$a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String HaptikSDK$a() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String ag$a() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String p_() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    private getUnmodifiedPayloads$HaptikSDK$a() {
    }

    public static getUnmodifiedPayloads$HaptikSDK$a valueOf() {
        getUnmodifiedPayloads$HaptikSDK$a getunmodifiedpayloads_haptiksdk_a;
        synchronized (getUnmodifiedPayloads$HaptikSDK$a.class) {
            if (ah$a == null) {
                ah$a = new getUnmodifiedPayloads$HaptikSDK$a();
            }
            getunmodifiedpayloads_haptiksdk_a = ah$a;
        }
        return getunmodifiedpayloads_haptiksdk_a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long ah$a() {
        return 0L;
    }
}
