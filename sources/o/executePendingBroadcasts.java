package o;

import com.giphy.sdk.analytics.models.enums.EventType;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.MediaType;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class executePendingBroadcasts {
    public static final String ag$a(Media media) {
        runAnimators.ag$a(media, "$this$responseId");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary != null) {
            return userDictionary.get("rk");
        }
        return null;
    }

    public static final void values(Media media, String str) {
        HashMap<String, String> userDictionary;
        runAnimators.ag$a(media, "$this$responseId");
        HashMap<String, String> userDictionary2 = media.getUserDictionary();
        if (userDictionary2 == null) {
            userDictionary2 = new HashMap<>();
        }
        media.setUserDictionary(userDictionary2);
        if (str == null || (userDictionary = media.getUserDictionary()) == null) {
            return;
        }
        userDictionary.put("rk", str);
    }

    public static final Integer values(Media media) {
        String str;
        runAnimators.ag$a(media, "$this$position");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("pk")) == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public static final void valueOf(Media media, Integer num) {
        runAnimators.ag$a(media, "$this$position");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null) {
            userDictionary = new HashMap<>();
        }
        media.setUserDictionary(userDictionary);
        if (num != null) {
            int intValue = num.intValue();
            HashMap<String, String> userDictionary2 = media.getUserDictionary();
            if (userDictionary2 != null) {
                userDictionary2.put("pk", String.valueOf(intValue));
            }
        }
    }

    public static final Boolean valueOf(Media media) {
        String str;
        runAnimators.ag$a(media, "$this$isEmoji");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("iek")) == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static final void values(Media media, Boolean bool) {
        runAnimators.ag$a(media, "$this$isEmoji");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null) {
            userDictionary = new HashMap<>();
        }
        media.setUserDictionary(userDictionary);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            HashMap<String, String> userDictionary2 = media.getUserDictionary();
            if (userDictionary2 != null) {
                userDictionary2.put("iek", String.valueOf(booleanValue));
            }
        }
    }

    public static final boolean ah$b(Media media) {
        runAnimators.ag$a(media, "$this$isVideo");
        return media.getType() == MediaType.video;
    }

    public static final Boolean toString(Media media) {
        String str;
        runAnimators.ag$a(media, "$this$isText");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("itk")) == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static final void ah$a(Media media, Boolean bool) {
        runAnimators.ag$a(media, "$this$isText");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null) {
            userDictionary = new HashMap<>();
        }
        media.setUserDictionary(userDictionary);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            HashMap<String, String> userDictionary2 = media.getUserDictionary();
            if (userDictionary2 != null) {
                userDictionary2.put("itk", String.valueOf(booleanValue));
            }
        }
    }

    public static final EventType ah$a(Media media) {
        String str;
        runAnimators.ag$a(media, "$this$eventType");
        HashMap<String, String> userDictionary = media.getUserDictionary();
        if (userDictionary == null || (str = userDictionary.get("etk")) == null) {
            return null;
        }
        return EventType.values()[Integer.parseInt(str)];
    }

    public static final void values(Media media, EventType eventType) {
        HashMap<String, String> userDictionary;
        runAnimators.ag$a(media, "$this$eventType");
        HashMap<String, String> userDictionary2 = media.getUserDictionary();
        if (userDictionary2 == null) {
            userDictionary2 = new HashMap<>();
        }
        media.setUserDictionary(userDictionary2);
        if (eventType == null || (userDictionary = media.getUserDictionary()) == null) {
            return;
        }
        userDictionary.put("etk", String.valueOf(eventType.ordinal()));
    }
}
