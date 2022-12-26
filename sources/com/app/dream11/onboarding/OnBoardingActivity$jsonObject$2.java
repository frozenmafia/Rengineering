package com.app.dream11.onboarding;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import org.json.JSONObject;
/* loaded from: classes3.dex */
final class OnBoardingActivity$jsonObject$2 extends Lambda implements Styleable.ArcMotion<JSONObject> {
    final /* synthetic */ OnBoardingActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingActivity$jsonObject$2(OnBoardingActivity onBoardingActivity) {
        super(0);
        this.this$0 = onBoardingActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final JSONObject invoke() {
        Bundle extras;
        String string;
        try {
            Intent intent = this.this$0.getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                string = extras.getString("launchData");
                return new JSONObject(string);
            }
            string = null;
            return new JSONObject(string);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
