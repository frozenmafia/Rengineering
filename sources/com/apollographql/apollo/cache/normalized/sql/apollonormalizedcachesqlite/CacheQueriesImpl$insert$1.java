package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.scheduleNext;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$insert$1 extends Lambda implements Styleable.ChangeBounds<scheduleNext, setAnimationMatrix> {
    final /* synthetic */ String $key;
    final /* synthetic */ String $record;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheQueriesImpl$insert$1(String str, String str2) {
        super(1);
        this.$key = str;
        this.$record = str2;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(scheduleNext schedulenext) {
        invoke2(schedulenext);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(scheduleNext schedulenext) {
        runAnimators.valueOf(schedulenext, "$receiver");
        schedulenext.valueOf(1, this.$key);
        schedulenext.valueOf(2, this.$record);
    }
}
