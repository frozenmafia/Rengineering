package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.getOverlay;
import o.runAnimators;
/* loaded from: classes7.dex */
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, getOverlay.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(Type type) {
        String values;
        runAnimators.ag$a(type, "p0");
        values = getOverlay.values(type);
        return values;
    }
}
