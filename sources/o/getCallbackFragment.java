package o;

import java.util.LinkedHashSet;
/* loaded from: classes7.dex */
public abstract class getCallbackFragment<S> extends androidx.fragment.app.Fragment {
    public final LinkedHashSet<addPreferencesFromResource<S>> ag$a = new LinkedHashSet<>();

    public boolean valueOf(addPreferencesFromResource<S> addpreferencesfromresource) {
        return this.ag$a.add(addpreferencesfromresource);
    }

    public void ah$b() {
        this.ag$a.clear();
    }
}
