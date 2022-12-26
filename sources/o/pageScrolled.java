package o;

import kotlin.Result;
import kotlin.Result$ah$a;
/* loaded from: classes5.dex */
public final class pageScrolled {
    private static final boolean valueOf;

    static {
        Object m1233constructorimpl;
        try {
            Result$ah$a result$ah$a = Result.Companion;
            m1233constructorimpl = Result.m1233constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result$ah$a result$ah$a2 = Result.Companion;
            m1233constructorimpl = Result.m1233constructorimpl(runAnimators.ag$a(th, "exception"));
        }
        valueOf = Result.m1240isSuccessimpl(m1233constructorimpl);
    }

    public static final boolean valueOf() {
        return valueOf;
    }
}
