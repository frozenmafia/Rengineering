package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transaction;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$recordForKey$1 extends Lambda implements Styleable.ChangeBounds<Transaction, T> {
    final /* synthetic */ Transition $mapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheQueriesImpl$recordForKey$1(Transition transition) {
        super(1);
        this.$mapper = transition;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final T invoke(Transaction transaction) {
        runAnimators.valueOf(transaction, "cursor");
        Transition transition = this.$mapper;
        String valueOf = transaction.valueOf(0);
        if (valueOf == null) {
            runAnimators.values();
        }
        String valueOf2 = transaction.valueOf(1);
        if (valueOf2 == null) {
            runAnimators.values();
        }
        return transition.invoke(valueOf, valueOf2);
    }
}
