package o;

import java.util.Collection;
import java.util.Map;
/* loaded from: classes7.dex */
public final class readCollection {
    public static final <E, C extends readDoubleArray<? super E>> Object toString(readIntArray<? extends E> readintarray, C c, setPatternPath<? super C> setpatternpath) {
        return closeField.values(readintarray, c, setpatternpath);
    }

    public static final <E, C extends Collection<? super E>> Object valueOf(readIntArray<? extends E> readintarray, C c, setPatternPath<? super C> setpatternpath) {
        return closeField.toString((readIntArray) readintarray, (Collection) c, (setPatternPath) setpatternpath);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object values(readIntArray<? extends kotlin.Pair<? extends K, ? extends V>> readintarray, M m, setPatternPath<? super M> setpatternpath) {
        return closeField.ag$a(readintarray, m, setpatternpath);
    }
}
