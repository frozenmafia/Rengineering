package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkRequestMetric;
import o.ViewInfoStore$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class NetworkRequestMetric$NetworkClientErrorReason$ah$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a ah$a = new NetworkRequestMetric$NetworkClientErrorReason$ah$a();

    private NetworkRequestMetric$NetworkClientErrorReason$ah$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return NetworkRequestMetric.NetworkClientErrorReason.forNumber(i) != null;
    }
}
