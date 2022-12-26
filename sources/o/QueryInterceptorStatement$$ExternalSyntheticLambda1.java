package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
/* loaded from: classes7.dex */
public class QueryInterceptorStatement$$ExternalSyntheticLambda1 {
    public static String toString(InputStream inputStream, Charset charset) throws IOException {
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        while (true) {
            try {
                int read = inputStreamReader.read(cArr, 0, 1024);
                if (read >= 0) {
                    sb.append(cArr, 0, read);
                } else {
                    String sb2 = sb.toString();
                    inputStreamReader.close();
                    return sb2;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    public static String values(File file, Charset charset) throws IOException {
        return toString(new FileInputStream(file), charset);
    }
}
