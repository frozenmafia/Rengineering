package com.app.dream11.login;

import com.facebook.hermes.intl.Constants;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reEvaluateState;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class LoginPresenter$loginPageHandler$1$onGoogleClick$1 extends Lambda implements Styleable.ChangeBounds<Map<String, Serializable>, setAnimationMatrix> {
    final /* synthetic */ reEvaluateState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginPresenter$loginPageHandler$1$onGoogleClick$1(reEvaluateState reevaluatestate) {
        super(1);
        this.this$0 = reevaluatestate;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Map<String, Serializable> map) {
        invoke2(map);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Serializable> map) {
        runAnimators.ag$a(map, "$this$trackEvent");
        map.put("button", "Google");
        map.put("Source", reEvaluateState.values(this.this$0));
        map.put(Constants.SENSITIVITY_VARIANT, reEvaluateState.ah$a(this.this$0).aj$a());
    }
}
