package o;

import java.util.Iterator;
/* loaded from: classes7.dex */
public abstract class clearNonTransitionAlpha<T> {
    public abstract Object ah$a(T t, setPatternPath<? super setAnimationMatrix> setpatternpath);

    public abstract Object ah$a(Iterator<? extends T> it, setPatternPath<? super setAnimationMatrix> setpatternpath);

    public final Object valueOf(invalidateChildInParent<? extends T> invalidatechildinparent, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        Object ah$a = ah$a((Iterator) invalidatechildinparent.iterator(), setpatternpath);
        return ah$a == PatternPathMotion.values() ? ah$a : setAnimationMatrix.ag$a;
    }
}
