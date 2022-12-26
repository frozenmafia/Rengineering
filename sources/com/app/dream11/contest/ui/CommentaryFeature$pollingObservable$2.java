package com.app.dream11.contest.ui;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.SupportSQLiteQuery;
import o.isStateValid;
/* loaded from: classes2.dex */
public final class CommentaryFeature$pollingObservable$2 extends Lambda implements Styleable.ArcMotion<SupportSQLiteQuery<Long>> {
    final /* synthetic */ isStateValid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentaryFeature$pollingObservable$2(isStateValid isstatevalid) {
        super(0);
        this.this$0 = isstatevalid;
    }

    @Override // o.Styleable.ArcMotion
    public final SupportSQLiteQuery<Long> invoke() {
        long j;
        long values;
        j = this.this$0.valueOf;
        values = this.this$0.values();
        return SupportSQLiteQuery.values(j, values, TimeUnit.SECONDS);
    }
}
