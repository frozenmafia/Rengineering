package o;

import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.Pagination;
import com.giphy.sdk.core.network.response.ListMediaResponse;
import com.giphy.sdk.tracking.CompletionHandlerExtensionKt$completionHandlerWithUserDictionary$1;
import java.util.List;
/* loaded from: classes4.dex */
public final class registerReceiver {
    public static /* synthetic */ postResult valueOf(postResult postresult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return values(postresult, z, z2);
    }

    public static final postResult<ListMediaResponse> values(postResult<? super ListMediaResponse> postresult, final boolean z, final boolean z2) {
        runAnimators.ag$a(postresult, "$this$completionHandlerWithUserDictionary");
        final CompletionHandlerExtensionKt$completionHandlerWithUserDictionary$1 completionHandlerExtensionKt$completionHandlerWithUserDictionary$1 = new CompletionHandlerExtensionKt$completionHandlerWithUserDictionary$1(postresult);
        return new postResult<ListMediaResponse>() { // from class: o.registerReceiver$ag$a
            @Override // o.postResult
            /* renamed from: ah$a */
            public void onComplete(ListMediaResponse listMediaResponse, Throwable th) {
                Integer offset;
                if ((listMediaResponse != null ? listMediaResponse.getData() : null) != null && listMediaResponse.getMeta() != null) {
                    List<Media> data = listMediaResponse.getData();
                    runAnimators.toString(data);
                    int i = 0;
                    for (Object obj : data) {
                        if (i < 0) {
                            reserveEndViewTransition.ag$a();
                        }
                        Media media = (Media) obj;
                        Meta meta = listMediaResponse.getMeta();
                        runAnimators.toString(meta);
                        executePendingBroadcasts.values(media, meta.getResponseId());
                        if (z) {
                            executePendingBroadcasts.values(media, (Boolean) true);
                        }
                        if (z2) {
                            executePendingBroadcasts.ah$a(media, true);
                        }
                        Pagination pagination = listMediaResponse.getPagination();
                        executePendingBroadcasts.valueOf(media, Integer.valueOf(((pagination == null || (offset = pagination.getOffset()) == null) ? 0 : offset.intValue()) + i));
                        i++;
                    }
                }
                completionHandlerExtensionKt$completionHandlerWithUserDictionary$1.invoke2(listMediaResponse, th);
            }
        };
    }
}
