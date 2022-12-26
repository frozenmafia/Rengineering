package o;

import java.util.concurrent.CancellationException;
import o.Styleable;
/* loaded from: classes7.dex */
public final class setTranslateY {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T ah$a(PropertyValuesHolderUtils propertyValuesHolderUtils, Styleable.ArcMotion<? extends T> arcMotion) {
        getPathName values;
        try {
            values = toPath.values(propertyValuesHolderUtils);
            ParcelImpl parcelImpl = new ParcelImpl(values);
            parcelImpl.valueOf();
            T invoke = arcMotion.invoke();
            parcelImpl.ah$a();
            return invoke;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
