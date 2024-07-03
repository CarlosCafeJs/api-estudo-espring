package br.comapispring.apispring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import br.comapispring.apispring.modelo.Pessoa;
import br.comapispring.apispring.repositorio.Repositorio;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class Controle {

  @Autowired
  private Repositorio acao;

  @PostMapping("api")
  public Pessoa cadastrar(@RequestBody Pessoa obj) {
    return acao.save(obj);
  }

  @GetMapping("api")
  public List<Pessoa> selecionar() {
    return acao.findAll();
  }

  @PutMapping("/api")
  public Pessoa editar(@RequestBody Pessoa obj) {
    return acao.save(obj);
  }

  @GetMapping("/api/{codigo}")
  public Pessoa selecionarPeloCodigo(@PathVariable int codigo) {
    return acao.findByCodigo(codigo);
  }

  @GetMapping("")
  public String mensagem() {
    return "";
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
