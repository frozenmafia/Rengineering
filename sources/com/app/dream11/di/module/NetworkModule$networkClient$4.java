package com.app.dream11.di.module;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NetworkModule$networkClient$4 extends Lambda implements Styleable.ChangeBounds<String, setAnimationMatrix> {
    final /* synthetic */ NetworkModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkModule$networkClient$4(NetworkModule networkModule) {
        super(1);
        this.this$0 = networkModule;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(String str) {
        invoke2(str);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        runAnimators.ag$a(str, "it");
        NetworkModule.toString(this.this$0).ag$a(str);
    }
}
