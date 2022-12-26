package o;

import java.lang.ref.WeakReference;
import o.updateSelection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class updateSelection$ag$a {
    private int ah$a;
    private final WeakReference<updateSelection.valueOf> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public updateSelection$ag$a(int i, updateSelection.valueOf valueof) {
        this.toString = new WeakReference<>(valueof);
        this.ah$a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean valueOf(updateSelection.valueOf valueof) {
        return valueof != null && this.toString.get() == valueof;
    }
}
