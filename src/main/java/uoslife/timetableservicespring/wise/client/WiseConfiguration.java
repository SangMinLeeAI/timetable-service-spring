package uoslife.timetableservicespring.wise.client;

import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.jaxb.JAXBContextFactory;
import feign.jaxb.JAXBDecoder;
import feign.jaxb.JAXBEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WiseConfiguration {

    private final JAXBContextFactory jaxbContextFactory = new JAXBContextFactory.Builder()
            .withMarshallerJAXBEncoding("EUC-KR")
            .build();


    @Bean
    public Encoder encoder() {
        return new JAXBEncoder(jaxbContextFactory);
    }

    @Bean
    public Decoder decoder() {
        return new JAXBDecoder(jaxbContextFactory);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
