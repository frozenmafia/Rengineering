package o;

import java.util.Collection;
import java.util.Iterator;
import o.Visibility;
/* loaded from: classes3.dex */
public final class ViewCompat$2$ag$a {
    private ViewCompat$2$ag$a() {
    }

    public /* synthetic */ ViewCompat$2$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    public final Boolean ag$a(String str, Collection<String> collection) {
        runAnimators.valueOf(str, "className");
        runAnimators.valueOf(collection, "projectPackages");
        Collection<String> collection2 = collection;
        boolean z = false;
        if (!collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Visibility.Mode.ah$a(str, (String) it.next(), false, 2, (Object) null)) {
                    z = true;
                    break;
                }
            }
        }
        return z ? true : null;
    }
}
