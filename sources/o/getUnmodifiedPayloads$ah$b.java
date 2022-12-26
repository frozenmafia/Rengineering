package o;
/* loaded from: classes7.dex */
protected final class getUnmodifiedPayloads$ah$b extends hasAnyOfTheFlags<Long> {
    private static getUnmodifiedPayloads$ah$b values;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String HaptikSDK$a() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String p_() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    private getUnmodifiedPayloads$ah$b() {
    }

    public static getUnmodifiedPayloads$ah$b valueOf() {
        getUnmodifiedPayloads$ah$b getunmodifiedpayloads_ah_b;
        synchronized (getUnmodifiedPayloads$ah$b.class) {
            if (values == null) {
                values = new getUnmodifiedPayloads$ah$b();
            }
            getunmodifiedpayloads_ah_b = values;
        }
        return getunmodifiedpayloads_ah_b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long ah$a() {
        return 600L;
    }
}
