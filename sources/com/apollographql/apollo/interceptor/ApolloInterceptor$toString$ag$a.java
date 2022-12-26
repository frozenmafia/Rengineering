package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import o.IntentSenderRequest;
import o.OnBackPressedDispatcherKt;
import o.R;
import o.onStateChanged;
/* loaded from: classes.dex */
public final class ApolloInterceptor$toString$ag$a {
    private boolean ag$a;
    private boolean ah$b;
    private final onStateChanged toString;
    private boolean values;
    private R.dimen valueOf = R.dimen.toString;
    private IntentSenderRequest.AnonymousClass1 HaptikSDK$a = IntentSenderRequest.AnonymousClass1.values;
    private Optional<onStateChanged.values> ah$a = Optional.absent();
    private boolean invoke = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ApolloInterceptor$toString$ag$a(onStateChanged onstatechanged) {
        this.toString = (onStateChanged) OnBackPressedDispatcherKt.values(onstatechanged, "operation == null");
    }

    public ApolloInterceptor$toString$ag$a toString(R.dimen dimenVar) {
        this.valueOf = (R.dimen) OnBackPressedDispatcherKt.values(dimenVar, "cacheHeaders == null");
        return this;
    }

    public ApolloInterceptor$toString$ag$a ah$a(IntentSenderRequest.AnonymousClass1 anonymousClass1) {
        this.HaptikSDK$a = (IntentSenderRequest.AnonymousClass1) OnBackPressedDispatcherKt.values(anonymousClass1, "requestHeaders == null");
        return this;
    }

    public ApolloInterceptor$toString$ag$a valueOf(boolean z) {
        this.values = z;
        return this;
    }

    public ApolloInterceptor$toString$ag$a ah$a(onStateChanged.values valuesVar) {
        this.ah$a = Optional.fromNullable(valuesVar);
        return this;
    }

    public ApolloInterceptor$toString$ag$a ag$a(Optional<onStateChanged.values> optional) {
        this.ah$a = (Optional) OnBackPressedDispatcherKt.values(optional, "optimisticUpdates == null");
        return this;
    }

    public ApolloInterceptor$toString$ag$a ah$a(boolean z) {
        this.invoke = z;
        return this;
    }

    public ApolloInterceptor$toString$ag$a values(boolean z) {
        this.ah$b = z;
        return this;
    }

    public ApolloInterceptor$toString$ag$a toString(boolean z) {
        this.ag$a = z;
        return this;
    }

    public ApolloInterceptor.toString ah$a() {
        return new ApolloInterceptor.toString(this.toString, this.valueOf, this.HaptikSDK$a, this.ah$a, this.values, this.invoke, this.ah$b, this.ag$a);
    }
}
