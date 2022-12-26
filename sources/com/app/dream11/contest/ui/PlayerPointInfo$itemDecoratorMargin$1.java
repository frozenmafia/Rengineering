package com.app.dream11.contest.ui;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.enableHomeButtonByDefault;
import o.toColor;
/* loaded from: classes2.dex */
public final class PlayerPointInfo$itemDecoratorMargin$1 extends Lambda implements Transition<Integer, Integer, toColor> {
    final /* synthetic */ enableHomeButtonByDefault $resourceProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPointInfo$itemDecoratorMargin$1(enableHomeButtonByDefault enablehomebuttonbydefault) {
        super(2);
        this.$resourceProvider = enablehomebuttonbydefault;
    }

    @Override // o.Transition
    public /* synthetic */ toColor invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final toColor invoke(int i, int i2) {
        if (i == 0) {
            return new toColor(0, 0, 0, 0);
        }
        if (i2 == i + 1) {
            return new toColor((int) this.$resourceProvider.toString(R.dimen.res_0x7f0701b0), 0, (int) this.$resourceProvider.toString(R.dimen.res_0x7f070186), 0);
        }
        return new toColor((int) this.$resourceProvider.toString(R.dimen.res_0x7f0701b0), 0, 0, 0);
    }
}
