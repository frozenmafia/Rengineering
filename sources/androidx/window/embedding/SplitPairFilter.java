package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SplitPairFilter(android.content.ComponentName r21, android.content.ComponentName r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final boolean matchesActivityPair(Activity activity, Activity activity2) {
        runAnimators.ag$a(activity, "primaryActivity");
        runAnimators.ag$a(activity2, "secondaryActivity");
        boolean z = false;
        boolean z2 = MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity2.getComponentName(), this.secondaryActivityName);
        if (activity2.getIntent() != null) {
            if (z2) {
                Intent intent = activity2.getIntent();
                runAnimators.ah$a(intent, "secondaryActivity.intent");
                if (matchesActivityIntentPair(activity, intent)) {
                    z = true;
                }
            }
            return z;
        }
        return z2;
    }

    public final boolean matchesActivityIntentPair(Activity activity, Intent intent) {
        String str;
        runAnimators.ag$a(activity, "primaryActivity");
        runAnimators.ag$a(intent, "secondaryActivityIntent");
        return MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.secondaryActivityName) && ((str = this.secondaryActivityIntentAction) == null || runAnimators.values((Object) str, (Object) intent.getAction()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SplitPairFilter) {
            SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
            return runAnimators.values(this.primaryActivityName, splitPairFilter.primaryActivityName) && runAnimators.values(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && runAnimators.values((Object) this.secondaryActivityIntentAction, (Object) splitPairFilter.secondaryActivityIntentAction);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.primaryActivityName.hashCode();
        int hashCode2 = this.secondaryActivityName.hashCode();
        String str = this.secondaryActivityIntentAction;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
