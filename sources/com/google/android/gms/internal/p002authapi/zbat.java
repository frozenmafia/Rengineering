package com.google.android.gms.internal.p002authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbn;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
/* renamed from: com.google.android.gms.internal.auth-api.zbat  reason: invalid package */
/* loaded from: classes7.dex */
final class zbat extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zbaz(context, looper, (zbn) obj, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
