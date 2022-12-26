package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.Pagination;
import java.util.List;
import o.getTargetTypes;
/* loaded from: classes4.dex */
public final class ListMediaResponse implements GenericResponse {
    private List<Media> data;
    private Meta meta;
    private Pagination pagination;

    public ListMediaResponse() {
        this(null, null, null, 7, null);
    }

    public ListMediaResponse(List<Media> list, Pagination pagination, Meta meta) {
        this.data = list;
        this.pagination = pagination;
        this.meta = meta;
    }

    public /* synthetic */ ListMediaResponse(List list, Pagination pagination, Meta meta, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : pagination, (i & 4) != 0 ? null : meta);
    }

    public final List<Media> getData() {
        return this.data;
    }

    public final void setData(List<Media> list) {
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
