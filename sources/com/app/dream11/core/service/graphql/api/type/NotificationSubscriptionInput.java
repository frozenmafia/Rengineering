package com.app.dream11.core.service.graphql.api.type;

import java.util.List;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class NotificationSubscriptionInput implements ComponentActivity.AnonymousClass6 {
    private final String name;
    private final List<NotificationSubscriptionOptionsInput> notificationSubscriptionOptionsInput;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationSubscriptionInput copy$default(NotificationSubscriptionInput notificationSubscriptionInput, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationSubscriptionInput.name;
        }
        if ((i & 2) != 0) {
            list = notificationSubscriptionInput.notificationSubscriptionOptionsInput;
        }
        return notificationSubscriptionInput.copy(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<NotificationSubscriptionOptionsInput> component2() {
        return this.notificationSubscriptionOptionsInput;
    }

    public final NotificationSubscriptionInput copy(String str, List<NotificationSubscriptionOptionsInput> list) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(list, "notificationSubscriptionOptionsInput");
        return new NotificationSubscriptionInput(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationSubscriptionInput) {
            NotificationSubscriptionInput notificationSubscriptionInput = (NotificationSubscriptionInput) obj;
            return runAnimators.values((Object) this.name, (Object) notificationSubscriptionInput.name) && runAnimators.values(this.notificationSubscriptionOptionsInput, notificationSubscriptionInput.notificationSubscriptionOptionsInput);
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.notificationSubscriptionOptionsInput.hashCode();
    }

    public String toString() {
        String str = this.name;
        List<NotificationSubscriptionOptionsInput> list = this.notificationSubscriptionOptionsInput;
        return "NotificationSubscriptionInput(name=" + str + ", notificationSubscriptionOptionsInput=" + list + ")";
    }

    public NotificationSubscriptionInput(String str, List<NotificationSubscriptionOptionsInput> list) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(list, "notificationSubscriptionOptionsInput");
        this.name = str;
        this.notificationSubscriptionOptionsInput = list;
    }

    public final String getName() {
        return this.name;
    }

    public final List<NotificationSubscriptionOptionsInput> getNotificationSubscriptionOptionsInput() {
        return this.notificationSubscriptionOptionsInput;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.NotificationSubscriptionInput$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a("name", NotificationSubscriptionInput.this.getName());
                onBackPressedCallback.ah$a("notificationSubscriptionOptionsInput", new NotificationSubscriptionInput$marshaller$1$1(NotificationSubscriptionInput.this));
            }
        };
    }
}
