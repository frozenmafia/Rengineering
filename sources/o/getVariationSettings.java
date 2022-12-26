package o;

import com.app.dream11.dream11.BaseFragment;
import com.app.dream11.model.FlowState;
/* loaded from: classes3.dex */
public final class getVariationSettings {
    private String ah$a;
    private BaseFragment toString;
    private String valueOf;
    private final FlowState values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getVariationSettings) {
            getVariationSettings getvariationsettings = (getVariationSettings) obj;
            return runAnimators.values(this.values, getvariationsettings.values) && runAnimators.values(this.toString, getvariationsettings.toString) && runAnimators.values((Object) this.valueOf, (Object) getvariationsettings.valueOf) && runAnimators.values((Object) this.ah$a, (Object) getvariationsettings.ah$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.values.hashCode();
        BaseFragment baseFragment = this.toString;
        int hashCode2 = baseFragment == null ? 0 : baseFragment.hashCode();
        String str = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        FlowState flowState = this.values;
        BaseFragment baseFragment = this.toString;
        String str = this.valueOf;
        String str2 = this.ah$a;
        return "FragmentWrapper(flowState=" + flowState + ", fragment=" + baseFragment + ", title=" + str + ", displayTitle=" + str2 + ")";
    }

    public getVariationSettings(FlowState flowState, BaseFragment baseFragment, String str, String str2) {
        runAnimators.ag$a(flowState, "flowState");
        runAnimators.ag$a(str2, "displayTitle");
        this.values = flowState;
        this.toString = baseFragment;
        this.valueOf = str;
        this.ah$a = str2;
    }

    public /* synthetic */ getVariationSettings(FlowState flowState, BaseFragment baseFragment, String str, String str2, int i, getTargetTypes gettargettypes) {
        this(flowState, (i & 2) != 0 ? null : baseFragment, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final FlowState ah$a() {
        return this.values;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final void valueOf(BaseFragment baseFragment) {
        this.toString = baseFragment;
    }

    public final BaseFragment values() {
        return this.toString;
    }
}
