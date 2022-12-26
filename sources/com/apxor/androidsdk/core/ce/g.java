package com.apxor.androidsdk.core.ce;

import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: classes3.dex */
class g {
    private final Pattern a = Pattern.compile("(\\[(user|session)_[\\w\\s]+\\([\\w\\s]+\\)\\])+");

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        String substring;
        JSONObject sessionAttributes;
        Matcher matcher = this.a.matcher(str);
        SDKController sDKController = SDKController.getInstance();
        while (matcher.find()) {
            try {
                String group = matcher.group();
                String substring2 = group.substring(group.indexOf("(") + 1, group.lastIndexOf(")"));
                Logger.d("Matching", "Macro: " + group);
                if (group.startsWith("[user_")) {
                    substring = group.substring(6, group.indexOf("("));
                    sessionAttributes = sDKController.getUserAttributes();
                } else {
                    substring = group.substring(9, group.indexOf("("));
                    sessionAttributes = sDKController.getSessionAttributes();
                }
                str = str.replace(group, sessionAttributes.optString(substring, substring2));
            } catch (Exception e) {
                SDKController.getInstance().logException("mRT", e);
            }
        }
        Logger.d("Matching", "Applied macros. Result: " + str);
        return str;
    }
}
