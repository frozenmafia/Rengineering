package o;

import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1;
/* loaded from: classes7.dex */
public final class setNonPrimaryAlpha {
    public static final void values(SafeCollector<?> safeCollector, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        if (((Number) propertyValuesHolderUtils.fold(0, new SafeCollector_commonKt$checkContext$result$1(safeCollector))).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + propertyValuesHolderUtils + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final getPathName ag$a(getPathName getpathname, getPathName getpathname2) {
        while (getpathname != null) {
            if (getpathname == getpathname2 || !(getpathname instanceof endFakeDrag)) {
                return getpathname;
            }
            getpathname = ((endFakeDrag) getpathname).aj$a();
        }
        return null;
    }
}
