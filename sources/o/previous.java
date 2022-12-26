package o;

import android.content.Context;
import android.content.Intent;
import com.amazon.identity.auth.device.workflow.WorkflowActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class previous {
    private Boolean ag$a;
    private Boolean valueOf;

    public boolean ag$a(Context context) {
        if (this.ag$a == null) {
            this.ag$a = Boolean.valueOf(ag$a(context, new Intent(context, WorkflowActivity.class)));
        }
        return this.ag$a.booleanValue();
    }

    boolean ag$a(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty();
    }

    public boolean ah$a(Context context) {
        if (this.valueOf == null) {
            this.valueOf = Boolean.valueOf(ag$a(context, new Intent(context, defpackage.m.class)));
        }
        return this.valueOf.booleanValue();
    }
}
