package o;

import java.util.List;
/* loaded from: classes.dex */
public class addGhostView extends popToOverlayTop {
    public static final /* synthetic */ int values(List list, int i) {
        return ag$a((List<?>) list, i);
    }

    public static final int ag$a(List<?> list, int i) {
        if (new TransitionPropagation(0, runAnimators.ag$a(list, "<this>")).toString(i)) {
            return runAnimators.ag$a(list, "<this>") - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new TransitionPropagation(0, runAnimators.ag$a(list, "<this>")) + "].");
    }
}
