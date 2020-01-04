package com.example.demo.constant;


import java.util.*;

public class MyType {

    /**
     * 文章类别
     */
    public enum ArticleType {
        LIFE("LIFE", "生活"), // WH81  WH87
        TECH("TECH", "技术"); // WH82  WH88

        private final String code;
        private final String name;

        private ArticleType(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String getCode() {
            return this.code;
        }

        public static List<Map<String, Object>> getValues() {
            List<Map<String, Object>> list = new ArrayList<>();
            Arrays.stream(ArticleType.values()).forEach(e -> {
                Map<String, Object> map = new HashMap<>();
                map.put("name", e.getName());
                map.put("value", e.getCode());
                list.add(map);
            });
            return list;
        }

        /**
         * 根据code获取name
         */
        public static String code2Name(String code) {
            ArticleType ArticleType = Arrays.stream(MyType.ArticleType.values()).filter(p -> code.equals(p.getCode())).findFirst().orElse(null);
            return ArticleType == null ? "" : ArticleType.getName();
        }

        /**
         * 根据name获取其code
         */
        public static String name2Code(String name) {
            ArticleType ArticleType = Arrays.stream(MyType.ArticleType.values()).filter(p -> name.equals(p.getName())).findFirst().orElse(null);
            return ArticleType == null ? "" : ArticleType.getCode();
        }

        public static boolean isInclude(String code){
            for (ArticleType e: ArticleType.values()){
                if(e.getCode().equals(code)){
                    return true;
                }
            }
            return false;
        }

        public static ArticleType parse(String code) {
            return Arrays.asList(ArticleType.values()).stream().filter(p -> p.getCode().equals(code)).findFirst().orElse(null);
        }
    }
}
