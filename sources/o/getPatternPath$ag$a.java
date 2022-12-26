package o;

import com.sendbird.android.constant.StringSet;
import kotlin.coroutines.EmptyCoroutineContext;
import o.PropertyValuesHolderUtils;
/* loaded from: classes5.dex */
public final class getPatternPath$ag$a {
    public static <E extends PropertyValuesHolderUtils.toString> E toString(getPatternPath getpatternpath, PropertyValuesHolderUtils.valueOf<E> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        if (valueof instanceof setSkew) {
            setSkew setskew = (setSkew) valueof;
            if (setskew.ag$a(getpatternpath.getKey())) {
                E e = (E) setskew.ag$a(getpatternpath);
                if (e instanceof PropertyValuesHolderUtils.toString) {
                    return e;
                }
                return null;
            }
            return null;
        } else if (getPatternPath.ag$a == valueof) {
            runAnimators.values((Object) getpatternpath, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return getpatternpath;
        } else {
            return null;
        }
    }

    public static PropertyValuesHolderUtils valueOf(getPatternPath getpatternpath, PropertyValuesHolderUtils.valueOf<?> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        if (valueof instanceof setSkew) {
            setSkew setskew = (setSkew) valueof;
            boolean ag$a = setskew.ag$a(getpatternpath.getKey());
            Object obj = getpatternpath;
            if (ag$a) {
                PropertyValuesHolderUtils.toString ag$a2 = setskew.ag$a(getpatternpath);
                obj = getpatternpath;
                if (ag$a2 != null) {
                    obj = EmptyCoroutineContext.INSTANCE;
                }
            }
            return (PropertyValuesHolderUtils) obj;
        }
        Object obj2 = getpatternpath;
        if (getPatternPath.ag$a == valueof) {
            obj2 = EmptyCoroutineContext.INSTANCE;
        }
        return (PropertyValuesHolderUtils) obj2;
    }
}
