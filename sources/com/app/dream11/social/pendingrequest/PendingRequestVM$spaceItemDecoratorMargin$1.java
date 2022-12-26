package com.app.dream11.social.pendingrequest;

import kotlin.jvm.internal.Lambda;
import o.NotificationCompat;
import o.Transition;
import o.toColor;
/* loaded from: classes3.dex */
public final class PendingRequestVM$spaceItemDecoratorMargin$1 extends Lambda implements Transition<Integer, Integer, toColor> {
    final /* synthetic */ NotificationCompat.CarExtender.UnreadConversation.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingRequestVM$spaceItemDecoratorMargin$1(NotificationCompat.CarExtender.UnreadConversation.Builder builder) {
        super(2);
        this.this$0 = builder;
    }

    @Override // o.Transition
    public /* synthetic */ toColor invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final toColor invoke(int i, int i2) {
        float f;
        float f2;
        if (i == 0) {
            f2 = this.this$0.ag$a;
            return new toColor((int) f2, 0, 0, 0);
        } else if (i2 == i + 1) {
            f = this.this$0.ag$a;
            return new toColor(0, 0, (int) f, 0);
        } else {
            return new toColor(0, 0, 0, 0);
        }
    }
}
