package o;

import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.operation.OperationSource;
import com.google.firebase.database.snapshot.Node;
/* loaded from: classes5.dex */
public class buildAdapterChangeFlagsForAnimations extends Operation {
    private final Node ah$a;

    public buildAdapterChangeFlagsForAnimations(OperationSource operationSource, bindViewHolder bindviewholder, Node node) {
        super(Operation.OperationType.Overwrite, operationSource, bindviewholder);
        this.ah$a = node;
    }

    public Node ah$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.database.core.operation.Operation
    public Operation ag$a(detachViewAt detachviewat) {
        bindViewHolder bindviewholder;
        if (this.ag$a.HaptikSDK$b()) {
            OperationSource operationSource = this.toString;
            bindviewholder = bindViewHolder.toString;
            return new buildAdapterChangeFlagsForAnimations(operationSource, bindviewholder, this.ah$a.toString(detachviewat));
        }
        return new buildAdapterChangeFlagsForAnimations(this.toString, this.ag$a.HaptikSDK$c(), this.ah$a);
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", valueOf(), invoke(), this.ah$a);
    }
}
