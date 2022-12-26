package androidx.work.impl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import o.animateAddImpl;
/* loaded from: classes.dex */
public class OperationImpl implements Operation {
    private final MutableLiveData<Operation.State> mOperationState = new MutableLiveData<>();
    private final SettableFuture<Operation.State.SUCCESS> mOperationFuture = SettableFuture.create();

    public OperationImpl() {
        setState(Operation.IN_PROGRESS);
    }

    @Override // androidx.work.Operation
    public animateAddImpl<Operation.State.SUCCESS> getResult() {
        return this.mOperationFuture;
    }

    @Override // androidx.work.Operation
    public LiveData<Operation.State> getState() {
        return this.mOperationState;
    }

    public void setState(Operation.State state) {
        this.mOperationState.postValue(state);
        if (state instanceof Operation.State.SUCCESS) {
            this.mOperationFuture.set((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            this.mOperationFuture.setException(((Operation.State.FAILURE) state).getThrowable());
        }
    }
}
