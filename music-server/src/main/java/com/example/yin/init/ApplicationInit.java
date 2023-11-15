package com.example.yin.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.StandardServletEnvironment;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 项目启动后，可以做一些初始化操作
 * ApplicationRunner: 在项目启动后会自动执行
 * @author Hlmove
 */
@Component
public class ApplicationInit implements ApplicationRunner {

    @Value("${server.port}")
    private int port;
    @Value("${ip}")
    private String currentIp;
    @Autowired
    private Environment env; // 获取项目环境

    //正则匹配规则
    private static final String REG;
    //正则表达式对象
    private static final Pattern PATTERN;

    static {
//        REG = "<img src=\"(.*)\" alt=\"(.*)\" (.*) />";
        REG = "\\[(.*)\\]";
        PATTERN = Pattern.compile(REG);
    }

    /**
     * Callback used to run the bean.
     * 该方法自动调用
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        String host = address.getHostAddress(); // ipv4
        System.out.println("*******************swagger访问地址********************");
        System.out.println("http://" + currentIp + ":" + port + "/doc.html");
        System.out.println("http://" + host + ":" + port + "/doc.html");
        System.out.println("*******************swagger访问地址********************");

        System.out.println();

        System.out.println("*****************本次启动激活的profile*****************");
        System.out.println("当前激活的profile: " + Arrays.toString(env.getActiveProfiles()));
        System.out.println("*****************本次启动激活的profile*****************");

        System.out.println();

        System.out.println("*****************本次启动读取的配置文件*****************");
        StandardServletEnvironment sse = (StandardServletEnvironment) env;
        sse.getPropertySources().forEach(ps -> {
            if (ps instanceof OriginTrackedMapPropertySource) {
                OriginTrackedMapPropertySource ot = (OriginTrackedMapPropertySource) ps;
                System.out.println(findConfigFile(ot.getName()));
            }
        });
        System.out.println("*****************本次启动读取的配置文件*****************");
    }

    /**
     * 使用正则表达式，查找配置文件，例如 [application.yml]
     *
     * @param line
     * @return
     */
    private static String findConfigFile(String line) {

        Matcher m = PATTERN.matcher(line);

        if (m.find()) {
            return m.group();
        }

        return null;

    }

}
