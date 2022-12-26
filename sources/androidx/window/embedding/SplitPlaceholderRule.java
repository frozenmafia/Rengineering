package androidx.window.embedding;

import android.content.Intent;
import com.sendbird.android.constant.StringSet;
import java.util.LinkedHashSet;
import java.util.Set;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i, int i2, float f, int i3, int i4, getTargetTypes gettargettypes) {
        this(set, intent, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.5f : f, (i4 & 32) != 0 ? 3 : i3);
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> set, Intent intent, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        runAnimators.ag$a(set, "filters");
        runAnimators.ag$a(intent, "placeholderIntent");
        this.placeholderIntent = intent;
        this.filters = reserveEndViewTransition.onXdkEvent(set);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter activityFilter) {
        runAnimators.ag$a(activityFilter, StringSet.filter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        return new SplitPlaceholderRule(reserveEndViewTransition.onXdkEvent(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SplitPlaceholderRule) && super.equals(obj) && super.equals(obj)) {
            SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
            return runAnimators.values(this.filters, splitPlaceholderRule.filters) && runAnimators.values(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
        }
        return false;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }
}
