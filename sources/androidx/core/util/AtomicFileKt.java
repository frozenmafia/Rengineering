package androidx.core.util;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import o.Styleable;
import o.ViewUtilsApi29;
import o.isTransitionRequired;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class AtomicFileKt {
    public static final void tryWrite(android.util.AtomicFile atomicFile, Styleable.ChangeBounds<? super FileOutputStream, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(atomicFile, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            runAnimators.ah$a(startWrite, "stream");
            changeBounds.invoke(startWrite);
            isTransitionRequired.toString(1);
            atomicFile.finishWrite(startWrite);
            isTransitionRequired.values(1);
        } catch (Throwable th) {
            isTransitionRequired.toString(1);
            atomicFile.failWrite(startWrite);
            isTransitionRequired.values(1);
            throw th;
        }
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = ViewUtilsApi29.ah$b;
        }
        writeText(atomicFile, str, charset);
    }

    public static final void writeText(android.util.AtomicFile atomicFile, String str, Charset charset) {
        runAnimators.ag$a(atomicFile, "<this>");
        runAnimators.ag$a(str, "text");
        runAnimators.ag$a(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        runAnimators.ah$a(bytes, "(this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static final byte[] readBytes(android.util.AtomicFile atomicFile) {
        runAnimators.ag$a(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        runAnimators.ah$a(readFully, "readFully()");
        return readFully;
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = ViewUtilsApi29.ah$b;
        }
        return readText(atomicFile, charset);
    }

    public static final String readText(android.util.AtomicFile atomicFile, Charset charset) {
        runAnimators.ag$a(atomicFile, "<this>");
        runAnimators.ag$a(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        runAnimators.ah$a(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) {
        runAnimators.ag$a(atomicFile, "<this>");
        runAnimators.ag$a(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            runAnimators.ah$a(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }
}
