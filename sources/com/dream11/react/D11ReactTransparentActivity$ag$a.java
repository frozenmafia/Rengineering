package com.dream11.react;

import android.content.Context;
import android.content.Intent;
import o.AnimationHandler;
import o.getTargetTypes;
import o.removeCallback;
import o.runAnimators;
/* loaded from: classes.dex */
public final class D11ReactTransparentActivity$ag$a {
    private D11ReactTransparentActivity$ag$a() {
    }

    public /* synthetic */ D11ReactTransparentActivity$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    public final Intent valueOf(Context context, AnimationHandler animationHandler) {
        runAnimators.ag$a(context, "context");
        Intent intent = new Intent(context, D11ReactTransparentActivity.class);
        intent.putExtras(removeCallback.valueOf(animationHandler));
        return intent;
    }
}
