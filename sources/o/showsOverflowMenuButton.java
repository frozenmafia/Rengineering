package o;

import com.google.gson.Gson;
import com.sendbird.android.constant.StringSet;
import o.StableIdStorage;
/* loaded from: classes2.dex */
public final class showsOverflowMenuButton implements ActionMode {
    private final StableIdStorage.NoStableIdStorage.AnonymousClass1 toString;

    public showsOverflowMenuButton(StableIdStorage.NoStableIdStorage.AnonymousClass1 anonymousClass1) {
        runAnimators.ag$a(anonymousClass1, "mFirebaseConfig");
        this.toString = anonymousClass1;
    }

    @Override // o.ActionMode
    public String toString(String str) {
        runAnimators.ag$a(str, StringSet.key);
        String ag$a = this.toString.ag$a(str);
        runAnimators.ah$a(ag$a, "mFirebaseConfig.getString(key)");
        return ag$a;
    }

    @Override // o.ActionMode
    public boolean valueOf(String str) {
        runAnimators.ag$a(str, StringSet.key);
        return this.toString.valueOf(str);
    }

    @Override // o.ActionMode
    public double values(String str) {
        runAnimators.ag$a(str, StringSet.key);
        return this.toString.ah$a(str);
    }

    @Override // o.ActionMode
    public long ah$a(String str) {
        runAnimators.ag$a(str, StringSet.key);
        return this.toString.values(str);
    }

    @Override // o.ActionMode
    public <T> T ah$a(String str, Class<T> cls) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(cls, "classOfT");
        try {
            return (T) new Gson().ah$a(this.toString.toString(str).ag$a(), cls);
        } catch (Exception unused) {
            return null;
        }
    }
}
