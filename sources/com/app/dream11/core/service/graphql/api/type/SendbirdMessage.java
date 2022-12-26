package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class SendbirdMessage implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> customType;
    private final ComponentActivity.AnonymousClass5<String> data;
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendbirdMessage copy$default(SendbirdMessage sendbirdMessage, String str, ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendbirdMessage.text;
        }
        if ((i & 2) != 0) {
            anonymousClass5 = sendbirdMessage.customType;
        }
        if ((i & 4) != 0) {
            anonymousClass52 = sendbirdMessage.data;
        }
        return sendbirdMessage.copy(str, anonymousClass5, anonymousClass52);
    }

    public final String component1() {
        return this.text;
    }

    public final ComponentActivity.AnonymousClass5<String> component2() {
        return this.customType;
    }

    public final ComponentActivity.AnonymousClass5<String> component3() {
        return this.data;
    }

    public final SendbirdMessage copy(String str, ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52) {
        runAnimators.ag$a(str, "text");
        runAnimators.ag$a(anonymousClass5, "customType");
        runAnimators.ag$a(anonymousClass52, "data");
        return new SendbirdMessage(str, anonymousClass5, anonymousClass52);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendbirdMessage) {
            SendbirdMessage sendbirdMessage = (SendbirdMessage) obj;
            return runAnimators.values((Object) this.text, (Object) sendbirdMessage.text) && runAnimators.values(this.customType, sendbirdMessage.customType) && runAnimators.values(this.data, sendbirdMessage.data);
        }
        return false;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.customType.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        String str = this.text;
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.customType;
        ComponentActivity.AnonymousClass5<String> anonymousClass52 = this.data;
        return "SendbirdMessage(text=" + str + ", customType=" + anonymousClass5 + ", data=" + anonymousClass52 + ")";
    }

    public SendbirdMessage(String str, ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52) {
        runAnimators.ag$a(str, "text");
        runAnimators.ag$a(anonymousClass5, "customType");
        runAnimators.ag$a(anonymousClass52, "data");
        this.text = str;
        this.customType = anonymousClass5;
        this.data = anonymousClass52;
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ SendbirdMessage(String str, ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5, (i & 4) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass52);
    }

    public final ComponentActivity.AnonymousClass5<String> getCustomType() {
        return this.customType;
    }

    public final ComponentActivity.AnonymousClass5<String> getData() {
        return this.data;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.SendbirdMessage$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a("text", SendbirdMessage.this.getText());
                if (SendbirdMessage.this.getCustomType().valueOf) {
                    onBackPressedCallback.ah$a("customType", SendbirdMessage.this.getCustomType().values);
                }
                if (SendbirdMessage.this.getData().valueOf) {
                    onBackPressedCallback.ah$a("data", SendbirdMessage.this.getData().values);
                }
            }
        };
    }
}
