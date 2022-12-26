package retrofit2;

import com.dreampay.commons.constants.Constants;
import java.util.Objects;
import o.SidecarWindowBackend;
/* loaded from: classes5.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient SidecarWindowBackend.WindowLayoutChangeCallbackWrapper<?> response;

    private static String getMessage(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper<?> windowLayoutChangeCallbackWrapper) {
        Objects.requireNonNull(windowLayoutChangeCallbackWrapper, "response == null");
        return "HTTP " + windowLayoutChangeCallbackWrapper.ah$a() + Constants.WHITE_SPACE + windowLayoutChangeCallbackWrapper.ah$b();
    }

    public HttpException(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper<?> windowLayoutChangeCallbackWrapper) {
        super(getMessage(windowLayoutChangeCallbackWrapper));
        this.code = windowLayoutChangeCallbackWrapper.ah$a();
        this.message = windowLayoutChangeCallbackWrapper.ah$b();
        this.response = windowLayoutChangeCallbackWrapper;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public SidecarWindowBackend.WindowLayoutChangeCallbackWrapper<?> response() {
        return this.response;
    }
}
