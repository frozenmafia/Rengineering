package o;

import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.internal.subscription.ApolloSubscriptionException;
/* loaded from: classes.dex */
public interface clearObservers {

    /* loaded from: classes.dex */
    public interface values<T> {
        void ag$a();

        void ag$a(ApolloSubscriptionException apolloSubscriptionException);

        void ah$a();

        void ah$a(getFlagsMask<T> getflagsmask);

        void toString(Throwable th);

        void values();
    }

    void ag$a();

    void ag$a(Subscription<?, ?, ?> subscription);

    void ah$a();

    void ah$a(setFillInIntent setfillinintent);

    void valueOf(setFillInIntent setfillinintent);

    <T> void values(Subscription<?, T, ?> subscription, values<T> valuesVar);
}
