package com.qian;

import com.qian.netty.WSServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 监听springBoot,当boot启动完毕之后,则启动netty webSocket server
 *
 * @author : ChenQian
 * @date : 2019/4/19 22:59
 */
@Slf4j
@Component
public class NettyBooter implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (contextRefreshedEvent.getApplicationContext().getParent() == null) {
            try {
                log.info("springBoot启动完毕....正在启动netty webSocket server...." );
                WSServer.getInstance().start();
                log.info("netty webSocket server 启动完毕...." );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
