package o;

import java.security.MessageDigest;
/* loaded from: classes5.dex */
public final class onWindowLayoutChangeListenerAdded {
    public static final onWindowLayoutChangeListenerRemoved values(final String str) {
        runAnimators.ag$a(str, "algorithm");
        return new onWindowLayoutChangeListenerRemoved(str) { // from class: o.onWindowLayoutChangeListenerAdded$ah$a
            final /* synthetic */ String ah$a;
            private final MessageDigest toString;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ah$a = str;
                this.toString = MessageDigest.getInstance(str);
            }

            @Override // o.onWindowLayoutChangeListenerRemoved
            public void ah$a(byte[] bArr, int i, int i2) {
                runAnimators.ag$a(bArr, "input");
                this.toString.update(bArr, i, i2);
            }

            @Override // o.onWindowLayoutChangeListenerRemoved
            public byte[] values() {
                return this.toString.digest();
            }
        };
    }
}
