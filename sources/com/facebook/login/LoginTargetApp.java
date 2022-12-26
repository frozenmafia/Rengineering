package com.facebook.login;

import java.util.Arrays;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");
    
    public static final valueOf Companion = new valueOf(null);
    private final String targetApp;

    public static final LoginTargetApp fromString(String str) {
        return Companion.values(str);
    }

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        public final LoginTargetApp values(String str) {
            LoginTargetApp[] valuesCustom = LoginTargetApp.valuesCustom();
            int length = valuesCustom.length;
            int i = 0;
            while (i < length) {
                LoginTargetApp loginTargetApp = valuesCustom[i];
                i++;
                if (runAnimators.values((Object) loginTargetApp.toString(), (Object) str)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LoginTargetApp[] valuesCustom() {
        LoginTargetApp[] valuesCustom = values();
        return (LoginTargetApp[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
