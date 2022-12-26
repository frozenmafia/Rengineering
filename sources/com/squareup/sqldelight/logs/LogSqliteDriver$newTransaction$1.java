package com.squareup.sqldelight.logs;

import kotlin.jvm.internal.Lambda;
import o.AutoMigrationCallback;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class LogSqliteDriver$newTransaction$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ AutoMigrationCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogSqliteDriver$newTransaction$1(AutoMigrationCallback autoMigrationCallback) {
        super(0);
        this.this$0 = autoMigrationCallback;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Styleable.ChangeBounds changeBounds;
        changeBounds = this.this$0.values;
        changeBounds.invoke("TRANSACTION COMMIT");
    }
}
