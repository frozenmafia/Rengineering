package o;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class findNestedRecyclerView {
    private static final AtomicLong ag$a = new AtomicLong(0);
    private static String ah$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public findNestedRecyclerView(isPreferredNextFocus ispreferrednextfocus) {
        byte[] bArr = new byte[10];
        valueOf(bArr);
        toString(bArr);
        ag$a(bArr);
        String values = CommonUtils.values(ispreferrednextfocus.ag$a(), MessageDigestAlgorithms.SHA_1);
        String values2 = CommonUtils.values(bArr);
        ah$a = String.format(Locale.US, "%s%s%s%s", values2.substring(0, 12), values2.substring(12, 16), values2.subSequence(16, 20), values.substring(0, 12)).toUpperCase(Locale.US);
    }

    private void valueOf(byte[] bArr) {
        long time = new Date().getTime();
        byte[] findnestedrecyclerview = toString(time / 1000);
        bArr[0] = findnestedrecyclerview[0];
        bArr[1] = findnestedrecyclerview[1];
        bArr[2] = findnestedrecyclerview[2];
        bArr[3] = findnestedrecyclerview[3];
        byte[] ag$a2 = ag$a(time % 1000);
        bArr[4] = ag$a2[0];
        bArr[5] = ag$a2[1];
    }

    private void toString(byte[] bArr) {
        byte[] ag$a2 = ag$a(ag$a.incrementAndGet());
        bArr[6] = ag$a2[0];
        bArr[7] = ag$a2[1];
    }

    private void ag$a(byte[] bArr) {
        byte[] ag$a2 = ag$a(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = ag$a2[0];
        bArr[9] = ag$a2[1];
    }

    private static byte[] toString(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] ag$a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return ah$a;
    }
}
