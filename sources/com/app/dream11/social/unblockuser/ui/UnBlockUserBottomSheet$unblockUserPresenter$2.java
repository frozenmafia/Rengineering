package com.app.dream11.social.unblockuser.ui;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.createIconWithBackground;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class UnBlockUserBottomSheet$unblockUserPresenter$2 extends Lambda implements Styleable.ArcMotion<createIconWithBackground> {
    final /* synthetic */ UnBlockUserBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnBlockUserBottomSheet$unblockUserPresenter$2(UnBlockUserBottomSheet unBlockUserBottomSheet) {
        super(0);
        this.this$0 = unBlockUserBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    public final createIconWithBackground invoke() {
        return ActionMenuItem.valueOf().valueOf(this.this$0.values());
    }
}
