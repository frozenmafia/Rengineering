package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.apxor.androidsdk.core.ce.Constants;
import o.Visibility;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        runAnimators.ag$a(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        runAnimators.ah$a(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        runAnimators.ah$a(className, "componentName.className");
        String str2 = packageName;
        boolean z = false;
        if (!(str2.length() > 0)) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        String str3 = className;
        if (!(str3.length() > 0)) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!Visibility.Mode.values((CharSequence) str2, (CharSequence) "*", false, 2, (Object) null) || Visibility.Mode.ag$a((CharSequence) str2, "*", 0, false, 6, (Object) null) == packageName.length() - 1)) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (!((!Visibility.Mode.values((CharSequence) str3, (CharSequence) "*", false, 2, (Object) null) || Visibility.Mode.ag$a((CharSequence) str3, "*", 0, false, 6, (Object) null) == className.length() - 1) ? true : true)) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public final boolean matchesIntent(Intent intent) {
        String str;
        runAnimators.ag$a(intent, "intent");
        return MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName) && ((str = this.intentAction) == null || runAnimators.values((Object) str, (Object) intent.getAction()));
    }

    public final boolean matchesActivity(Activity activity) {
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (runAnimators.values((Object) str, (Object) (intent == null ? null : intent.getAction()))) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityFilter) {
            ActivityFilter activityFilter = (ActivityFilter) obj;
            return runAnimators.values(this.componentName, activityFilter.componentName) && runAnimators.values((Object) this.intentAction, (Object) activityFilter.intentAction);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.componentName.hashCode();
        String str = this.intentAction;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
