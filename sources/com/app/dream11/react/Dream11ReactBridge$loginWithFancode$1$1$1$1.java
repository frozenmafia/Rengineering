package com.app.dream11.react;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.SupportSQLiteQuery;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Dream11ReactBridge$loginWithFancode$1$1$1$1 extends Lambda implements Styleable.ArcMotion<SupportSQLiteQuery<FlowState>> {
    final /* synthetic */ SupportSQLiteQuery<FlowState> $data;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ReactBridge$loginWithFancode$1$1$1$1(SupportSQLiteQuery<FlowState> supportSQLiteQuery) {
        super(0);
        this.$data = supportSQLiteQuery;
    }

    @Override // o.Styleable.ArcMotion
    public final SupportSQLiteQuery<FlowState> invoke() {
        SupportSQLiteQuery<FlowState> supportSQLiteQuery = this.$data;
        runAnimators.ah$a(supportSQLiteQuery, "data");
        return supportSQLiteQuery;
    }
}
