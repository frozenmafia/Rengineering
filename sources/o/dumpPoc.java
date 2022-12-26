package o;

import com.app.dream11.core.event.EventType;
import com.app.dream11.leaguelisting.brightcovepip.VideoEventType;
import com.app.dream11.model.FeatureUpdate;
/* loaded from: classes3.dex */
public final class dumpPoc extends FeatureUpdate {
    private VideoEventType ah$a;

    public final VideoEventType ah$a() {
        return this.ah$a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dumpPoc(VideoEventType videoEventType, EventType eventType) {
        super(eventType);
        runAnimators.ag$a(videoEventType, "brightCoveVideoEventType");
        runAnimators.ag$a(eventType, "eventType");
        this.ah$a = videoEventType;
    }
}
