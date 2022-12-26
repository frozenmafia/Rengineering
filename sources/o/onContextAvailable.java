package o;

import java.util.Arrays;
import o.ComponentActivity;
/* loaded from: classes.dex */
public final class onContextAvailable {
    private final ComponentActivity.AnonymousClass1 ag$a;

    public onContextAvailable(ComponentActivity.AnonymousClass1 anonymousClass1) {
        this.ag$a = anonymousClass1;
    }

    public final void values(String str, Object... objArr) {
        runAnimators.valueOf(str, "message");
        runAnimators.valueOf(objArr, "args");
        toString(3, str, null, Arrays.copyOf(objArr, objArr.length));
    }

    public final void ah$a(Throwable th, String str, Object... objArr) {
        runAnimators.valueOf(str, "message");
        runAnimators.valueOf(objArr, "args");
        toString(3, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    public final void ah$a(String str, Object... objArr) {
        runAnimators.valueOf(str, "message");
        runAnimators.valueOf(objArr, "args");
        toString(5, str, null, Arrays.copyOf(objArr, objArr.length));
    }

    public final void valueOf(String str, Object... objArr) {
        runAnimators.valueOf(str, "message");
        runAnimators.valueOf(objArr, "args");
        toString(6, str, null, Arrays.copyOf(objArr, objArr.length));
    }

    public final void values(Throwable th, String str, Object... objArr) {
        runAnimators.valueOf(str, "message");
        runAnimators.valueOf(objArr, "args");
        toString(6, str, th, Arrays.copyOf(objArr, objArr.length));
    }

    private final void toString(int i, String str, Throwable th, Object... objArr) {
        ComponentActivity.AnonymousClass1 anonymousClass1 = this.ag$a;
        if (anonymousClass1 != null) {
            anonymousClass1.ag$a(i, str, th, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
