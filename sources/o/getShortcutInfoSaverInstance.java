package o;

import java.io.Serializable;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class getShortcutInfoSaverInstance extends androidx.fragment.app.FragmentStatePagerAdapter {
    private Map<String, ? extends Serializable> ah$a;

    public abstract String toString(int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getShortcutInfoSaverInstance(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager);
        runAnimators.ag$a(fragmentManager, "fm");
    }

    public void ag$a(Map<String, ? extends Serializable> map) {
        this.ah$a = map;
    }

    public final Map<String, Serializable> ah$a() {
        return this.ah$a;
    }
}
