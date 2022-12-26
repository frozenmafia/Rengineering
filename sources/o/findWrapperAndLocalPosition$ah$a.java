package o;

import com.google.common.collect.ImmutableMap;
import com.google.common.reflect.Types;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class findWrapperAndLocalPosition$ah$a {
    private final ImmutableMap<findWrapperAndLocalPosition$ag$a, Type> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public findWrapperAndLocalPosition$ah$a() {
        this.valueOf = ImmutableMap.of();
    }

    private findWrapperAndLocalPosition$ah$a(ImmutableMap<findWrapperAndLocalPosition$ag$a, Type> immutableMap) {
        this.valueOf = immutableMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final findWrapperAndLocalPosition$ah$a values(Map<findWrapperAndLocalPosition$ag$a, ? extends Type> map) {
        ImmutableMap.valueOf builder = ImmutableMap.builder();
        builder.ah$a(this.valueOf);
        for (Map.Entry<findWrapperAndLocalPosition$ag$a, ? extends Type> entry : map.entrySet()) {
            findWrapperAndLocalPosition$ag$a key = entry.getKey();
            Type value = entry.getValue();
            markViewHoldersUpdated.toString(!key.ag$a(value), "Type variable %s bound to itself", key);
            builder.toString(key, value);
        }
        return new findWrapperAndLocalPosition$ah$a(builder.ag$a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Type valueOf(final TypeVariable<?> typeVariable) {
        return values(typeVariable, new findWrapperAndLocalPosition$ah$a(this) { // from class: o.findWrapperAndLocalPosition$ah$a.5
            @Override // o.findWrapperAndLocalPosition$ah$a
            public Type values(TypeVariable<?> typeVariable2, findWrapperAndLocalPosition$ah$a findwrapperandlocalposition_ah_a) {
                return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) ? typeVariable2 : this.values(typeVariable2, findwrapperandlocalposition_ah_a);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.GenericDeclaration] */
    Type values(TypeVariable<?> typeVariable, findWrapperAndLocalPosition$ah$a findwrapperandlocalposition_ah_a) {
        Type[] valueOf;
        Type type = this.valueOf.get(new findWrapperAndLocalPosition$ag$a(typeVariable));
        if (type == null) {
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            valueOf = new findWrapperAndLocalPosition(findwrapperandlocalposition_ah_a).valueOf(bounds);
            return (Types.toString.values && Arrays.equals(bounds, valueOf)) ? typeVariable : Types.valueOf(typeVariable.getGenericDeclaration(), typeVariable.getName(), valueOf);
        }
        return new findWrapperAndLocalPosition(findwrapperandlocalposition_ah_a).ag$a(type);
    }
}
