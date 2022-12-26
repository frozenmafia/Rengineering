package com.squareup.sqldelight.android;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.Transaction;
import o.TypeConverter;
import o.runAnimators;
/* loaded from: classes7.dex */
public final /* synthetic */ class AndroidSqliteDriver$executeQuery$2 extends FunctionReferenceImpl implements Styleable.ChangeBounds<TypeConverter, Transaction> {
    public static final AndroidSqliteDriver$executeQuery$2 INSTANCE = new AndroidSqliteDriver$executeQuery$2();

    AndroidSqliteDriver$executeQuery$2() {
        super(1, TypeConverter.class, "executeQuery", "executeQuery()Lcom/squareup/sqldelight/db/SqlCursor;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final Transaction invoke(TypeConverter typeConverter) {
        runAnimators.ag$a(typeConverter, "p1");
        return typeConverter.valueOf();
    }
}
