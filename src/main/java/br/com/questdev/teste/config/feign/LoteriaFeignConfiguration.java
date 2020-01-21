package br.com.questdev.teste.config.feign;

import br.com.questdev.teste.repository.Loteria;
import feign.Feign;
import feign.Logger;
import feign.form.FormEncoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Request.Options;

@Configuration
public class LoteriaFeignConfiguration {

    @Value(value = "${api.loterias.endpoint}")
    private String loteriaEndpoint;

    @Bean
    public Loteria loteriaClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .options(new Options(2000, 2000))
                .logger(new feign.Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .target(Loteria.class, loteriaEndpoint);
    }
}
