package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class isDecorView<E> {
    private final Object ah$a;

    public static int ag$a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean ag$a(Object obj, Object obj2) {
        return (obj2 instanceof isDecorView) && runAnimators.values(obj, ((isDecorView) obj2).valueOf());
    }

    public static String toString(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public static <E> Object valueOf(Object obj) {
        return obj;
    }

    public boolean equals(Object obj) {
        return ag$a(this.ah$a, obj);
    }

    public int hashCode() {
        return ag$a(this.ah$a);
    }

    public String toString() {
        return toString(this.ah$a);
    }

    public final /* synthetic */ Object valueOf() {
        return this.ah$a;
    }

    public static /* synthetic */ Object ah$a(Object obj, int i, getTargetTypes gettargettypes) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return valueOf(obj);
    }

    public static final Object values(Object obj, E e) {
        if (!getPixelSize.values() || (!(e instanceof List))) {
            if (obj == null) {
                return valueOf(e);
            }
            if (obj instanceof ArrayList) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ((ArrayList) obj).add(e);
                return valueOf(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e);
            return valueOf(arrayList);
        }
        throw new AssertionError();
    }
}
