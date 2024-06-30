package br.comapispring.apispring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import br.comapispring.apispring.modelo.Pessoa;
import br.comapispring.apispring.repositorio.Repositorio;

@RestController
public class Controle {

  public String postMethodName(@RequestBody String entity) {
    return entity;
  }

  @Autowired
  private Repositorio acao;

  @PostMapping("api")
  public Pessoa cadastrar(@RequestBody Pessoa obj) {
    return acao.save(obj);
  }

  @GetMapping("")
  public String mensagem() {
    return "Hello World!";
  }

  @GetMapping("/boasvindas")
  public String boasvindas() {
    return "Bem-vindo(a) ";
  }

  @GetMapping("/boasvindas/{nome}")
  public String boasvindas(@PathVariable String nome) {
    return "Bem-vindo(a) " + nome;
  }

  @PostMapping("/pessoa")
  public Pessoa pessoa(@RequestBody Pessoa p) {
    return p;
  }

}
