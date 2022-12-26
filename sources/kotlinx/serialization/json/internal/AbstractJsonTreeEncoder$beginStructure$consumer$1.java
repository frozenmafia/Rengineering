package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Lambda;
import o.FailedSpecification;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.updatePageAccessibilityActions;
/* loaded from: classes8.dex */
public final class AbstractJsonTreeEncoder$beginStructure$consumer$1 extends Lambda implements Styleable.ChangeBounds<updatePageAccessibilityActions, setAnimationMatrix> {
    final /* synthetic */ FailedSpecification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractJsonTreeEncoder$beginStructure$consumer$1(FailedSpecification failedSpecification) {
        super(1);
        this.this$0 = failedSpecification;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(updatePageAccessibilityActions updatepageaccessibilityactions) {
        invoke2(updatepageaccessibilityactions);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(updatePageAccessibilityActions updatepageaccessibilityactions) {
        String ag$a;
        runAnimators.ag$a(updatepageaccessibilityactions, "node");
        FailedSpecification failedSpecification = this.this$0;
        ag$a = failedSpecification.ag$a();
        failedSpecification.ah$a(ag$a, updatepageaccessibilityactions);
    }
}
