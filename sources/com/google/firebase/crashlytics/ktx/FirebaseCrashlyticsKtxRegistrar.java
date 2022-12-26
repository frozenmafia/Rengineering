package com.google.firebase.crashlytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o.MessageThreadUtil;
import o.StableIdStorage;
import o.reserveEndViewTransition;
/* loaded from: classes7.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<MessageThreadUtil.SyncQueueItem<?>> values() {
        return reserveEndViewTransition.ag$a(StableIdStorage.SharedPoolStableIdStorage.toString("fire-cls-ktx", "18.3.1"));
    }
}
