package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Meta;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ErrorResponse implements GenericResponse {
    private final String message;
    private Meta meta;

    public ErrorResponse(int i, String str) {
        this.meta = new Meta(i, str, null, 4, null);
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final void setMeta(Meta meta) {
        runAnimators.ag$a(meta, "<set-?>");
        this.meta = meta;
    }

    public final String getMessage() {
        return this.message;
    }
}
