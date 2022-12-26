package com.app.dream11.chat.groups;

import com.app.dream11.chat.groups.GroupShareVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GroupShareVM$buttonMoreOptions$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ GroupShareVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupShareVM$buttonMoreOptions$1(GroupShareVM groupShareVM) {
        super(0);
        this.this$0 = groupShareVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GroupShareVM.GroupShareHandler groupShareHandler = this.this$0.getGroupShareHandler();
        if (groupShareHandler == null) {
            return;
        }
        groupShareHandler.onMoreClicked();
    }
}
