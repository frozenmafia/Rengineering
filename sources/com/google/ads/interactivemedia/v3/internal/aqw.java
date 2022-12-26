package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
/* loaded from: classes4.dex */
public final class aqw extends GoogleApi implements aqr {
    private static final Api.ClientKey a;

    /* renamed from: b  reason: collision with root package name */
    private static final Api.AbstractClientBuilder f679b;
    private static final Api c;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        aqu aquVar = new aqu();
        f679b = aquVar;
        c = new Api("SignalSdk.API", aquVar, clientKey);
    }

    public aqw(Context context) {
        super(context, c, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
