package com.app.dream11.reaction.models;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.AppComponentFactory$ah$a;
import o.Styleable;
import o.setAlarmClock;
/* loaded from: classes3.dex */
public final class ReactionsConfig$ReactionsConfigBuilder$reactionTextProvider$1 extends Lambda implements Styleable.ChangeBounds<Integer, String> {
    final /* synthetic */ AppComponentFactory$ah$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsConfig$ReactionsConfigBuilder$reactionTextProvider$1(AppComponentFactory$ah$a appComponentFactory$ah$a) {
        super(1);
        this.this$0 = appComponentFactory$ah$a;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final String invoke(int i) {
        List list;
        list = this.this$0.ah$b;
        return ((setAlarmClock) list.get(i)).valueOf();
    }
}
