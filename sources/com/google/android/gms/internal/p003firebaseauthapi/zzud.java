package com.google.android.gms.internal.p003firebaseauthapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzud  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzud extends Api.AbstractClientBuilder<zztm, zzuf> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ zztm buildClient(Context context, Looper looper, ClientSettings clientSettings, zzuf zzufVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zztn(context, looper, clientSettings, zzufVar, connectionCallbacks, onConnectionFailedListener);
    }
}
