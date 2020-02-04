package com.umsign.blog.jooq.gen;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;
import org.junit.Test;

public class JooqGeneration {

    @Test
    public void generation() {
        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                    .withDriver("com.mysql.cj.jdbc.Driver")
                    .withUrl("jdbc:mysql://localhost:3306/jooq?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC")
                    .withUser("root")
                    .withPassword("1234"))
                .withGenerator(new Generator()
                    .withDatabase(new Database()
                        .withName("org.jooq.meta.mysql.MySQLDatabase")
                        .withIncludes(".*")
                        .withExcludes("")
                        .withInputSchema("jooq"))
                    .withTarget(new Target()
                        .withPackageName("com.umsign.blog.jooq.model")
                        .withDirectory("/home/ukh/toyland_dev/springboot/jooqExample/src/main/java/")));

        try {
            GenerationTool.generate(configuration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
