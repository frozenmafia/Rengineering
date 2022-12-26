package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.ContentResolverCompat;
import o.ServiceCompat;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class NewCreateTeamVM$onClearTeamClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ContentResolverCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCreateTeamVM$onClearTeamClick$1(ContentResolverCompat contentResolverCompat) {
        super(0);
        this.this$0 = contentResolverCompat;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ServiceCompat HaptikSDK$e = this.this$0.HaptikSDK$e();
        if (HaptikSDK$e == null) {
            return;
        }
        HaptikSDK$e.ag$a();
    }
}
