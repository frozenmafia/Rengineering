package o;

import com.facebook.appevents.FlushResult;
/* loaded from: classes4.dex */
public final class getAllowEnterTransitionOverlap {
    private FlushResult valueOf = FlushResult.SUCCESS;
    private int values;

    public final int ah$a() {
        return this.values;
    }

    public final void ah$a(int i) {
        this.values = i;
    }

    public final FlushResult ag$a() {
        return this.valueOf;
    }

    public final void toString(FlushResult flushResult) {
        runAnimators.ag$a(flushResult, "<set-?>");
        this.valueOf = flushResult;
    }
}
