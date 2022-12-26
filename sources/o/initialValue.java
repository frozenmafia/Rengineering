package o;

import com.dreampay.commons.constants.Constants;
import com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityCallback;
import com.phonepe.intent.sdk.api.PhonePe;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ChangeBounds;
/* loaded from: classes5.dex */
public final class initialValue implements Runnable {
    public final /* synthetic */ CheckPhonePeAvailabilityCallback ag$a;
    public final /* synthetic */ long ah$a;
    public final /* synthetic */ AtomicBoolean toString;
    public final /* synthetic */ Long valueOf;

    public initialValue(AtomicBoolean atomicBoolean, long j, Long l, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        this.toString = atomicBoolean;
        this.ah$a = j;
        this.valueOf = l;
        this.ag$a = checkPhonePeAvailabilityCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        beginAsyncSectionFallback.ag$a("checkAvailability", "timeout");
        if (!this.toString.get()) {
            ChangeBounds.AnonymousClass4.valueOf.values(this.ah$a, Long.valueOf(currentTimeMillis).longValue() - this.valueOf.longValue());
        }
        PhonePe.irjuc(true, Constants.Upi.PHONEPE_SUCCESS, this.toString, this.ag$a);
    }
}
