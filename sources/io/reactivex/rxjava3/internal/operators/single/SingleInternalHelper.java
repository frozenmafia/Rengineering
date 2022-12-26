package io.reactivex.rxjava3.internal.operators.single;

import java.util.NoSuchElementException;
import o.addOffset;
import o.createByteVector;
import o.decrement;
import o.getSidecar;
/* loaded from: classes7.dex */
public final class SingleInternalHelper {

    /* loaded from: classes7.dex */
    enum NoSuchElementSupplier implements createByteVector<NoSuchElementException> {
        INSTANCE;

        @Override // o.createByteVector
        public NoSuchElementException get() {
            return new NoSuchElementException();
        }
    }

    /* loaded from: classes7.dex */
    enum ToFlowable implements addOffset<decrement, getSidecar> {
        INSTANCE;

        @Override // o.addOffset
        public getSidecar apply(decrement decrementVar) {
            return new SingleToFlowable(decrementVar);
        }
    }
}
