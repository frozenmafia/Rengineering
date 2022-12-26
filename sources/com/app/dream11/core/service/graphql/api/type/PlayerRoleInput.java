package com.app.dream11.core.service.graphql.api.type;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.isAfterLast;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PlayerRoleInput implements ComponentActivity.AnonymousClass6 {
    private final int id;

    public static /* synthetic */ PlayerRoleInput copy$default(PlayerRoleInput playerRoleInput, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = playerRoleInput.id;
        }
        return playerRoleInput.copy(i);
    }

    public final int component1() {
        return this.id;
    }

    public final PlayerRoleInput copy(int i) {
        return new PlayerRoleInput(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayerRoleInput) && this.id == ((PlayerRoleInput) obj).id;
    }

    public int hashCode() {
        return this.id;
    }

    public String toString() {
        int i = this.id;
        return "PlayerRoleInput(id=" + i + ")";
    }

    public PlayerRoleInput(int i) {
        this.id = i;
    }

    public final int getId() {
        return this.id;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.PlayerRoleInput$marshaller$$inlined$invoke$1
            private static int toString = 45;
            private static int valueOf = 0;
            private static int values = 1;

            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                int i = values + 53;
                valueOf = i % 128;
                int i2 = i % 2;
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ag$a(ag$a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, (ViewConfiguration.getPressedStateDuration() >> 16) + 147, true, Drawable.resolveOpacity(0, 0) + 2, new char[]{65534, 3}).intern(), Integer.valueOf(PlayerRoleInput.this.getId()));
                int i3 = values + 39;
                valueOf = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            }

            private static String ag$a(int i, int i2, boolean z, int i3, char[] cArr) {
                String str;
                synchronized (isAfterLast.valueOf) {
                    char[] cArr2 = new char[i3];
                    isAfterLast.values = 0;
                    while (isAfterLast.values < i3) {
                        isAfterLast.ag$a = cArr[isAfterLast.values];
                        cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                        int i4 = isAfterLast.values;
                        cArr2[i4] = (char) (cArr2[i4] - toString);
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
