package br.com.asaas.screenmatch.domain.filme;

import java.time.LocalDate;

public record DadosAlteracaoFilme(Long id, String nome, Integer duracao, Integer ano, String genero) {}
