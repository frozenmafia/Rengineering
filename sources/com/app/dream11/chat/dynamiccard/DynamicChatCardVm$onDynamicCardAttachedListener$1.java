package com.app.dream11.chat.dynamiccard;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DynamicChatCardVm$onDynamicCardAttachedListener$1 extends Lambda implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    final /* synthetic */ DynamicChatCardVm this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicChatCardVm$onDynamicCardAttachedListener$1(DynamicChatCardVm dynamicChatCardVm) {
        super(1);
        this.this$0 = dynamicChatCardVm;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.this$0.onAttached();
            this.this$0.fetchDynamicData();
            return;
        }
        this.this$0.onDetached();
    }
}
