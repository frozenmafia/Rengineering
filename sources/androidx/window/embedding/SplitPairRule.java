package androidx.window.embedding;

import com.sendbird.android.constant.StringSet;
import java.util.LinkedHashSet;
import java.util.Set;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    public /* synthetic */ SplitPairRule(Set set, boolean z, boolean z2, boolean z3, int i, int i2, float f, int i3, int i4, getTargetTypes gettargettypes) {
        this(set, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? false : z3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) == 0 ? i2 : 0, (i4 & 64) != 0 ? 0.5f : f, (i4 & 128) != 0 ? 3 : i3);
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> set, boolean z, boolean z2, boolean z3, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        runAnimators.ag$a(set, "filters");
        this.finishPrimaryWithSecondary = z;
        this.finishSecondaryWithPrimary = z2;
        this.clearTop = z3;
        this.filters = reserveEndViewTransition.onXdkEvent(set);
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final SplitPairRule plus$window_release(SplitPairFilter splitPairFilter) {
        runAnimators.ag$a(splitPairFilter, StringSet.filter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(splitPairFilter);
        return new SplitPairRule(reserveEndViewTransition.onXdkEvent(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SplitPairRule) && super.equals(obj)) {
            SplitPairRule splitPairRule = (SplitPairRule) obj;
            return runAnimators.values(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
        }
        return false;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.filters.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + ActivityRule$$ExternalSyntheticBackport0.m(this.finishPrimaryWithSecondary)) * 31) + ActivityRule$$ExternalSyntheticBackport0.m(this.finishSecondaryWithPrimary)) * 31) + ActivityRule$$ExternalSyntheticBackport0.m(this.clearTop);
    }
}
