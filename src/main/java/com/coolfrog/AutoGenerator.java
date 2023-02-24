package com.coolfrog;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.coolfrog.domain.BaseDomain;

import java.util.Collections;

public class AutoGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/coolfrog", "coolfrog", "coolfrog123456")
                .globalConfig(builder -> {
                    builder.author("watson") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E://Watson/git/coolfrog/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.coolfrog")
//                            .moduleName("coolfrog")
                            .entity("domain")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("dao")
                            .xml("mapper")
                            .controller("controller")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E://Watson/git/coolfrog/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder//.addInclude("tbl_book") // 设置需要生成的表名
                            .addTablePrefix("tbl_") // 设置过滤表前缀
                            // entity
                            .entityBuilder()
                            .enableLombok()
                            .superClass(BaseDomain.class)
                            .addSuperEntityColumns("id", "create_time", "last_update_time")
                            .enableFileOverride()
                            // controller
                            .controllerBuilder()
                            .enableHyphenStyle()
                            .enableRestStyle()
                            .formatFileName("%sController")
                            // service
                            .serviceBuilder()
                            .formatServiceFileName("I%sService")
                            .formatServiceImplFileName("%sServiceImp")
                            // mapper
                            .mapperBuilder()
                            .superClass(BaseMapper.class)
                            .enableMapperAnnotation()
                            .formatMapperFileName("I%sDao")
                            .enableFileOverride()
                            .formatXmlFileName("%s");

                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
