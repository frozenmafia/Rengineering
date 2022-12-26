package kotlin.reflect;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Class<?>, Class<?>> {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final Class<?> invoke(Class<?> cls) {
        runAnimators.ag$a(cls, "p0");
        return cls.getComponentType();
    }
}
