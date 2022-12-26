package o;

import com.app.dream11.chat.models.FullScreenImagePreviewData;
import com.app.dream11.model.FlowState;
import com.app.dream11.social.flowstates.FullImageFlowState;
import com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class setReplyAction extends getGroupId<setForegroundServiceBehavior> {
    @Override // o.getGroupId
    /* renamed from: HaptikSDK$c */
    public setForegroundServiceBehavior initializeVM() {
        return new setForegroundServiceBehavior(new FullScreenImagePreviewData(valueOf(), ag$a(), ah$a(), values()));
    }

    public final String valueOf() {
        if (this.flowState instanceof FullImageFlowState) {
            FlowState flowState = this.flowState;
            Objects.requireNonNull(flowState, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageFlowState");
            return ((FullImageFlowState) flowState).getImageUrl();
        } else if (this.flowState instanceof FullImageWithBlockSSFlowState) {
            FlowState flowState2 = this.flowState;
            Objects.requireNonNull(flowState2, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState");
            return ((FullImageWithBlockSSFlowState) flowState2).getImageUrl();
        } else {
            return "";
        }
    }

    public final String ag$a() {
        if (this.flowState instanceof FullImageFlowState) {
            FlowState flowState = this.flowState;
            Objects.requireNonNull(flowState, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageFlowState");
            return ((FullImageFlowState) flowState).getTitle();
        } else if (this.flowState instanceof FullImageWithBlockSSFlowState) {
            FlowState flowState2 = this.flowState;
            Objects.requireNonNull(flowState2, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState");
            return ((FullImageWithBlockSSFlowState) flowState2).getTitle();
        } else {
            return "";
        }
    }

    public final String ah$a() {
        if (this.flowState instanceof FullImageFlowState) {
            FlowState flowState = this.flowState;
            Objects.requireNonNull(flowState, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageFlowState");
            return ((FullImageFlowState) flowState).getSubTitle();
        } else if (this.flowState instanceof FullImageWithBlockSSFlowState) {
            FlowState flowState2 = this.flowState;
            Objects.requireNonNull(flowState2, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState");
            return ((FullImageWithBlockSSFlowState) flowState2).getSubTitle();
        } else {
            return "";
        }
    }

    public final String values() {
        if (this.flowState instanceof FullImageFlowState) {
            FlowState flowState = this.flowState;
            Objects.requireNonNull(flowState, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageFlowState");
            return ((FullImageFlowState) flowState).getCaption();
        } else if (this.flowState instanceof FullImageWithBlockSSFlowState) {
            FlowState flowState2 = this.flowState;
            Objects.requireNonNull(flowState2, "null cannot be cast to non-null type com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState");
            return ((FullImageWithBlockSSFlowState) flowState2).getCaption();
        } else {
            return "";
        }
    }
}
