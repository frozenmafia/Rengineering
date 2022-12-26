package com.squareup.sqldelight.android;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TransactionExecutor;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class AndroidSqliteDriver$database$2 extends Lambda implements Styleable.ArcMotion<SupportSQLiteDatabase> {
    final /* synthetic */ SupportSQLiteDatabase $database;
    final /* synthetic */ TransactionExecutor.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidSqliteDriver$database$2(TransactionExecutor.AnonymousClass1 anonymousClass1, SupportSQLiteDatabase supportSQLiteDatabase) {
        super(0);
        this.this$0 = anonymousClass1;
        this.$database = supportSQLiteDatabase;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final SupportSQLiteDatabase invoke() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper;
        SupportSQLiteDatabase writableDatabase;
        supportSQLiteOpenHelper = this.this$0.ag$a;
        if (supportSQLiteOpenHelper == null || (writableDatabase = supportSQLiteOpenHelper.getWritableDatabase()) == null) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.$database;
            runAnimators.toString(supportSQLiteDatabase);
            return supportSQLiteDatabase;
        }
        return writableDatabase;
    }
}
