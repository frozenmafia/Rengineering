package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transaction;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$changes$1 extends Lambda implements Styleable.ChangeBounds<Transaction, Long> {
    public static final CacheQueriesImpl$changes$1 INSTANCE = new CacheQueriesImpl$changes$1();

    CacheQueriesImpl$changes$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Long invoke(Transaction transaction) {
        return Long.valueOf(invoke2(transaction));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final long invoke2(Transaction transaction) {
        runAnimators.valueOf(transaction, "cursor");
        Long transaction2 = transaction.toString(0);
        if (transaction2 == null) {
            runAnimators.values();
        }
        return transaction2.longValue();
    }
}
