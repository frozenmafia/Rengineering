package o;

import java.util.concurrent.CancellationException;
import o.PropertyValuesHolderUtils;
import o.Styleable;
/* loaded from: classes5.dex */
public final class getPathName$ah$a {
    public static <E extends PropertyValuesHolderUtils.toString> E ag$a(getPathName getpathname, PropertyValuesHolderUtils.valueOf<E> valueof) {
        return (E) PropertyValuesHolderUtils$toString$ah$a.valueOf(getpathname, valueof);
    }

    public static <R> R ah$a(getPathName getpathname, R r, Transition<? super R, ? super PropertyValuesHolderUtils.toString, ? extends R> transition) {
        return (R) PropertyValuesHolderUtils$toString$ah$a.values(getpathname, r, transition);
    }

    public static PropertyValuesHolderUtils ah$a(getPathName getpathname, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        return PropertyValuesHolderUtils$toString$ah$a.toString(getpathname, propertyValuesHolderUtils);
    }

    public static PropertyValuesHolderUtils valueOf(getPathName getpathname, PropertyValuesHolderUtils.valueOf<?> valueof) {
        return PropertyValuesHolderUtils$toString$ah$a.ag$a(getpathname, valueof);
    }

    public static /* synthetic */ void toString(getPathName getpathname, CancellationException cancellationException, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        getpathname.valueOf(cancellationException);
    }

    public static /* synthetic */ getStrokeLineCap valueOf(getPathName getpathname, boolean z, boolean z2, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return getpathname.toString(z, z2, changeBounds);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
    }
}
