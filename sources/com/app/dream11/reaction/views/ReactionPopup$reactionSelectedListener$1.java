package com.app.dream11.reaction.views;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAlarmClock;
import o.setAndAllowWhileIdle;
import o.setExactAndAllowWhileIdle;
/* loaded from: classes6.dex */
public final class ReactionPopup$reactionSelectedListener$1 extends Lambda implements Styleable.ChangeBounds<setAlarmClock, Boolean> {
    final /* synthetic */ setAndAllowWhileIdle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionPopup$reactionSelectedListener$1(setAndAllowWhileIdle setandallowwhileidle) {
        super(1);
        this.this$0 = setandallowwhileidle;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(setAlarmClock setalarmclock) {
        if (setalarmclock != null) {
            setAndAllowWhileIdle setandallowwhileidle = this.this$0;
            setandallowwhileidle.HaptikSDK$c();
            setExactAndAllowWhileIdle values = setandallowwhileidle.values();
            if (values != null) {
                values.toString(setalarmclock, setandallowwhileidle.valueOf());
            }
        }
        return true;
    }
}
