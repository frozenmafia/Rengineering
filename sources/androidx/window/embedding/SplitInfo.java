package androidx.window.embedding;

import android.app.Activity;
import com.apxor.androidsdk.core.ce.Constants;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(ActivityStack activityStack, ActivityStack activityStack2, float f) {
        runAnimators.ag$a(activityStack, "primaryActivityStack");
        runAnimators.ag$a(activityStack2, "secondaryActivityStack");
        this.primaryActivityStack = activityStack;
        this.secondaryActivityStack = activityStack2;
        this.splitRatio = f;
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public final boolean contains(Activity activity) {
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SplitInfo) {
            SplitInfo splitInfo = (SplitInfo) obj;
            if (runAnimators.values(this.primaryActivityStack, splitInfo.primaryActivityStack) && runAnimators.values(this.secondaryActivityStack, splitInfo.secondaryActivityStack)) {
                return (this.splitRatio > splitInfo.splitRatio ? 1 : (this.splitRatio == splitInfo.splitRatio ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + Float.floatToIntBits(this.splitRatio);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb.append("splitRatio=" + getSplitRatio() + '}');
        String sb2 = sb.toString();
        runAnimators.ah$a(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
