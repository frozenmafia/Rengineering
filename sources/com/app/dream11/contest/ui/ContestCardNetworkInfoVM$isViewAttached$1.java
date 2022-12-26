package com.app.dream11.contest.ui;

import com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.updateVisibility;
/* loaded from: classes2.dex */
public final class ContestCardNetworkInfoVM$isViewAttached$1 extends Lambda implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    final /* synthetic */ NetworkInfoFragment $networkInfo;
    final /* synthetic */ updateVisibility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestCardNetworkInfoVM$isViewAttached$1(updateVisibility updatevisibility, NetworkInfoFragment networkInfoFragment) {
        super(1);
        this.this$0 = updatevisibility;
        this.$networkInfo = networkInfoFragment;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.this$0.ag$a;
            if (z2 || this.$networkInfo == null) {
                return;
            }
            updateVisibility.values HaptikSDK$b = this.this$0.HaptikSDK$b();
            if (HaptikSDK$b != null) {
                HaptikSDK$b.valueOf();
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            }
            this.this$0.ag$a = true;
        }
    }
}
