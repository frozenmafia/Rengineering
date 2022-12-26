package o;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
/* loaded from: classes.dex */
public class binderDied implements invoke {
    private static final String valueOf = "by";

    @Override // o.invoke
    public void ag$a(Bundle bundle) {
        putEncryptedObject.valueOf(valueOf, "onCancel");
    }

    @Override // o.ensureViewModelStore
    /* renamed from: ah$a */
    public void ag$a(AuthError authError) {
        putEncryptedObject.valueOf(valueOf, "onError");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.ensureViewModelStore
    public void toString(Bundle bundle) {
        putEncryptedObject.valueOf(valueOf, "onSuccess");
    }
}
