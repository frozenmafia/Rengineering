package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.updatePageAccessibilityActions;
/* loaded from: classes8.dex */
public final class TreeJsonEncoderKt$writeJson$encoder$1 extends Lambda implements Styleable.ChangeBounds<updatePageAccessibilityActions, setAnimationMatrix> {
    final /* synthetic */ Ref.ObjectRef<updatePageAccessibilityActions> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TreeJsonEncoderKt$writeJson$encoder$1(Ref.ObjectRef<updatePageAccessibilityActions> objectRef) {
        super(1);
        this.$result = objectRef;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(updatePageAccessibilityActions updatepageaccessibilityactions) {
        invoke2(updatepageaccessibilityactions);
        return setAnimationMatrix.ag$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(updatePageAccessibilityActions updatepageaccessibilityactions) {
        runAnimators.ag$a(updatepageaccessibilityactions, "it");
        this.$result.element = updatepageaccessibilityactions;
    }
}
