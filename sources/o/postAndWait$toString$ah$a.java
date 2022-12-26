package o;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.postAndWait;
/* loaded from: classes3.dex */
public final class postAndWait$toString$ah$a {
    private final CopyOnWriteArrayList<postAndWait$toString$ah$a$ag$a> ag$a = new CopyOnWriteArrayList<>();

    public void toString(Handler handler, postAndWait.toString tostring) {
        FingerprintManagerCompat.toString(handler);
        FingerprintManagerCompat.toString(tostring);
        values(tostring);
        this.ag$a.add(new postAndWait$toString$ah$a$ag$a(handler, tostring));
    }

    public void values(postAndWait.toString tostring) {
        postAndWait.toString tostring2;
        Iterator<postAndWait$toString$ah$a$ag$a> it = this.ag$a.iterator();
        while (it.hasNext()) {
            postAndWait$toString$ah$a$ag$a next = it.next();
            tostring2 = next.ag$a;
            if (tostring2 == tostring) {
                next.values();
                this.ag$a.remove(next);
            }
        }
    }

    public void values(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator<postAndWait$toString$ah$a$ag$a> it = this.ag$a.iterator();
        while (it.hasNext()) {
            final postAndWait$toString$ah$a$ag$a next = it.next();
            z = next.toString;
            if (!z) {
                handler = next.ah$a;
                handler.post(new Runnable() { // from class: o.onDestruction
                    @Override // java.lang.Runnable
                    public final void run() {
                        postAndWait$toString$ah$a.ag$a(postAndWait$toString$ah$a$ag$a.this, i, j, j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void ag$a(postAndWait$toString$ah$a$ag$a postandwait_tostring_ah_a_ag_a, int i, long j, long j2) {
        postAndWait.toString tostring;
        tostring = postandwait_tostring_ah_a_ag_a.ag$a;
        tostring.ah$a(i, j, j2);
    }
}
