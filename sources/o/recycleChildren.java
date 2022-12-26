package o;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseException;
/* loaded from: classes5.dex */
public class recycleChildren implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final Exception getException(Status status) {
        if (status.getStatusCode() == 8) {
            return new FirebaseException(status.zza());
        }
        return new FirebaseApiNotAvailableException(status.zza());
    }
}
