package o;
/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: classes5.dex */
public final class getUnmodifiedPayloads$HaptikSDK$e extends hasAnyOfTheFlags<Long> {
    private static getUnmodifiedPayloads$HaptikSDK$e ah$a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String HaptikSDK$a() {
        return "fpr_session_max_duration_min";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String ag$a() {
        return "sessions_max_length_minutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String p_() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    private getUnmodifiedPayloads$HaptikSDK$e() {
    }

    public static getUnmodifiedPayloads$HaptikSDK$e valueOf() {
        getUnmodifiedPayloads$HaptikSDK$e getunmodifiedpayloads_haptiksdk_e;
        synchronized (getUnmodifiedPayloads$HaptikSDK$e.class) {
            if (ah$a == null) {
                ah$a = new getUnmodifiedPayloads$HaptikSDK$e();
            }
            getunmodifiedpayloads_haptiksdk_e = ah$a;
        }
        return getunmodifiedpayloads_haptiksdk_e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long ah$a() {
        return 240L;
    }
}
