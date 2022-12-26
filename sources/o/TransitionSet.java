package o;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import o.ViewGroupUtilsApi14;
/* loaded from: classes5.dex */
public final class TransitionSet extends go implements getPropagationProperties<Character> {
    public static final toString ah$a = new toString(null);
    private static final TransitionSet values = new TransitionSet(1, 0);

    /* renamed from: o.TransitionSet$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public interface AnonymousClass1 {
        List<Annotation> getAnnotations();
    }

    /* loaded from: classes5.dex */
    public interface TransitionSetListener<R> extends AnonymousClass1 {
        R call(Object... objArr);

        R callBy(Map<KParameter, ? extends Object> map);

        String getName();

        List<KParameter> getParameters();

        ViewGroupUtilsApi14.AnonymousClass1 getReturnType();

        List<Object> getTypeParameters();

        KVisibility getVisibility();

        boolean isAbstract();

        boolean isFinal();

        boolean isOpen();

        boolean isSuspend();
    }

    public TransitionSet(char c, char c2) {
        super(c, c2, 1);
    }

    @Override // o.getPropagationProperties
    /* renamed from: HaptikSDK$b */
    public Character getStart() {
        return Character.valueOf(ah$a());
    }

    @Override // o.getPropagationProperties
    /* renamed from: HaptikSDK$a */
    public Character getEndInclusive() {
        return Character.valueOf(valueOf());
    }

    @Override // o.go
    public boolean values() {
        return runAnimators.toString(ah$a(), valueOf()) > 0;
    }

    @Override // o.go
    public boolean equals(Object obj) {
        if (obj instanceof TransitionSet) {
            if (!values() || !((TransitionSet) obj).values()) {
                TransitionSet transitionSet = (TransitionSet) obj;
                if (ah$a() != transitionSet.ah$a() || valueOf() != transitionSet.valueOf()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.go
    public int hashCode() {
        if (values()) {
            return -1;
        }
        return (ah$a() * 31) + valueOf();
    }

    @Override // o.go
    public String toString() {
        return ah$a() + ".." + valueOf();
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
