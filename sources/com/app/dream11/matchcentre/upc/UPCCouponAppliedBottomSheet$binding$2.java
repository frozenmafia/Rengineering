package com.app.dream11.matchcentre.upc;

import android.view.LayoutInflater;
import androidx.databinding.DataBindingUtil;
import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.DropDownListView;
import o.Styleable;
import o.pickPivot;
/* loaded from: classes3.dex */
public final class UPCCouponAppliedBottomSheet$binding$2 extends Lambda implements Styleable.ArcMotion<DropDownListView.GateKeeperDrawable> {
    final /* synthetic */ pickPivot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UPCCouponAppliedBottomSheet$binding$2(pickPivot pickpivot) {
        super(0);
        this.this$0 = pickpivot;
    }

    @Override // o.Styleable.ArcMotion
    public final DropDownListView.GateKeeperDrawable invoke() {
        return (DropDownListView.GateKeeperDrawable) DataBindingUtil.inflate(LayoutInflater.from(this.this$0.getContext()), R.layout.res_0x7f0d0160, null, false);
    }
}
