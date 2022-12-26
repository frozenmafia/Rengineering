package o;

import java.util.Comparator;
/* loaded from: classes4.dex */
public final /* synthetic */ class moveFragmentToExpectedState implements Comparator {
    public static final /* synthetic */ moveFragmentToExpectedState valueOf = new moveFragmentToExpectedState();

    private /* synthetic */ moveFragmentToExpectedState() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int ah$a;
        ah$a = isParentMenuVisible.ah$a((isDestroyed) obj, (isDestroyed) obj2);
        return ah$a;
    }
}
