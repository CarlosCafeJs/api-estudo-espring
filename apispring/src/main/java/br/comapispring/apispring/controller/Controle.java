package br.comapispring.apispring.controller;

import org.springframework.web.bind.annotation.GetMapping; // Adicione esta linha
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.comapispring.apispring.modelo.Pessoa;

@RestController
public class Controle {

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
