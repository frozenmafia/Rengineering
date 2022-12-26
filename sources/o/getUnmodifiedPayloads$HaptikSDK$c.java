package o;
/* loaded from: classes5.dex */
protected final class getUnmodifiedPayloads$HaptikSDK$c extends hasAnyOfTheFlags<Float> {
    private static getUnmodifiedPayloads$HaptikSDK$c ag$a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String HaptikSDK$a() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String p_() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    private getUnmodifiedPayloads$HaptikSDK$c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static getUnmodifiedPayloads$HaptikSDK$c ah$a() {
        getUnmodifiedPayloads$HaptikSDK$c getunmodifiedpayloads_haptiksdk_c;
        synchronized (getUnmodifiedPayloads$HaptikSDK$c.class) {
            if (ag$a == null) {
                ag$a = new getUnmodifiedPayloads$HaptikSDK$c();
            }
            getunmodifiedpayloads_haptiksdk_c = ag$a;
        }
        return getunmodifiedpayloads_haptiksdk_c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float valueOf() {
        return Float.valueOf(1.0f);
    }
}
