package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.RandomGif;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class RandomGifResponse implements GenericResponse {
    private RandomGif data;
    private Meta meta;

    public RandomGifResponse() {
        this(null, null, 3, null);
    }

    public RandomGifResponse(RandomGif randomGif, Meta meta) {
        this.data = randomGif;
        this.meta = meta;
    }

    public /* synthetic */ RandomGifResponse(RandomGif randomGif, Meta meta, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : randomGif, (i & 2) != 0 ? null : meta);
    }

    public final RandomGif getData() {
        return this.data;
    }

    public final void setData(RandomGif randomGif) {
        this.data = randomGif;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final void setMeta(Meta meta) {
        this.meta = meta;
    }

    public final MediaResponse toGifResponse() {
        MediaResponse mediaResponse = new MediaResponse(null, null, 3, null);
        RandomGif randomGif = this.data;
        runAnimators.toString(randomGif);
        mediaResponse.setData(randomGif.toGif());
        mediaResponse.setMeta(this.meta);
        return mediaResponse;
    }
}
