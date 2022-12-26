package com.app.dream11.login;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.MotionScene;
import o.Styleable;
import o.SupportSQLiteQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class RegisterPresenter$onActivityResult$1 extends FunctionReferenceImpl implements Styleable.ArcMotion<SupportSQLiteQuery<FlowState>> {
    public RegisterPresenter$onActivityResult$1(Object obj) {
        super(0, obj, MotionScene.class, "getDeepLinkFlowState", "getDeepLinkFlowState()Lio/reactivex/Observable;", 0);
    }

    @Override // o.Styleable.ArcMotion
    public final SupportSQLiteQuery<FlowState> invoke() {
        return MotionScene.toString((MotionScene) this.receiver);
    }
}
