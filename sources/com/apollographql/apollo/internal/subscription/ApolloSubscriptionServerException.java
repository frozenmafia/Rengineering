package com.apollographql.apollo.internal.subscription;

import java.util.Collections;
import java.util.Map;
import o.OnBackPressedDispatcherKt;
/* loaded from: classes.dex */
public class ApolloSubscriptionServerException extends ApolloSubscriptionException {
    public final Map<String, Object> errorPayload;

    public ApolloSubscriptionServerException(Map<String, Object> map) {
        super("Subscription failed");
        this.errorPayload = Collections.unmodifiableMap((Map) OnBackPressedDispatcherKt.values(map, "errorPayload == null"));
    }
}
