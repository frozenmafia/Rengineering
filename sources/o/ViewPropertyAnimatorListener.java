package o;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.WindowInsetsControllerCompat;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes3.dex */
public class ViewPropertyAnimatorListener {
    private final Pools.Pool<ViewPropertyAnimatorListener$ag$a> toString;
    private final WindowInsetsControllerCompat.Impl23<getDescendants, String> values = new WindowInsetsControllerCompat.Impl23<>(1000);

    public ViewPropertyAnimatorListener() {
        Pools.Pool<ViewPropertyAnimatorListener$ag$a> impl30;
        impl30 = WindowInsetsControllerCompat.Impl30.toString(new Pools.SynchronizedPool(10), new WindowInsetsControllerCompat.Impl30.toString<ViewPropertyAnimatorListener$ag$a>() { // from class: o.ViewPropertyAnimatorListener.4
            @Override // o.WindowInsetsControllerCompat.Impl30.toString
            /* renamed from: valueOf */
            public ViewPropertyAnimatorListener$ag$a ah$a() {
                try {
                    return new ViewPropertyAnimatorListener$ag$a(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        this.toString = impl30;
    }

    public String ag$a(getDescendants getdescendants) {
        String valueOf;
        synchronized (this.values) {
            valueOf = this.values.valueOf((WindowInsetsControllerCompat.Impl23<getDescendants, String>) getdescendants);
        }
        if (valueOf == null) {
            valueOf = toString(getdescendants);
        }
        synchronized (this.values) {
            this.values.ag$a(getdescendants, valueOf);
        }
        return valueOf;
    }

    private String toString(getDescendants getdescendants) {
        ViewPropertyAnimatorListener$ag$a viewPropertyAnimatorListener$ag$a = (ViewPropertyAnimatorListener$ag$a) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(this.toString.acquire());
        try {
            getdescendants.ag$a(viewPropertyAnimatorListener$ag$a.ag$a);
            return WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(viewPropertyAnimatorListener$ag$a.ag$a.digest());
        } finally {
            this.toString.release(viewPropertyAnimatorListener$ag$a);
        }
    }
}
