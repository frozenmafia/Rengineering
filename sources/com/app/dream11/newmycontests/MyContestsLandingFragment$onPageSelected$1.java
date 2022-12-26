package com.app.dream11.newmycontests;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.attachCompleter;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
final class MyContestsLandingFragment$onPageSelected$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ int $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyContestsLandingFragment$onPageSelected$1(int i) {
        super(0);
        this.$position = i;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new attachCompleter().values(new NewEvents("My Contests Tab Selection", EventCategory.$UNKNOWN).addProperty("position", Integer.valueOf(this.$position)), new EventTracker[0]);
    }
}
