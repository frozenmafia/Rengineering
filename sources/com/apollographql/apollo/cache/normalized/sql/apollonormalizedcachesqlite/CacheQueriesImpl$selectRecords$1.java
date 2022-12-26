package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transaction;
import o.excludeObject;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$selectRecords$1 extends Lambda implements Styleable.ChangeBounds<Transaction, T> {
    final /* synthetic */ excludeObject $mapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CacheQueriesImpl$selectRecords$1(excludeObject excludeobject) {
        super(1);
        this.$mapper = excludeobject;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final T invoke(Transaction transaction) {
        runAnimators.valueOf(transaction, "cursor");
        excludeObject excludeobject = this.$mapper;
        Long transaction2 = transaction.toString(0);
        if (transaction2 == null) {
            runAnimators.values();
        }
        String valueOf = transaction.valueOf(1);
        if (valueOf == null) {
            runAnimators.values();
        }
        String valueOf2 = transaction.valueOf(2);
        if (valueOf2 == null) {
            runAnimators.values();
        }
        return excludeobject.invoke(transaction2, valueOf, valueOf2);
    }
}
