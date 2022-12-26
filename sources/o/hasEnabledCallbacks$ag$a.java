package o;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;
import o.hasEnabledCallbacks;
/* loaded from: classes.dex */
public final class hasEnabledCallbacks$ag$a {

    /* loaded from: classes.dex */
    public static final class values implements hasEnabledCallbacks$ah$a<T> {
        final /* synthetic */ Transition valueOf;

        values(Transition transition) {
            this.valueOf = transition;
        }

        @Override // o.hasEnabledCallbacks$ah$a
        public void valueOf(List<? extends T> list, hasEnabledCallbacks.valueOf valueof) {
            runAnimators.valueOf(valueof, "listItemWriter");
            this.valueOf.invoke(list, valueof);
        }
    }

    public static <T> void valueOf(hasEnabledCallbacks hasenabledcallbacks, ResponseField responseField, List<? extends T> list, Transition<? super List<? extends T>, ? super hasEnabledCallbacks.valueOf, setAnimationMatrix> transition) {
        runAnimators.valueOf(responseField, "field");
        runAnimators.valueOf(transition, "block");
        hasenabledcallbacks.ah$a(responseField, list, new values(transition));
    }
}
