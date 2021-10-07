package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CalculadoraDeImpostosTest {

    Orcamento orcamento = new Orcamento(new BigDecimal(100));
    CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();


    @Test
    void calcularICMS() {
        BigDecimal expected = new BigDecimal(10);
        BigDecimal actual = calculadoraDeImpostos.calcular(orcamento, new ICMS());
        System.out.println(expected + " " + actual);
        //Assertions.assertThat(expected).isEqualTo(actual);
    }

    @Test
    void calcularISS(){
        BigDecimal expected = new BigDecimal(6);
        BigDecimal actual = calculadoraDeImpostos.calcular(orcamento, new ISS());
        System.out.println(expected + " " + actual);
    }
}