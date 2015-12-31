package com.makkajai;

/**
 * Created by administrator on 31/12/15.
 */
public class Constants {

    public static final String H = ".h";
    public static final String USING_NS_CC = "USING_NS_CC;\n";
    public static final String BEGINS_WITH_2_UPPER_CASE_LETTERS = "([A-Z]{2})(.*)";
    public static final String BEGINS_WITH_UPPER_CASE_LETTERS = "([A-Z]{1})(.*)";
    public static final String CC = "CC";
    public static final String COCOS2D = "cocos2d::";


    public static class Keywords {
        public static final String SUPER = "super";
        public static final String BASE = "base";
        public static final String THIS = "this";
        public static final String SELF = "self";
        public static final String NIL = "nil";
        public static final String NULL = "NULL";
        public static final String AT_PUBLIC = "@public";
        public static final String PUBLIC = "public:";
        public static final String PROTECTED = "protected:";
        public static final String AT_PROTECTED = "@protected";
        public static final String PRIVATE = "private:";
        public static final String AT_PRIVATE = "@private";
        public static final String IMPORT = "#import ";
        public static final String INCLUDE = "#include ";
        public static final String END = "@end";
        public static final String YES = "YES";
        public static final String TRUE = "true";
        public static final String NO = "NO";
        public static final String FALSE = "false";
        public static final String AT_QUOTE = "@\"";
        public static final String QUOTE = "\"";
    }

    public static class Types {
        //Types and their constants.
        public static final String BOOL = "BOOL";

        public static final String NS_OBJECT = "NSObject";
        public static final String REF = COCOS2D + "Ref";

        public static final String ID = "id";
        public static final String REF_POINTER = REF + " *";

        public static final String NS_STRING = "NSString";
        public static final String STRING = COCOS2D + "__String";

        public static final String CCNodeColor = "CCNodeColor";
        public static final String NODE = COCOS2D + "Node";

        public static final String NS_MUTABLE_ARRAY = "NSMutableArray";
        public static final String NS_ARRAY = "NSArray";
        public static final String ARRAY = COCOS2D + "__Array";

        public static final String CGPOINT = "CGPoint";
        public static final String VEC2 = "Vec2";

        public static final String CGSIZE = "CGSize";
        public static final String SIZE = "Size";

        public static final String CGRECT = "CGRect";
        public static final String RECT = "Rect";
    }

    public static class Methods {
        public static final String STRING_WITH_FORMAT = "stringWithFormat";
        public static final String CREATE_WITH_FORMAT = "createWithFormat";

        public static final String CCP = "ccp";
        public static final String VEC2 = "Vec2";

        public static final String CG_RECT_MAKE = "CGRectMake";
        public static final String RECT = "Rect";

        public static final String CG_SIZE_MAKE = "CGSizeMake";
        public static final String SIZE = "Size";

    }
}