package o;

import kotlin.Result;
import kotlin.Result$ah$a;
/* loaded from: classes5.dex */
public final class invalidateSelf {
    public static final String ah$a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String ah$a(setPatternPath<?> setpatternpath) {
        String m1233constructorimpl;
        if (setpatternpath instanceof getClientWidth) {
            return setpatternpath.toString();
        }
        try {
            Result$ah$a result$ah$a = Result.Companion;
            m1233constructorimpl = Result.m1233constructorimpl(setpatternpath + '@' + ah$a((Object) setpatternpath));
        } catch (Throwable th) {
            Result$ah$a result$ah$a2 = Result.Companion;
            m1233constructorimpl = Result.m1233constructorimpl(runAnimators.ag$a(th, "exception"));
        }
        if (Result.m1236exceptionOrNullimpl(m1233constructorimpl) != null) {
            m1233constructorimpl = setpatternpath.getClass().getName() + '@' + ah$a((Object) setpatternpath);
        }
        return (String) m1233constructorimpl;
    }

    public static final String values(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
