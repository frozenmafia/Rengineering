package o;

import com.google.common.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
/* loaded from: classes7.dex */
public abstract class setStableIdMode<T, R> implements AnnotatedElement, Member {
    private final Member toString;
    private final AccessibleObject values;

    protected abstract Type[] values();

    <M extends AccessibleObject & Member> setStableIdMode(M m) {
        markViewHoldersUpdated.toString(m);
        this.values = m;
        this.toString = m;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.values.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.values.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.values.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.values.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.toString.getName();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.toString.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.toString.isSynthetic();
    }

    public boolean equals(Object obj) {
        if (obj instanceof setStableIdMode) {
            setStableIdMode setstableidmode = (setStableIdMode) obj;
            if (valueOf().equals(setstableidmode.valueOf()) && this.toString.equals(setstableidmode.toString)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return this.toString.toString();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.toString.getDeclaringClass();
    }

    public TypeToken<T> valueOf() {
        return TypeToken.of((Class) getDeclaringClass());
    }

    /* loaded from: classes7.dex */
    public static class values<T> extends setStableIdMode<T, Object> {
        final Method ag$a;

        public values(Method method) {
            super(method);
            this.ag$a = method;
        }

        @Override // o.setStableIdMode
        public Type[] values() {
            return this.ag$a.getGenericParameterTypes();
        }
    }

    /* loaded from: classes7.dex */
    public static class valueOf<T> extends setStableIdMode<T, T> {
        final Constructor<?> ag$a;

        public valueOf(Constructor<?> constructor) {
            super(constructor);
            this.ag$a = constructor;
        }

        @Override // o.setStableIdMode
        public Type[] values() {
            Type[] genericParameterTypes = this.ag$a.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !ah$a()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.ag$a.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        private boolean ah$a() {
            Class<?> declaringClass = this.ag$a.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }
    }
}
