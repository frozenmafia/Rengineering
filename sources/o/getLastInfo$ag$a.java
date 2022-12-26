package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes5.dex */
final class getLastInfo$ag$a implements InvocationHandler {
    private final List<String> ag$a;
    private boolean ah$a;
    private String valueOf;

    public getLastInfo$ag$a(List<String> list) {
        runAnimators.ag$a(list, "protocols");
        this.ag$a = list;
    }

    public final boolean valueOf() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.valueOf;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        runAnimators.ag$a(obj, "proxy");
        runAnimators.ag$a(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (runAnimators.values((Object) name, (Object) "supports") && runAnimators.values(Boolean.TYPE, returnType)) {
            return true;
        }
        if (runAnimators.values((Object) name, (Object) "unsupported") && runAnimators.values(Void.TYPE, returnType)) {
            this.ah$a = true;
            return null;
        }
        if (runAnimators.values((Object) name, (Object) "protocols")) {
            if (objArr.length == 0) {
                return this.ag$a;
            }
        }
        if ((runAnimators.values((Object) name, (Object) "selectProtocol") || runAnimators.values((Object) name, (Object) "select")) && runAnimators.values(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
            Object obj2 = objArr[0];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj2;
            int size = list.size();
            if (size >= 0) {
                int i = 0;
                while (true) {
                    Object obj3 = list.get(i);
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj3;
                    if (!this.ag$a.contains(str)) {
                        if (i == size) {
                            break;
                        }
                        i++;
                    } else {
                        this.valueOf = str;
                        return str;
                    }
                }
            }
            String str2 = this.ag$a.get(0);
            this.valueOf = str2;
            return str2;
        } else if ((runAnimators.values((Object) name, (Object) "protocolSelected") || runAnimators.values((Object) name, (Object) "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
            this.valueOf = (String) obj4;
            return null;
        } else {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
