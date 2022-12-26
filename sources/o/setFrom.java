package o;

import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.snapshot.Node;
/* loaded from: classes5.dex */
public class setFrom {
    private final Event.EventType ag$a;
    private final getDecoratedLeft ah$a;
    private final getDecoratedLeft toString;
    private final detachViewAt valueOf;
    private final detachViewAt values;

    private setFrom(Event.EventType eventType, getDecoratedLeft getdecoratedleft, detachViewAt detachviewat, detachViewAt detachviewat2, getDecoratedLeft getdecoratedleft2) {
        this.ag$a = eventType;
        this.ah$a = getdecoratedleft;
        this.valueOf = detachviewat;
        this.values = detachviewat2;
        this.toString = getdecoratedleft2;
    }

    public static setFrom ag$a(getDecoratedLeft getdecoratedleft) {
        return new setFrom(Event.EventType.VALUE, getdecoratedleft, null, null, null);
    }

    public static setFrom values(detachViewAt detachviewat, Node node) {
        return values(detachviewat, getDecoratedLeft.ag$a(node));
    }

    public static setFrom values(detachViewAt detachviewat, getDecoratedLeft getdecoratedleft) {
        return new setFrom(Event.EventType.CHILD_ADDED, getdecoratedleft, detachviewat, null, null);
    }

    public static setFrom toString(detachViewAt detachviewat, Node node) {
        return toString(detachviewat, getDecoratedLeft.ag$a(node));
    }

    public static setFrom toString(detachViewAt detachviewat, getDecoratedLeft getdecoratedleft) {
        return new setFrom(Event.EventType.CHILD_REMOVED, getdecoratedleft, detachviewat, null, null);
    }

    public static setFrom ag$a(detachViewAt detachviewat, getDecoratedLeft getdecoratedleft, getDecoratedLeft getdecoratedleft2) {
        return new setFrom(Event.EventType.CHILD_CHANGED, getdecoratedleft, detachviewat, null, getdecoratedleft2);
    }

    public static setFrom valueOf(detachViewAt detachviewat, getDecoratedLeft getdecoratedleft) {
        return new setFrom(Event.EventType.CHILD_MOVED, getdecoratedleft, detachviewat, null, null);
    }

    public setFrom ah$a(detachViewAt detachviewat) {
        return new setFrom(this.ag$a, this.ah$a, this.valueOf, detachviewat, this.toString);
    }

    public detachViewAt ag$a() {
        return this.valueOf;
    }

    public Event.EventType valueOf() {
        return this.ag$a;
    }

    public getDecoratedLeft ah$a() {
        return this.ah$a;
    }

    public getDecoratedLeft values() {
        return this.toString;
    }

    public String toString() {
        return "Change: " + this.ag$a + com.dreampay.commons.constants.Constants.WHITE_SPACE + this.valueOf;
    }
}
