package com.squareup.sqldelight.android;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.TypeConverter;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final /* synthetic */ class AndroidSqliteDriver$execute$2 extends FunctionReferenceImpl implements Styleable.ChangeBounds<TypeConverter, setAnimationMatrix> {
    public static final AndroidSqliteDriver$execute$2 INSTANCE = new AndroidSqliteDriver$execute$2();

    AndroidSqliteDriver$execute$2() {
        super(1, TypeConverter.class, "execute", "execute()V", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(TypeConverter typeConverter) {
        invoke2(typeConverter);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TypeConverter typeConverter) {
        runAnimators.ag$a(typeConverter, "p1");
        typeConverter.ah$a();
    }
}
