package com.amazon.identity.auth.device.api.authorization;

import android.content.Context;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.sendbird.android.constant.StringSet;
import defpackage.ch;
import java.util.HashMap;
import java.util.Map;
import o.computeWindowBoundsP$window_release;
import o.ensureViewModelStore;
import o.onCreate;
import o.putEncryptedObject;
/* loaded from: classes.dex */
public final class User {
    private static final String ah$a = "com.amazon.identity.auth.device.api.authorization.User";
    private final Map<String, String> toString;

    /* loaded from: classes6.dex */
    enum a {
        NAME("name"),
        EMAIL("email"),
        USER_ID(StringSet.user_id),
        POSTAL_CODE("postal_code");
        

        /* renamed from: a  reason: collision with other field name */
        public final String f28a;

        a(String str) {
            this.f28a = str;
        }
    }

    User(Map<String, String> map) {
        this.toString = map;
    }

    static User ag$a(Bundle bundle) {
        HashMap hashMap = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return new User(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(Context context, computeWindowBoundsP$window_release computewindowboundsp_window_release, final ensureViewModelStore<User, AuthError> ensureviewmodelstore) {
        String str = ah$a;
        putEncryptedObject.valueOf(str, context.getPackageName() + " calling fetch");
        Bundle bundle = new Bundle();
        bundle.putBoolean(ch.c.FAIL_ON_INSUFFICIENT_SCOPE.f21a, true);
        computewindowboundsp_window_release.toString(context, bundle, new onCreate() { // from class: com.amazon.identity.auth.device.api.authorization.User.4
            @Override // o.ensureViewModelStore
            /* renamed from: ah$a */
            public void ag$a(AuthError authError) {
                ensureViewModelStore.this.ag$a(authError);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.ensureViewModelStore
            public void toString(Bundle bundle2) {
                ensureViewModelStore.this.toString(User.ag$a(bundle2.getBundle(ch.b.PROFILE.f19a)));
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Map<String, String> map = this.toString;
            Map<String, String> map2 = ((User) obj).toString;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Map<String, String> map = this.toString;
        return (map == null ? 0 : map.hashCode()) + 31;
    }

    public String toString() {
        return String.format("%s={userInfo=%s}", super.toString(), this.toString);
    }
}
