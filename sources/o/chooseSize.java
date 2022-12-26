package o;

import com.google.firebase.database.core.view.Event;
/* loaded from: classes5.dex */
public class chooseSize implements Event {
    private final processPersistent ah$a;
    private final Event.EventType toString;
    private final String valueOf;
    private final offsetPositionRecordsForRemove values;

    public chooseSize(Event.EventType eventType, processPersistent processpersistent, offsetPositionRecordsForRemove offsetpositionrecordsforremove, String str) {
        this.toString = eventType;
        this.ah$a = processpersistent;
        this.values = offsetpositionrecordsforremove;
        this.valueOf = str;
    }

    public bindViewHolder values() {
        bindViewHolder ah$a = this.values.ah$a().ah$a();
        return this.toString == Event.EventType.VALUE ? ah$a : ah$a.ah$b();
    }

    public offsetPositionRecordsForRemove ah$a() {
        return this.values;
    }

    @Override // com.google.firebase.database.core.view.Event
    public void ag$a() {
        this.ah$a.toString(this);
    }

    @Override // com.google.firebase.database.core.view.Event
    public String toString() {
        if (this.toString == Event.EventType.VALUE) {
            return values() + ": " + this.toString + ": " + this.values.ag$a(true);
        }
        return values() + ": " + this.toString + ": { " + this.values.values() + ": " + this.values.ag$a(true) + " }";
    }
}
