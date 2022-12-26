package kotlin;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class NotImplementedError extends Error {
    public NotImplementedError() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String str) {
        super(str);
        runAnimators.ag$a(str, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
