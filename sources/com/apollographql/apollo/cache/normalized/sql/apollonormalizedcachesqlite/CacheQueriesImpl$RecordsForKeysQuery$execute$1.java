package com.apollographql.apollo.cache.normalized.sql.apollonormalizedcachesqlite;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getLauncher;
import o.reserveEndViewTransition;
import o.runAnimators;
import o.scheduleNext;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CacheQueriesImpl$RecordsForKeysQuery$execute$1 extends Lambda implements Styleable.ChangeBounds<scheduleNext, setAnimationMatrix> {
    final /* synthetic */ getLauncher.values this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheQueriesImpl$RecordsForKeysQuery$execute$1(getLauncher.values valuesVar) {
        super(1);
        this.this$0 = valuesVar;
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
        for (Object obj : this.this$0.toString) {
            int i2 = i + 1;
            if (i < 0) {
                reserveEndViewTransition.ag$a();
            }
            schedulenext.valueOf(i2, (String) obj);
            i = i2;
        }
    }
}
