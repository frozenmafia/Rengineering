package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
/* loaded from: classes4.dex */
public class getContentUri implements Application.ActivityLifecycleCallbacks {
    private static getContentUri values;
    private boolean ah$a = false;
    private Application valueOf;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    private getContentUri(Context context) {
        this.valueOf = null;
        Application application = (Application) context.getApplicationContext();
        this.valueOf = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static getContentUri ag$a() {
        if (values == null) {
            values = new getContentUri(setMinimumVelocity.values());
        }
        return values;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (setRampUpDuration.invoke().booleanValue() && this.ah$a) {
            getDeltaX.ah$a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.ah$a = true;
    }

    public void ah$a() {
        this.valueOf.unregisterActivityLifecycleCallbacks(this);
        this.valueOf = null;
        values = null;
    }
}
