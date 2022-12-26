package o;

import android.content.Context;
import android.util.Base64;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/* loaded from: classes4.dex */
public final class computeCrcOfCentralDir {
    private final long ag$a;
    private final byte[] ah$a;
    private final long valueOf;
    private final String values;

    public String ah$a() {
        return this.values;
    }

    public byte[] ag$a() {
        return this.ah$a;
    }

    public long valueOf() {
        return this.ag$a;
    }

    public computeCrcOfCentralDir(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        Properties properties = new Properties();
        try {
            properties.load(openRawResource);
            this.valueOf = Long.parseLong(properties.getProperty("config_version", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
            String property = properties.getProperty("package_name", "");
            this.values = property;
            byte[] decode = Base64.decode(properties.getProperty("signature_hash", ""), 0);
            this.ah$a = decode;
            this.ag$a = Long.parseLong(properties.getProperty("minimum_google_pay_sdk_version", String.valueOf(Long.MAX_VALUE)));
            if (property.isEmpty() || decode.length < 1) {
                throw new IllegalArgumentException("Invalid GooglePay InApp API configuration");
            }
        } catch (IOException | IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid GooglePay InApp API configuration", e);
        }
    }
}
