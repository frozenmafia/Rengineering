package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import java.util.logging.Logger;
import o.animateAddImpl;
import o.getLocalAdapterPosition;
import o.markViewHoldersUpdated;
import o.removeViewIfHidden;
/* loaded from: classes7.dex */
abstract class AggregateFuture<InputT, OutputT> extends getLocalAdapterPosition<OutputT> {
    private static final Logger ag$a = Logger.getLogger(AggregateFuture.class.getName());
    private ImmutableCollection<? extends animateAddImpl<? extends InputT>> ah$a;

    /* loaded from: classes7.dex */
    enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    @Override // o.countItemsBefore
    public final void valueOf() {
        super.valueOf();
        ImmutableCollection<? extends animateAddImpl<? extends InputT>> immutableCollection = this.ah$a;
        values(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean invoke = invoke();
            removeViewIfHidden<? extends animateAddImpl<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(invoke);
            }
        }
    }

    @Override // o.countItemsBefore
    public final String HaptikSDK$a() {
        ImmutableCollection<? extends animateAddImpl<? extends InputT>> immutableCollection = this.ah$a;
        if (immutableCollection != null) {
            String valueOf = String.valueOf(immutableCollection);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.HaptikSDK$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(ReleaseResourcesReason releaseResourcesReason) {
        markViewHoldersUpdated.toString(releaseResourcesReason);
        this.ah$a = null;
    }
}
