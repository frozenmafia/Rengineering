package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.Meta;
import o.getTargetTypes;
/* loaded from: classes4.dex */
public final class MediaResponse implements GenericResponse {
    private Media data;
    private Meta meta;

    public MediaResponse() {
        this(null, null, 3, null);
    }

    public MediaResponse(Media media, Meta meta) {
        this.data = media;
        this.meta = meta;
    }

    public /* synthetic */ MediaResponse(Media media, Meta meta, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : media, (i & 2) != 0 ? null : meta);
    }

    public final Media getData() {
        return this.data;
    }

    public final void setData(Media media) {
        this.data = media;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final void setMeta(Meta meta) {
        this.meta = meta;
    }
}
