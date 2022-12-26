package com.app.dream11.notificationcentre;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.directMeasureWithOrientation;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NotificationOptionsBottomSheet$optionsPresenter$2 extends Lambda implements Styleable.ArcMotion<directMeasureWithOrientation> {
    final /* synthetic */ NotificationOptionsBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOptionsBottomSheet$optionsPresenter$2(NotificationOptionsBottomSheet notificationOptionsBottomSheet) {
        super(0);
        this.this$0 = notificationOptionsBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    public final directMeasureWithOrientation invoke() {
        directMeasureWithOrientation connect = ActionMenuItem.valueOf().connect();
        connect.values(this.this$0.ag$a());
        return connect;
    }
}
