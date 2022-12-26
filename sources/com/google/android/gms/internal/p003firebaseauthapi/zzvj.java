package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvj implements OnFailureListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvj(zzvn zzvnVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        logger = zzvn.zza;
        String valueOf = String.valueOf(exc.getMessage());
        logger.e(valueOf.length() != 0 ? "SmsRetrieverClient failed to start: ".concat(valueOf) : new String("SmsRetrieverClient failed to start: "), new Object[0]);
    }
}
