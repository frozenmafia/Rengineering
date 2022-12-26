package o;

import java.util.Iterator;
import java.util.List;
import o.Styleable;
/* loaded from: classes3.dex */
public final class canScrollHorizontally {
    public static final <T> T values(List<? extends T> list, Styleable.ChangeBounds<? super T, Boolean> changeBounds) {
        runAnimators.ag$a(list, "<this>");
        runAnimators.ag$a(changeBounds, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (changeBounds.invoke((T) it.next()).booleanValue()) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 || i == runAnimators.ag$a(list, "<this>")) {
            return null;
        }
        return list.get(i + 1);
    }
}
