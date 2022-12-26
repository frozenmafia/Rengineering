package o;

import com.bugsnag.android.repackaged.dslplatform.json.ConfigurationException;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.ParsingException;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import o.ViewCompat;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
/* loaded from: classes3.dex */
public abstract class recalcViewsWithUnhandled {
    static final JsonReader.values<Element> ag$a = new JsonReader.values<Element>() { // from class: o.recalcViewsWithUnhandled.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: valueOf */
        public Element toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return recalcViewsWithUnhandled.valueOf(jsonReader);
        }
    };
    static final ViewCompat.Api31Impl.toString<Element> toString = new ViewCompat.Api31Impl.toString<Element>() { // from class: o.recalcViewsWithUnhandled.3
    };
    private static final DocumentBuilder valueOf;

    static {
        try {
            valueOf = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public static Element valueOf(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 34) {
            try {
                return valueOf.parse(new InputSource(new StringReader(jsonReader.getSignupData()))).getDocumentElement();
            } catch (SAXException e) {
                throw jsonReader.valueOf("Invalid XML value", 0, e);
            }
        }
        return ah$a(ViewCompat.ScrollIndicators.valueOf(jsonReader));
    }

    public static Element ah$a(Map<String, Object> map) throws IOException {
        Set<String> keySet = map.keySet();
        if (keySet.size() > 1) {
            throw ParsingException.create("Invalid XML. Expecting root element", true);
        }
        String next = keySet.iterator().next();
        Document ah$a = ah$a();
        Element createElement = ah$a.createElement(next);
        ah$a.appendChild(createElement);
        valueOf(ah$a, createElement, map.get(next));
        return createElement;
    }

    private static Document ah$a() {
        Document newDocument;
        synchronized (recalcViewsWithUnhandled.class) {
            try {
                newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            } catch (ParserConfigurationException e) {
                throw new ConfigurationException(e);
            }
        }
        return newDocument;
    }

    private static void valueOf(Document document, Element element, Object obj) {
        if (obj instanceof HashMap) {
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                String str = (String) entry.getKey();
                if (str.startsWith("@")) {
                    element.setAttribute(str.substring(1), entry.getValue().toString());
                } else if (str.startsWith("#")) {
                    if (str.equals("#text")) {
                        if (entry.getValue() instanceof List) {
                            valueOf(document, (Node) element, (List<String>) entry.getValue());
                        } else {
                            element.appendChild(document.createTextNode(entry.getValue().toString()));
                        }
                    } else if (str.equals("#cdata-section")) {
                        if (entry.getValue() instanceof List) {
                            ah$a(document, element, (List) entry.getValue());
                        } else {
                            element.appendChild(document.createCDATASection(entry.getValue().toString()));
                        }
                    } else if (str.equals("#comment")) {
                        if (entry.getValue() instanceof List) {
                            ag$a(document, element, (List) entry.getValue());
                        } else {
                            element.appendChild(document.createComment(entry.getValue().toString()));
                        }
                    }
                } else {
                    Element createElement = document.createElement(str);
                    element.appendChild(createElement);
                    valueOf(document, createElement, entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            values(document, element, (List) obj);
        } else if (obj != null) {
            element.setTextContent(obj.toString());
        }
    }

    private static void valueOf(Document document, Node node, List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        node.appendChild(document.createTextNode(sb.toString()));
    }

    private static void ah$a(Document document, Node node, List<String> list) {
        for (String str : list) {
            node.appendChild(document.createCDATASection(str));
        }
    }

    private static void ag$a(Document document, Node node, List<String> list) {
        for (String str : list) {
            node.appendChild(document.createComment(str));
        }
    }

    private static void values(Document document, Node node, List<Object> list) {
        Node parentNode = node.getParentNode();
        valueOf(document, (Element) node, list.get(0));
        for (Object obj : list.subList(1, list.size())) {
            Element createElement = document.createElement(node.getNodeName());
            parentNode.appendChild(createElement);
            valueOf(document, createElement, obj);
        }
    }
}
