package o;

import com.app.dream11.core.service.graphql.api.NotificationsFilterTypesQuery;
/* loaded from: classes3.dex */
public final class setParent extends androidx.databinding.BaseObservable {
    private setParent$ag$a ag$a;
    private NotificationsFilterTypesQuery.FetchNotificationFilter ah$a;
    private androidx.databinding.ObservableField<Boolean> toString;

    public setParent(setParent$ag$a setparent_ag_a) {
        runAnimators.ag$a(setparent_ag_a, "itemViewHandler");
        this.ag$a = setparent_ag_a;
        this.toString = new androidx.databinding.ObservableField<>(false);
    }

    public final setParent$ag$a valueOf() {
        return this.ag$a;
    }

    public final void valueOf(NotificationsFilterTypesQuery.FetchNotificationFilter fetchNotificationFilter) {
        this.ah$a = fetchNotificationFilter;
    }

    public final NotificationsFilterTypesQuery.FetchNotificationFilter values() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<Boolean> ag$a() {
        return this.toString;
    }
}
