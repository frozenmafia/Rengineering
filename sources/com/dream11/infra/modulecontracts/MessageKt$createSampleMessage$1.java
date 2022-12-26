package com.dream11.infra.modulecontracts;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.moveDrawerToOffset;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class MessageKt$createSampleMessage$1 extends Lambda implements Styleable.ChangeBounds<moveDrawerToOffset.valueOf, setAnimationMatrix> {
    public static final MessageKt$createSampleMessage$1 INSTANCE = new MessageKt$createSampleMessage$1();

    MessageKt$createSampleMessage$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(moveDrawerToOffset.valueOf valueof) {
        invoke2(valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(moveDrawerToOffset.valueOf valueof) {
        runAnimators.ag$a(valueof, "$this$$receiver");
        valueof.ah$a(CompareTeamFlowState.MATCH_ID, 1);
        valueof.values(HeadToHeadMatchPickerFlowState.MATCH_NAME, "test");
        valueof.toString("tour", AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dream11.infra.modulecontracts.MessageKt$createSampleMessage$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<moveDrawerToOffset.valueOf, setAnimationMatrix> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ setAnimationMatrix invoke(moveDrawerToOffset.valueOf valueof) {
            invoke2(valueof);
            return setAnimationMatrix.ag$a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(moveDrawerToOffset.valueOf valueof) {
            runAnimators.ag$a(valueof, "$this$complex");
            valueof.ah$a("tourId", 1);
            valueof.values("tourName", "test");
            valueof.values("Arraytest", valueof.values("test", "test"), valueof.values("test", "test"), valueof.values("test", "test"));
        }
    }
}
