package o;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import defpackage.bz;
import defpackage.ch;
/* loaded from: classes.dex */
public class registerCallback extends bz implements invoke {
    private static final String ah$a = "bx";
    private Bundle HaptikSDK$b;

    public registerCallback() {
        this((invoke) null);
    }

    public registerCallback(invoke invokeVar) {
        super(invokeVar);
    }

    public registerCallback(final onCreate oncreate) {
        super(new invoke() { // from class: o.registerCallback.3
            @Override // o.invoke
            public void ag$a(Bundle bundle) {
                putEncryptedObject.toString(registerCallback.ah$a, "onCancel called in for APIListener");
            }

            @Override // o.ensureViewModelStore
            /* renamed from: ah$a */
            public void ag$a(AuthError authError) {
                onCreate oncreate2 = onCreate.this;
                if (oncreate2 != null) {
                    oncreate2.ah$a(authError);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.ensureViewModelStore
            public void toString(Bundle bundle) {
                onCreate oncreate2 = onCreate.this;
                if (oncreate2 != null) {
                    oncreate2.toString(bundle);
                }
            }
        });
    }

    @Override // o.invoke
    public void ag$a(Bundle bundle) {
        this.HaptikSDK$b = bundle;
        bundle.putSerializable(ch.b.FUTURE.f19a, bz.a.CANCEL);
        this.toString.countDown();
        this.valueOf.ag$a(this.HaptikSDK$b);
    }

    @Override // defpackage.bz
    public Bundle ah$a() {
        Bundle bundle = this.HaptikSDK$b;
        return bundle != null ? bundle : super.ah$a();
    }
}
