package com.google.api.client.http;

import java.util.HashMap;
import java.util.Map;
import o.PrintHelper;
import o.canFindInPreLayout;
/* loaded from: classes7.dex */
public class UriTemplate {
    private static final Map<Character, CompositeOutput> ag$a = new HashMap();

    static {
        CompositeOutput.values();
    }

    /* loaded from: classes7.dex */
    enum CompositeOutput {
        PLUS('+', "", ",", false, true),
        HASH('#', "#", ",", false, true),
        DOT('.', ".", ".", false, false),
        FORWARD_SLASH('/', "/", "/", false, false),
        SEMI_COLON(';', ";", ";", true, false),
        QUERY('?', "?", "&", true, false),
        AMP('&', "&", "&", true, false),
        SIMPLE(null, "", ",", false, false);
        
        private final String explodeJoiner;
        private final String outputPrefix;
        private final Character propertyPrefix;
        private final boolean requiresVarAssignment;
        private final boolean reservedExpansion;

        CompositeOutput(Character ch, String str, String str2, boolean z, boolean z2) {
            this.propertyPrefix = ch;
            this.outputPrefix = (String) PrintHelper.PrintUriAdapter.AnonymousClass1.ag$a(str);
            this.explodeJoiner = (String) PrintHelper.PrintUriAdapter.AnonymousClass1.ag$a(str2);
            this.requiresVarAssignment = z;
            this.reservedExpansion = z2;
            if (ch != null) {
                UriTemplate.ag$a.put(ch, this);
            }
        }

        String getOutputPrefix() {
            return this.outputPrefix;
        }

        String getExplodeJoiner() {
            return this.explodeJoiner;
        }

        boolean requiresVarAssignment() {
            return this.requiresVarAssignment;
        }

        int getVarNameStartIndex() {
            return this.propertyPrefix == null ? 0 : 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getEncodedValue(String str) {
            String values;
            if (!this.reservedExpansion) {
                return canFindInPreLayout.toString(str);
            }
            values = canFindInPreLayout.values.values(str);
            return values;
        }
    }
}
