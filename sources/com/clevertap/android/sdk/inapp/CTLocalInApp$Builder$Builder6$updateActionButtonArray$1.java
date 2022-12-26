package com.clevertap.android.sdk.inapp;

import com.sendbird.android.constant.StringSet;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
import org.json.JSONObject;
/* loaded from: classes6.dex */
final class CTLocalInApp$Builder$Builder6$updateActionButtonArray$1 extends Lambda implements Transition<String, String, setAnimationMatrix> {
    final /* synthetic */ CTLocalInApp$ag$a$ag$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CTLocalInApp$Builder$Builder6$updateActionButtonArray$1(CTLocalInApp$ag$a$ag$a cTLocalInApp$ag$a$ag$a) {
        super(2);
        this.this$0 = cTLocalInApp$ag$a$ag$a;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(String str, String str2) {
        invoke2(str, str2);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        JSONObject jSONObject;
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(str2, "value");
        Integer[] numArr = {0, 1};
        CTLocalInApp$ag$a$ag$a cTLocalInApp$ag$a$ag$a = this.this$0;
        for (int i = 0; i < 2; i++) {
            int intValue = numArr[i].intValue();
            jSONObject = cTLocalInApp$ag$a$ag$a.ag$a;
            jSONObject.getJSONArray("buttons").getJSONObject(intValue).put(str, str2);
        }
    }
}
