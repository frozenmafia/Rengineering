package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
/* loaded from: classes7.dex */
public interface setTabIndicatorColorResource<T> extends writeByteArray<T> {
    writeByteArray<T> a_(PropertyValuesHolderUtils propertyValuesHolderUtils, int i, BufferOverflow bufferOverflow);

    /* loaded from: classes7.dex */
    public static final class values {
        public static /* synthetic */ writeByteArray toString(setTabIndicatorColorResource settabindicatorcolorresource, PropertyValuesHolderUtils propertyValuesHolderUtils, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    propertyValuesHolderUtils = EmptyCoroutineContext.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return settabindicatorcolorresource.a_(propertyValuesHolderUtils, i, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }
}
