package com.amazon.identity.auth.device.api.authorization;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import o.getActivityResultRegistry;
import o.getLastCustomNonConfigurationInstance;
import o.getOnBackPressedDispatcher;
import o.getViewModelStore;
import o.onRetainCustomNonConfigurationInstance;
import o.onRetainCustomNonConfigurationInstance$ag$a;
/* loaded from: classes.dex */
public final class AuthorizeRequest extends onRetainCustomNonConfigurationInstance<getActivityResultRegistry, getLastCustomNonConfigurationInstance, AuthCancellation, AuthError> {
    private boolean ag$a;
    private String ah$a;
    private String toString;
    private GrantType valueOf;
    private List<getViewModelStore> values;

    /* loaded from: classes.dex */
    public enum GrantType {
        ACCESS_TOKEN,
        AUTHORIZATION_CODE
    }

    /* loaded from: classes.dex */
    public static final class toString extends onRetainCustomNonConfigurationInstance$ag$a<AuthorizeRequest> {
        private final AuthorizeRequest ah$a;

        public toString(getOnBackPressedDispatcher getonbackpresseddispatcher) {
            super(getonbackpresseddispatcher);
            this.ah$a = new AuthorizeRequest(this.ag$a);
        }

        public toString ag$a(String str, String str2) {
            this.ah$a.values(str, str2);
            return this;
        }

        public toString ag$a(boolean z) {
            this.ah$a.valueOf(z);
            return this;
        }

        public toString ah$a(GrantType grantType) {
            this.ah$a.ah$a(grantType);
            return this;
        }

        public toString toString(getViewModelStore... getviewmodelstoreArr) {
            this.ah$a.toString(getviewmodelstoreArr);
            return this;
        }

        public AuthorizeRequest valueOf() {
            return this.ah$a;
        }
    }

    AuthorizeRequest(getOnBackPressedDispatcher getonbackpresseddispatcher) {
        super(getonbackpresseddispatcher);
        this.values = new LinkedList();
        this.valueOf = GrantType.ACCESS_TOKEN;
        this.ag$a = true;
    }

    public List<getViewModelStore> HaptikSDK$a() {
        return this.values;
    }

    public boolean HaptikSDK$b() {
        return this.ag$a;
    }

    @Override // o.onRetainCustomNonConfigurationInstance
    public final Bundle HaptikSDK$c() {
        Bundle bundle = new Bundle();
        String[] strArr = new String[this.values.size()];
        for (int i = 0; i < this.values.size(); i++) {
            strArr[i] = this.values.get(i).values();
        }
        bundle.putStringArray("requestedScopes", strArr);
        bundle.putBoolean("shouldReturnUserData", HaptikSDK$b());
        return bundle;
    }

    public GrantType ag$a() {
        return this.valueOf;
    }

    @Override // o.getSavedStateRegistry
    public final String ah$a() {
        return "com.amazon.identity.auth.device.authorization.request.authorize";
    }

    public void ah$a(GrantType grantType) {
        this.valueOf = grantType;
    }

    @Override // o.onRetainCustomNonConfigurationInstance
    public final Class<getActivityResultRegistry> invoke() {
        return getActivityResultRegistry.class;
    }

    public void toString(String str) {
        this.toString = str;
    }

    public void toString(getViewModelStore... getviewmodelstoreArr) {
        Collections.addAll(this.values, getviewmodelstoreArr);
    }

    public String valueOf() {
        return this.ah$a;
    }

    public void valueOf(boolean z) {
        this.ag$a = z;
    }

    public String values() {
        return this.toString;
    }

    public void values(String str) {
        this.ah$a = str;
    }

    public void values(String str, String str2) {
        toString(str);
        values(str2);
    }
}
