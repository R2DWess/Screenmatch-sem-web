package br.com.wzzy.screenmatch;

import br.com.wzzy.screenmatch.model.DadosSerie;
import br.com.wzzy.screenmatch.service.ConsumoApi;
import br.com.wzzy.screenmatch.service.ConvertDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
        System.out.println(json);

        ConvertDados conversor = new ConvertDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}
