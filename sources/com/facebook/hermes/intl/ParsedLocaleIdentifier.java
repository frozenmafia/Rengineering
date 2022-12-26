package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.TreeMap;
/* loaded from: classes6.dex */
public class ParsedLocaleIdentifier {
    ParsedLanguageIdentifier languageIdentifier;
    TreeMap<Character, ArrayList<String>> otherExtensionsMap;
    ArrayList<String> puExtensions;
    TreeMap<String, ArrayList<String>> transformedExtensionFields;
    ParsedLanguageIdentifier transformedLanguageIdentifier;
    ArrayList<CharSequence> unicodeExtensionAttributes;
    TreeMap<String, ArrayList<String>> unicodeExtensionKeywords;

    /* loaded from: classes6.dex */
    public static class ParsedLanguageIdentifier {
        String languageSubtag;
        String regionSubtag;
        String scriptSubtag;
        ArrayList<String> variantSubtagList;
    }
}
