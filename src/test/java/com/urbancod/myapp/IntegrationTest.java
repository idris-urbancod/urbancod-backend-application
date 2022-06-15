package com.urbancod.myapp;

import com.urbancod.myapp.UrbancodBackendApplicationApp;
import com.urbancod.myapp.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = UrbancodBackendApplicationApp.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
