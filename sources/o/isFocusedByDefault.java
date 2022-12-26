package o;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public final class isFocusedByDefault {
    public static final byte[] valueOf(setBackgroundTintMode.toString tostring) {
        runAnimators.valueOf(tostring, "streamable");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Throwable th = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream2);
            setBackgroundTintMode setbackgroundtintmode = new setBackgroundTintMode(printWriter instanceof BufferedWriter ? (BufferedWriter) printWriter : new BufferedWriter(printWriter, 8192));
            Throwable th2 = null;
            tostring.toStream(setbackgroundtintmode);
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            setSlideEdge.values(setbackgroundtintmode, th2);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            setSlideEdge.values(byteArrayOutputStream, th);
            runAnimators.toString(byteArray, "ByteArrayOutputStream().… baos.toByteArray()\n    }");
            return byteArray;
        } finally {
        }
    }
}
