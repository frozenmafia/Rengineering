package o;

import com.app.dream11.model.NewEvents;
import o.Styleable;
/* loaded from: classes.dex */
public final class getWrapped {
    private final Styleable.ChangeBounds<NewEvents, setAnimationMatrix> values;

    /* JADX WARN: Multi-variable type inference failed */
    public getWrapped(Styleable.ChangeBounds<? super NewEvents, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(changeBounds, "trackEvent");
        this.values = changeBounds;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "tag");
        NewEvents newEvents = new NewEvents("TaggedViewRendered");
        newEvents.addProperty("viewTag", str);
        this.values.invoke(newEvents);
    }
}
