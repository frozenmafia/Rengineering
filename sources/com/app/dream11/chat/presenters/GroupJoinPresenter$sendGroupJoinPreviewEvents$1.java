package com.app.dream11.chat.presenters;

import com.app.dream11.chat.interfaces.IChatFeature;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GroupJoinPresenter$sendGroupJoinPreviewEvents$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ NewEvents $event;
    final /* synthetic */ String $groupId;
    final /* synthetic */ GroupJoinPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupJoinPresenter$sendGroupJoinPreviewEvents$1(GroupJoinPresenter groupJoinPresenter, NewEvents newEvents, String str) {
        super(0);
        this.this$0 = groupJoinPresenter;
        this.$event = newEvents;
        this.$groupId = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IChatFeature chatFeature = this.this$0.getChatFeature();
        NewEvents newEvents = this.$event;
        newEvents.addProperty("channelUrl", this.$groupId);
        chatFeature.trackChatEvents(newEvents);
    }
}
