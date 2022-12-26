package com.dreampay.graphql.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class PaymentCallbackInput implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> failure;
    private final ComponentActivity.AnonymousClass5<String> success;
    private final ComponentActivity.AnonymousClass5<String> webhook;

    public PaymentCallbackInput() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentCallbackInput) {
            PaymentCallbackInput paymentCallbackInput = (PaymentCallbackInput) obj;
            return runAnimators.values(this.failure, paymentCallbackInput.failure) && runAnimators.values(this.success, paymentCallbackInput.success) && runAnimators.values(this.webhook, paymentCallbackInput.webhook);
        }
        return false;
    }

    public int hashCode() {
        return (((this.failure.hashCode() * 31) + this.success.hashCode()) * 31) + this.webhook.hashCode();
    }

    public String toString() {
        return "PaymentCallbackInput(failure=" + this.failure + ", success=" + this.success + ", webhook=" + this.webhook + ')';
    }

    public PaymentCallbackInput(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53) {
        runAnimators.ag$a(anonymousClass5, "failure");
        runAnimators.ag$a(anonymousClass52, "success");
        runAnimators.ag$a(anonymousClass53, "webhook");
        this.failure = anonymousClass5;
        this.success = anonymousClass52;
        this.webhook = anonymousClass53;
    }

    public /* synthetic */ PaymentCallbackInput(ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass52, (i & 4) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass53);
    }

    public final ComponentActivity.AnonymousClass5<String> getFailure() {
        return this.failure;
    }

    public final ComponentActivity.AnonymousClass5<String> getSuccess() {
        return this.success;
    }

    public final ComponentActivity.AnonymousClass5<String> getWebhook() {
        return this.webhook;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.dreampay.graphql.type.PaymentCallbackInput$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                if (PaymentCallbackInput.this.getFailure().valueOf) {
                    onBackPressedCallback.ah$a("failure", PaymentCallbackInput.this.getFailure().values);
                }
                if (PaymentCallbackInput.this.getSuccess().valueOf) {
                    onBackPressedCallback.ah$a("success", PaymentCallbackInput.this.getSuccess().values);
                }
                if (PaymentCallbackInput.this.getWebhook().valueOf) {
                    onBackPressedCallback.ah$a("webhook", PaymentCallbackInput.this.getWebhook().values);
                }
            }
        };
    }
}
