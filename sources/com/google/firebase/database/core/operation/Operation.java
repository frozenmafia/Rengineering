package com.google.firebase.database.core.operation;

import o.bindViewHolder;
import o.detachViewAt;
/* loaded from: classes5.dex */
public abstract class Operation {
    protected final bindViewHolder ag$a;
    protected final OperationSource toString;
    protected final OperationType values;

    /* loaded from: classes5.dex */
    public enum OperationType {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    public abstract Operation ag$a(detachViewAt detachviewat);

    public Operation(OperationType operationType, OperationSource operationSource, bindViewHolder bindviewholder) {
        this.values = operationType;
        this.toString = operationSource;
        this.ag$a = bindviewholder;
    }

    public bindViewHolder valueOf() {
        return this.ag$a;
    }

    public OperationSource invoke() {
        return this.toString;
    }

    public OperationType HaptikSDK$a() {
        return this.values;
    }
}
