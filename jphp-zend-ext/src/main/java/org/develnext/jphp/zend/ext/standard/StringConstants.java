package org.develnext.jphp.zend.ext.standard;

import php.runtime.ext.support.compile.ConstantsContainer;

public class StringConstants extends ConstantsContainer {
    public final int STR_PAD_LEFT = 0;
    public final int STR_PAD_RIGHT = 1;
    public final int STR_PAD_BOTH = 2;

    public static final int HTML_SPECIALCHARS = 0;
    public static final int HTML_ENTITIES = 1;
    public static final int ENT_HTML_QUOTE_NONE = 0;
    public static final int ENT_HTML_QUOTE_SINGLE = 1;
    public static final int ENT_HTML_QUOTE_DOUBLE = 2;
    public static final int ENT_COMPAT = ENT_HTML_QUOTE_DOUBLE;
    public static final int ENT_QUOTES =
            ENT_HTML_QUOTE_SINGLE | ENT_HTML_QUOTE_DOUBLE;
    public static final int ENT_NOQUOTES = ENT_HTML_QUOTE_NONE;


    public final static int ENT_HTML401 = 0;
    public final static int ENT_XML1 = 16;
    public final static int ENT_XHTML = 32;
    public final static int ENT_HTML5 = 48;
}
