package o;

import com.google.android.exoplayer2.C;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class updateDrawerState implements FrameworkSQLiteOpenHelperFactory<SupportSQLiteQuery<Throwable>, SupportSQLiteQuery<Long>> {
    private final long ag$a;
    private final int values;

    public updateDrawerState(int i, long j) {
        this.values = i;
        this.ag$a = j;
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    /* renamed from: ag$a */
    public SupportSQLiteQuery<Long> apply(SupportSQLiteQuery<Throwable> supportSQLiteQuery) {
        runAnimators.ag$a(supportSQLiteQuery, "attempts");
        SupportSQLiteQuery valueOf = supportSQLiteQuery.valueOf(new FrameworkSQLiteOpenHelperFactory<Throwable, SupportSQLiteQuery<Long>>() { // from class: o.updateDrawerState$ah$a
            private int valueOf;

            @Override // o.FrameworkSQLiteOpenHelperFactory
            /* renamed from: valueOf */
            public SupportSQLiteQuery<Long> apply(Throwable th) {
                int i;
                long j;
                runAnimators.ag$a(th, "throwable");
                int i2 = this.valueOf + 1;
                this.valueOf = i2;
                i = updateDrawerState.this.values;
                if (i2 < i) {
                    j = updateDrawerState.this.ag$a;
                    SupportSQLiteQuery<Long> values = SupportSQLiteQuery.values(addTransitionInternal.ah$a(j * this.valueOf, (long) C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS), TimeUnit.MILLISECONDS);
                    runAnimators.ah$a(values, "{\n                      …  )\n                    }");
                    return values;
                }
                SupportSQLiteQuery<Long> valueOf2 = SupportSQLiteQuery.valueOf(th);
                runAnimators.ah$a(valueOf2, "error<Long>(throwable)");
                return valueOf2;
            }
        });
        runAnimators.ah$a(valueOf, "override fun apply(attem…   }\n            })\n    }");
        return valueOf;
    }
}
