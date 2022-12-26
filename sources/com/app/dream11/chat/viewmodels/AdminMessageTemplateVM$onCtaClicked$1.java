package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.models.AdminMessageCTA;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AdminMessageTemplateVM$onCtaClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ AdminMessageTemplateVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminMessageTemplateVM$onCtaClicked$1(AdminMessageTemplateVM adminMessageTemplateVM) {
        super(0);
        this.this$0 = adminMessageTemplateVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String path;
        Styleable.ChangeBounds changeBounds;
        AdminMessageCTA cta = this.this$0.getAdminMessageTemplate().getCta();
        if (cta == null || (path = cta.getPath()) == null) {
            return;
        }
        changeBounds = this.this$0.onClickListener;
        changeBounds.invoke(path);
    }
}
