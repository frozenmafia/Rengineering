package o;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
/* loaded from: classes5.dex */
public class hiddenAnimateTransform {
    public static final <T> Set<T> ag$a(T t) {
        Set<T> singleton = Collections.singleton(t);
        runAnimators.ah$a(singleton, "singleton(element)");
        return singleton;
    }

    public static final <E> Set<E> values() {
        return new SetBuilder();
    }

    public static final <E> Set<E> ag$a(int i) {
        return new SetBuilder(i);
    }
}
