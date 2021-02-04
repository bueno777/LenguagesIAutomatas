package sample.Config;

import java.util.regex.Pattern;

public class Config {
    public static final String[] KEYWORDS = new String[]{
            "Puerta", "Puertas", "Llantas", "Parabrisa", "Parabrisas",
            "Rin", "Rines", "Amortiguador", "Amortiguadores", "de", "Negro", "Negros", "Negras",
            "Rojo", "Rojos", "Blanco", "Blancos", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "Nuevo", "nuevas", "nuevp", "seminueva", "seminuevo", "Ford", "Mustang", "GM", "ION", "Nissan",
            "Maxima", "Altima", "print", "Sarten", "Cebolla", "declarar", "como", "cocinar"
            //"a","b"

            /*"abstract","assert","boolean", "break", "byte", "case","catch","char","class","const","continue"
            "defaault","do","double", "else", "eunm", "extends","final","finally","float","for","goto",
            "if","implements","import", "instanceof", "int", "interface","long","native","new","package","public",
            "return","short","static", "strictfp", "super", "switch","synchronized","this","throw","throws","transisent",
            "try", "void", "volatile", "while"*/
    };

    public static final String KEYWORD_PATTERN =
    public static final String PAREN_PATTERN =
    public static final String BRACE_PATTERN =
    public static final String BRACKET_PATTERN =
    public static final String SEMICOLON_PATTERN =
    public static final String STRING_PATTERN =
    public static final String COMMENT_PATTERN = "";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>)" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>)" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>)" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>)" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>)" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>)" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>)" + COMMENT_PATTERN + ")"
    );

    public static final String sampleCode = String.join("\n" new String[]

    {
        // "print(10)",
        //"declarar x como cebolla"
        //"cocinar(x)",

        "declarar x llantas de Maxima",
                "declarar y llantas de Mustang",
                "declarar z llantas de Ion",
                "declarar f puertas de Maxima",
                "declarar o puerta de Nissan",
                "declarar l rines de Maxima",
                "declarar k puerta de Ford",
                "declarar r puerta de Ion",
                "puertas  (e)",

        // "1 e Nueva de ION",
        // "2 Rines de e",
        // "4 llantas de k y r"v
        // "package com.example;",
        // "",
        // import java.util.*;",
        //"",
        // public class Foo ectends Bar implements Baz {",
        //"",
        // /*",
        //    * multi-line comment",
        //*/"
        //public static void main(String[] args{",
        //single line comment",
        // for(String arg: args) {",
        // if(arg.length() !=0)"
        // System.out.println(arg);",
        // else",
        // System.err,println(\"Warning: empty string as argument\");",
        // }",
        //}",
        //"",
        //"}"
    });

    public static String[] expresiones = {
            "[2-9] llantas de [A-Za-z]" + ",
            "2 [A-Za-z]+ de Maxima",
            "4 [A-Za-z]+ de [A-Za-z]+",
            "[2-9] Puertas de [A-Z-a-z]+",
            "1 [A-Za-z]+ de Ford",
            "2 Puertas (Nuevas | Seminuevos) de [A-Za-z]+"
            "1 [A-Za-z]+ Nueva de Sentra",
            "4 Rines de [A-Za-z]+",
            "2 [A-Za-z]+ de Maxima y [a-z]+",
            "sumar [a-z{1,} mas [a-z]{1,}",
            "declarar [a-z]{1,} como (sarten | cebolla",
    }
}

    })
    }

