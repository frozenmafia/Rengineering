package o;

import java.util.HashMap;
import java.util.Map;
import o.CallbackRegistry;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class checkTouchSlop implements getViewHorizontalDragRange {
    private final ViewGroupBindingAdapter.AnonymousClass2 ag$a;
    private final BindingMethod toString;
    private final setRequiresFadingEdge valueOf;
    private final CallbackRegistry.NotifierCallback values;

    public checkTouchSlop() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof checkTouchSlop) {
            checkTouchSlop checktouchslop = (checkTouchSlop) obj;
            return runAnimators.values(this.toString, checktouchslop.toString) && runAnimators.values(this.values, checktouchslop.values) && runAnimators.values(this.valueOf, checktouchslop.valueOf) && runAnimators.values(this.ag$a, checktouchslop.ag$a);
        }
        return false;
    }

    public int hashCode() {
        BindingMethod bindingMethod = this.toString;
        int hashCode = bindingMethod == null ? 0 : bindingMethod.hashCode();
        CallbackRegistry.NotifierCallback notifierCallback = this.values;
        int hashCode2 = notifierCallback == null ? 0 : notifierCallback.hashCode();
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        int hashCode3 = setrequiresfadingedge == null ? 0 : setrequiresfadingedge.hashCode();
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.ag$a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (anonymousClass2 != null ? anonymousClass2.hashCode() : 0);
    }

    public String toString() {
        return "RegisterTapped(_ageCheckBox=" + this.toString + ", _button=" + this.values + ", _utm_redirection=" + this.valueOf + ", _variant=" + this.ag$a + ')';
    }

    public checkTouchSlop(BindingMethod bindingMethod, CallbackRegistry.NotifierCallback notifierCallback, setRequiresFadingEdge setrequiresfadingedge, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2) {
        this.toString = bindingMethod;
        this.values = notifierCallback;
        this.valueOf = setrequiresfadingedge;
        this.ag$a = anonymousClass2;
    }

    public /* synthetic */ checkTouchSlop(BindingMethod bindingMethod, CallbackRegistry.NotifierCallback notifierCallback, setRequiresFadingEdge setrequiresfadingedge, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : bindingMethod, (i & 2) != 0 ? null : notifierCallback, (i & 4) != 0 ? null : setrequiresfadingedge, (i & 8) != 0 ? null : anonymousClass2);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RegisterTapped");
        BindingMethod bindingMethod = this.toString;
        if (bindingMethod != null) {
            hashMap.put("ageCheckBox", Boolean.valueOf(bindingMethod.values()));
        }
        CallbackRegistry.NotifierCallback notifierCallback = this.values;
        if (notifierCallback != null) {
            hashMap.put("button", notifierCallback.ag$a());
        }
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        if (setrequiresfadingedge != null) {
            hashMap.put("utm_redirection", setrequiresfadingedge.ah$a());
        }
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.ag$a;
        if (anonymousClass2 != null) {
            hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
        }
        return hashMap;
    }
}
