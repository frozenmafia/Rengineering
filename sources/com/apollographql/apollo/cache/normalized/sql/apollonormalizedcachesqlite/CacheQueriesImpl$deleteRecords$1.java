package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reserveEndViewTransition;
import o.runAnimators;
import o.scheduleNext;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$deleteRecords$1 extends Lambda implements Styleable.ChangeBounds<scheduleNext, setAnimationMatrix> {
    final /* synthetic */ Collection $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheQueriesImpl$deleteRecords$1(Collection collection) {
        super(1);
        this.$key = collection;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(scheduleNext schedulenext) {
        invoke2(schedulenext);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(scheduleNext schedulenext) {
        runAnimators.valueOf(schedulenext, "$receiver");
        int i = 0;
        for (Object obj : this.$key) {
            int i2 = i + 1;
            if (i < 0) {
                reserveEndViewTransition.ag$a();
            }
            schedulenext.valueOf(i2, (String) obj);
            i = i2;
        }
    }
}
