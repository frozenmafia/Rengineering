package o;

import com.dreampay.commons.constants.Constants;
import com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityCallback;
import com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityInternalCallback;
import com.phonepe.intent.sdk.api.PhonePe;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public final class keysCompare implements CheckPhonePeAvailabilityInternalCallback {
    public final /* synthetic */ AtomicBoolean ah$a;
    public final /* synthetic */ CheckPhonePeAvailabilityCallback toString;

    public keysCompare(AtomicBoolean atomicBoolean, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        this.ah$a = atomicBoolean;
        this.toString = checkPhonePeAvailabilityCallback;
    }

    @Override // com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityInternalCallback
    public void onFailure(boolean z, String str) {
        beginAsyncSectionFallback.ag$a("checkAvailability", "Received checkAvailability Response " + z + com.dreampay.commons.constants.Constants.WHITE_SPACE + str);
        PhonePe.irjuc(true, Constants.Upi.PHONEPE_SUCCESS, this.ah$a, this.toString);
    }

    @Override // com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityInternalCallback
    public void onSuccess(boolean z, String str) {
        beginAsyncSectionFallback.ag$a("checkAvailability", "Received checkAvailability Response " + z + com.dreampay.commons.constants.Constants.WHITE_SPACE + str);
        PhonePe.irjuc(z, str, this.ah$a, this.toString);
    }
}
