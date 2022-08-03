package com.mentorama.filmes.excecoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExControllerAdvice {
    @ExceptionHandler({RecursoInexistenteException.class})
    public ResponseEntity<String> handle(final RecursoInexistenteException e){
        return new ResponseEntity<>("Esse filme ja foi adicionado", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({NotaInexistenteException.class})
    public ResponseEntity<String> handle(final NotaInexistenteException e){
        return new ResponseEntity<>("A nota deve ser entre 1 e 5", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({FilmeInexistenteException.class})
    public ResponseEntity<String> handle(final FilmeInexistenteException e){
        return new ResponseEntity<>("Filme não encotrado", HttpStatus.NOT_FOUND);
    }

}
