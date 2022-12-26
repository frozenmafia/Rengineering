package o;

import com.app.dream11.core.service.graphql.api.type.MyConnectionStatus;
import o.StateListDrawable;
/* loaded from: classes3.dex */
public interface getShowsUserInterface {
    void onConnectionStatusUpdate(MyConnectionStatus myConnectionStatus);

    void onError(StateListDrawable.StateListState stateListState);

    void onSuccess(String str);
}
