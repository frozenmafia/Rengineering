package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.toColor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AllContestInviteForChannelVM$spaceItemDecoratorMargin$1 extends Lambda implements Transition<Integer, Integer, toColor> {
    final /* synthetic */ AllContestInviteForChannelVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllContestInviteForChannelVM$spaceItemDecoratorMargin$1(AllContestInviteForChannelVM allContestInviteForChannelVM) {
        super(2);
        this.this$0 = allContestInviteForChannelVM;
    }

    @Override // o.Transition
    public /* synthetic */ toColor invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final toColor invoke(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 0) {
            f5 = this.this$0.topMargin;
            f6 = this.this$0.margin;
            return new toColor(0, (int) f5, 0, (int) f6);
        } else if (i2 == i + 1) {
            f3 = this.this$0.margin;
            f4 = this.this$0.topMargin;
            return new toColor(0, (int) f3, 0, (int) f4);
        } else {
            f = this.this$0.margin;
            f2 = this.this$0.margin;
            return new toColor(0, (int) f, 0, (int) f2);
        }
    }
}
