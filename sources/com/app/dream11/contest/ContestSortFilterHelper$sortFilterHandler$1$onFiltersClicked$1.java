package com.app.dream11.contest;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getView;
import o.readFamily;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class ContestSortFilterHelper$sortFilterHandler$1$onFiltersClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestSortFilterHelper$sortFilterHandler$1$onFiltersClicked$1(getView getview) {
        super(0);
        this.this$0 = getview;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        readFamily.valueOf(this.this$0.ah$a(), this.this$0.ag$a().values(), this.this$0.ag$a().HaptikSDK$c() == null ? Integer.valueOf(this.this$0.ag$a().HaptikSDK$a()) : this.this$0.ag$a().HaptikSDK$c(), "entry", this.this$0.ag$a().HaptikSDK$b());
    }
}
