package o;

import com.app.dream11.core.service.graphql.api.fragment.DepositSubSection;
import com.app.dream11.model.SequenceInfo;
/* loaded from: classes3.dex */
public final class markHierarchyDirty {
    private final enableHomeButtonByDefault ag$a;
    private final DepositSubSection ah$a;
    private SequenceInfo toString;
    private final validateParams valueOf;

    public markHierarchyDirty(validateParams validateparams, enableHomeButtonByDefault enablehomebuttonbydefault, DepositSubSection depositSubSection, SequenceInfo sequenceInfo) {
        runAnimators.ag$a(validateparams, "mHandler");
        runAnimators.ag$a(enablehomebuttonbydefault, "iResourceProvider");
        runAnimators.ag$a(depositSubSection, "paymentTypeGql");
        this.valueOf = validateparams;
        this.ag$a = enablehomebuttonbydefault;
        this.ah$a = depositSubSection;
        this.toString = sequenceInfo;
    }

    public final validateParams ah$a() {
        return this.valueOf;
    }

    public final DepositSubSection ag$a() {
        return this.ah$a;
    }

    public final void ah$a(SequenceInfo sequenceInfo) {
        this.toString = sequenceInfo;
    }
}
