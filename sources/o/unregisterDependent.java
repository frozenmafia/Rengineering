package o;

import java.util.concurrent.Executor;
import o.setOnPreferenceChangeListener;
/* loaded from: classes7.dex */
public class unregisterDependent {
    private final callChangeListener ag$a;
    private final Executor ah$a;
    private final setOnPreferenceChangeListener valueOf;
    private final getDependency values;

    /* JADX INFO: Access modifiers changed from: package-private */
    @setTopLeft
    public unregisterDependent(Executor executor, getDependency getdependency, callChangeListener callchangelistener, setOnPreferenceChangeListener setonpreferencechangelistener) {
        this.ah$a = executor;
        this.values = getdependency;
        this.ag$a = callchangelistener;
        this.valueOf = setonpreferencechangelistener;
    }

    public void ag$a() {
        this.ah$a.execute(new Runnable() { // from class: o.clearWasDetached
            @Override // java.lang.Runnable
            public final void run() {
                unregisterDependent.this.values();
            }
        });
    }

    public /* synthetic */ void values() {
        this.valueOf.ag$a(new setOnPreferenceChangeListener.values() { // from class: o.assignParent
            @Override // o.setOnPreferenceChangeListener.values
            public final Object ag$a() {
                return unregisterDependent.this.ah$a();
            }
        });
    }

    public /* synthetic */ Object ah$a() {
        for (findPreference findpreference : this.values.ah$a()) {
            this.ag$a.valueOf(findpreference, 1);
        }
        return null;
    }
}
