package com.squareup.sqldelight.android;

import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class AndroidQuery$bindBytes$1 extends Lambda implements Styleable.ChangeBounds<SupportSQLiteProgram, setAnimationMatrix> {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidQuery$bindBytes$1(byte[] bArr, int i) {
        super(1);
        this.$bytes = bArr;
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
        byte[] bArr = this.$bytes;
        if (bArr == null) {
            supportSQLiteProgram.bindNull(this.$index);
        } else {
            supportSQLiteProgram.bindBlob(this.$index, bArr);
        }
    }
}
