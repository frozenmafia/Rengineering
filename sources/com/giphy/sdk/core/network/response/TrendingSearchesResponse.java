package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Meta;
import java.util.List;
import o.getTargetTypes;
/* loaded from: classes6.dex */
public final class TrendingSearchesResponse implements GenericResponse {
    private List<String> data;
    private Meta meta;

    public TrendingSearchesResponse() {
        this(null, null, 3, null);
    }

    public TrendingSearchesResponse(List<String> list, Meta meta) {
        this.data = list;
        this.meta = meta;
    }

    public /* synthetic */ TrendingSearchesResponse(List list, Meta meta, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : meta);
    }

    public final List<String> getData() {
        return this.data;
    }

    public final void setData(List<String> list) {
        this.data = list;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final void setMeta(Meta meta) {
        this.meta = meta;
    }
}
