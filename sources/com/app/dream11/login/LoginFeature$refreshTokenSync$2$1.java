package com.app.dream11.login;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setupMotionViews;
/* loaded from: classes3.dex */
public final class LoginFeature$refreshTokenSync$2$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Throwable $it;
    final /* synthetic */ setupMotionViews this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFeature$refreshTokenSync$2$1(setupMotionViews setupmotionviews, Throwable th) {
        super(0);
        this.this$0 = setupmotionviews;
        this.$it = th;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setupMotionViews setupmotionviews = this.this$0;
        NewEvents newEvents = new NewEvents("RefreshTokenException");
        newEvents.addProperty("exception", this.$it.getMessage());
        setupmotionviews.trackEvent(newEvents, new EventTracker[0]);
    }
}
