package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getResultContract;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$recordsForKeys$2 extends Lambda implements Transition<String, String, getResultContract> {
    public static final CacheQueriesImpl$recordsForKeys$2 INSTANCE = new CacheQueriesImpl$recordsForKeys$2();

    CacheQueriesImpl$recordsForKeys$2() {
        super(2);
    }

    @Override // o.Transition
    public final getResultContract invoke(String str, String str2) {
        runAnimators.valueOf(str, "key_");
        runAnimators.valueOf(str2, "record");
        return new getResultContract(str, str2);
    }
}
