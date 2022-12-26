package com.app.dream11.core.service.graphql.api.type;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.sendbird.android.constant.StringSet;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.isAfterLast;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PlayerInput implements ComponentActivity.AnonymousClass6 {
    private final int id;
    private final ComponentActivity.AnonymousClass5<PlayerRoleInput> role;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayerInput copy$default(PlayerInput playerInput, int i, ComponentActivity.AnonymousClass5 anonymousClass5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = playerInput.id;
        }
        if ((i2 & 2) != 0) {
            anonymousClass5 = playerInput.role;
        }
        return playerInput.copy(i, anonymousClass5);
    }

    public final int component1() {
        return this.id;
    }

    public final ComponentActivity.AnonymousClass5<PlayerRoleInput> component2() {
        return this.role;
    }

    public final PlayerInput copy(int i, ComponentActivity.AnonymousClass5<PlayerRoleInput> anonymousClass5) {
        runAnimators.ag$a(anonymousClass5, StringSet.role);
        return new PlayerInput(i, anonymousClass5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayerInput) {
            PlayerInput playerInput = (PlayerInput) obj;
            return this.id == playerInput.id && runAnimators.values(this.role, playerInput.role);
        }
        return false;
    }

    public int hashCode() {
        return (this.id * 31) + this.role.hashCode();
    }

    public String toString() {
        int i = this.id;
        ComponentActivity.AnonymousClass5<PlayerRoleInput> anonymousClass5 = this.role;
        return "PlayerInput(id=" + i + ", role=" + anonymousClass5 + ")";
    }

    public PlayerInput(int i, ComponentActivity.AnonymousClass5<PlayerRoleInput> anonymousClass5) {
        runAnimators.ag$a(anonymousClass5, StringSet.role);
        this.id = i;
        this.role = anonymousClass5;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ PlayerInput(int i, ComponentActivity.AnonymousClass5 anonymousClass5, int i2, getTargetTypes gettargettypes) {
        this(i, (i2 & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5);
    }

    public final ComponentActivity.AnonymousClass5<PlayerRoleInput> getRole() {
        return this.role;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.PlayerInput$marshaller$$inlined$invoke$1
            private static int ah$a = 1;
            private static int valueOf = 0;
            private static int values = 164;

            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                remove marshaller;
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ag$a(toString((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1, (ViewConfiguration.getLongPressTimeout() >> 16) + 266, true, Color.blue(0) + 2, new char[]{65534, 3}).intern(), Integer.valueOf(PlayerInput.this.getId()));
                if ((PlayerInput.this.getRole().valueOf ? '\b' : (char) 6) != '\b') {
                    return;
                }
                PlayerRoleInput playerRoleInput = PlayerInput.this.getRole().values;
                if (!(playerRoleInput != null)) {
                    int i = valueOf + 111;
                    ah$a = i % 128;
                    int i2 = i % 2;
                    marshaller = null;
                    int i3 = ah$a + 45;
                    valueOf = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    marshaller = playerRoleInput.marshaller();
                }
                onBackPressedCallback.ag$a(StringSet.role, marshaller);
                int i5 = valueOf + 55;
                ah$a = i5 % 128;
                int i6 = i5 % 2;
            }

            private static String toString(int i, int i2, boolean z, int i3, char[] cArr) {
                String str;
                synchronized (isAfterLast.valueOf) {
                    char[] cArr2 = new char[i3];
                    isAfterLast.values = 0;
                    while (isAfterLast.values < i3) {
                        isAfterLast.ag$a = cArr[isAfterLast.values];
                        cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                        int i4 = isAfterLast.values;
                        cArr2[i4] = (char) (cArr2[i4] - values);
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
