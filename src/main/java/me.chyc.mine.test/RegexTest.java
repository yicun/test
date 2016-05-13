package me.chyc.mine.test;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yicun.chen on 4/8/16.
 */
public class RegexTest {
    public List<String> paramList;
    public String redisCategory;
    public RegexTest(String featureName) {
        String[] terms = featureName.split("@");

        if (terms.length > 1)
            this.redisCategory = terms[1];

        paramList = new ArrayList<String>();
        for (int i = 2; i < terms.length; i++) {
            paramList.add(terms[i].toLowerCase().trim());
        }
    }

    public String test() {
        String redisKey = "";

        for (int i = 0; i < paramList.size(); i++) {
            String param = paramList.get(i);
            // 处理参数中的通配符
            Pattern p = Pattern.compile("#(.+?)#");
            Matcher matcher = p.matcher(param);

            while (matcher.find()) {
                String term = matcher.group();
                if (term.equalsIgnoreCase("#keyword#")) {
                    String value = "keywordtest";
                    param = param.replace(term, value);
                }
                if (term.equalsIgnoreCase("#categoryid#")) {
                    String value = "1";
                    param = param.replace(term, value);
                }
            }
            paramList.set(i, param);
        }
        redisKey = StringUtils.join(paramList, "_");
        return redisKey;
    }

    public static void main(String[] args) {
        RegexTest regexTest = new RegexTest("REDIS@ShopFeature@QueryDistCtr@#keyword#@#categoryid#");
        System.out.println(regexTest.test());
    }

}
