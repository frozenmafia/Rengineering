package com.app.dream11.core.service.graphql.api.type;

import java.util.Date;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class CompareDate implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<Date> eq;
    private final ComponentActivity.AnonymousClass5<Date> gt;
    private final ComponentActivity.AnonymousClass5<Date> gte;
    private final ComponentActivity.AnonymousClass5<Date> lt;
    private final ComponentActivity.AnonymousClass5<Date> lte;

    public CompareDate() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CompareDate copy$default(CompareDate compareDate, ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, int i, Object obj) {
        ComponentActivity.AnonymousClass5<Date> anonymousClass56 = anonymousClass5;
        if ((i & 1) != 0) {
            anonymousClass56 = compareDate.eq;
        }
        ComponentActivity.AnonymousClass5<Date> anonymousClass57 = anonymousClass52;
        if ((i & 2) != 0) {
            anonymousClass57 = compareDate.gt;
        }
        ComponentActivity.AnonymousClass5 anonymousClass58 = anonymousClass57;
        ComponentActivity.AnonymousClass5<Date> anonymousClass59 = anonymousClass53;
        if ((i & 4) != 0) {
            anonymousClass59 = compareDate.lt;
        }
        ComponentActivity.AnonymousClass5 anonymousClass510 = anonymousClass59;
        ComponentActivity.AnonymousClass5<Date> anonymousClass511 = anonymousClass54;
        if ((i & 8) != 0) {
            anonymousClass511 = compareDate.lte;
        }
        ComponentActivity.AnonymousClass5 anonymousClass512 = anonymousClass511;
        ComponentActivity.AnonymousClass5<Date> anonymousClass513 = anonymousClass55;
        if ((i & 16) != 0) {
            anonymousClass513 = compareDate.gte;
        }
        return compareDate.copy(anonymousClass56, anonymousClass58, anonymousClass510, anonymousClass512, anonymousClass513);
    }

    public final ComponentActivity.AnonymousClass5<Date> component1() {
        return this.eq;
    }

    public final ComponentActivity.AnonymousClass5<Date> component2() {
        return this.gt;
    }

    public final ComponentActivity.AnonymousClass5<Date> component3() {
        return this.lt;
    }

    public final ComponentActivity.AnonymousClass5<Date> component4() {
        return this.lte;
    }

    public final ComponentActivity.AnonymousClass5<Date> component5() {
        return this.gte;
    }

    public final CompareDate copy(ComponentActivity.AnonymousClass5<Date> anonymousClass5, ComponentActivity.AnonymousClass5<Date> anonymousClass52, ComponentActivity.AnonymousClass5<Date> anonymousClass53, ComponentActivity.AnonymousClass5<Date> anonymousClass54, ComponentActivity.AnonymousClass5<Date> anonymousClass55) {
        runAnimators.ag$a(anonymousClass5, "eq");
        runAnimators.ag$a(anonymousClass52, "gt");
        runAnimators.ag$a(anonymousClass53, "lt");
        runAnimators.ag$a(anonymousClass54, "lte");
        runAnimators.ag$a(anonymousClass55, "gte");
        return new CompareDate(anonymousClass5, anonymousClass52, anonymousClass53, anonymousClass54, anonymousClass55);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompareDate) {
            CompareDate compareDate = (CompareDate) obj;
            return runAnimators.values(this.eq, compareDate.eq) && runAnimators.values(this.gt, compareDate.gt) && runAnimators.values(this.lt, compareDate.lt) && runAnimators.values(this.lte, compareDate.lte) && runAnimators.values(this.gte, compareDate.gte);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.eq.hashCode() * 31) + this.gt.hashCode()) * 31) + this.lt.hashCode()) * 31) + this.lte.hashCode()) * 31) + this.gte.hashCode();
    }

    public String toString() {
        ComponentActivity.AnonymousClass5<Date> anonymousClass5 = this.eq;
        ComponentActivity.AnonymousClass5<Date> anonymousClass52 = this.gt;
        ComponentActivity.AnonymousClass5<Date> anonymousClass53 = this.lt;
        ComponentActivity.AnonymousClass5<Date> anonymousClass54 = this.lte;
        ComponentActivity.AnonymousClass5<Date> anonymousClass55 = this.gte;
        return "CompareDate(eq=" + anonymousClass5 + ", gt=" + anonymousClass52 + ", lt=" + anonymousClass53 + ", lte=" + anonymousClass54 + ", gte=" + anonymousClass55 + ")";
    }

    public CompareDate(ComponentActivity.AnonymousClass5<Date> anonymousClass5, ComponentActivity.AnonymousClass5<Date> anonymousClass52, ComponentActivity.AnonymousClass5<Date> anonymousClass53, ComponentActivity.AnonymousClass5<Date> anonymousClass54, ComponentActivity.AnonymousClass5<Date> anonymousClass55) {
        runAnimators.ag$a(anonymousClass5, "eq");
        runAnimators.ag$a(anonymousClass52, "gt");
        runAnimators.ag$a(anonymousClass53, "lt");
        runAnimators.ag$a(anonymousClass54, "lte");
        runAnimators.ag$a(anonymousClass55, "gte");
        this.eq = anonymousClass5;
        this.gt = anonymousClass52;
        this.lt = anonymousClass53;
        this.lte = anonymousClass54;
        this.gte = anonymousClass55;
    }

    public /* synthetic */ CompareDate(ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass52, (i & 4) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass53, (i & 8) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass54, (i & 16) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass55);
    }

    public final ComponentActivity.AnonymousClass5<Date> getEq() {
        return this.eq;
    }

    public final ComponentActivity.AnonymousClass5<Date> getGt() {
        return this.gt;
    }

    public final ComponentActivity.AnonymousClass5<Date> getLt() {
        return this.lt;
    }

    public final ComponentActivity.AnonymousClass5<Date> getLte() {
        return this.lte;
    }

    public final ComponentActivity.AnonymousClass5<Date> getGte() {
        return this.gte;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.CompareDate$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                if (CompareDate.this.getEq().valueOf) {
                    onBackPressedCallback.ah$a("eq", CustomType.DATE, CompareDate.this.getEq().values);
                }
                if (CompareDate.this.getGt().valueOf) {
                    onBackPressedCallback.ah$a("gt", CustomType.DATE, CompareDate.this.getGt().values);
                }
                if (CompareDate.this.getLt().valueOf) {
                    onBackPressedCallback.ah$a("lt", CustomType.DATE, CompareDate.this.getLt().values);
                }
                if (CompareDate.this.getLte().valueOf) {
                    onBackPressedCallback.ah$a("lte", CustomType.DATE, CompareDate.this.getLte().values);
                }
                if (CompareDate.this.getGte().valueOf) {
                    onBackPressedCallback.ah$a("gte", CustomType.DATE, CompareDate.this.getGte().values);
                }
            }
        };
    }
}
