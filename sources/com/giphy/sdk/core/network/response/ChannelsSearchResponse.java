package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Channel;
import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.Pagination;
import java.util.List;
/* loaded from: classes6.dex */
public final class ChannelsSearchResponse implements GenericResponse {
    private List<Channel> data;
    private Meta meta;
    private Pagination pagination;

    public ChannelsSearchResponse(List<Channel> list, Pagination pagination, Meta meta) {
        this.data = list;
        this.pagination = pagination;
        this.meta = meta;
    }

    public final List<Channel> getData() {
        return this.data;
    }

    public final void setData(List<Channel> list) {
        this.data = list;
    }

    public final Pagination getPagination() {
        return this.pagination;
    }

    public final void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final void setMeta(Meta meta) {
        this.meta = meta;
    }
}
