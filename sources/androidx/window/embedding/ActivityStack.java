package androidx.window.embedding;

import android.app.Activity;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.List;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> list, boolean z) {
        runAnimators.ag$a(list, "activities");
        this.activities = list;
        this.isEmpty = z;
    }

    public /* synthetic */ ActivityStack(List list, boolean z, int i, getTargetTypes gettargettypes) {
        this(list, (i & 2) != 0 ? false : z);
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public final boolean contains(Activity activity) {
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        return this.activities.contains(activity);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityStack) {
            ActivityStack activityStack = (ActivityStack) obj;
            return (runAnimators.values(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) ? false : true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(runAnimators.values("activities=", (Object) getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        runAnimators.ah$a(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
