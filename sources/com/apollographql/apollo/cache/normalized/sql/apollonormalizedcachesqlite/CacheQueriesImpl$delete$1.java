package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.scheduleNext;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$delete$1 extends Lambda implements Styleable.ChangeBounds<scheduleNext, setAnimationMatrix> {
    final /* synthetic */ String $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheQueriesImpl$delete$1(String str) {
        super(1);
        this.$key = str;
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
    }
}
