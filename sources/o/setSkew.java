package o;

import com.sendbird.android.constant.StringSet;
import o.PropertyValuesHolderUtils;
import o.PropertyValuesHolderUtils.toString;
import o.Styleable;
/* loaded from: classes5.dex */
public abstract class setSkew<B extends PropertyValuesHolderUtils.toString, E extends B> implements PropertyValuesHolderUtils.valueOf<E> {
    private final Styleable.ChangeBounds<PropertyValuesHolderUtils.toString, E> ah$a;
    private final PropertyValuesHolderUtils.valueOf<?> toString;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.Styleable$ChangeBounds<? super o.PropertyValuesHolderUtils$toString, ? extends E extends B>, o.Styleable$ChangeBounds<o.PropertyValuesHolderUtils$toString, E extends B>, java.lang.Object] */
    public setSkew(PropertyValuesHolderUtils.valueOf<B> valueof, Styleable.ChangeBounds<? super PropertyValuesHolderUtils.toString, ? extends E> changeBounds) {
        runAnimators.ag$a(valueof, "baseKey");
        runAnimators.ag$a(changeBounds, "safeCast");
        this.ah$a = changeBounds;
        this.toString = valueof instanceof setSkew ? (PropertyValuesHolderUtils.valueOf<B>) ((setSkew) valueof).toString : valueof;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lo/PropertyValuesHolderUtils$toString;)TE; */
    public final PropertyValuesHolderUtils.toString ag$a(PropertyValuesHolderUtils.toString tostring) {
        runAnimators.ag$a(tostring, "element");
        return (PropertyValuesHolderUtils.toString) this.ah$a.invoke(tostring);
    }

    public final boolean ag$a(PropertyValuesHolderUtils.valueOf<?> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        return valueof == this || this.toString == valueof;
    }
}
