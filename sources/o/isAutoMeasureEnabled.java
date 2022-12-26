package o;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.FallbackServiceBroker;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.internal.p003firebaseauthapi.zztp;
import com.google.firebase.auth.api.fallback.service.FirebaseAuthFallbackService;
/* loaded from: classes7.dex */
public final class isAutoMeasureEnabled extends FallbackServiceBroker {
    final /* synthetic */ FirebaseAuthFallbackService values;

    public isAutoMeasureEnabled(FirebaseAuthFallbackService firebaseAuthFallbackService, Context context) {
        this.values = firebaseAuthFallbackService;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException {
        Bundle extraArgs = getServiceRequest.getExtraArgs();
        if (extraArgs == null) {
            throw new IllegalArgumentException("ExtraArgs is null.");
        }
        String string = extraArgs.getString("com.google.firebase.auth.API_KEY");
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        iGmsCallbacks.onPostInitComplete(0, new zztp(this.values, string), null);
    }
}
