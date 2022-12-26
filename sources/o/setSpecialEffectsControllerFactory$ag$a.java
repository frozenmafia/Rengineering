package o;

import android.app.Activity;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class setSpecialEffectsControllerFactory$ag$a implements onFragmentCreated {
    private final Activity valueOf;

    public setSpecialEffectsControllerFactory$ag$a(Activity activity) {
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        this.valueOf = activity;
    }

    @Override // o.onFragmentCreated
    public Activity values() {
        return this.valueOf;
    }

    @Override // o.onFragmentCreated
    public void ag$a(Intent intent, int i) {
        runAnimators.ag$a(intent, "intent");
        values().startActivityForResult(intent, i);
    }
}
