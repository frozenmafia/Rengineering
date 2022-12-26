package o;

import android.content.SharedPreferences;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final class onHiddenChanged {
    public static final values ah$a = new values(null);
    private final String toString;
    private final boolean valueOf;

    public /* synthetic */ onHiddenChanged(String str, boolean z, getTargetTypes gettargettypes) {
        this(str, z);
    }

    private onHiddenChanged(String str, boolean z) {
        this.toString = str;
        this.valueOf = z;
    }

    public String toString() {
        String str = this.valueOf ? "Applink" : "Unclassified";
        if (this.toString != null) {
            return str + '(' + ((Object) this.toString) + ')';
        }
        return str;
    }

    public final void valueOf() {
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(DefaultSpecialEffectsController.AnonymousClass8.ag$a()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.toString);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.valueOf);
        edit.apply();
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final onHiddenChanged valueOf() {
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(DefaultSpecialEffectsController.AnonymousClass8.ag$a());
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new onHiddenChanged(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), null);
            }
            return null;
        }

        public final void ag$a() {
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(DefaultSpecialEffectsController.AnonymousClass8.ag$a()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }
    }
}
