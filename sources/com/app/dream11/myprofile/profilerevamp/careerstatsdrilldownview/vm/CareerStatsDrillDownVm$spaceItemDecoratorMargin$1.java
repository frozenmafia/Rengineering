package com.app.dream11.myprofile.profilerevamp.careerstatsdrilldownview.vm;

import kotlin.jvm.internal.Lambda;
import o.State;
import o.Transition;
import o.toColor;
/* loaded from: classes3.dex */
public final class CareerStatsDrillDownVm$spaceItemDecoratorMargin$1 extends Lambda implements Transition<Integer, Integer, toColor> {
    final /* synthetic */ State this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareerStatsDrillDownVm$spaceItemDecoratorMargin$1(State state) {
        super(2);
        this.this$0 = state;
    }

    @Override // o.Transition
    public /* synthetic */ toColor invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2);
    }

    public final toColor invoke(int i, Integer num) {
        float f;
        if (num != null && num.intValue() == i + 1) {
            f = this.this$0.values;
            return new toColor(0, 0, 0, (int) f);
        }
        return new toColor(0, 0, 0, 0);
    }
}
