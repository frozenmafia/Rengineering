package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkConnectionInfo;
import o.ViewInfoStore$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class NetworkConnectionInfo$NetworkType$ag$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a ag$a = new NetworkConnectionInfo$NetworkType$ag$a();

    private NetworkConnectionInfo$NetworkType$ag$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return NetworkConnectionInfo.NetworkType.forNumber(i) != null;
    }
}
