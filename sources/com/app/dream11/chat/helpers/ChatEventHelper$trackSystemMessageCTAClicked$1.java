package com.app.dream11.chat.helpers;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatEventHelper$trackSystemMessageCTAClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $type;
    final /* synthetic */ ChatEventHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatEventHelper$trackSystemMessageCTAClicked$1(String str, ChatEventHelper chatEventHelper) {
        super(0);
        this.$type = str;
        this.this$0 = chatEventHelper;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("SystemMessageCTAClicked");
        String str = this.$type;
        if (str != null) {
            newEvents.addProperty("systemMessageType", str);
        }
        this.this$0.addCommonProperties(newEvents);
        ChatEventHelper.access$getFeature$p(this.this$0).trackEvent(newEvents, new EventTracker[0]);
    }
}
