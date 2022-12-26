package com.dreampay.commons.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sendbird.android.constant.StringSet;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes4.dex */
public final class SharedPreferencesStorage {
    private final Context context;
    private final setIdentityTransforms sharedPreferences$delegate;

    public SharedPreferencesStorage(Context context) {
        runAnimators.ag$a(context, "context");
        this.context = context;
        this.sharedPreferences$delegate = runAnimators.ag$a(new SharedPreferencesStorage$sharedPreferences$2(this), "initializer");
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences$delegate.getValue();
        runAnimators.ah$a(value, "<get-sharedPreferences>(...)");
        return (SharedPreferences) value;
    }

    public final String generateFileName() {
        return runAnimators.values("dreampay_", (Object) this.context.getPackageName());
    }

    public final void set(String str, String str2) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(str2, "value");
        getSharedPreferences().edit().putString(str, str2).commit();
    }

    public static /* synthetic */ String get$default(SharedPreferencesStorage sharedPreferencesStorage, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesStorage.get(str, str2);
    }

    public final String get(String str, String str2) {
        runAnimators.ag$a(str, StringSet.key);
        return getSharedPreferences().getString(str, str2);
    }

    public final void clear() {
        getSharedPreferences().edit().clear().commit();
    }
}
