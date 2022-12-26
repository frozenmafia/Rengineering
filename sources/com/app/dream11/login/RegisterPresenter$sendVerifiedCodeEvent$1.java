package com.app.dream11.login;

import com.app.dream11.model.viewmodel.RegisterPageVM;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.MotionScene;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class RegisterPresenter$sendVerifiedCodeEvent$1 extends Lambda implements Styleable.ChangeBounds<Map<String, Serializable>, setAnimationMatrix> {
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ String $status;
    final /* synthetic */ MotionScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterPresenter$sendVerifiedCodeEvent$1(MotionScene motionScene, String str, String str2) {
        super(1);
        this.this$0 = motionScene;
        this.$status = str;
        this.$errorMessage = str2;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Map<String, Serializable> map) {
        invoke2(map);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Serializable> map) {
        runAnimators.ag$a(map, "$this$trackEvent");
        map.put("input_type", "referralCode");
        map.put("user_input", ((RegisterPageVM) MotionScene.ah$a(this.this$0)).getInviteCode());
        map.put("status", this.$status);
        map.put("errorMessage", this.$errorMessage);
    }
}
