package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import com.sendbird.android.constant.StringSet;
import kotlin.jvm.internal.Lambda;
import o.excludeObject;
import o.getInput;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$selectRecords$2 extends Lambda implements excludeObject<Long, String, String, getInput> {
    public static final CacheQueriesImpl$selectRecords$2 INSTANCE = new CacheQueriesImpl$selectRecords$2();

    CacheQueriesImpl$selectRecords$2() {
        super(3);
    }

    @Override // o.excludeObject
    public /* synthetic */ getInput invoke(Long l, String str, String str2) {
        return invoke(l.longValue(), str, str2);
    }

    public final getInput invoke(long j, String str, String str2) {
        runAnimators.valueOf(str, StringSet.key);
        runAnimators.valueOf(str2, "record");
        return new getInput(j, str, str2);
    }
}
