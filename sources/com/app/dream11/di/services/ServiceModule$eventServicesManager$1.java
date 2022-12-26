package com.app.dream11.di.services;

import dagger.Lazy;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActionViewExpanded;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ServiceModule$eventServicesManager$1 extends Lambda implements Styleable.ArcMotion<onActionViewExpanded> {
    final /* synthetic */ Lazy<onActionViewExpanded> $device;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceModule$eventServicesManager$1(Lazy<onActionViewExpanded> lazy) {
        super(0);
        this.$device = lazy;
    }

    @Override // o.Styleable.ArcMotion
    public final onActionViewExpanded invoke() {
        onActionViewExpanded ah$a = this.$device.ah$a();
        runAnimators.ah$a(ah$a, "device.get()");
        return ah$a;
    }
}
