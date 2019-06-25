package com.ihealth.ai.common.config;

import com.ihealth.ai.common.config.properties.*;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

@Configuration
@EnableConfigurationProperties({
    ApplicationProperties.class,
    CacheServerProperties.class,
    DatabaseServerProperties.class,
    SecurityProperties.class,
    WebServerProperties.class
})
public class WebServerConfig {

    @Autowired
    private WebServerProperties webServerProperties;

    @Bean
    public EmbeddedServletContainerFactory servletContainer () {
        WebServerProperties.JettyProperties jettyProperties = webServerProperties.getJetty();
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(jettyProperties.getQueueSize());
        QueuedThreadPool queuedThreadPool = new QueuedThreadPool(
            jettyProperties.getMaxThreads(),
            jettyProperties.getMinThreads(),
            jettyProperties.getIdleTimeout(),
            queue
        );

        JettyEmbeddedServletContainerFactory jetty = new JettyEmbeddedServletContainerFactory();
        jetty.setPort(webServerProperties.getPort());
        jetty.setThreadPool(queuedThreadPool);

        return jetty;
    }
}
