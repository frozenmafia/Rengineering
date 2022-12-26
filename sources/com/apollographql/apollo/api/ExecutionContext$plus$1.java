package com.apollographql.apollo.api;

import kotlin.jvm.internal.Lambda;
import o.ComponentActivity;
import o.Transition;
import o.onLaunch;
import o.onLaunch$ah$a;
import o.runAnimators;
import o.startIntentSenderForResult;
/* loaded from: classes.dex */
public final class ExecutionContext$plus$1 extends Lambda implements Transition<onLaunch, onLaunch$ah$a, onLaunch> {
    public static final ExecutionContext$plus$1 INSTANCE = new ExecutionContext$plus$1();

    ExecutionContext$plus$1() {
        super(2);
    }

    @Override // o.Transition
    public final onLaunch invoke(onLaunch onlaunch, onLaunch$ah$a onlaunch_ah_a) {
        runAnimators.valueOf(onlaunch, "acc");
        runAnimators.valueOf(onlaunch_ah_a, "element");
        onLaunch onlaunch2 = onlaunch.toString(onlaunch_ah_a.values());
        return onlaunch2 == ComponentActivity.AnonymousClass3.ah$a ? onlaunch_ah_a : new startIntentSenderForResult(onlaunch2, onlaunch_ah_a);
    }
}
