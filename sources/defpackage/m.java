package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.workflow.WorkflowActivity;
import o.putEncryptedObject;
import o.registerLayoutStateChangeCallback;
/* renamed from: m  reason: default package */
/* loaded from: classes5.dex */
public class m extends Activity {
    private static final String valueOf = "m";

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = valueOf;
        Log.d(str, "onCreate");
        try {
            WorkflowActivity.toString(getIntent().getData(), this, registerLayoutStateChangeCallback.toString(getIntent().getData()), str);
        } catch (AuthError e) {
            putEncryptedObject.toString(valueOf, "Could not fetch request ID from the response uri", getIntent().getData().toString(), e);
        }
        Log.d(valueOf, "finish");
        finish();
    }
}
