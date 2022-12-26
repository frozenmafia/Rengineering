package com.apollographql.apollo;

import com.apollographql.apollo.exception.ApolloException;
import o.getFillInIntent;
import o.saveState;
/* loaded from: classes.dex */
public interface ApolloSubscriptionCall<T> extends getFillInIntent {

    /* loaded from: classes.dex */
    public enum CachePolicy {
        NO_CACHE,
        NETWORK_ONLY,
        CACHE_AND_NETWORK
    }

    /* loaded from: classes.dex */
    public interface toString<T> {
        void ag$a();

        void ah$a(ApolloException apolloException);

        void toString(saveState<T> savestate);

        void valueOf();

        void values();
    }

    void ag$a(toString<T> tostring);

    ApolloSubscriptionCall<T> ah$a();
}
