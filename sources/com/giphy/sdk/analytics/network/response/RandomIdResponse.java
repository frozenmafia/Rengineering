package com.giphy.sdk.analytics.network.response;

import com.giphy.sdk.analytics.models.RandomId;
import com.giphy.sdk.core.network.response.GenericResponse;
import o.getTargetTypes;
/* loaded from: classes6.dex */
public final class RandomIdResponse implements GenericResponse {
    private final RandomId data;

    public RandomIdResponse() {
        this(null, 1, null);
    }

    public RandomIdResponse(RandomId randomId) {
        this.data = randomId;
    }

    public /* synthetic */ RandomIdResponse(RandomId randomId, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : randomId);
    }

    public final RandomId getData() {
        return this.data;
    }
}
