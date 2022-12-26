package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getCallerContract;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$recordForKey$2 extends Lambda implements Transition<String, String, getCallerContract> {
    public static final CacheQueriesImpl$recordForKey$2 INSTANCE = new CacheQueriesImpl$recordForKey$2();

    CacheQueriesImpl$recordForKey$2() {
        super(2);
    }

    @Override // o.Transition
    public final getCallerContract invoke(String str, String str2) {
        runAnimators.valueOf(str, "key_");
        runAnimators.valueOf(str2, "record");
        return new getCallerContract(str, str2);
    }
}
