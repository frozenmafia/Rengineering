package o;

import okhttp3.Request;
import okhttp3.Response;
/* renamed from: o.translateActivityPredicates$lambda-6$ah$a  reason: invalid class name */
/* loaded from: classes5.dex */
public final class translateActivityPredicates$lambda6$ah$a {
    private translateActivityPredicates$lambda6$ah$a() {
    }

    public /* synthetic */ translateActivityPredicates$lambda6$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final boolean toString(Response response, Request request) {
        runAnimators.ag$a(response, "response");
        runAnimators.ag$a(request, "request");
        int code = response.code();
        if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
            if (code != 307) {
                if (code != 308 && code != 404 && code != 405) {
                    switch (code) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                return false;
            }
        }
        return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
    }
}
