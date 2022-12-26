package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.setLabelFor;
/* loaded from: classes6.dex */
final class BugsnagReactNativePlugin$load$1 extends Lambda implements Styleable.ChangeBounds<setLabelFor, setAnimationMatrix> {
    final /* synthetic */ BugsnagReactNativePlugin this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugsnagReactNativePlugin$load$1(BugsnagReactNativePlugin bugsnagReactNativePlugin) {
        super(1);
        this.this$0 = bugsnagReactNativePlugin;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(setLabelFor setlabelfor) {
        invoke2(setlabelfor);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(setLabelFor setlabelfor) {
        runAnimators.ag$a(setlabelfor, "it");
        Styleable.ChangeBounds<setLabelFor, setAnimationMatrix> jsCallback = this.this$0.getJsCallback();
        if (jsCallback != null) {
            jsCallback.invoke(setlabelfor);
        }
    }
}
