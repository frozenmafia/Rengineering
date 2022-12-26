package o;

import com.appsamurai.storyly.exoplayer2.extractor.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class failWrite {
    private final ByteArrayOutputStream ag$a;
    private final DataOutputStream toString;

    public failWrite() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.ag$a = byteArrayOutputStream;
        this.toString = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] toString(EventMessage eventMessage) {
        this.ag$a.reset();
        try {
            ag$a(this.toString, eventMessage.valueOf);
            ag$a(this.toString, eventMessage.ah$a != null ? eventMessage.ah$a : "");
            this.toString.writeLong(eventMessage.values);
            this.toString.writeLong(eventMessage.toString);
            this.toString.write(eventMessage.ag$a);
            this.toString.flush();
            return this.ag$a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void ag$a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
