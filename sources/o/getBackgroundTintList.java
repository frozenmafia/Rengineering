package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class getBackgroundTintList implements Application.ActivityLifecycleCallbacks {
    private final Transition<String, Map<String, ? extends Object>, setAnimationMatrix> toString;
    private String values;

    /* JADX WARN: Multi-variable type inference failed */
    public getBackgroundTintList(Transition<? super String, ? super Map<String, ? extends Object>, setAnimationMatrix> transition) {
        runAnimators.valueOf(transition, "cb");
        this.toString = transition;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        runAnimators.valueOf(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        String getbackgroundtintlist = toString(activity);
        runAnimators.toString(getbackgroundtintlist, "getActivityName(activity)");
        valueOf(getbackgroundtintlist, "onCreate()", Boolean.valueOf(bundle != null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        runAnimators.valueOf(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        String getbackgroundtintlist = toString(activity);
        runAnimators.toString(getbackgroundtintlist, "getActivityName(activity)");
        ag$a(this, getbackgroundtintlist, "onStart()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        runAnimators.valueOf(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        String getbackgroundtintlist = toString(activity);
        runAnimators.toString(getbackgroundtintlist, "getActivityName(activity)");
        ag$a(this, getbackgroundtintlist, "onResume()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        runAnimators.valueOf(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        String getbackgroundtintlist = toString(activity);
        runAnimators.toString(getbackgroundtintlist, "getActivityName(activity)");
        ag$a(this, getbackgroundtintlist, "onPause()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        runAnimators.valueOf(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        String getbackgroundtintlist = toString(activity);
        runAnimators.toString(getbackgroundtintlist, "getActivityName(activity)");
        ag$a(this, getbackgroundtintlist, "onStop()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        runAnimators.valueOf(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.valueOf(bundle, "outState");
        String getbackgroundtintlist = toString(activity);
        runAnimators.toString(getbackgroundtintlist, "getActivityName(activity)");
        ag$a(this, getbackgroundtintlist, "onSaveInstanceState()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        runAnimators.valueOf(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        String getbackgroundtintlist = toString(activity);
        runAnimators.toString(getbackgroundtintlist, "getActivityName(activity)");
        ag$a(this, getbackgroundtintlist, "onDestroy()", null, 4, null);
    }

    private final String toString(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    static /* synthetic */ void ag$a(getBackgroundTintList getbackgroundtintlist, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        getbackgroundtintlist.valueOf(str, str2, bool);
    }

    private final void valueOf(String str, String str2, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("hasBundle", bool);
        }
        String str3 = this.values;
        if (str3 != null) {
            linkedHashMap.put("previous", str3);
        }
        Transition<String, Map<String, ? extends Object>, setAnimationMatrix> transition = this.toString;
        transition.invoke(str + '#' + str2, linkedHashMap);
        this.values = str2;
    }
}
