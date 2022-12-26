package com.app.dream11.matchcentre.networkinmatch;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createRowDefinition;
import o.setAnimationMatrix;
import o.setEnable;
/* loaded from: classes3.dex */
public final class NetworkMatchCardHeaderVm$isViewAttached$1 extends Lambda implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    final /* synthetic */ createRowDefinition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMatchCardHeaderVm$isViewAttached$1(createRowDefinition createrowdefinition) {
        super(1);
        this.this$0 = createrowdefinition;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(boolean z) {
        boolean z2;
        setEnable setenable;
        if (z) {
            z2 = this.this$0.valueOf;
            if (z2) {
                return;
            }
            setenable = this.this$0.ag$a;
            if (setenable != null) {
                setenable.values(this.this$0);
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            }
            this.this$0.valueOf = true;
        }
    }
}
