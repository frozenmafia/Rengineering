package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class ContestFilterInput implements ComponentActivity.AnonymousClass6 {
    private final ContestFilter name;
    private final ContestFilterValueInput value;

    public static /* synthetic */ ContestFilterInput copy$default(ContestFilterInput contestFilterInput, ContestFilter contestFilter, ContestFilterValueInput contestFilterValueInput, int i, Object obj) {
        if ((i & 1) != 0) {
            contestFilter = contestFilterInput.name;
        }
        if ((i & 2) != 0) {
            contestFilterValueInput = contestFilterInput.value;
        }
        return contestFilterInput.copy(contestFilter, contestFilterValueInput);
    }

    public final ContestFilter component1() {
        return this.name;
    }

    public final ContestFilterValueInput component2() {
        return this.value;
    }

    public final ContestFilterInput copy(ContestFilter contestFilter, ContestFilterValueInput contestFilterValueInput) {
        runAnimators.ag$a(contestFilter, "name");
        runAnimators.ag$a(contestFilterValueInput, "value");
        return new ContestFilterInput(contestFilter, contestFilterValueInput);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContestFilterInput) {
            ContestFilterInput contestFilterInput = (ContestFilterInput) obj;
            return this.name == contestFilterInput.name && runAnimators.values(this.value, contestFilterInput.value);
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        ContestFilter contestFilter = this.name;
        ContestFilterValueInput contestFilterValueInput = this.value;
        return "ContestFilterInput(name=" + contestFilter + ", value=" + contestFilterValueInput + ")";
    }

    public ContestFilterInput(ContestFilter contestFilter, ContestFilterValueInput contestFilterValueInput) {
        runAnimators.ag$a(contestFilter, "name");
        runAnimators.ag$a(contestFilterValueInput, "value");
        this.name = contestFilter;
        this.value = contestFilterValueInput;
    }

    public final ContestFilter getName() {
        return this.name;
    }

    public final ContestFilterValueInput getValue() {
        return this.value;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.ContestFilterInput$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a("name", ContestFilterInput.this.getName().getRawValue());
                onBackPressedCallback.ag$a("value", ContestFilterInput.this.getValue().marshaller());
            }
        };
    }
}
