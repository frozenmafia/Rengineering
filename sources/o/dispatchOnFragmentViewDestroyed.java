package o;

import android.content.Intent;
import java.util.UUID;
/* loaded from: classes4.dex */
public final class dispatchOnFragmentViewDestroyed {
    public static final dispatchOnFragmentViewDestroyed$ah$a ah$a = new dispatchOnFragmentViewDestroyed$ah$a(null);
    private static dispatchOnFragmentViewDestroyed toString;
    private final UUID ag$a;
    private Intent valueOf;
    private int values;

    public dispatchOnFragmentViewDestroyed(int i) {
        this(i, null, 2, null);
    }

    public dispatchOnFragmentViewDestroyed(int i, UUID uuid) {
        runAnimators.ag$a(uuid, "callId");
        this.values = i;
        this.ag$a = uuid;
    }

    public static final /* synthetic */ dispatchOnFragmentViewDestroyed ag$a() {
        if (isStateAtLeast.values(dispatchOnFragmentViewDestroyed.class)) {
            return null;
        }
        try {
            return toString;
        } catch (Throwable th) {
            isStateAtLeast.values(th, dispatchOnFragmentViewDestroyed.class);
            return null;
        }
    }

    public static final /* synthetic */ void ag$a(dispatchOnFragmentViewDestroyed dispatchonfragmentviewdestroyed) {
        if (isStateAtLeast.values(dispatchOnFragmentViewDestroyed.class)) {
            return;
        }
        try {
            toString = dispatchonfragmentviewdestroyed;
        } catch (Throwable th) {
            isStateAtLeast.values(th, dispatchOnFragmentViewDestroyed.class);
        }
    }

    public final int valueOf() {
        if (isStateAtLeast.values(this)) {
            return 0;
        }
        try {
            return this.values;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dispatchOnFragmentViewDestroyed(int r1, java.util.UUID r2, int r3, o.getTargetTypes r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r3 = "randomUUID()"
            o.runAnimators.ah$a(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dispatchOnFragmentViewDestroyed.<init>(int, java.util.UUID, int, o.getTargetTypes):void");
    }

    public final UUID values() {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            return this.ag$a;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    public final Intent ah$a() {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            return this.valueOf;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    public final void values(Intent intent) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            this.valueOf = intent;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    public final boolean invoke() {
        if (isStateAtLeast.values(this)) {
            return false;
        }
        try {
            return dispatchOnFragmentViewDestroyed$ah$a.values(ah$a, this);
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return false;
        }
    }
}
