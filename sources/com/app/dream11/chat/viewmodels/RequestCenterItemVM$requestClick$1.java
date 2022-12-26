package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.RequestCenterItemVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RequestCenterItemVM$requestClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ RequestCenterItemVM.RequestHandler $handler;
    final /* synthetic */ RequestCenterItemVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestCenterItemVM$requestClick$1(RequestCenterItemVM.RequestHandler requestHandler, RequestCenterItemVM requestCenterItemVM) {
        super(0);
        this.$handler = requestHandler;
        this.this$0 = requestCenterItemVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RequestCenterItemVM.RequestHandler requestHandler = this.$handler;
        if (requestHandler == null) {
            return;
        }
        requestHandler.onRequestClicked(this.this$0.getGroup().getChannelUrl());
    }
}
