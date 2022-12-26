package o;
/* loaded from: classes5.dex */
protected final class getUnmodifiedPayloads$HaptikSDK$b extends hasAnyOfTheFlags<Boolean> {
    private static getUnmodifiedPayloads$HaptikSDK$b ah$a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String HaptikSDK$a() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String p_() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    protected getUnmodifiedPayloads$HaptikSDK$b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static getUnmodifiedPayloads$HaptikSDK$b valueOf() {
        getUnmodifiedPayloads$HaptikSDK$b getunmodifiedpayloads_haptiksdk_b;
        synchronized (getUnmodifiedPayloads$HaptikSDK$b.class) {
            if (ah$a == null) {
                ah$a = new getUnmodifiedPayloads$HaptikSDK$b();
            }
            getunmodifiedpayloads_haptiksdk_b = ah$a;
        }
        return getunmodifiedpayloads_haptiksdk_b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean ah$a() {
        return true;
    }
}
