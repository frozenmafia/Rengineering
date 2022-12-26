package io.reactivex.rxjava3.internal.operators.flowable;

import o.addStruct;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
public final class FlowableInternalHelper {

    /* loaded from: classes7.dex */
    public enum RequestMax implements addStruct<getSidecarVersion> {
        INSTANCE;

        @Override // o.addStruct
        public void accept(getSidecarVersion getsidecarversion) {
            getsidecarversion.request(Long.MAX_VALUE);
        }
    }
}
