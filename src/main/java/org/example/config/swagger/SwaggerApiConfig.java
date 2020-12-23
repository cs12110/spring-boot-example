package org.example.config.swagger;

import org.example.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 访问地址: http://ip:port/swagger-ui.html#/
 *
 * @author walle&eva
 * @version V1.0
 * @since 2020-12-23 13:37
 */
@Configuration
@EnableSwagger2
public class SwaggerApiConfig {

    /**
     * swagger2配置文件,配置扫描包
     *
     * @return Docket
     */
    @Bean
    public Docket createRestApi() {
        String pkgName = getRootPackageName();
        ApiInfo apiInfo = buildApiInfo();

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo).select()
            .apis(RequestHandlerSelectors.basePackage(pkgName)).paths(PathSelectors.any()).build();
    }

    private static String getRootPackageName() {
        String appName = Application.class.getName();
        int lastIndex = appName.lastIndexOf(".");
        return appName.substring(0, lastIndex);
    }

    /**
     * 创建API信息
     *
     * @return ApiInfo
     */
    private ApiInfo buildApiInfo() {
        Contact contact = new Contact("api-universe", "", "api-universe@box.cn");

        ApiInfoBuilder builder = new ApiInfoBuilder();
        builder.title("Apis");
        builder.contact(contact);
        builder.version("1.0");
        builder.description("api文档");
        return builder.build();
    }
}
