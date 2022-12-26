package o;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.integration.ShareChannel;
import com.app.dream11.model.AuthResponse;
import com.app.dream11.model.IEventDataProvider;
import com.app.dream11.model.NewEvents;
/* loaded from: classes.dex */
public interface setPresenterCallback {
    String HaptikSDK$c();

    boolean HaptikWebView();

    double ag$a(int i);

    String ag$a(EventTracker eventTracker);

    SupportSQLiteQuery<String> ag$a(String str);

    void ag$a();

    void ag$a(EventTracker eventTracker, NewEvents newEvents);

    String ah$a();

    String ah$a(EventTracker eventTracker);

    void ah$a(putNext putnext);

    void ah$b();

    void getInitSettings();

    void getSignupData();

    void toString(String str);

    void toString(boolean z);

    int valueOf();

    <T> SupportSQLiteQuery<T> valueOf(EventTracker eventTracker);

    SupportSQLiteQuery<String> valueOf(EventTracker eventTracker, String str, int i, String str2, long j, IEventDataProvider iEventDataProvider, ShareChannel shareChannel, boolean z, String str3);

    void valueOf(EventTracker eventTracker, String str);

    void valueOf(AuthResponse authResponse);

    long values(EventTracker eventTracker);

    void values(String str);
}
