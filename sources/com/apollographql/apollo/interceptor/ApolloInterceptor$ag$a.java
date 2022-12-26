package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import java.util.Collection;
import o.ContextAwareKt;
import o.saveState;
import okhttp3.Response;
/* loaded from: classes.dex */
public final class ApolloInterceptor$ag$a {
    public final Optional<Response> ag$a;
    public final Optional<saveState> ah$a;
    public final Optional<Collection<ContextAwareKt>> valueOf;

    public ApolloInterceptor$ag$a(Response response) {
        this(response, null, null);
    }

    public ApolloInterceptor$ag$a(Response response, saveState savestate, Collection<ContextAwareKt> collection) {
        this.ag$a = Optional.fromNullable(response);
        this.ah$a = Optional.fromNullable(savestate);
        this.valueOf = Optional.fromNullable(collection);
    }
}
