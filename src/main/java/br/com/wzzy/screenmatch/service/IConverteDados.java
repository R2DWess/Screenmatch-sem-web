package br.com.wzzy.screenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
