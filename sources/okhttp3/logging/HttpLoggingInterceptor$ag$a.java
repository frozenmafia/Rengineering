package okhttp3.logging;

import o.accept;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes5.dex */
public interface HttpLoggingInterceptor$ag$a {
    public static final values valueOf = new values(null);
    public static final HttpLoggingInterceptor$ag$a ag$a = new HttpLoggingInterceptor$ag$a() { // from class: okhttp3.logging.HttpLoggingInterceptor$ag$a$values$ah$a
        @Override // okhttp3.logging.HttpLoggingInterceptor$ag$a
        public void ah$a(String str) {
            runAnimators.ag$a(str, "message");
            accept.lambda1.ag$a(accept.lambda1.invoke.ag$a(), str, 0, null, 6, null);
        }
    };

    void ah$a(String str);

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }
}
