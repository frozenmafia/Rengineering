package o;

import com.apollographql.apollo.ApolloCall;
/* loaded from: classes.dex */
public interface peekAvailableContext<T> extends getFillInIntent {
    peekAvailableContext<T> ag$a(ApolloCall.valueOf<T> valueof);

    @Override // o.getFillInIntent
    void ag$a();

    void valueOf();

    peekAvailableContext<T> values();
}
