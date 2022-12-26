package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;
/* loaded from: classes5.dex */
public interface parseSplitActivityRule extends EmptyDecorator, ReadableByteChannel {
    void HaptikSDK$a(long j) throws IOException;

    boolean HaptikSDK$b(long j) throws IOException;

    getMinSmallestWidth HaptikSDK$e();

    InputStream HaptikWebView();

    byte a() throws IOException;

    int ag$a(ActivityCompatHelperApi24 activityCompatHelperApi24) throws IOException;

    long ag$a(safeInsetBottom safeinsetbottom) throws IOException;

    long ag$a(ByteString byteString) throws IOException;

    String ag$a(Charset charset) throws IOException;

    ByteString ag$a(long j) throws IOException;

    boolean ag$a(long j, ByteString byteString) throws IOException;

    void ah$a(getMinSmallestWidth getminsmallestwidth, long j) throws IOException;

    void ah$a(byte[] bArr) throws IOException;

    void ah$b(long j) throws IOException;

    ByteString aj$a() throws IOException;

    long ak() throws IOException;

    short ak$a() throws IOException;

    int ak$b() throws IOException;

    long extraCallback() throws IOException;

    parseSplitActivityRule getInitSettings();

    boolean getSignupData() throws IOException;

    long isLogoutPending() throws IOException;

    String onMessageChannelReady() throws IOException;

    String onNavigationEvent() throws IOException;

    byte[] onXdkEvent() throws IOException;

    byte[] toString(long j) throws IOException;

    long valueOf(ByteString byteString) throws IOException;

    String valueOf(long j) throws IOException;

    getMinSmallestWidth valueOf();
}
