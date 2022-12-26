package o;

import java.util.Collections;
import java.util.List;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public interface getUpperBound<Model, Data> {
    valueOf<Data> ah$a(Model model, int i, int i2, setMargins setmargins);

    boolean toString(Model model);

    /* loaded from: classes3.dex */
    public static class valueOf<Data> {
        public final invokeSuspend<Data> ag$a;
        public final List<getDescendants> ah$a;
        public final getDescendants toString;

        public valueOf(getDescendants getdescendants, invokeSuspend<Data> invokesuspend) {
            this(getdescendants, Collections.emptyList(), invokesuspend);
        }

        public valueOf(getDescendants getdescendants, List<getDescendants> list, invokeSuspend<Data> invokesuspend) {
            this.toString = (getDescendants) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(getdescendants);
            this.ah$a = (List) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(list);
            this.ag$a = (invokeSuspend) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(invokesuspend);
        }
    }
}
