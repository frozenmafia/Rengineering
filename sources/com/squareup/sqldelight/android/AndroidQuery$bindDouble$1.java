package com.squareup.sqldelight.android;

import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class AndroidQuery$bindDouble$1 extends Lambda implements Styleable.ChangeBounds<SupportSQLiteProgram, setAnimationMatrix> {
    final /* synthetic */ Double $double;
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidQuery$bindDouble$1(Double d, int i) {
        super(1);
        this.$double = d;
        this.$index = i;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(SupportSQLiteProgram supportSQLiteProgram) {
        invoke2(supportSQLiteProgram);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SupportSQLiteProgram supportSQLiteProgram) {
        runAnimators.ag$a(supportSQLiteProgram, "it");
        Double d = this.$double;
        if (d == null) {
            supportSQLiteProgram.bindNull(this.$index);
        } else {
            supportSQLiteProgram.bindDouble(this.$index, d.doubleValue());
        }
    }
}
