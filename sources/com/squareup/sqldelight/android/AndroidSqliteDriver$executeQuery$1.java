package com.squareup.sqldelight.android;

import kotlin.jvm.internal.Lambda;
import o.SharedSQLiteStatement;
import o.Styleable;
import o.TransactionExecutor;
import o.TypeConverter;
/* loaded from: classes7.dex */
public final class AndroidSqliteDriver$executeQuery$1 extends Lambda implements Styleable.ArcMotion<TypeConverter> {
    final /* synthetic */ int $parameters;
    final /* synthetic */ String $sql;
    final /* synthetic */ TransactionExecutor.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver$executeQuery$1(TransactionExecutor.AnonymousClass1 anonymousClass1, String str, int i) {
        super(0);
        this.this$0 = anonymousClass1;
        this.$sql = str;
        this.$parameters = i;
    }

    @Override // o.Styleable.ArcMotion
    public final TypeConverter invoke() {
        return new SharedSQLiteStatement(this.$sql, this.this$0.values(), this.$parameters);
    }
}
