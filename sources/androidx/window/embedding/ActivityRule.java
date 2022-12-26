package androidx.window.embedding;

import com.sendbird.android.constant.StringSet;
import java.util.LinkedHashSet;
import java.util.Set;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public /* synthetic */ ActivityRule(Set set, boolean z, int i, getTargetTypes gettargettypes) {
        this(set, (i & 2) != 0 ? false : z);
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public ActivityRule(Set<ActivityFilter> set, boolean z) {
        runAnimators.ag$a(set, "filters");
        this.alwaysExpand = z;
        this.filters = reserveEndViewTransition.onXdkEvent(set);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final ActivityRule plus$window_release(ActivityFilter activityFilter) {
        runAnimators.ag$a(activityFilter, StringSet.filter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        return new ActivityRule(reserveEndViewTransition.onXdkEvent(linkedHashSet), this.alwaysExpand);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityRule) {
            ActivityRule activityRule = (ActivityRule) obj;
            return runAnimators.values(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
        }
        return false;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + ActivityRule$$ExternalSyntheticBackport0.m(this.alwaysExpand);
    }
}
