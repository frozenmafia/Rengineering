package o;

import android.content.Context;
import com.appsamurai.storyly.StoryGroupType;
import com.sendbird.android.constant.StringSet;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class obtainAddFontFromBufferMethod extends obtainCreateFromFamiliesWithDefaultMethod {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obtainAddFontFromBufferMethod(Context context, String str) {
        super(context, str, 0, 4);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "statusKey");
    }

    public final void ah$a(List<getFontFamily> list) {
        if (list == null) {
            return;
        }
        for (getFontFamily getfontfamily : list) {
            for (getUniqueKey getuniquekey : getfontfamily.ah$b) {
                String str = getfontfamily.toString + '_' + getuniquekey.valueOf;
                String str2 = "ttl_" + getfontfamily.toString + '_' + getuniquekey.valueOf;
                if (getuniquekey.onXdkEvent) {
                    StoryGroupType storyGroupType = getfontfamily.HaptikSDK$b;
                    StoryGroupType storyGroupType2 = StoryGroupType.MomentsDefault;
                    if (storyGroupType == storyGroupType2 || storyGroupType == StoryGroupType.MomentsBlock) {
                        runAnimators.ag$a(str2, StringSet.key);
                        if (!ah$a().contains(str2)) {
                            valueOf(str2, System.currentTimeMillis() + 90000000);
                        }
                    }
                    StoryGroupType storyGroupType3 = getfontfamily.HaptikSDK$b;
                    if (storyGroupType3 != storyGroupType2 && storyGroupType3 != StoryGroupType.MomentsBlock) {
                        runAnimators.ag$a(str, StringSet.key);
                        if (!ah$a().contains(str)) {
                            ag$a(str, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    public final void values(List<getFontFamily> list) {
        Map<String, ?> all = ah$a().getAll();
        if (list == null) {
            return;
        }
        for (getFontFamily getfontfamily : list) {
            for (getUniqueKey getuniquekey : getfontfamily.ah$b) {
                String str = getfontfamily.toString + '_' + getuniquekey.valueOf;
                Object obj = all.get("ttl_" + getfontfamily.toString + '_' + getuniquekey.valueOf);
                boolean z = false;
                if ((obj instanceof Long ? (Long) obj : null) == null) {
                    Object obj2 = all.get(str);
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    if (bool == null ? false : bool.booleanValue()) {
                        if (getfontfamily.ak$b) {
                        }
                    }
                    getuniquekey.onXdkEvent = z;
                }
                z = true;
                getuniquekey.onXdkEvent = z;
            }
            getfontfamily.HaptikSDK$b();
        }
    }
}
