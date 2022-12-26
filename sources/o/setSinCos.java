package o;

import java.util.Comparator;
import o.Styleable;
/* loaded from: classes5.dex */
public class setSinCos {
    public static final <T> int valueOf(T t, T t2, Styleable.ChangeBounds<? super T, ? extends Comparable<?>>[] changeBoundsArr) {
        for (Styleable.ChangeBounds<? super T, ? extends Comparable<?>> changeBounds : changeBoundsArr) {
            int ag$a = setScale.ag$a(changeBounds.invoke(t), changeBounds.invoke(t2));
            if (ag$a != 0) {
                return ag$a;
            }
        }
        return 0;
    }

    public static final <T extends Comparable<?>> int ag$a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class toString<T> implements Comparator {
        final /* synthetic */ Styleable.ChangeBounds<T, Comparable<?>>[] valueOf;

        /* JADX WARN: Multi-variable type inference failed */
        toString(Styleable.ChangeBounds<? super T, ? extends Comparable<?>>[] changeBoundsArr) {
            this.valueOf = changeBoundsArr;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return setSinCos.valueOf(t, t2, this.valueOf);
        }
    }

    public static final <T> Comparator<T> valueOf(Styleable.ChangeBounds<? super T, ? extends Comparable<?>>... changeBoundsArr) {
        runAnimators.ag$a(changeBoundsArr, "selectors");
        if (!(changeBoundsArr.length > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return new toString(changeBoundsArr);
    }

    public static final <T extends Comparable<? super T>> Comparator<T> ah$a() {
        PathMotion pathMotion = PathMotion.values;
        runAnimators.values((Object) pathMotion, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return pathMotion;
    }
}
