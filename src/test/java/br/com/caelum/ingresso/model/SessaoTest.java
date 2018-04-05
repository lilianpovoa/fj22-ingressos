package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

public class SessaoTest {
	
@Test
public void oPrecoDaSessaoDeveSerIgualASomaDoPrecoDaSalaMaisOPrecoDoFilme(){
	Sala sala = new Sala("Sala 1",new BigDecimal("20"));
	Filme filme = new Filme("Fimle", Duration.ofMinutes(120),"Genero",new BigDecimal("20"));
	BigDecimal somaDosPrecosDaSalaEFilme = sala.getPreco().add(filme.getPreco());
	Sessao sessao = new Sessao(LocalTime.now(),filme,sala);
	Assert.assertEquals(somaDosPrecosDaSalaEFilme, sessao.getPreco());
	
	
}

}
