package kotlin.coroutines;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.runAnimators;
/* loaded from: classes5.dex */
final class CombinedContext$toString$1 extends Lambda implements Transition<String, PropertyValuesHolderUtils.toString, String> {
    public static final CombinedContext$toString$1 INSTANCE = new CombinedContext$toString$1();

    CombinedContext$toString$1() {
        super(2);
    }

    @Override // o.Transition
    public final String invoke(String str, PropertyValuesHolderUtils.toString tostring) {
        runAnimators.ag$a(str, "acc");
        runAnimators.ag$a(tostring, "element");
        if (str.length() == 0) {
            return tostring.toString();
        }
        return str + ", " + tostring;
    }
}
