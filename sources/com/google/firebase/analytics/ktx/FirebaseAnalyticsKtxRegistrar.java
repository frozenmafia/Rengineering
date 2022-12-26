package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o.MessageThreadUtil;
import o.StableIdStorage;
import o.reserveEndViewTransition;
/* loaded from: classes7.dex */
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<MessageThreadUtil.SyncQueueItem<?>> values() {
        return reserveEndViewTransition.ag$a(StableIdStorage.SharedPoolStableIdStorage.toString("fire-analytics-ktx", "21.2.0"));
    }
}
