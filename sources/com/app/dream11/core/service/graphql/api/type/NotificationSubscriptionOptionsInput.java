package com.app.dream11.core.service.graphql.api.type;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.databinding.library.baseAdapters.BR;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.isAfterLast;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class NotificationSubscriptionOptionsInput implements ComponentActivity.AnonymousClass6 {
    private final int id;
    private final boolean isSelected;
    private final String name;
    private final String type;

    public static /* synthetic */ NotificationSubscriptionOptionsInput copy$default(NotificationSubscriptionOptionsInput notificationSubscriptionOptionsInput, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = notificationSubscriptionOptionsInput.id;
        }
        if ((i2 & 2) != 0) {
            str = notificationSubscriptionOptionsInput.type;
        }
        if ((i2 & 4) != 0) {
            str2 = notificationSubscriptionOptionsInput.name;
        }
        if ((i2 & 8) != 0) {
            z = notificationSubscriptionOptionsInput.isSelected;
        }
        return notificationSubscriptionOptionsInput.copy(i, str, str2, z);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.name;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final NotificationSubscriptionOptionsInput copy(int i, String str, String str2, boolean z) {
        runAnimators.ag$a(str, "type");
        runAnimators.ag$a(str2, "name");
        return new NotificationSubscriptionOptionsInput(i, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationSubscriptionOptionsInput) {
            NotificationSubscriptionOptionsInput notificationSubscriptionOptionsInput = (NotificationSubscriptionOptionsInput) obj;
            return this.id == notificationSubscriptionOptionsInput.id && runAnimators.values((Object) this.type, (Object) notificationSubscriptionOptionsInput.type) && runAnimators.values((Object) this.name, (Object) notificationSubscriptionOptionsInput.name) && this.isSelected == notificationSubscriptionOptionsInput.isSelected;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.id;
        int hashCode = this.type.hashCode();
        int hashCode2 = this.name.hashCode();
        boolean z = this.isSelected;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.name;
        boolean z = this.isSelected;
        return "NotificationSubscriptionOptionsInput(id=" + i + ", type=" + str + ", name=" + str2 + ", isSelected=" + z + ")";
    }

    public NotificationSubscriptionOptionsInput(int i, String str, String str2, boolean z) {
        runAnimators.ag$a(str, "type");
        runAnimators.ag$a(str2, "name");
        this.id = i;
        this.type = str;
        this.name = str2;
        this.isSelected = z;
    }

    public final int getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.NotificationSubscriptionOptionsInput$marshaller$$inlined$invoke$1
            private static int ah$a = 97;
            private static int toString = 1;
            private static int values;

            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                int i = toString + 27;
                values = i % 128;
                int i2 = i % 2;
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ag$a(values((ViewConfiguration.getEdgeSlop() >> 16) + 1, KeyEvent.getDeadChar(0, 0) + BR.lastMessageText, true, 2 - View.resolveSize(0, 0), new char[]{3, 65534}).intern(), Integer.valueOf(NotificationSubscriptionOptionsInput.this.getId()));
                onBackPressedCallback.ah$a("type", NotificationSubscriptionOptionsInput.this.getType());
                onBackPressedCallback.ah$a("name", NotificationSubscriptionOptionsInput.this.getName());
                onBackPressedCallback.valueOf("isSelected", Boolean.valueOf(NotificationSubscriptionOptionsInput.this.isSelected()));
                int i3 = toString + 21;
                values = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            }

            private static String values(int i, int i2, boolean z, int i3, char[] cArr) {
                String str;
                synchronized (isAfterLast.valueOf) {
                    char[] cArr2 = new char[i3];
                    isAfterLast.values = 0;
                    while (isAfterLast.values < i3) {
                        isAfterLast.ag$a = cArr[isAfterLast.values];
                        cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                        int i4 = isAfterLast.values;
                        cArr2[i4] = (char) (cArr2[i4] - ah$a);
                        isAfterLast.values++;
                    }
                    if (i > 0) {
                        isAfterLast.toString = i;
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr2, 0, cArr3, 0, i3);
                        System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                        System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
                    }
                    if (z) {
                        char[] cArr4 = new char[i3];
                        isAfterLast.values = 0;
                        while (isAfterLast.values < i3) {
                            cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                            isAfterLast.values++;
                        }
                        cArr2 = cArr4;
                    }
                    str = new String(cArr2);
                }
                return str;
            }
        };
    }
}
