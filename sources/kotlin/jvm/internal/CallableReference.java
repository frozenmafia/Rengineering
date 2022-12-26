package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import o.TransitionSet;
import o.TransitionValuesMaps;
import o.ViewGroupUtilsApi14;
import o.setPropagation;
/* loaded from: classes5.dex */
public abstract class CallableReference implements TransitionSet.TransitionSetListener, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient TransitionSet.TransitionSetListener reflected;
    private final String signature;

    protected abstract TransitionSet.TransitionSetListener computeReflected();

    /* loaded from: classes5.dex */
    static class NoReceiver implements Serializable {
        private static final NoReceiver INSTANCE = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public TransitionSet.TransitionSetListener compute() {
        TransitionSet.TransitionSetListener transitionSetListener = this.reflected;
        if (transitionSetListener == null) {
            TransitionSet.TransitionSetListener computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return transitionSetListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TransitionSet.TransitionSetListener getReflected() {
        TransitionSet.TransitionSetListener compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public TransitionValuesMaps getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? setPropagation.toString(cls) : setPropagation.values(cls);
    }

    @Override // o.TransitionSet.TransitionSetListener
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // o.TransitionSet.TransitionSetListener
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @Override // o.TransitionSet.TransitionSetListener
    public ViewGroupUtilsApi14.AnonymousClass1 getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // o.TransitionSet.AnonymousClass1
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // o.TransitionSet.TransitionSetListener
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // o.TransitionSet.TransitionSetListener
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o.TransitionSet.TransitionSetListener
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @Override // o.TransitionSet.TransitionSetListener
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // o.TransitionSet.TransitionSetListener
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // o.TransitionSet.TransitionSetListener
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // o.TransitionSet.TransitionSetListener
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // o.TransitionSet.TransitionSetListener
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
