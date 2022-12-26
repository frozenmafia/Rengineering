package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class ContestFilterValueInput implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> eq;
    private final ComponentActivity.AnonymousClass5<String> gt;
    private final ComponentActivity.AnonymousClass5<String> gte;
    private final ComponentActivity.AnonymousClass5<String> lt;
    private final ComponentActivity.AnonymousClass5<String> lte;

    public ContestFilterValueInput() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ContestFilterValueInput copy$default(ContestFilterValueInput contestFilterValueInput, ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, int i, Object obj) {
        ComponentActivity.AnonymousClass5<String> anonymousClass56 = anonymousClass5;
        if ((i & 1) != 0) {
            anonymousClass56 = contestFilterValueInput.lt;
        }
        ComponentActivity.AnonymousClass5<String> anonymousClass57 = anonymousClass52;
        if ((i & 2) != 0) {
            anonymousClass57 = contestFilterValueInput.gt;
        }
        ComponentActivity.AnonymousClass5 anonymousClass58 = anonymousClass57;
        ComponentActivity.AnonymousClass5<String> anonymousClass59 = anonymousClass53;
        if ((i & 4) != 0) {
            anonymousClass59 = contestFilterValueInput.lte;
        }
        ComponentActivity.AnonymousClass5 anonymousClass510 = anonymousClass59;
        ComponentActivity.AnonymousClass5<String> anonymousClass511 = anonymousClass54;
        if ((i & 8) != 0) {
            anonymousClass511 = contestFilterValueInput.gte;
        }
        ComponentActivity.AnonymousClass5 anonymousClass512 = anonymousClass511;
        ComponentActivity.AnonymousClass5<String> anonymousClass513 = anonymousClass55;
        if ((i & 16) != 0) {
            anonymousClass513 = contestFilterValueInput.eq;
        }
        return contestFilterValueInput.copy(anonymousClass56, anonymousClass58, anonymousClass510, anonymousClass512, anonymousClass513);
    }

    public final ComponentActivity.AnonymousClass5<String> component1() {
        return this.lt;
    }

    public final ComponentActivity.AnonymousClass5<String> component2() {
        return this.gt;
    }

    public final ComponentActivity.AnonymousClass5<String> component3() {
        return this.lte;
    }

    public final ComponentActivity.AnonymousClass5<String> component4() {
        return this.gte;
    }

    public final ComponentActivity.AnonymousClass5<String> component5() {
        return this.eq;
    }

    public final ContestFilterValueInput copy(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<String> anonymousClass55) {
        runAnimators.ag$a(anonymousClass5, "lt");
        runAnimators.ag$a(anonymousClass52, "gt");
        runAnimators.ag$a(anonymousClass53, "lte");
        runAnimators.ag$a(anonymousClass54, "gte");
        runAnimators.ag$a(anonymousClass55, "eq");
        return new ContestFilterValueInput(anonymousClass5, anonymousClass52, anonymousClass53, anonymousClass54, anonymousClass55);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContestFilterValueInput) {
            ContestFilterValueInput contestFilterValueInput = (ContestFilterValueInput) obj;
            return runAnimators.values(this.lt, contestFilterValueInput.lt) && runAnimators.values(this.gt, contestFilterValueInput.gt) && runAnimators.values(this.lte, contestFilterValueInput.lte) && runAnimators.values(this.gte, contestFilterValueInput.gte) && runAnimators.values(this.eq, contestFilterValueInput.eq);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.lt.hashCode() * 31) + this.gt.hashCode()) * 31) + this.lte.hashCode()) * 31) + this.gte.hashCode()) * 31) + this.eq.hashCode();
    }

    public String toString() {
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.lt;
        ComponentActivity.AnonymousClass5<String> anonymousClass52 = this.gt;
        ComponentActivity.AnonymousClass5<String> anonymousClass53 = this.lte;
        ComponentActivity.AnonymousClass5<String> anonymousClass54 = this.gte;
        ComponentActivity.AnonymousClass5<String> anonymousClass55 = this.eq;
        return "ContestFilterValueInput(lt=" + anonymousClass5 + ", gt=" + anonymousClass52 + ", lte=" + anonymousClass53 + ", gte=" + anonymousClass54 + ", eq=" + anonymousClass55 + ")";
    }

    public ContestFilterValueInput(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<String> anonymousClass55) {
        runAnimators.ag$a(anonymousClass5, "lt");
        runAnimators.ag$a(anonymousClass52, "gt");
        runAnimators.ag$a(anonymousClass53, "lte");
        runAnimators.ag$a(anonymousClass54, "gte");
        runAnimators.ag$a(anonymousClass55, "eq");
        this.lt = anonymousClass5;
        this.gt = anonymousClass52;
        this.lte = anonymousClass53;
        this.gte = anonymousClass54;
        this.eq = anonymousClass55;
    }

    public /* synthetic */ ContestFilterValueInput(ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass52, (i & 4) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass53, (i & 8) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass54, (i & 16) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass55);
    }

    public final ComponentActivity.AnonymousClass5<String> getLt() {
        return this.lt;
    }

    public final ComponentActivity.AnonymousClass5<String> getGt() {
        return this.gt;
    }

    public final ComponentActivity.AnonymousClass5<String> getLte() {
        return this.lte;
    }

    public final ComponentActivity.AnonymousClass5<String> getGte() {
        return this.gte;
    }

    public final ComponentActivity.AnonymousClass5<String> getEq() {
        return this.eq;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.ContestFilterValueInput$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                if (ContestFilterValueInput.this.getLt().valueOf) {
                    onBackPressedCallback.ah$a("lt", ContestFilterValueInput.this.getLt().values);
                }
                if (ContestFilterValueInput.this.getGt().valueOf) {
                    onBackPressedCallback.ah$a("gt", ContestFilterValueInput.this.getGt().values);
                }
                if (ContestFilterValueInput.this.getLte().valueOf) {
                    onBackPressedCallback.ah$a("lte", ContestFilterValueInput.this.getLte().values);
                }
                if (ContestFilterValueInput.this.getGte().valueOf) {
                    onBackPressedCallback.ah$a("gte", ContestFilterValueInput.this.getGte().values);
                }
                if (ContestFilterValueInput.this.getEq().valueOf) {
                    onBackPressedCallback.ah$a("eq", ContestFilterValueInput.this.getEq().values);
                }
            }
        };
    }
}
