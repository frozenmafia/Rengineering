package o;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes4.dex */
public class restoreAddedFragments extends ImageRequest {
    private final ReadableMap values;

    public static restoreAddedFragments ag$a(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        return new restoreAddedFragments(imageRequestBuilder, readableMap);
    }

    protected restoreAddedFragments(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        super(imageRequestBuilder);
        this.values = readableMap;
    }

    public ReadableMap ah$a() {
        return this.values;
    }
}
