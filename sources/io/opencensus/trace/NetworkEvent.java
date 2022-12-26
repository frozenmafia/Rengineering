package io.opencensus.trace;

import o.SlidingPaneLayout;
@Deprecated
/* loaded from: classes7.dex */
public abstract class NetworkEvent extends SlidingPaneLayout.DisableLayerRunnable {

    /* loaded from: classes7.dex */
    public enum Type {
        SENT,
        RECV
    }

    NetworkEvent() {
    }
}
