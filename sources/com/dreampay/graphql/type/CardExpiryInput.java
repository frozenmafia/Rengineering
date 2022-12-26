package com.dreampay.graphql.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CardExpiryInput implements ComponentActivity.AnonymousClass6 {
    private final String month;
    private final String year;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardExpiryInput) {
            CardExpiryInput cardExpiryInput = (CardExpiryInput) obj;
            return runAnimators.values((Object) this.year, (Object) cardExpiryInput.year) && runAnimators.values((Object) this.month, (Object) cardExpiryInput.month);
        }
        return false;
    }

    public int hashCode() {
        return (this.year.hashCode() * 31) + this.month.hashCode();
    }

    public String toString() {
        return "CardExpiryInput(year=" + this.year + ", month=" + this.month + ')';
    }

    public CardExpiryInput(String str, String str2) {
        runAnimators.ag$a(str, "year");
        runAnimators.ag$a(str2, "month");
        this.year = str;
        this.month = str2;
    }

    public final String getYear() {
        return this.year;
    }

    public final String getMonth() {
        return this.month;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.dreampay.graphql.type.CardExpiryInput$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a("year", CardExpiryInput.this.getYear());
                onBackPressedCallback.ah$a("month", CardExpiryInput.this.getMonth());
            }
        };
    }
}
