package com.app.dream11.chat;

import com.app.dream11.newhome.PlayStoreAppUpdateManager;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes.dex */
final class ChatActivity$playStoreAppUpdateManager$2 extends Lambda implements Styleable.ArcMotion<PlayStoreAppUpdateManager> {
    final /* synthetic */ ChatActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivity$playStoreAppUpdateManager$2(ChatActivity chatActivity) {
        super(0);
        this.this$0 = chatActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m68invoke$lambda0(boolean z) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final PlayStoreAppUpdateManager invoke() {
        return new PlayStoreAppUpdateManager(this.this$0, ChatActivity$playStoreAppUpdateManager$2$$ExternalSyntheticLambda0.INSTANCE);
    }
}
