package com.google.android.gms.internal.p003firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuo  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzuo extends LifecycleCallback {
    private final List<PhoneAuthProvider.toString> zza;

    private zzuo(LifecycleFragment lifecycleFragment, List<PhoneAuthProvider.toString> list) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
        this.zza = list;
    }

    public static void zza(Activity activity, List<PhoneAuthProvider.toString> list) {
        LifecycleFragment fragment = getFragment(activity);
        if (((zzuo) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", zzuo.class)) == null) {
            new zzuo(fragment, list);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.zza) {
            this.zza.clear();
        }
    }
}
