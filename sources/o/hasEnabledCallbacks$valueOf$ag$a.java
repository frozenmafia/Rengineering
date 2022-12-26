package o;

import java.util.List;
import o.hasEnabledCallbacks;
/* loaded from: classes.dex */
public final class hasEnabledCallbacks$valueOf$ag$a {

    /* loaded from: classes.dex */
    public static final class valueOf implements hasEnabledCallbacks$ah$a<T> {
        final /* synthetic */ Transition values;

        valueOf(Transition transition) {
            this.values = transition;
        }

        @Override // o.hasEnabledCallbacks$ah$a
        public void valueOf(List<? extends T> list, hasEnabledCallbacks.valueOf valueof) {
            runAnimators.valueOf(valueof, "listItemWriter");
            this.values.invoke(list, valueof);
        }
    }

    public static <T> void valueOf(hasEnabledCallbacks.valueOf valueof, List<? extends T> list, Transition<? super List<? extends T>, ? super hasEnabledCallbacks.valueOf, setAnimationMatrix> transition) {
        runAnimators.valueOf(transition, "block");
        valueof.values(list, new valueOf(transition));
    }
}
