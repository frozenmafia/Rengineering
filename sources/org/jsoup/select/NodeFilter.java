package org.jsoup.select;

import o.SidecarAdapter;
/* loaded from: classes8.dex */
public interface NodeFilter {

    /* loaded from: classes8.dex */
    public enum FilterResult {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    FilterResult valueOf(SidecarAdapter sidecarAdapter, int i);

    FilterResult values(SidecarAdapter sidecarAdapter, int i);
}
