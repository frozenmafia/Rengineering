package org.apache.http.impl.conn;

import com.dreampay.commons.constants.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.http.util.Args;
/* loaded from: classes5.dex */
public class Wire {
    private final String id;
    private final Log log;

    public Wire(Log log, String str) {
        this.log = log;
        this.id = str;
    }

    public Wire(Log log) {
        this(log, "");
    }

    private void wire(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                Log log = this.log;
                log.debug(this.id + Constants.WHITE_SPACE + sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            Log log2 = this.log;
            log2.debug(this.id + Constants.WHITE_SPACE + sb.toString());
        }
    }

    public boolean enabled() {
        return this.log.isDebugEnabled();
    }

    public void output(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Output");
        wire(">> ", inputStream);
    }

    public void input(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Input");
        wire("<< ", inputStream);
    }

    public void output(byte[] bArr, int i, int i2) throws IOException {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void input(byte[] bArr, int i, int i2) throws IOException {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void output(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr));
    }

    public void input(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr));
    }

    public void output(int i) throws IOException {
        output(new byte[]{(byte) i});
    }

    public void input(int i) throws IOException {
        input(new byte[]{(byte) i});
    }

    public void output(String str) throws IOException {
        Args.notNull(str, "Output");
        output(str.getBytes());
    }

    public void input(String str) throws IOException {
        Args.notNull(str, "Input");
        input(str.getBytes());
    }
}
