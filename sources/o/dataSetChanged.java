package o;

import kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1;
import kotlinx.coroutines.internal.UndeliveredElementException;
import o.Styleable;
/* loaded from: classes7.dex */
public final class dataSetChanged {
    public static /* synthetic */ UndeliveredElementException ag$a(Styleable.ChangeBounds changeBounds, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return ag$a(changeBounds, obj, undeliveredElementException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException ag$a(Styleable.ChangeBounds<? super E, setAnimationMatrix> changeBounds, E e, UndeliveredElementException undeliveredElementException) {
        try {
            changeBounds.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            ChangeScroll.toString(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static final <E> void toString(Styleable.ChangeBounds<? super E, setAnimationMatrix> changeBounds, E e, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        UndeliveredElementException ag$a = ag$a(changeBounds, e, null);
        if (ag$a != null) {
            parseTintModeCompat.toString(propertyValuesHolderUtils, ag$a);
        }
    }

    public static final <E> Styleable.ChangeBounds<Throwable, setAnimationMatrix> valueOf(Styleable.ChangeBounds<? super E, setAnimationMatrix> changeBounds, E e, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(changeBounds, e, propertyValuesHolderUtils);
    }
}
