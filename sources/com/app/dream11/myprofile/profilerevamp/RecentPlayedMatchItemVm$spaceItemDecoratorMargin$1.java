package com.app.dream11.myprofile.profilerevamp;

import kotlin.jvm.internal.Lambda;
import o.Fixed;
import o.Transition;
import o.toColor;
/* loaded from: classes6.dex */
public final class RecentPlayedMatchItemVm$spaceItemDecoratorMargin$1 extends Lambda implements Transition<Integer, Integer, toColor> {
    final /* synthetic */ Fixed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentPlayedMatchItemVm$spaceItemDecoratorMargin$1(Fixed fixed) {
        super(2);
        this.this$0 = fixed;
    }

    @Override // o.Transition
    public /* synthetic */ toColor invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final toColor invoke(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        if (i == 0) {
            f7 = this.this$0.valueOf;
            f8 = this.this$0.values;
            f9 = this.this$0.ah$a;
            return new toColor((int) f7, 0, ((int) f8) / 2, (int) f9);
        } else if (i2 == i + 1) {
            f4 = this.this$0.values;
            f5 = this.this$0.valueOf;
            f6 = this.this$0.ah$a;
            return new toColor(((int) f4) / 2, 0, (int) f5, (int) f6);
        } else {
            f = this.this$0.values;
            f2 = this.this$0.values;
            f3 = this.this$0.ah$a;
            return new toColor(((int) f) / 2, 0, ((int) f2) / 2, (int) f3);
        }
    }
}
