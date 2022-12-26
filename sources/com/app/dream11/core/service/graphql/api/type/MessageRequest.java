package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class MessageRequest implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> inviteCode;
    private final SendbirdMessage message;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageRequest copy$default(MessageRequest messageRequest, SendbirdMessage sendbirdMessage, ComponentActivity.AnonymousClass5 anonymousClass5, int i, Object obj) {
        if ((i & 1) != 0) {
            sendbirdMessage = messageRequest.message;
        }
        if ((i & 2) != 0) {
            anonymousClass5 = messageRequest.inviteCode;
        }
        return messageRequest.copy(sendbirdMessage, anonymousClass5);
    }

    public final SendbirdMessage component1() {
        return this.message;
    }

    public final ComponentActivity.AnonymousClass5<String> component2() {
        return this.inviteCode;
    }

    public final MessageRequest copy(SendbirdMessage sendbirdMessage, ComponentActivity.AnonymousClass5<String> anonymousClass5) {
        runAnimators.ag$a(sendbirdMessage, "message");
        runAnimators.ag$a(anonymousClass5, "inviteCode");
        return new MessageRequest(sendbirdMessage, anonymousClass5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageRequest) {
            MessageRequest messageRequest = (MessageRequest) obj;
            return runAnimators.values(this.message, messageRequest.message) && runAnimators.values(this.inviteCode, messageRequest.inviteCode);
        }
        return false;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.inviteCode.hashCode();
    }

    public String toString() {
        SendbirdMessage sendbirdMessage = this.message;
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.inviteCode;
        return "MessageRequest(message=" + sendbirdMessage + ", inviteCode=" + anonymousClass5 + ")";
    }

    public MessageRequest(SendbirdMessage sendbirdMessage, ComponentActivity.AnonymousClass5<String> anonymousClass5) {
        runAnimators.ag$a(sendbirdMessage, "message");
        runAnimators.ag$a(anonymousClass5, "inviteCode");
        this.message = sendbirdMessage;
        this.inviteCode = anonymousClass5;
    }

    public final SendbirdMessage getMessage() {
        return this.message;
    }

    public /* synthetic */ MessageRequest(SendbirdMessage sendbirdMessage, ComponentActivity.AnonymousClass5 anonymousClass5, int i, getTargetTypes gettargettypes) {
        this(sendbirdMessage, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5);
    }

    public final ComponentActivity.AnonymousClass5<String> getInviteCode() {
        return this.inviteCode;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.MessageRequest$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ag$a("message", MessageRequest.this.getMessage().marshaller());
                if (MessageRequest.this.getInviteCode().valueOf) {
                    onBackPressedCallback.ah$a("inviteCode", MessageRequest.this.getInviteCode().values);
                }
            }
        };
    }
}
